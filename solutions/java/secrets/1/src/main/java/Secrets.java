public class Secrets {
    public static int shiftBack(int value, int amount) {
    	int result=value >>> amount;
    	return result;
    }

    public static int setBits(int value, int mask) {
    	int result=value | mask;
    	return result;
    }

    public static int flipBits(int value, int mask) {
    	int result= value ^ mask;
    	return result;
    }

    public static int clearBits(int value, int mask) {
    	int maskNew= ~ mask;
    	int result= value & maskNew;
    	return result;
    }
}