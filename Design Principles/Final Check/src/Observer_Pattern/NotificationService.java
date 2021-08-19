package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {

	public List<INotificationObserver> list = new ArrayList<>();

	@Override
	public void addSubscriber(INotificationObserver iNotificationObserver) {
		list.add(iNotificationObserver);
	}

	@Override
	public void removeSubscriber(INotificationObserver iNotificationObserver) {
		list.remove(iNotificationObserver);
	}

	@Override
	public void notifySubscribers(int noOfTickets) {
		if (noOfTickets >= 100) {
			for (INotificationObserver iNotObs : list) {
				iNotObs.onTicketsBooked();
			}
		}
	}

}
