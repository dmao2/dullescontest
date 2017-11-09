package EducationalGames;
/*
LANG: JAVA
TASK: 
*/

import java.io.*;
import java.util.*;
public class fsmsReg
{
	public static void main(String[] args) throws IOException
	{
		Scanner c = new Scanner(System.in);
		String str = c.nextLine();
		while(!str.equals("Done"))
		{
			if(str.length()==0) break;
			String[] tok = str.split("[\t]");
//			System.out.println(Arrays.toString(tok));
			System.out.print("First Name: "+lower(tok[1])+", Last Name: "+lower(tok[0])+", Grade: "+tok[2]+", Tests: ");
			for(int i=3; i<3+4; i++) 
			{
				if(tok[i].equals("1"))
				{
					switch(i)
					{
						case 3: System.out.println("NS"); break;
						case 4: System.out.println("Calc"); break;
						case 5: System.out.println("Math"); break;
						case 6: System.out.println("Sci"); break;
					}
				}
			}
//			System.out.println();
			str = c.nextLine();
		}
	}
	
	
	
	public static String lower(String str)
	{
		String ret = "";
		for(int i=0; i<str.length(); i++) ret+=(char) (str.charAt(i)+32);
		return ret;
	}
}
