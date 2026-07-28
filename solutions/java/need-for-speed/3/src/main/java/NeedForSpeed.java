class NeedForSpeed {
	private int speed;
	private int batteryDrain;
	private int metersDriven;
	private int battery;
	
	
	NeedForSpeed(int speed, int batteryDrain) {
		this.speed = speed;
		this.batteryDrain = batteryDrain;
		this.metersDriven=0;
		this.battery=100;
	}

	


	public boolean batteryDrained() {
    	
    return battery<batteryDrain;
	
	}

    public int distanceDriven() {
    	return metersDriven;
    }

    public void drive() {
    	if (battery<batteryDrain) {
			return;
		}
    	metersDriven+=speed;    	
    	battery-=batteryDrain;    	    	
    }

    public static NeedForSpeed nitro() {
    	NeedForSpeed n1= new NeedForSpeed(50, 4);   
    	return n1;
    }
    public int maxDistance() {
    	return (battery/batteryDrain)*speed;
    }
}

class RaceTrack {
	private int distance;
	
    RaceTrack(int distance) {
    this.distance=distance;    
    }
    
	public boolean canFinishRace(NeedForSpeed car) {
		return car.maxDistance()>=distance;
	}
}
