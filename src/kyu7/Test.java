package kyu7;

public class Test {


  public static boolean validatePin(String pin) {
    if(pin.length() == 4 || pin.length() == 6){

      for (char a : pin.toCharArray()) {
        if(!Character.isDigit(a)){

          return false;
        }
      }

      return true;

    }
    return false;
  }

  public static void main(String[] args) {


  }
}
