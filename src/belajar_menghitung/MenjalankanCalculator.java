package belajar_menghitung;

import java.util.Scanner;

public class MenjalankanCalculator extends CalculatorInheritance{

    public static void main(String[] args) {

        //scaner untuk menangkap inputan user
        Scanner sc = new Scanner(System.in);

        int a,b;
        String op;

        System.out.println("Masukan anka pertama");
        //menampung nilai b dari inputan user
        a = sc.nextInt();
        System.out.println("masukan angka kedua");
        //menampung nilai b dari inputan user
        b = sc.nextInt();

        sc.nextLine();
        System.out.println("Masukan operator .. + - * /");
        op = sc.nextLine();

        if (op.equals(TAMBAH)){
            tambah(a,b);
        }
        if (op.equals(KURANG)){
            kurang(a,b);
        }
        if (op.equals(KALI)){
            kali(a,b);
        }
        if (op.equals(BAGI)){
            bagi(a,b);
        }


    }
}
