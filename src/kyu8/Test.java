package kyu8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test {

  public static String correct(String string) {

    String result = string.replace('5','S').replace('0','O').replace('1','I');
    return result;

  }





  public static void main(String[] args) {


    System.out.println(correct("501"));


  }
}
