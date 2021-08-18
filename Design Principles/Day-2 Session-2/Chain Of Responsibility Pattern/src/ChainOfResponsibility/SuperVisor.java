package ChainOfResponsibility;

public class SuperVisor extends ILeaveRequestHandler {

	public SuperVisor(int days) {
		this.days = days;
	}

}
