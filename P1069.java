package problem01;

import java.util.ArrayList;
import java.util.Scanner;

public class P1069 {
	
	public static void main(String args[])
	{
		int m,n,s;
		Scanner input=new Scanner(System.in);
		ArrayList<String> winners=new ArrayList();
		m=input.nextInt();
		n=input.nextInt();
		s=input.nextInt();
		String nouse=input.nextLine();
		String[] friends=new String[m];
		for(int i=0;i<m;i++)
		{
			friends[i]=input.nextLine();
		}
		
		for(int i=s-1;i<m;)
		{
			if(!winners.contains(friends[i]))
			{
				winners.add(friends[i]);
				i+=n;
			}else
			{
				i++;
			}
		}
		
		if(winners.size()==0)
		{
			System.out.println("Keep going...");
		}else
		{
			for(String str:winners)
			{
				System.out.println(str);
			}
		}
	}
	

}
