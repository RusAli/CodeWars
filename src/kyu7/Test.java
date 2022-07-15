package kyu7;

public class Test {


  public static boolean validatePin(String pin) {

    return pin.matches("\\d{4} | \\d{6}");
  }

  public static void main(String[] args) {


  }
}
