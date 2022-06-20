package kyu8;

public class Solutions {

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

//  5)

//  Playing with cubes I
//  https://www.codewars.com/kata/playing-with-cubes-i/train/java

  /*
  Create a public class called Cube without a constructor which gets one single private integer variable Side, a getter GetSide() and a setter SetSide(int num) method for this property. Actually, getter and setter methods are not the common way to write this code in C#. In the next kata of this series, we gonna refactor the code and make it a bit more professional...

  Notes:

  There's no need to check for negative values!
  initialise the side to 0.
*/

  public class Cube{
    private int Side;

    public int getSide() {
      return this.Side;
    }

    public void setSide(int side) {
      this.Side = side;
    }
  }

//  6)

//  Building blocks
//  https://www.codewars.com/kata/building-blocks/train/java
/*
  Write a class Block that creates a block (Duh..)

          ##Requirements
  The constructor should take an array as an argument, this will contain 3 integers of the form [width, length, height] from which the Block should be created.
  Define these methods:
          `getWidth()` return the width of the `Block`
          `getLength()` return the length of the `Block`
          `getHeight()` return the height of the `Block`
          `getVolume()` return the volume of the `Block`
          `getSurfaceArea()` return the surface area of the `Block`

          ##Examples
  Block b = new Block(new int[]{2,4,6}) -> creates a `Block` object with a width of `2` a length of `4` and a height of `6`
          b.getWidth() // -> 2
          b.getLength() // -> 4
          b.getHeight() // -> 6
          b.getVolume() // -> 48
          b.getSurfaceArea() // -> 88
  */

  public class Block{

    int width;
    int length;
    int height;
    int volume;
    int surfaceArea;

    public int getWidth() {
      return width;
    }

    public int getLength() {
      return length;
    }

    public int getHeight() {
      return height;
    }

    public int getVolume() {
      return volume;
    }

    public int getSurfaceArea() {
      return surfaceArea;
    }


    public Block(int[] block){
      width = block[0];
      length = block[1];
      height = block[2];

      volume = width*length*height;
      surfaceArea = 2 * (width*length + width*height + length*height);

    }
  }

//  7)
//  Two fighters, one winner.
//  https://www.codewars.com/kata/577bd8d4ae2807c64b00045b/train/java

  /*
  Create a function that returns the name of the winner in a fight between two fighters.
  Each fighter takes turns attacking the other and whoever kills the other first is victorious.
  Death is defined as having health <= 0.

  Each fighter will be a Fighter object/instance.
  See the Fighter class below in your chosen language.

  Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0.
  You can mutate the Fighter objects.

  Example:
  declare_winner(Fighter("Lew", 10, 2), Fighter("Harry", 5, 4), "Lew") => "Lew"

  Lew attacks Harry; Harry now has 3 health.
  Harry attacks Lew; Lew now has 6 health.
  Lew attacks Harry; Harry now has 1 health.
  Harry attacks Lew; Lew now has 2 health.
  Lew attacks Harry: Harry now has -1 health and is dead. Lew wins.

  public class Fighter {
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
      this.name = name;
      this.health = health;
      this.damagePerAttack = damagePerAttack;
    }
  }

*/
//TODO : 7)


//  8)
//  How good are you really?
//  https://www.codewars.com/kata/5601409514fc93442500010b/train/java

/*
  There was a test in your class and you passed it. Congratulations!
  But you're an ambitious person. You want to know if you're better than the average student in your class.

  You receive an array with your peers' test scores. Now calculate the average and compare your score!

  Return True if you're better, else False!

  Note:
  Your points are not included in the array of your class's points.
  For calculating the average point you may add your point to the given array!
*/

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

//  9)
//  Abbreviate a Two Word Name
//  https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java

/*
  Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
  The output should be two capital letters with a dot separating them.
  It should look like this:

  Sam Harris => S.H
  patrick feeney => P.F

*/

  public static String abbrevName(String name) {
    name = name.toUpperCase();

    String[] names = name.split(" ");

    return names[0].charAt(0)+"."+names[1].charAt(0);
  }

//  10)
// Triple Trouble
//  https://www.codewars.com/kata/5704aea738428f4d30000914/train/java

/*

  Create a function that will return a string that combines all of the letters of the three inputed strings in groups.
  Taking the first letter of all of the inputs and grouping them next to each other.
  Do this for every letter, see example below!

  E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"

  Note: You can expect all of the inputs to be the same length.
*/


  public static String tripleTrouble(String one, String two, String three) {
    String result = "";
    for (int i = 0; i < one.length(); i++) {
      result += ""+ one.charAt(i)+two.charAt(i)+three.charAt(i);
    }
    return result;
  }

//  11)
//  The Feast of Many Beasts
//  https://www.codewars.com/kata/5aa736a455f906981800360d/train/java
/*

  All of the animals are having a feast! Each animal is bringing one dish.
  There is just one rule: the dish must start and end with the same letters as the animal's name.
  For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.

  Write a function feast that takes the animal's name and dish as arguments and
  returns true or false to indicate whether the beast is allowed to bring the dish to the feast.

  Assume that beast and dish are always lowercase strings, and that each has at least two letters.
  beast and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the string.
  They will not contain numerals.

*/

  public static boolean feast(String beast, String dish) {

    if(beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1)){
      return true;
    }
    return false;
  }

