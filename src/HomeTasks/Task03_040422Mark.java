package HomeTasks;

import java.util.Scanner;

public class Task03_040422Mark {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте, я бот гадалка созданный Марком Красновым!");
        Thread.sleep(1000);
        System.out.println("Пожалуйста, представтесь.");
        String name = scanner.nextLine();
        Thread.sleep(1000);
        System.out.println("Ну здравствуй, " + name + "!");
        Thread.sleep(1000);
        System.out.println("Введите ваш любимый школьный предмет: рисование," +
                " математика, физика, физическая культура, английский язык, история, география," +
                "литература, биология или русский язык");
        String favouriteSubject = scanner.nextLine();

        switch (favouriteSubject) {
            case "математика" :
                System.out.println("Раз твой любимый школьный предмет -- математика," +
                        "то ты станешь великим математиком!");
                break;
            case "физическая культура" :
                System.out.println("Раз твой любимый школьный предмет -- физ-ра," +
                        "то ты станешь спортсменом!");
                break;
            case "рисование":
                System.out.println("Раз твой любимый школьный предмет -- рисование," +
                        "то ты станешь известным художником!");
                break;
            case "история":
                System.out.println("Раз твой любимый школьный предмет -- история," +
                        "то ты станешь историком!");
                break;
            case "география":
                System.out.println("Раз твой любимый школьный предмет -- география," +
                        "то ты станешь географом!");
                break;
            case "литература":
                System.out.println("Раз твой любимый школьный предмет -- литература," +
                        "то ты станешь известным писателем!");
                break;
            case "английский язык":
                System.out.println("Раз твой любимый школьный предмет -- английский язык," +
                        "то ты станешь переводчиком президента!");
                break;
            case "биология":
                System.out.println("Раз твой любимый школьный предмет -- биология," +
                        "то ты станешь биологом!");
                break;
            case "физика":
                System.out.println("Раз твой любимый школьный предмет -- физиком," +
                        "то ты станешь великим физиком!");
                break;
            case "русский язык":
                System.out.println("Раз твой любимый школьный предмет -- русский язык," +
                        "то ты станешь очень грамотным человеком!");
                break;
            default:
                System.out.println("Извините, программа не понимает вас. Либо вы ввели слово" +
                        " которого нет в базе данных, либо вы указали слово с заглавной буквы!");
        }
        System.out.println("BYe");
    }
}
