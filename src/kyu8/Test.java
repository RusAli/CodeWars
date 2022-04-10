package kyu8;

public class Test {

  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {

    int sum =0;
    for(int i =0; i < classPoints.length; i++){
      sum += classPoints[i];
    }
    int avg = sum/classPoints.length;
    if(avg > yourPoints){
      return false;
    }else {
      return true;
    }
  }

  public static void main(String[] args) {


    System.out.println(betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));


  }
}
