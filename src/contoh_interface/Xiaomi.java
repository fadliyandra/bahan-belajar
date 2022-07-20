package contoh_interface;

//implementasikan interface phone sebelumnya
public class Xiaomi implements Phone{

    private int volume;
    private boolean isPowerOn;

    public Xiaomi(){
        this.volume= 50;
    }


    @Override
    public void powerON() {
        isPowerOn = true;
        System.out.println("Handphone Menyala");
        System.out.println("selamat datang di xiaomi");
        System.out.println("android versi 1.2.3");

    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone dimatikan");

    }
    @Override
    public void volumeUp() {
        if(isPowerOn){
            if(this.volume == MAX_VOLUME){
                System.out.println("Volume Full");
                System.out.println("Sudah " + this.getVolume() + " %");
            }else {
                this.volume += 10;
                System.out.println("Volume sekarang : " + this.getVolume());
            }
        }else {
            System.out.println("Nyalajan dulu HP-nya");

        }

    }
    @Override
    public void volumeDown() {
        // JIka hp nya hidup nyala
        if(isPowerOn){
            if(this.volume == MIN_VOLUME){
                System.out.println("Volume Full");
                System.out.println("Sudah " + this.getVolume() + " %");
            }else {
                this.volume += 10;
                System.out.println("Volume sekarang : " + this.getVolume());
            }
        }else {
            System.out.println("Nyalajan dulu HP-nya");

        }

    }


    public int getVolume(){
        return this.volume;
    }




}
