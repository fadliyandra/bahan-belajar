package contoh_interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            //membuat object hp
        Phone redmiNote = new Xiaomi();

            //membuat object user
        PhoneUser fadli = new PhoneUser(redmiNote);
            //kita coba nyalakan hp nya
        fadli.turnOnThePhone();

        //biar enak kita buat program input value menggunakan scaner

        Scanner input = new Scanner(System.in);

        String aksi;

        while (true){
            System.out.println("====APLIKASI INTERFACE HANDPHONE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecil Volume");
            System.out.println("--------------------------------------");
            System.out.println("Pilih Aksi > ");
            aksi = input.nextLine();


            if(aksi.equalsIgnoreCase("1")){
                fadli.turnOnThePhone();
            }else if (aksi.equalsIgnoreCase("2")){
                fadli.turnOffThePhone();
            }else if (aksi.equalsIgnoreCase("3")){
                fadli.makePhoneLounder();
            }else if (aksi.equalsIgnoreCase("4")){
                fadli.makePhoneSilent();
            }else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            }else {
                System.out.println("Kamu Salah Pilihan");
            }


        }






    }
}
