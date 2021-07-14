package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_숫자의개수1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int num = a * b * c;

		int arr[] = new int[10];

		while (num > 0) {
			arr[num % 10]++;
			num /= 10;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
