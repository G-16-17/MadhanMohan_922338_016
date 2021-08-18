public class MessageSubscriberOne implements Observer {

	@Override
	public void update(MessagePublisher msg) {
		System.out.println("MessageSubscriberThree :: " + msg.getMessageContent());

	}

}