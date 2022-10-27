import java.util.Scanner;
public class main {
    public static void main(String[] args ) {
        double tlarmut = 2.14, tlelma= 3.67, tldomates=1.11, tlmuz=0.95, tlpatlican=5.00;
        double armut,elma,domates,muz,patlican;
        double armuttutari,elmatutari,domatestutari,muztutari,patlicantutari,toplam;

        Scanner armut1 = new Scanner(System.in);
        System.out.print("Lütfen Aldığınız Armut'un Kg Tutarını Giriniz :");
        armut = armut1.nextDouble();

        Scanner elma1 = new Scanner(System.in);
        System.out.print("Lütfen Aldığınız Elma'nın  Kg Tutarını Giriniz :");
        elma = elma1.nextDouble();

        Scanner domates1 = new Scanner(System.in);
        System.out.print("Lütfen Aldığınız Domates'in Kg Tutarını Giriniz :");
        domates = domates1.nextDouble();

        Scanner muz1 = new Scanner(System.in);
        System.out.print("Lütfen Aldığınız Muz'un Kg Tutarını Giriniz :");
        muz = muz1.nextDouble();

        Scanner patlican1 = new Scanner(System.in);
        System.out.print("Lütfen Aldığınız Patlıcan'In Kg Tutarını Giriniz :");
        patlican = patlican1.nextDouble();

        armuttutari=tlarmut*armut;
        elmatutari=tlelma*elma;
        domatestutari=tldomates*domates;
        muztutari=tlmuz*muz;
        patlicantutari=tlpatlican*patlican;
        toplam=(armuttutari+elmatutari+domatestutari+muztutari+patlicantutari);

        System.out.println("Armut Tutari :" + armuttutari);
        System.out.println("Elma Tutari :" + elmatutari);
        System.out.println("Domates Tutari :" + domatestutari);
        System.out.println("Muz Tutari :" + muztutari);
        System.out.println("Patlıcan Tutari :" + patlicantutari);
        System.out.println("Toplam Tutar : " +toplam );

    }
}
