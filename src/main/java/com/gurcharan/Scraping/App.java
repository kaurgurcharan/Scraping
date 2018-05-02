package com.gurcharan.Scraping;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        final Document document = Jsoup.connect("https://www.imdb.com/chart/top").get();
        
       //System.out.println(document.outerHtml());
        
        for(Element row:document.select("table.chart full-width tr")) {
        	
        	final String title = row.select(".titleColumn").text();
        	final String rating = row.select(".imdbRating").text();
        	
        	
        	System.out.println(title + "Rating " + rating);
        }
        
        
    }
}
