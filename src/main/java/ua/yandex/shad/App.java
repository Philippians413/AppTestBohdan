package ua.yandex.shad;

public class App {

    public static void main(String[] args) {
      System.out.print(avg(3.0,3.0));
    }
	
    private App(){}

    public static final int MIN_TEMPERATURE = -273;

    public static double avg(Double x, Double y){
      return (x + y)/2;
    }
    
    public static int findTempClosestToZero(int ... arr){
	if (arr.length == 0) {
	  throw new IllegalArgumentException();      
	}
	int min = arr[0];
	for(int val : arr) {
	  if (val == 0) return 0;
	  if (val < min) {
	    min = val;
	  }
	  if (val < MIN_TEMPERATURE) {
	    throw new IllegalArgumentException();
	  }
	}
	return min;
    }
}
