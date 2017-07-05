package problem01;

import java.util.Scanner;

public class P1066 {
	
	public static void main(String args[])
	{
		int m,n,a,b,x;
		Scanner input=new Scanner(System.in);
		m=input.nextInt();
		n=input.nextInt();
		a=input.nextInt();
		b=input.nextInt();
		x=input.nextInt();
//		int[][] matrix=new int[m][n];
		int inputNum;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
//				matrix[i][j]=input.nextInt();
				inputNum=input.nextInt();
				if(inputNum>=a&&inputNum<=b)
				{
					inputNum=x;
				}
				System.out.printf("%03d%c",inputNum,j==n-1?'\n':' ');
			}
		}
		
//		String[][] result=new String[m][n];
//		for(int i=0;i<m;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//			 	if(matrix[i][j]>=a&&matrix[i][j]<=b)
//			 	{
//			 		matrix[i][j]=x;
//			 	}
//			 	result[i][j]=changeToThree(matrix[i][j]);
//			 	if(j!=n-1)
//			 	{
//			 		System.out.print(result[i][j]+" ");
//			 	}
//			 	else if(j==n-1&&i!=m-1)
//			 	{
//			 		System.out.print(result[i][j]);
//			 		System.out.println();
//			 	}else
//			 	{
//			 		System.out.print(result[i][j]);
//			 	}
//			}
//		}
//		
//	}
	

	
//	public static String changeToThree(int a)
//	{
//		String value = "";
//		String[] num=new String[3];
//		int i=0;
//		while(a%10!=0)
//		{
//			num[i]=String.valueOf(a%10);
//			a=a/10;
//			i++;
//		}
//		for(int j=num.length-1;j>=0;j--)
//		{
//			if(num[j]==null)
//			{
//				num[j]="0";
//			}
//			value+=num[j];
//		}
//		return value;
//		
	}
	
	

}
