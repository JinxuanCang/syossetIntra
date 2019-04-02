package models.pdf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;

import models.curriculum.Course;

public class CurriculumParser {

	private static ArrayList<Course> courses;
	private static File file = new File("res\\CurriculumManuals\\Input\\2019.pdf");
	private static File fileLinux = new File("res/CurriculumManuals/Input/2019.pdf");

	public static void writePDFtoText() {
		try (PDDocument document = PDDocument.load(file);) {

			PDFTextStripper textStripper = new PDFTextStripper();
			String text = textStripper.getText(document);
			File output = new File("res\\CurriculumManuals\\Output\\2019.txt");
			try (FileWriter writer = new FileWriter(output);) {
				writer.write(text);
			}

		} catch (InvalidPasswordException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		parseDepartment();
	}

	public static void parseDepartment() {
		try (PDDocument document = PDDocument.load(fileLinux);) {

			PDFTextStripper textStripper = new PDFTextStripper();
			String text = textStripper.getText(document);

			String start = "[19]";
			String end = "[24]";

			int startIndex = text.indexOf(start);
			int endIndex = text.indexOf(end);

			text = text.substring(startIndex, endIndex);

			try (Scanner scanner = new Scanner(text)) {

				scanner.nextLine();

				String title = trimAndCapitalize(scanner.nextLine());

				System.out.println(title);
				System.out.println();

				int firstID = scanner.nextInt();
				scanner.nextLine();

				while (true) {
					try {
						scanner.nextInt();
						scanner.nextLine();
					} catch (Exception e) {
						break;
					}
				}

				scanner.nextLine();
				scanner.nextLine();
				scanner.nextLine();
				while (scanner.hasNextLine()) {
					String nextLine = scanner.nextLine();
					if (nextLine.substring(0, 1).startsWith("["))
						break;
					String ctitle = trimAndCapitalize(nextLine);
					String test = trimAndCapitalize(scanner.nextLine());
					String[] parts = test.split(" ");
					String ca = "", cname, cnumber;
					if (parts[0].substring(parts[0].length() - 1).equals(".")) {
						ca = parts[0];
						cname = parts[1] + " " + parts[2];
						cnumber = parts[3];
					} else {
						cname = parts[0] + " " + parts[1];
						cnumber = parts[2];
					}

					System.out.println(ctitle);
					System.out.println(ca + (ca.equals("") ? "" : " ") + cname);
					System.out.println(cnumber);
					System.out.println();
				}

				StringBuilder builder = new StringBuilder();
				while (scanner.hasNextLine()) {
					try {
						scanner.nextInt();
						break;
					} catch (Exception e) {
						String nextLine = scanner.nextLine();
						builder.append(nextLine);
					}
				}

				String description = builder.toString();

				System.out.println();

				System.out.println(description);

				System.out.println();
				int id = firstID;
				all: {
					while (scanner.hasNextLine()) {

						System.out.println(id);

						String courseName = trimAndCapitalize(scanner.nextLine());

						System.out.println(courseName);

						String line = scanner.nextLine();
						if (line.startsWith("("))
							line = scanner.nextLine();

						String[] csv = line.split(", ");
						int halfYearLength = csv[0].equals("Year") ? 2 : (-1);
						int halfPeriodLength = csv[1].equals("1 Period") ? 2 : -1;

						System.out.println("half year length" + halfYearLength);
						System.out.println("half period length" + halfPeriodLength);

						StringBuilder build = new StringBuilder();
						while (scanner.hasNextLine()) {
							try {
								scanner.nextInt();
								break;
							} catch (Exception e) {
								String nextLine = scanner.nextLine();
								build.append(nextLine);
							}
						}

						String coursedesc = build.toString();

						System.out.println(coursedesc);

						System.out.println();
					}
				}
			}

		} catch (InvalidPasswordException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String trimAndCapitalize(String str) {
		str = str.trim();
		String[] words = str.split(" ");
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
			builder.append(word + " ");
		}
		return builder.toString();
	}
}
