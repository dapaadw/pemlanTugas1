package Semester_2.Praktikum;

public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private double waktu;

    public void setNoPlat(String s) {
        noPlat = s;
    }
    
    public void setWarna(String s) {
        warna = s;
    }
    
    public void setManufaktur(String s) {
        manufaktur = s;
    }
    
    public void setKecepatan(double d) {
        kecepatan = rubahKecepatan(d);
    }
    //ditambah method setWaktu untuk mengatur waktu dalam jam (no. 4)
    public void setWaktu(double d) {
        waktu = rubahSekon(d);
    }
    //ditambah method rubahSekon untuk merubah waktu dari jam ke sekon (no. 5)
    private double rubahSekon(double d) {
        return d * 3600;
    }
    //ditambah method rubahKecepatan untuk merubah kecepatan dari km ke m (no. 6)
    private double rubahKecepatan(double d) {
        return d * 1000/3600;
    }
    //ditambah method hitungJarak untuk menghitung jarak tempuh (no. 7)
    public double hitungJarak(double d1, double d2) {
        return d1 * d2;
    }
    //informasi jarak ditambah (no. 8)
    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("Mempunyai nomor plat " + noPlat);
        System.out.println("Serta memiliki warna " + warna);
        System.out.println("mampu menempuh kecepatan " + kecepatan * 3600 / 1000 + " km/jam");
        System.out.println("dalam meter kecepatannya " + kecepatan + " m/s");
        System.out.println("dan dapat menempuh jarak " + hitungJarak(kecepatan, waktu) + " meter");
        System.out.println("atau " + hitungJarak(kecepatan * 3600 / 1000 , waktu / 3600) + " km");
    }
}
