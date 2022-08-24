package kyu7;

public class Solutions {

  /**
   * 1)
   * Regex validate PIN code
   * https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java
   *
   * ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
   *
   * If the function is passed a valid PIN string, return true, else return false.
   *
   * Examples (Input --> Output)
   * "1234"   -->  true
   * "12345"  -->  false
   * "a234"   -->  false
   */

  public static boolean validatePin(String pin) {

    return pin.matches("\\d{4} | \\d{6}");
  }

  /**
   * 2)
   * Vowel Count
   * https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java
   *
   * Return the number (count) of vowels in the given string.
   *
   * We will consider a, e, i, o, u as vowels for this Kata (but not y).
   *
   * The input string will only consist of lower case letters and/or spaces.
   */

  public static int getCount(String str) {
    if(str.length() !=0 && str != null){
      int count = 0;
      for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
          count++;
        }
      }

      return count;
    }

    return 0;
  }

  /**
   * 3)
   * Disemvowel Trolls
   * https://www.codewars.com/kata/52fba66badcd10859f00097e/train/java
   *
   * Trolls are attacking your comment section!
   *
   * A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
   *
   * Your task is to write a function that takes a string and return a new string with all vowels removed.
   *
   * For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
   *
   * Note: for this kata y isn't considered a vowel.
   */

  public static String disemvowel(String str) {
    String res = str.replaceAll("[aeiouAEIOU]", "");

    return res;
  }

  /**
   * 4)
   * Highest and Lowest
   * https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java
   *
   * In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
   *
   * Examples
   * highAndLow("1 2 3 4 5")  // return "5 1"
   * highAndLow("1 2 -3 4 5") // return "5 -3"
   * highAndLow("1 9 3 4 -5") // return "9 -5"
   */

  public static String highAndLow(String numbers) {
    String[] nums = numbers.split("\s");
    int max = Integer.parseInt(nums[0]);
    int min = Integer.parseInt(nums[0]);

    for(int i = 1; i < nums.length; i++){
      max = Math.max(max,Integer.parseInt(nums[i]));
      max = Math.min(min,Integer.parseInt(nums[i]));
    }

    return max + " " + min;

  }














}
