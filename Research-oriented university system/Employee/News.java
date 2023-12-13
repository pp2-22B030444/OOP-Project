package Employee ;

import java.text.SimpleDateFormat;
import java.util.Date;


public class News implements NewsObserver
{
	
	public String topic;
	public String text;
	public Date date;
	public News(){
		
	}

	public News(String topic, String text, Date date) {
		this();
		this.topic = topic;
		this.text = text;
		this.date = date;
	}
	
	public void viewNews() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println("Topic: " + topic);
        System.out.println("Text: " + text);
        System.out.println("Date: " + dateFormat.format(date));
    }

	@Override
	public void update(News news) {
	     System.out.println("Received a news update:");
	     System.out.println(news);		
	}
	@Override
	public String toString() {
		return "News [topic=" + topic + ", text=" + text + ", date=" + date + "]";
	}
	
}