//  12)
//  Find the position!
//  https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java
/*

  When provided with a letter, return its position in the alphabet.

          Input :: "a"

  Ouput :: "Position of alphabet: 1"

  This kata is meant for beginners. Rank and upvote to bring it out of beta
*/

  public static String position(char alphabet) {
    String alph = "abcdefghijklmnopqrstuvwxyz";
    String mes = "Position of alphabet: ";

    return mes + (alph.indexOf(alphabet)+1);
  }

//  13)
//  Array plus array
//  https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java
/*

  I'm new to coding and now I want to get the sum of two arrays...actually the sum of all their elements.
  I'll appreciate for your help.

  P.S. Each array includes only integer numbers. Output is a number too.
*/

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    int sum = 0;
    for (int i = 0; i < arr1.length; i++) {
      sum += arr1[i]+arr2[i];
    }
    return sum;
  }

//  14)
//  Convert boolean values to strings 'Yes' or 'No'.
// https://www.codewars.com/kata/53369039d7ab3ac506000467/train/java

/*
Complete the method that takes a boolean value and return a "Yes" string for true,
  or a "No" string for false.
*/
  public static String boolToWord(boolean b) {
  if(b == true){
    return "Yes";
  }
  else{
    return "No";
  }
}

//  15)
//  Basic Mathematical Operations
//  https://www.codewars.com/kata/57356c55867b9b7a60000bd7/train/java

/*
  Your task is to create a function that does four basic mathematical operations.

  The function should take three arguments - operation(string/char), value1(number), value2(number).
  The function should return result of numbers after applying the chosen operation.

  Examples(Operator, value1, value2) --> output
          ('+', 4, 7) --> 11
          ('-', 15, 18) --> -3
          ('*', 5, 5) --> 25
          ('/', 49, 7) --> 7

*/

  public static Integer basicMath(String op, int v1, int v2) {
    int result = 0;
    switch (op){
      case "+" :
        result = v1+v2;
        break;
      case "-" :
        result =  v1-v2;
        break;
      case "*" :
        result = v1 * v2;
        break;
      case "/" :
        result = v1 / v2;
        break;
    }
    return result;

  }

//  16)
////  Convert a string to an array
////  https://www.codewars.com/kata/57e76bc428d6fbc2d500036d/train/java

  public static String[] stringToArray(String s) {
    String[] arr = s.split(" ");
    return arr;
  }


//  17)
//  Reversed sequence
//  https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java

  public static int[] reverse(int n){

    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = n;
      n--;
    }
    return arr;
  }


//  18)
//  Correct the mistakes of the character recognition software
//  https://www.codewars.com/kata/577bd026df78c19bca0002c0/train/java
/*

  Character recognition software is widely used to digitise printed texts.
  Thus the texts can be edited, searched and stored on a computer.

  When documents (especially pretty old ones written with a typewriter),
  are digitised character recognition softwares often make mistakes.

  Your task is correct the errors in the digitised text. You only have to handle the following mistakes:

  S is misinterpreted as 5
  O is misinterpreted as 0
  I is misinterpreted as 1
  The test cases contain numbers only by mistake.

*/
  public static String correct(String string) {

  String result = string.replace('5','S').replace('0','O').replace('1','I');
  return result;

}

//  19)
//  Even or Odd
//  https://www.codewars.com/kata/53da3dbb4a5168369a0000fe/train/java

 /*
  Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.

  */
  public class EvenOrOdd {
    public static String even_or_odd(int number) {
      if(number % 2 == 0 ){
        return "Even";
      }else {
        return "Odd";
      }

    }
  }

//  20)
//  Sum of positive
//  https://www.codewars.com/kata/5715eaedb436cf5606000381/train/java
/*
  You get an array of numbers, return the sum of all of the positives ones.

  Example [1,-4,7,12] => 1 + 7 + 12 = 20

  Note: if there is nothing to sum, the sum is default to 0.
*/

  public class Positive{

    public static int sum(int[] arr){

      if(arr != null && arr.length > 0){

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
          if(arr[i] > 0){
            sum +=arr[i];
          }
        }
        return sum;
      }
      return 0;
    }
  }

//  21)
//  Return Negative
//  https://www.codewars.com/kata/55685cd7ad70877c23000102/train/java
/*
  In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

  Examples
  Kata.makeNegative(1);  // return -1
  Kata.makeNegative(-5); // return -5
  Kata.makeNegative(0);  // return 0
  Notes
  The number can be negative already, in which case no change is required.
  Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.
*/

  public class Kata {

    public static int makeNegative(final int x) {
      return -Math.abs(x);
    }

  }

//  22)
//  Opposite number
//  https://www.codewars.com/kata/56dec885c54a926dcd001095/train/java
/*
  Very simple, given an integer or a floating-point number, find its opposite.

  Examples:

          1: -1
          14: -14
          -34: 34
*/

//  public class Kata
//  {
//    public static int opposite(int number)
//    {
//      return number *=(-1);
//    }
//  }

//  23)
//  Reversed Strings
//  https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java

/*
  Complete the solution so that it reverses the string passed into it.

          'world'  =>  'dlrow'
          'word'   =>  'drow'
*/

  public class Kata {
    public static String solution(String str) {
      return new StringBuilder(str).reverse().toString();
    }
  }











}


































