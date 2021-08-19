package Observer_Pattern;

public interface INotificationService {
	public void addSubscriber(INotificationObserver observer); 
	public void removeSubscriber(INotificationObserver observer);
	public void notifySubscribers(int noOfTickets);
	
}
