package ua.yandex.rd;

public class App {
  public static double avg(double ... arr) {
    double sum = 0.0;
    for (double val : arr)
      sum += val;
    return sum / arr.length;
  }
}