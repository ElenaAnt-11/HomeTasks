package HomeTaskOne;

class HomeTaskOne {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
    }
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSing() {
        int a = 5;
        int b = 6;
        {System.out.println(a + b >= 0? "Сумма положительная" : "Сумма отрицательная");
        }
    }
    static void printColor() {
        int value = 120;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        }
        if (value > 0) {
            System.out.println("Зелёный");
        }
    }
    static void compareNumbers() {
        int a = 10;
        int b = 20;
        {System.out.println(a >= b? "a >= b" : "a < b");
        }
    }
}