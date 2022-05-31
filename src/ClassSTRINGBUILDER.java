import java.util.Locale;

public class ClassSTRINGBUILDER {
    public static void main (String[] args ){
//        String str1 = "Привет";
//        str1.toLowerCase(Locale.ROOT);
//        System.out.println(str1.toLowerCase(Locale.ROOT));
//        System.out.println();
//        System.out.println();
//        System.out.println(str1.toUpperCase(Locale.ROOT));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Привет");
        stringBuilder.append(" всем");

        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.reverse().toString());

    }
}
