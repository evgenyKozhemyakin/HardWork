/**
*Java 1. HomeWork #1
*
* @autor Evgeny Kozhemyakin
* @version 22.12.2021
*/
class HomeWork {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign() {
        int a = -30;
        int b = 20;
        System.out.println((a + b >= 0) ? "Sum is positiv" : "Sum is negativ");
    }
    static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }
    static void compareNumbers() {
        int a = 12;
        int b = 22;
        if (a >= b) {
            System.out.println(" a >= b ");
        }
        else {
            System.out.println(" a < b ");
        }
    }

}
