/*3. Write a program in java to find sum of each diagonal elements of an user entered 3X
3 matrix of nos*/

import java.util.*;
public class lab7p3 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
	        int i,j,row,col,sum=0;
	
		row = 3;
		
		col = 3;

		int[][] mat = new int[row][col];
 
    		System.out.println("Enter the elements of 3x3 matrix") ;
    		for(i=0;i<row;i++)
    		{ 
	    		for(j=0;j<col;j++)
	    		{ 
	        		mat[i][j] = sc.nextInt();
    			}
		}
		
    		System.out.println("The elements of the matrix") ;
    		for(i=0;i<row;i++)
    		{ 
	    		for(j=0;j<col;j++)
	    		{ 
	       	 		System.out.print(mat[i][j]+"\t");
    			}
      	 		System.out.println("");
		}

    		for(i=0;i<row;i++)
    		{ 
	    		for(j=0;j<col;j++)
	    		{ 
				if(i==j)	
				{
					sum = sum + mat[i][j];
				}
    			}
		}

    		System.out.printf("SUM of DIAGONAL elements of the matrix = "+sum) ;
 	}	
}

