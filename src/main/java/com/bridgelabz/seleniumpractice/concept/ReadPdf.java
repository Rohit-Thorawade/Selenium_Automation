/**
 * @author Rohit Thorawade
 * @purpose Reading data from pdf
 *
 */
package com.bridgelabz.seleniumpractice.concept;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadPdf {
	
	public static void main(String[] args) throws IOException
	{
		FileInputStream obj =new FileInputStream("/home/admin-1/eclipse-workspace/Selenium/src/main/java/com/bridgelabz/seleniumpractice/concept/Selenium Notes.pdf");
		PDDocument objdoc = PDDocument.load(obj);
		PDFTextStripper objpdf = new PDFTextStripper();
		String pdfcontent = objpdf.getText(objdoc);
		System.out.println(pdfcontent);
	}

}
