/*
 * File         :  HelloJava.java
 * Description  :  Java Program to multiply two Matrix
 * Author       :  Advait Arjit S
 * Version      :  1.0
 * Date         :  19/09/2023
 */
import java.util.Scanner;


public class MatrixProduct {


public static void main(String[] args) {


try (Scanner sc = new Scanner(System.in)) {

	System.out.println("Enter the no. of rows of First Matrix");

	

	int row1=sc.nextInt();

	

	System.out.println("Enter the no. of colums of First Matrix");

	

	int col1=sc.nextInt();

	

	System.out.println("Enter the no. of rows of Second Matrix");

	

	int row2=sc.nextInt();

	

	System.out.println("Enter the no. of colums of Second Matrix");

	

	int col2=sc.nextInt();

	

	int matrix1[][]=new int[row1][col1];

	

	int matrix2[][]=new int[row2][col2];

	

	int product[][]=new int[row1][col2];

	

	System.out.println("Enter the Elements of First Matrix");

	

	for(int i=0;i<row1;i++)

	

	{

	

	for(int j=0;j<col1;j++)

	

	{

	

	matrix1[i][j]=sc.nextInt();

	

	}

	

	}

	

	System.out.println("Enter the elements of Second Matrix");

	

	for(int i=0;i<row2;i++)

	

	{

	

	for(int j=0;j<col2;j++)

	

	{

	

	matrix2[i][j]=sc.nextInt();

	

	}

	

	}

	

	if(col1!=row2)

	

	{

	

		System.out.println("MULTIPLICATION IS NOT POSSIBLE");	

	

	}

	

	else

	System.out.println("Resultant Matrix is:");

	{

	

	for(int i=0;i<row1;i++)

	

		{

	

	for(int j=0;j<col2;j++)	

	

			{

	

		product[i][j]=0;

	

		for(int k=0;k<col1;k++)

	

		{

	

			product[i][j]+=matrix1[i][k]*matrix2[k][j];

	

		}

	

		System.out.print(product[i][j]+"\t");

	

			

	

		}

	

	System.out.println("\n");

	

		}

	

	}

}


}


}