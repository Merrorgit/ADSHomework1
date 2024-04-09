import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    //task1 inear complexity O(n)
    public static int minarr(int n, int[] arr) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return (min);
    }

    public static void task1() {
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minarr(a, arr));
    }
    //task2 Linear complexity O(n)
    public static double avrarr(int n, int[] arr) {
        double average = 0;
        for (int i = 0; i < n; i++) {
            average = average + arr[i];
        }
        average = average / n;
        return (average);
    }

    public static void task2() {
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(avrarr(a, arr));
    }
    //task3 Linear complexity O(n)
    public static String primeornot(int a) {
        if (a < 2) {
            return ("This is not prime or composite number");
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return ("Composite");
            }
        }
        return ("Prime");
    }

    public static void task3() {
        int a = sc.nextInt();
        System.out.println(primeornot(a));
    }
    //task4 Linear complexity O(n)
    public static int fact(int a) {
        if (a == 0 || a == 1) {
            return 1;
        } else {
            return a * fact(a - 1);
        }
    }

    public static void task4() {
        int a = sc.nextInt();
        System.out.println(fact(a));
    }
    //task 5 Exponential complexity O(2^n)
    public static int fiban(int a) {
        if (a == 0)
            return 0;
        else if (a == 1)
            return 1;

        return fiban(a - 1) + fiban(a - 2);
    }

    public static void task5() {
        int a = sc.nextInt();
        System.out.println(fiban(a));
    }
    //task6 Linear complexity O(n)
    public static int powfunc(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * powfunc(a, n - 1);
    }

    public static void task6() {
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(powfunc(a, n));
    }

    //task7 Factorial Complexity O(n!)
    static String swap(String str, int l, int i) {
        char[] charArray = str.toCharArray();
        char temp = charArray[l];
        charArray[l] = charArray[i];
        charArray[i] = temp;
        return String.valueOf(charArray);
    }
    static void permut(String str, int l, int r){
        if(l==r) System.out.println(str);
        for (int i = l; i <= r; i++) {
            str = swap(str, l, i);
            permut(str, l + 1, r);
            str = swap(str, l, i);
        }
    }

    public static void task7() {
        String s = sc.nextLine();
        String str = sc.nextLine();
        int r = str.length();
        permut(str, 0, r-1);
    }
    //task8 Linear complexity O(n)
    public static String isonlynumbers(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return ("No");
            }
        }
        return ("Yes");
    }
    public static void task8() {
        String s = sc.nextLine();
        System.out.println(isonlynumbers(s));
    }
    //task9 Exponential complexity O(2^n)
    public static int binomial(int n, int k){
        if(k == 0 || n == k){
            return 1;
        }
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }
    public static void task9(){
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(binomial(n,k));
    }
    //task10 Linear complexity O(n)
    public static int gcd(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a > b) {
            return gcd(a - b, b);
        } else {
            return gcd(a, b - a);
        }
    }
    public static void task10(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }

    public static void main(String[] args) {
    }
}