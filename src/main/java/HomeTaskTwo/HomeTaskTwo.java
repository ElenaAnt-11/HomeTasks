package HomeTaskTwo;

/**
 *  Java 1. Home task #2
 *
 * @ author Elena Antonchik
 * @ version 13 Feb 2022
 */

class HomeTaskTwo {
    public static void main(String[] args) {
        boolean m = interval(5, 10);
        System.out.println(m? "true" : "false");

        comparison(104);

        boolean result = negativePositiveNumber(-245);
        System.out.println(result? "true" : "false");

        printName();
    }

    static boolean interval(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    static void comparison(int a) {
        System.out.println(a >= 0? "число положительное" : "число отрицательное");
    }

    static boolean negativePositiveNumber(int a) {
        return a >= 0;
    }

    static void printName() {
        String name = "Elena Ant";
        int i;
        for (i = 0; i < 5; i++) {
            System.out.print(name);
            System.out.println();
        }
    }
}

