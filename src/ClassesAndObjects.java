
public class ClassesAndObjects {

    public static void main (String args[]) {
        Cat catOne = new Cat("Garfield", "Lasagna", 10);
        Cat catTwo = new Cat("Pink Panther", "Tuna", 15);
        Cat catThree = new Cat("Catwoman", "Pizza", 20);

        isOlder(catOne,catThree);
        makeBestFriends(catOne, catTwo);
        makeKitten(catOne,catThree);

    }

  public static boolean isOlder(int catA, int catB){
   return catA > catB;
  }

  public static void makeBestFriends(String catA, String catB){
        String food = "";
        setFavoriteFood(food);
  }

  public static String makeKitten(String catA, String catB){
        catA = getName();
        catB = getName();
        String newName = catA + catB;
        int age = setAge(0);
        String newCat = newName + " with age " + age;
        return newCat;
  }

  public static void adoption(String cat, String pers){
        Person person = new Person();
        person.setName();
  }






}
