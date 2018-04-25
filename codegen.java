import java.util.*;
import java.io.*;

public class codegen{
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter expression :");
		String s = scan.nextLine();
		int size = s.length();
		int j=0;

		System.out.println("MOV R"+j+" "+s.charAt(size-1));
		for(int i=size-1;i>0;i--)
		{
			if(s.charAt(i)=='*' || s.charAt(i)=='-' || s.charAt(i)=='+' || s.charAt(i)=='/')
			{
				j++;
				System.out.println("MOV R"+j+" "+s.charAt(i-1));
			
				switch(s.charAt(i))
				{
					case '*': System.out.println("MUL R"+j+"R"+(j-1)); break;
					case '-': System.out.println("SUB R"+j+"R"+(j-1)); break;					
					case '+': System.out.println("ADD R"+j+"R"+(j-1)); break;
					case '/': System.out.println("DIV R"+j+"R"+(j-1)); break;
						
				}
			}
			if(s.charAt(i)=='=')
				System.out.println("MOV "+s.charAt(0)+" R"+j);
		}
		
	}
}
