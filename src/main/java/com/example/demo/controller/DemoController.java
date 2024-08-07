package com.example.demo.controller;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	

	
	
	@GetMapping("/getvalue")
	public void getSomething() throws IOException{
		     
	          //
		//File fin=new File("C:\\Users\\Admin\\Downloads\\1407155000178501 _ 01-JAN-2022_31-DEC-2022_unlocked.pdf");    
	            try (Reader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Admin\\Downloads\\1407155000178501 _ 01-JAN-2022_31-DEC-2022_unlocked.docx"),  StandardCharsets.UTF_8))) {
	                int i;    
	                while((i=br.read())!=-1){  
	                System.out.print((char)i);  
	                }  
	                br.close();    
	            } catch (IOException e) {
	                e.printStackTrace();
	            }

//	                  try{    
//	                	  File f=new File("C:\\Users\\Admin\\Downloads\\testout.txt");
//	                      FileOutputStream fout=new FileOutputStream("C:\\Users\\Admin\\Downloads\\testout.txt");    
//	                         
//	                      byte b[]=text.getBytes("UTF-8");//converting string into byte array    
//	                      String s=new String(b, StandardCharsets.UTF_8);
//	                      System.err.println(s);
//	                      fout.write(b);    
//	                      fout.close();    
//	                      System.out.println("success...");    
//	                     }catch(Exception e){System.out.println(e);}    
//	                  doc.close();  
	               }    
	            //Closing the document  
	         
	    
	         }    
	         
		
	  
	  
	
	
	
	
	

