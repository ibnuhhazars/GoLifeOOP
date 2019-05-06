package com.oop.archive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipMultiple {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		//TODO : Input File 1 = text1 , File 2 = text2 , File 3 = text3
		
		String userDir = System.getProperty("user.dir");
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Nama File 1 : ");
		String file1 = scan.nextLine();
		System.out.print("Input Nama File 2 : ");
		String file2 = scan.nextLine();
		System.out.print("Input Nama File 3 : ");
		String file3 = scan.nextLine();

		try {
			List<String> srcFiles = Arrays.asList(userDir + "/Zip1/" + file1 + ".txt",
					userDir + "/Zip2/" + file2 + ".txt", userDir + "/Zip3/" + file3 + ".txt");
			FileOutputStream fos = new FileOutputStream("multiCompressed.zip");
			ZipOutputStream zipOut = new ZipOutputStream(fos);
			for (String srcFile : srcFiles) {
				File fileToZip = new File(srcFile);
				FileInputStream fis = new FileInputStream(fileToZip);
				ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
				zipOut.putNextEntry(zipEntry);

				byte[] bytes = new byte[1024];
				int length;
				while ((length = fis.read(bytes)) >= 0) {
					zipOut.write(bytes, 0, length);
				}
				fis.close();
			}
			System.out.println("Compress Berhasil Brow !!");
			zipOut.close();
			fos.close();

		} catch (Exception e) {
			System.out.println("Nama File Salah Brow !!");
		}
	}
}
