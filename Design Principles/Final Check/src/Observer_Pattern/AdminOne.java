package Observer_Pattern;

public class AdminOne implements INotificationObserver {

	@Override
	public void onTicketsBooked() {
		System.out.println("Admin 1 : Notification received : More than 100 tickets booked");
	}

}
