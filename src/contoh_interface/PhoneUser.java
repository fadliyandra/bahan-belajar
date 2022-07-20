package contoh_interface;


///pada class ini objek user dapat melakukan beberapa pekerjaan
//yang bisa di lakukan pada object handpone nya sperri mematikan menghidupkan menambah dan mengecilakn volume


//pada masing masing methode turnon the phone dan lainya akan memanggil methode kosong di interfcae
public class PhoneUser {

    private Phone phone;

    public PhoneUser (Phone phone){
        this.phone = phone;

    }
    void turnOnThePhone(){
        this.phone.powerON();

    }
    void turnOffThePhone(){
        this.phone.powerOff();


    }
    void makePhoneLounder(){
        this.phone.volumeUp();

    }

    void makePhoneSilent(){
        this.phone.volumeDown();

    }

}
