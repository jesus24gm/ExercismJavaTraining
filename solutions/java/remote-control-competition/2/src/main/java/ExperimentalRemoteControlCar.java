public class ExperimentalRemoteControlCar implements RemoteControlCar {

	private int distance;
	
	
	
public ExperimentalRemoteControlCar() {
		this.distance = 0;
	}
@Override
public void drive() {
	distance+=20;
}
@Override
	public int getDistanceTravelled() {
		// TODO Auto-generated method stub
		return distance;
	}
}
