import java.util.Scanner;

import javax.security.auth.kerberos.KerberosCredMessage;
import javax.swing.InputMap;

public class VATRateCalculator {
    public static void main(String[] args) {
        double fiyat;
        double kdvliFiyat;
        double kdvTutari;
        double kdvOrani;

        Scanner paraDegeri = new Scanner(System.in);
        System.out.print("Tutar giriniz :");
        fiyat = paraDegeri.nextDouble();
        if (fiyat <= 1000) {
            kdvOrani = 0.18;
        } else {
            kdvOrani = 0.08;
        }

        kdvTutari = fiyat * kdvOrani;
        kdvliFiyat = fiyat + kdvTutari;
        System.out.println("KDV'siz tutar :" + fiyat);
        System.out.println("KDV orani       :" + kdvOrani);
        System.out.println("KDV tutari      :" + kdvTutari);
        System.out.println("KDV'li Tutar    :" + kdvliFiyat);

    }
}
