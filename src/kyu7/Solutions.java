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













}
