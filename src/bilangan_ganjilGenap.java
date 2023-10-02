import java.util.Scanner;
public class bilangan_ganjilGenap {
    public static void main(String[] args) throws Exception {
        /* Menghitung bilangan ganjil/genap */
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = inputan.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }
    }
}
