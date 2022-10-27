import java.util.Scanner;

public class VucudKitleEndeksiHesaplama {
    public static void main(String[] args) {

        double boy, kilo,vucutKitleEndeksi;
        Scanner dmp = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        boy = dmp.nextDouble();
        System.out.print("Kilonuzu giriniz : ");
        kilo = dmp.nextDouble();

        vucutKitleEndeksi = kilo / boy / boy;

        System.out.print("Vücut kitle endeksiniz : " + vucutKitleEndeksi);
    }
}
