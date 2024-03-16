package Lab1;

import java.io.File;
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap duong dan: ");
		String path = sc.nextLine();

		File file = new File(path);

		if (!file.exists()) {
			System.out.println("Duong dan khong ton tai");
			return;
		}

		if (file.isDirectory()) {
			delete(file);
		} else {
			deleteFile(file);
		}

		System.out.println("Xoa");
	}

	private static void delete(File f) {
		File[] files = f.listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isDirectory()) {
					delete(file);
				} else {
					deleteFile(file);
				}
			}
		}
		f.delete();
	}

	private static void deleteFile(File file) {
		file.delete();
	}

}
