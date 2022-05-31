/**
 * Имя цвета	Цветовой код	Цвет фона	        Код цвета фона
 * ЧЕРНЫЙ	    \u001B[30m	    BLACK_BACKGROUND	\u001B[40m
 * КРАСНЫЙ	    \u001B[31m	    RED_BACKGROUND	    \u001B[41m
 * Зеленый	    \u001B[32m	    GREEN_BACKGROUND	\u001B[42m
 * Желтый	    \u001B[33m	    YELLOW_BACKGROUND	\u001B[43m
 * Синий	    \u001B[34m	    BLUE_BACKGROUND	    \u001B[44m
 * Фиолетовый	\u001B[35m	    PURPLE_BACKGROUND	\u001B[45m
 * голубой	    \u001B[36m	    CYAN_BACKGROUND	    \u001B[46m
 * БЕЛЫЙ	    \u001B[37m	    WHITE_BACKGROUND	\u001B[47m
 */


package HomeTasks;

public class Task08_100422_Mark {
    public static void main(String[] args) throws InterruptedException {
        String ANSI_Yellow = "\u001B[33m";
        String ANSI_Blue = "\u001B[34m";
        String ANSI_Purple = "\u001B[35m";
        String ANSI_LightBlue = "\u001B[36m";
        String ANSI_White = "\u001B[37m";
        String ANSI_Black = "\u001B[30m";
        String ANSI_Red = "\u001B[31m";
        String ANSI_Green = "\u001B[32m";
        String str1 = "Снежок порхает, кружится,";
        String str2 = "На улице бело.";
        String str3 = "И превратились лужицы";
        String str4 = "В холодное стекло.";
        String str5 = "В саду, где пели зяблики";
        String str6 = "Сегодня — посмотри! —";
        String str7 = "Как розовые яблоки,";
        String str8 = "На ветках снегири.";
        String str9 = "Снежок изрезан лыжами,";
        String str10 = "Как мел, скрипуч и сух,";
        String str11 = "И ловит кошка рыжая";
        String str12 = "Веселых белых мух.";
        System.out.println(ANSI_Black + str1);
        Thread.sleep(500);
        System.out.println(ANSI_Red + str2);
        Thread.sleep(500);
        System.out.println(ANSI_Green + str3);
        Thread.sleep(500);
        System.out.println(ANSI_Yellow + str4);
        Thread.sleep(500);
        System.out.println(ANSI_Blue + str5);
        Thread.sleep(500);
        System.out.println(ANSI_Purple + str6);
        Thread.sleep(500);
        System.out.println(ANSI_LightBlue + str7);
        Thread.sleep(500);
        System.out.println(ANSI_White + str8);
        Thread.sleep(500);
        System.out.println(ANSI_Green + str9);
        Thread.sleep(500);
        System.out.println(ANSI_Black + str10);
        Thread.sleep(500);
        System.out.println(ANSI_Purple + str11);
        Thread.sleep(500);
        System.out.println(ANSI_Yellow + str12);


    }
}

