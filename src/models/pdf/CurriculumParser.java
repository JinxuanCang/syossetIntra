package models.pdf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;

import models.Course;

public class CurriculumParser {

	private static ArrayList<Course> courses;
	private static File file = new File("res\\CurriculumManuals\\Input\\2019.pdf");

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
		writePDFtoText();
	}

}
