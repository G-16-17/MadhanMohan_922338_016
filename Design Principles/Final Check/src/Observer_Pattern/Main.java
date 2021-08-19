package Observer_Pattern;

public class Main {
	public static void main(String[] args)
	{
		AdminOne a1=new AdminOne();
		AdminTwo a2=new AdminTwo();
		
		NotificationService service=new NotificationService();
		service.addSubscriber(a1);
		service.addSubscriber(a2);
		
		service.notifySubscribers(101);
		
		service.removeSubscriber(a1);
		
		service.notifySubscribers(99);
		
		service.notifySubscribers(199);
	}
}