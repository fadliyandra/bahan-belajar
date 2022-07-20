package tampilan_bintang_sesuai_angka;

import java.util.Scanner;

public class JumlahSisiBangundatar {
    public static void main(String[] args) {
        int jumlahSisi;
        Scanner input = new Scanner(System.in);
         System.out.println("Masukan jumlah sisi : ");
        jumlahSisi = input.nextInt();
        input.close();

        for(int i = 0; i<jumlahSisi; i++){
            System.out.print("*");
            for (int j=0; j<jumlahSisi; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
