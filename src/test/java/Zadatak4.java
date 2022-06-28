import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        //Zadatak 4 - Preko skenera uneti dva broja i odstampati aritmeticku sredinu unetih brojeva

        Scanner sc = new Scanner (System.in);

        System.out.println("Unesite dva broja");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double z = (x + y) / 2;

        System.out.println("Aritmeticka sredina ta dva broja je " + z);




    }
}
