package Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class NewsPublisher {
    private List<NewsObserver> observers;
	public Vector<News> news;
	

	public NewsPublisher() {
	    this.observers = new ArrayList<>();
	    this.news = new Vector<>();
	}

	public NewsPublisher(List<NewsObserver> observers) {
	    this.observers = observers;
	    this.news = new Vector<>();
	}


    public void addObserver(NewsObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(NewsObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(News news) {
        for (NewsObserver observer : observers) {
            observer.update(news);
        }
    }

    public void publishNews(String topic, String text, Date date) {
        News news = new News(topic, text, date);
        notifyObservers(news);
        Data.news.add(news);
    }
    public void removeNews(News oldNews) {
        int index = news.indexOf(oldNews);
        if (index != -1) {
            news.remove(index);
            notifyObservers(oldNews);
            Data.news.remove(index);
        }
    }
    
    
    @Override
    public String toString() {
        return "NewsPublisher [observers=" + observers + "]";
    }
	
}
