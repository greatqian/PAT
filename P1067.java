package problem01;

import java.util.Scanner;

public class P1067 {
	
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		String inputStr=input.nextLine();
		String[] strAndNum=inputStr.split(" ");
		String password=strAndNum[0];
		int count=Integer.parseInt(strAndNum[1]);
		int i=0;
		while(i++<count)
		{
			String inputPassword=input.nextLine();
			if(inputPassword.equals(password))
			{
				System.out.println("Welcome in");
				break;
			}else if(inputPassword.equals("#"))
			{
				break;
			}
			else
			{
				System.out.println("Wrong password: "+inputPassword);
			}
			
			if(i==count)
			{
				System.out.println("Account locked");
				break;
			}
		}
	}

}
