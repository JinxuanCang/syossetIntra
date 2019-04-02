package pdf;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

public class CurriculumGenerator {
	private static File testFile = new File("res\\CurriculumManuals\\Output\\test.pdf");

	private static File manualFile = new File("res\\CurriculumManuals\\Input\\2019.pdf");

	public static void generate() {
		try (PDDocument doc = new PDDocument(); PDDocument coverDoc = PDDocument.load(manualFile)) {

			doc.addPage(coverDoc.getPage(0));

			doc.save(testFile);
			System.out.println("saved");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		generate();
	}
}
