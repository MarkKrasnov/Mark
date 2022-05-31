package Lesson8;

public class Lesson8_3 {
    public static void main(String[] args) {
        Calc calc =  new Calc();
        System.out.println(calc.divideInt(10, 2));
    }


}

class Calc {
    //Этот метод складывает 2 числа
    public int sum (int a, int b) {
        return a + b;
    }
    //Этот метод вычитает 2 числа
    public int minus (int a, int b) {
        return a - b;
    }
    //Этот метод умножает 2 числа
    public int multiply (int a, int b) {
        return a * b;
    }
    //Этот метод делит 2 числа
    public int divideInt (int a, int b) {
        return a / b;
    }
}