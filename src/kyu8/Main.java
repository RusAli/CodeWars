package kyu8;

public class Main {

//  1)
//  You Can't Code Under Pressure #1
//  https://www.codewars.com/kata/53ee5429ba190077850011d4/train/java

 /* Code as fast as you can! You need to double the integer and return it.*/

  public static int doubleInteger(int i) {
    i *= 2;
    return i;
  }

//2)
//  Opposites Attract
//  https://www.codewars.com/kata/555086d53eac039a2a000083/train/java

/*
  Timmy & Sarah think they are in love, but around where they live,
  they will only know once they pick a flower each.
  If one of the flowers has an even number of petals
  and the other has an odd number of petals it means they are in love.

  Write a function that will take the number of petals of each flower
  and return true if they are in love and false if they aren't.
 */


  public static boolean isLove(final int flower1, final int flower2) {
    return flower1 % 2 != flower2 % 2;
  }

//3)
//  Find the smallest integer in the array
//  https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
/*

  Given an array of integers your solution should find the smallest integer.

  For example:

  Given [34, 15, 88, 2] your solution will return 2
  Given [34, -345, -1, 100] your solution will return -345
  You can assume, for the purpose of this kata, that the supplied array will not be empty.

*/

//  4)
  public static int findSmallestInt(int[] args) {
    int min = args[0];
    for(int i = 1; i < args.length; i++){
      if ( args[i] < min){
        min = args[i];
      }
    }
    return min;
  }

//  If you can't sleep, just count sheep!!
//  https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
/*

  If you can't sleep, just count sheep!!

  Task:
  Given a non-negative integer, 3 for example,
  return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
  Input will always be valid, i.e. no negative integers.
*/

  public static String countingSheep(int num) {
    String result = "";
    for( int i = 1; i <= num; i++){
      result += i + " sheep...";
    }
    return result;
  }







}
