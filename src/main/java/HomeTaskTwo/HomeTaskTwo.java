package HomeTaskTwo;

/**
 *  Java 1. Home task #2
 *
 * @ author Elena Antonchik
 * @ version 13 Feb 2022
 */

class HomeTaskTwo {
    public static void main(String[] args) {
        System.out.println(interval(5,10));
        System.out.println(interval(5,5));
        System.out.println(interval(10,10));
        System.out.println(interval(4,4));
        System.out.println(interval(10,20));
        separator();

        comparison(104);
        comparison(-104);
        comparison(0);
        separator();

        System.out.println(negativePositiveNumber(-245));
        System.out.println(negativePositiveNumber(245));
        System.out.println(negativePositiveNumber(0));
        separator();

        printName("Elena Ant, ", 25);
    }

    static boolean interval(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    static void comparison(int a) {
        System.out.println(a >= 0? "число положительное" : "число отрицательное");
    }

    static boolean negativePositiveNumber(int a) {
        return a < 0;
    }

    static void printName(String name, int age) {
        int i;
        for (i = 0; i < 5; i++) {
            System.out.print(name + age);
            System.out.println();
        }
    }

    static void separator() {
        System.out.println("----------------");
    }
}

