package ex;

import java.text.NumberFormat;
import java.util.Scanner;


/*
 * Date: 2016/12/12
 * Author: 105021031  ©s¨Ê¿A
 */
public class ex02 {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits( 3 );
		while (true) {
			
			String val = src.nextLine();
			String data[] = val.split(" ");
			int n=data.length;
			float sum = 0;

			for (int i = 0; i < n; i++) {
				sum += Integer.valueOf(data[i]);
			}
			System.out.println("Size" + n);
			System.out.print("Average" +nf.format(sum /n)  );
			
			
			
		}
	
	}
}