import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Input banyak angka
            int banyakAngka;
            do {
                System.out.print("Masukkan banyak angka yang mau dicetak [2..10] : ");
                banyakAngka = scanner.nextInt();
            } while (banyakAngka < 2 || banyakAngka > 10);

            // Input beda
            int beda;
            do {
                System.out.print("Masukkan beda masing-masing angka [2..9]       : ");
                beda = scanner.nextInt();
            } while (beda < 2 || beda > 9);

            // Deret Aritmatika
            System.out.print("Deret Aritmatika: ");
            for(int i =1;i <= banyakAngka * beda;i = i +beda) {
                System.out.print(i +" ");
            }
            System.out.println();

            // Deret Geometri
            System.out.print("Deret Geometri: ");
            int angka = 1;
            for (int i = 1; i <= banyakAngka; i++) {
                System.out.print(angka + " ");
                angka *= beda;
            }
            System.out.println();

            // Faktorial
            int faktorial = 1;
            for (int i = banyakAngka; i >= 1; i--) {
                faktorial *= i;
            }
            System.out.println("Faktorial dari angka "+ banyakAngka + " : ");
            for(int i = banyakAngka; i >1; i--) {
                System.out.print(i +" * ");
            }
            System.out.println("1 = "+ faktorial);

            // Pertanyaan untuk mengulang
            System.out.print("Apakah ingin mengulang? (Y/T) ");
            String ulang = scanner.next();
            if (!ulang.equalsIgnoreCase("Y")) {
                break;
            }
        }
        scanner.close();
    }
}
