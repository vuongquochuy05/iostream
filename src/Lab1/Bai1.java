package Lab1;

import java.io.File;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		File f = new File(path);
		long fSize = f.length();
		System.out.println(fSize);
	}
}
