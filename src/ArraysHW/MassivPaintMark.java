package ArraysHW;

public class MassivPaintMark {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10)
        {
            int j = 0;
            while(j < 20)
            {
                if (i==0 || i==9) {
                    System.out.print("Б");}

                if (i>0 && i <9 && j==0)	{
                    System.out.print("Б");}

                if (i>0 && i <9 && j>0 && j<19){
                    System.out.print(" ");}

                if (i>0 && i <9 && j==19)	{
                    System.out.print("Б");}

                j++;
            }
            System.out.println();

            i++;
        }
    }
}

