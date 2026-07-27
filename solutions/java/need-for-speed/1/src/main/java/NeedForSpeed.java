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

	

    public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}



	public int getBatteryDrain() {
		return batteryDrain;
	}



	public void setBatteryDrain(int batteryDrain) {
		this.batteryDrain = batteryDrain;
	}



	public int getMetersDriven() {
		return metersDriven;
	}



	public void setMetersDriven(int metersDriven) {
		this.metersDriven = metersDriven;
	}



	public int getBattery() {
		return battery;
	}



	public void setBattery(int battery) {
		this.battery = battery;
	}



	public boolean batteryDrained() {
    	if (battery>=batteryDrain) {
			return false;
		}
    	return true;
    }

    public int distanceDriven() {
    	return metersDriven;
    }

    public void drive() {
    	if (battery<batteryDrain || battery==0) {
			return;
		}
    	metersDriven+=speed;    	
    	battery-=batteryDrain;    	    	
    }

    public static NeedForSpeed nitro() {
    	NeedForSpeed n1= new NeedForSpeed(50, 4);   
    	return n1;
    }
}

class RaceTrack {
	private int distance;
	
    RaceTrack(int distance) {
    this.distance=distance;    
    }
    

    public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}


	public boolean canFinishRace(NeedForSpeed car) {
		int capacity= (car.getBattery()/car.getBatteryDrain())*car.getSpeed();
		if (capacity<distance) {
			return false;
		}
	return true;
	}
}
