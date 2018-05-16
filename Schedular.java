package com.gurcharan.Scraping;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class Schedular implements Job{

	public void execute(JobExecutionContext arg0) throws JobExecutionException{
		
		
		try {
			 Document docs = Jsoup.connect("https://www.callitspring.com/ca/en/sale/women/c/510?show=All&viewAll=true&sort=&q=").get();
			 Elements temp = docs.select("div.product-tile");
			 
				// System.out.println("temp is " +temp);
					int i = 0;
					for(Element list:temp) {
						i++;
						System.out.println(i + " " + list.getElementsByTag("a").first().text());
				
					}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println(docs.outerHtml());	
		 
		 
//		 for(int j=0;j<50;j++) {
//			 System.out.println("*");
//		 }
		

	}
}
