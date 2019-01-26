public class Conditionals {

  public static void main(String args[]) {

  }

  public static boolean isOdd(int n) {
    if ((n & 1) != 0) {
    }
    return true;
  }

  public static boolean isMultipleOfThree(int n) {
    if (n % 3 == 0) {
    }
    return true;
  }

  public static boolean isOddAndMultipleOfThree() {
    if ((n & 1) != 0 && (n % 3 == 0)) {
    }
    return true;
  }

  public static boolean isOddAndIsMultipleOfThree2(int n){
    if ((n % 2 == 0) && (n % 3 != 0)){
    }
    return false;
  }

  public static void fizzMultipleofThree(int n){
    if (n % 3 == 0) {
      System.out.println("Fizz");
    }else{
      System.out.println("n");
    }
  }

  public static boolean personIsFromLondon(String person){
    if (person.setCity().equals("London")){
    }
    return true;
  }

  public static char personNameIsLongerThanFive(char person){
    char person = getName();
      if (person.lenght > 5){
        System.out.println(person);
      }else{
        System.out.println("Name is too short");
      }
    }

  }



}

