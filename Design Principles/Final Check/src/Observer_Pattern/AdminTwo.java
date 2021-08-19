package Observer_Pattern;

public class AdminTwo implements INotificationObserver {

	@Override
	public void onTicketsBooked() {
		System.out.println("Admin 2 : Notification received : More than 100 tickets booked");
	}

}
