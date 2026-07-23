import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
    	int num=random.nextInt(PLANET_CLASSES.length);
        char planet=PLANET_CLASSES[num];
        return planet;    
    }

    String randomShipRegistryNumber() {    	
    	return "NCC-"+(1000+random.nextInt(9000));
    }

    double randomStardate() {
    	return 41000.0+1000.0*random.nextDouble();
    	}
}
