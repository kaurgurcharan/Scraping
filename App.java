package com.gurcharan.Scraping;

//import java.io.IOException;
//
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    
	public static void main( String[] args ) throws Exception
    {
    	JobDetail job = JobBuilder.newJob(Schedular.class).build();
    	//System.out.println("job is " +job);
    	
    	Trigger t1 = TriggerBuilder.newTrigger().withIdentity("CronTrigger").withSchedule(CronScheduleBuilder.cronSchedule("0 0/1 * 1/1 * ? *")).build();
    	//System.out.println("trigger is" +t1);
    	
    	Scheduler sc = StdSchedulerFactory.getDefaultScheduler();
    	//System.out.println("Schedulaer is" +sc);
    	
    	sc.start();
    	sc.scheduleJob(job, t1);
    	
    	//AldoSale ads = new AldoSale();
    	//ads.showData();
//        final Document document = Jsoup.connect("https://www.imdb.com/chart/top").get();
//        
//       //System.out.println(document.outerHtml());
//        
//        System.out.println("Got the document ");
//        
//        for(Element row:document.select("table.chart tr")) {
//        	
//        	final String title = row.select(".titleColumn").text();
//        	System.out.println("the title is " + title);
//        	final String rating = row.select(".imdbRating").text();
//        	System.out.println("the rating is " + rating);
//        	
//        	System.out.println(title + "Rating " + rating);
//        }
        
        
    }

	private static JobBuilder newTrigger() {
		// TODO Auto-generated method stub
		return null;
	}
}
