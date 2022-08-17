import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        int[] nizBr = new int[4];
        int brojac = 0;
        int index = 0;

        while (brojac < 4) {
            nizBr[index] = unos.nextInt();
            brojac++;
            index++;
        }

        System.out.println();
        System.out.println("Zbir prvog i zadnjeg index-a je: " + (nizBr[0] + nizBr[3]));
        System.out.println();
        System.out.println("Zbir druog i trećeg index-a je: " + (nizBr[1] + nizBr[2]));
    }
}