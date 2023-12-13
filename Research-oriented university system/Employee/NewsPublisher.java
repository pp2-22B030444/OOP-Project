package Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsPublisher {
    private List<NewsObserver> observers;

    public NewsPublisher() {
        this.observers = new ArrayList<>();
    }

    public NewsPublisher(List<NewsObserver> observers) {
        this.observers = observers;
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
    }

    @Override
    public String toString() {
        return "NewsPublisher [observers=" + observers + "]";
    }

}


