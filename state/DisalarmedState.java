
public class DisalarmedState implements State {

	Alarm alarm;
	
	public DisalarmedState(Alarm alarm) {
		// TODO Auto-generated constructor stub
		this.alarm = alarm;
	}

	@Override
	public void enableAlarm() {
		// TODO Auto-generated method stub
		System.out.println("ALARMED");
		alarm.setState(alarm.getAlarmedState());

	}

	@Override
	public void disableAlarm() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();

	}

	@Override
	public void breakIn() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();

	}

	@Override
	public void silenceAlarm() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();

	}

}
