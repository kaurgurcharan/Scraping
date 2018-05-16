package com.gurcharan.Scraping;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

//import java.io.IOException;

//import org.jsoup.nodes.Element;
import org.jsoup.Jsoup;

public class CallItSpringSale {

	
	//public static void main(String[] args) throws Exception{
	public void showData() throws Exception {	
		
	final Document docs = 
				Jsoup.connect("https://www.callitspring.com/ca/en/sale/women/c/510?show=All&viewAll=true&sort=&q=").get();
		
		
		//System.out.println(docs.outerHtml());
		
		for(Element row:docs.select("div.product-tile")) {
			
			final String title = row.select(".product-tile").text();
        	System.out.println("the title is " + title);
        	
//        	final String rating = row.select(".imdbRating").text();
//        	System.out.println("the rating is " + rating);
        	
        //	System.out.println(title + "Rating " + rating);
			
		}
	}
		
	//}
}
