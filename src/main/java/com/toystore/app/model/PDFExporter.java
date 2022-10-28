package com.toystore.app.model;
import java.awt.Color;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;


public class PDFExporter {
	
	private List<Cart> cProducts;

	public PDFExporter(List<Cart> cProducts) {
		super();
		this.cProducts = cProducts;
	}
		
	private void writeTableHeader(PdfPTable table) {
		 PdfPCell cell = new PdfPCell();
	        cell.setBackgroundColor(Color.LIGHT_GRAY);
	        cell.setPadding(10);
	         
	        Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN);
	        font.setColor(Color.BLACK);
	         
	        cell.setPhrase(new Phrase("Sr. No.", font));
	         
	        table.addCell(cell);
	        cell.setPhrase(new Phrase("Product Name", font));
	         
	        table.addCell(cell);
	         
	        cell.setPhrase(new Phrase("Product Type", font));
	        table.addCell(cell);
	         
	        cell.setPhrase(new Phrase("Quantity", font));
	        table.addCell(cell);
	         
	        cell.setPhrase(new Phrase("Price", font));
	        table.addCell(cell);
	         
	       
	}
	
	private void writeTableData(PdfPTable table) {
		
		
		int i = 1;
		for (Cart cart : cProducts) {
			
			table.addCell(String.valueOf(i));
			table.addCell(cart.getCname());
            table.addCell(cart.getCtype());
            table.addCell(String.valueOf(cart.getQuantity()));
            table.addCell(String.valueOf(cart.getCprice()));
            i++;
        }
		
	}
	
	public void export(HttpServletResponse response,float bagtotal1,String upi) throws DocumentException, IOException {
		Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());
         
        document.open();
        Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN);
        font.setSize(20);
        font.setColor(Color.BLACK);
         
        Paragraph p = new Paragraph("ToyStory", font);
        p.setAlignment(Paragraph.ALIGN_CENTER);
        
        Paragraph p1 = new Paragraph("***************Invoice***************", font);
        p1.setAlignment(Paragraph.ALIGN_CENTER);
       
        Paragraph p2 = new Paragraph("Total Amount : "+ bagtotal1);
        p2.setAlignment(Paragraph.ALIGN_BOTTOM);
        
        Paragraph p3 = new Paragraph("Paid by : "+ upi);
        p3.setAlignment(Paragraph.ALIGN_BOTTOM);
         
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
	    String currentDateTime = dateFormatter.format(new Date());
	     
	     
	     
	     Paragraph p4 = new Paragraph("Date & Time : "+ currentDateTime);
	     p4.setAlignment(Paragraph.ALIGN_BOTTOM);
	     
	     
        document.add(p);
        document.add(p1);
        document.add(p2);
        document.add(p3);
        document.add(p4);
        
        
        PdfPTable table = new PdfPTable(5);
        table.setWidthPercentage(100f);
        table.setWidths(new float[] {1.5f, 3.5f, 3.0f, 3.0f, 1.5f});
        table.setSpacingBefore(10);
         
        writeTableHeader(table);
        writeTableData(table);
         
        document.add(table);
         
        document.close();
         
		
	}

	
}
