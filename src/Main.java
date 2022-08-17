import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        int[] nizBr = new int[4];
        int brojac = 0;

        System.out.println("Unesi četri broja");
        System.out.println();

        while (brojac < 4) {
            nizBr[brojac] = unos.nextInt();
            brojac++;
        }

        System.out.println();
        System.out.println("Zbir prvog i zadnjeg broja je: " + (nizBr[0] + nizBr[3]));
        System.out.println();
        System.out.println("Zbir druog i trećeg broja je: " + (nizBr[1] + nizBr[2]));
    }
}