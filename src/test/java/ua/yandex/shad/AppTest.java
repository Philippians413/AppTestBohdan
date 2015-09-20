package ua.yandex.shad;

import org.junit.Test;
import static org.junit.Assert.*;


public class AppTest {
  
  @Test
  public void testAvg() {    
    double x = 0.0; double y = 0.0; 
    double expResult = 0.0;
    double result = App.avg(x, y);    
    assertEquals(expResult, result, 0.001);
    //fail("The test case is a prototype.");
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testFindTempClosestToZero_FailOnEmptyList(){
    int[] arr = {};
    App.findTempClosestToZero(arr);    
  }
  
  @Test
  public void testFindTempClosestToZero_WithSingleElement(){
    int[] arr = {1};
    int expResult = 1;
    int result = App.findTempClosestToZero(arr);
    assertEquals(expResult, result);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testFindTempClosestToZero_FailTemperatureOutOfRange(){
    int[] arr = {0, 10, -100, -274};   
    App.findTempClosestToZero(arr);    
  }

}
