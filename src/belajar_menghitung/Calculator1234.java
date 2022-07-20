package belajar_menghitung;

public class Calculator1234 {
    //buat parametr string
    final static String TAMBAH = "+";
    final static String KURANG = "-";

    //methode untuk menampilkan hasil operasi
        public  static void Display(int x, int y , String operator, int z){
            System.out.println(x + " " +operator + " "+ y + " = " +z);
        }

    //mthod tambah
    public static void tambah(int x, int y){
            //panggil methode display dan masukan parameternya
        Display(x,y, TAMBAH, x+y);
    }
    public static void kurang(int x, int y){
        Display(x,y, KURANG, x+y);

    }

}
