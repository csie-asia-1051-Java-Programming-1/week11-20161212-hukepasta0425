package hw;
import java.util.*;
/*
 * Date: 2016/12/12
 * Author: 105021***  ???
 */
public class hw01 {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		String val=src.next();
		int a=src.nextInt();
		int sum=0;
		
		for(int i=0;i<val.length();i++)
		{
			char n=val.charAt(i);
			if(n>=65 && n<=(90-a))
			{
				sum=n+a;
			}
			else
			{
				 sum=(n+a)-26;
			}
			System.out.print((char)sum);
		}
	
		

	}
}



//+2
//65-67
//90-