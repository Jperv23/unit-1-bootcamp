
public class Loops {

    public static void main(String args[]) {


    }

    public static void printOneToTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void printOneToTen2() {
        int[] oneTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : oneTen) {
            System.out.println(i);
        }
    }

    public static void printsN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void printsSum() {
        for (int i = 1; i < 10; i++) {
            int sum = i + i++;
            System.out.println(sum);
        }
    }


}
