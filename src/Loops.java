
public class Loops {

    public static void main(String args[]) {

        printsSum2(10000);
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
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
            System.out.println(s);
        }
    }

    public static void printsSum2(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
            System.out.println(s);
        }
    }

    public static void printsS(int n, String s) {
        if (n >= 1) {
            for (int i = 0; i <= n; i++) {
                System.out.println(s);
                i++;
            }
        }else{
            System.out.println("\"\"");
        }
    }


}



