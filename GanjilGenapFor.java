/** 
 * 1. Ubah program berikut yang menggunakan for menjadi while dan do-while:
 * Program Asal (for): 
**/


import java.util.Scanner;

public class GanjilGenapFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Masukkan batas bilangan: ");

        n = input.nextInt();

        System.out.println("\n=== Bilangan Ganjil dan Genap ===");

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i + " adalah bilangan genap");
            else
                System.out.println(i + " adalah bilangan ganjil");
        }
    }
}