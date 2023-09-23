package ds;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;



public class ds {
	public static int y = 0 , z = 0 ;
	public static int i = 0 , j = 0  , k = 0 ;
public static void main (String [] args)
{	
	System.out.println("ENTER 1 )IF YOU WANT FIBONACHI  \nENTER 2 IF YOU WANT Arithmetic and geometric sequence \nENTER 3 IF YOU WANT MATRIX ");
	int n ; 
	Scanner scanner = new Scanner(System.in);
	n = scanner.nextInt() ;
	int x ;
	//s = start number (first number of sequence ) 
	//e = the number of sequence we want 
	//dq = ghadr nesbat
	int s ;
	int e ;
	int dq ;
	switch(n)
	{
	case 1 :
		System.out.println("PLEASE ENTER YOUR NUMBER");
		x = scanner.nextInt() ;
		System.out.println(fib(x));
		break ;
	case 2 :
		System.out.println("PLEASE ENTER FIRST NUMBER OF SEQUENCE\nENTER THE NUMBER OF SEQUENCE YOU WANT\nAND ENTER DQ ");
		s = scanner.nextInt() ;
		e = scanner.nextInt() ;
		dq = scanner.nextInt() ;
		System.out.println(ds(s , e , dq));
		System.out.println(as(s , e , dq));
		break ;
	case 3 :
		System.out.println("PLEASE ENTER MATRIXS SIZES");
		x = scanner.nextInt() ;
		float [][] first = new float [x][x];
		float [][] end = new float [x][x] ;
		float [][] result = new float [x][x] ;		
		getm (x ,x , first) ;
		y = 0 ;
		z = 0 ;
		getm(x ,x , end) ;			
		mm(x , x , first , x , x , end , result) ;	
		DecimalFormat ft = new DecimalFormat("#.##");
		
		System.out.println(Arrays.deepToString(result));
		System.out.println(Arrays.deepToString(first));
		System.out.println(Arrays.deepToString(end));
		
		break ;
	}
}
public static double fib (int x)
{
	if(x <= 1)
		return x ;
	return fib(x - 1) + fib(x - 2) ;
	}
public static double ds(int s , int e , int dq)
{
	if(e <= 1)
		return s ;
	return ds(s , e - 1 , dq) + dq ;
}
public static double as(int s , int e , int dq)
{
	if(e <= 1)
		return s ;
	return as(s , e - 1 , dq) * dq ;
}
static void mm(int row1, int col1, float[][] first, int row2, int col2, float[][] end,float[][] result)         
{if (i >= row1) 
return; 
if (j < col2) 
{if (k < col1) 
{ result[i][j] += first[i][k] * end[k][j]; 
 k++; 
 mm(row1, col1, first, row2, col2, end, result); } 
k = 0; 
j++; 
mm(row1, col1, first, row2, col2, end, result); } 
j = 0; 
i++; 
mm(row1, col1, first, row2, col2, end, result); } 
static void getm(int row1 , int col1 , float [][] tmp)
{	Scanner scanner = new Scanner(System.in) ;
	if(y >= row1)
		return ;
	if(z < col1)
	{
		tmp[y][z] = scanner.nextFloat() ;
		z++ ;
		getm (row1 , col1 , tmp);
	}
	z = 0 ;
	y ++ ;
	getm (row1 , col1 , tmp) ;
		}

/*
public static void mm(int n , float a[][] , float b[][] , float c[][] ) {
	if(i >= n)
		return ;
	if(j < n) {
		if(k < n) {
			c[i][j] += a[i][k] * b[k][j] ;
			k ++ ;
			mm(n , a , b , c) ;
		}
		k = 0 ;
		mm(n , a , b , c) ;
		j ++ ;
	}
	j = 0 ;
	mm(n , a , b , c) ;
	i ++ ;	}	
	*/	
/*
public static void getmatrixs (int x , float a[][])
{
	Scanner s = new Scanner(System.in) ;
	if(y >= x)
		return ;
	if(z < x)
		{
		System.out.println("enter next number");
			a[y][z] = s.nextFloat() ;
			z++ ;
			getmatrixs(x , a) ;
		}
	z = 0 ;
	getmatrixs(x , a) ;
	y ++ ;
	}*/
}



