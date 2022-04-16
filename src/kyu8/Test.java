package kyu8;

import java.util.stream.IntStream;

public class Test {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    int sum = 0;
    for (int i = 0; i < arr1.length; i++) {
      sum += arr1[i]+arr2[i];
    }
    return sum;
  }



  public static void main(String[] args) {

    int[] arr1 = {1,2,3};
    int[] arr2 = {4,5,6};
    int sum = 0;

    for (int i = 0; i < arr1.length; i++) {

      sum += arr1[i]+arr2[i];

    }

    System.out.println(sum);

  }
}
