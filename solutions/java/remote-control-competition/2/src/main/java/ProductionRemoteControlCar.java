class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{

	private int distance;
	private int victories;		
	   public ProductionRemoteControlCar() {
		   this.distance=0;
	   }
	   @Override
	public void drive() {
		   distance+=10;		   
	}
   @Override
	public int getDistanceTravelled() {
		// TODO Auto-generated method stub
		return distance;
	}

    public int getNumberOfVictories() {
    	return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
    	this.victories=numberOfVictories;
    }
	
	@Override
	public int compareTo(ProductionRemoteControlCar c) {
		return  c.victories -this.victories ;
	}
}
