package ex;

import java.util.*;

/*
 * Date: 2016/12/12
 * Author: 105021031  ©s¨Ê¿A
 */
public class ex01 {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();

		for (int i = 0; i < n; i++) {
			int all = src.nextInt();
			int m = src.nextInt();
			int k = src.nextInt();
			int data[] = new int[k];
			int sum = 0, ram = 0;
			for (int j = 0; j < k; j++) {
				data[j] = src.nextInt();
			}
			for (int a = 0; a < k - 1; a++) {
				for (int b = a + 1; b < k; b++) {
					if(data[a]>data[b])
					{
					ram = data[a];
					data[a] = data[b];
					data[b] = ram;
					}
				}
			}
			for (int t = 0; t < m; t++) {
				sum += data[t];
			}
			if (sum > all) {
				System.out.print("Impossible");
			} else {
				System.out.print(sum);
			}
		}
	}
}
