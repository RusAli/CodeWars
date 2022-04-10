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
  public class Fighter {
    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
      this.name = name;
      this.health = health;
      this.damagePerAttack = damagePerAttack;
    }
  }

  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    if (!fighter1.name.equals(firstAttacker)) {
      return declareWinner(fighter2, fighter1, firstAttacker);
    }

    fighter2.health -= fighter1.damagePerAttack;
    if (fighter2.health <= 0) {
      return firstAttacker;
    }
    return declareWinner(fighter2, fighter1, fighter2.name);
  }


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




































  }
