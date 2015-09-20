package ua.yandex.shad;

public class App {

    public static final int MIN_TEMPERATURE = -273;

    public static double avg(Double x, Double y){
      return (x + y)/2;
    }
    
    public static int findTempClosestToZero(int ... arr){
	if (arr.length == 0) {
	  throw new IllegalArgumentException();      
	}
	for(int val : arr) {
	  if (val < MIN_TEMPERATURE) {
	    throw new IllegalArgumentException();
	  }
	}
	return arr[0];
    }
}
