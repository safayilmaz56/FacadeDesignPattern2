import java.util.Scanner;

public class Araba {

    Scanner scanner = new Scanner(System.in);
    int sayi1 = scanner.nextInt();
    int sayi2 = scanner.nextInt();
    int sayi3 = scanner.nextInt();
    String renk = scanner.next();
    public Araba(IskeletOlusturucu iskelet,MotorOlusturucu motor,Renkler renk){

        System.out.println("İskelet x:" + sayi1);
        System.out.println("İskelet y:" + sayi2);
        System.out.println("İskelet z:" + sayi3);
        System.out.println("Motor x:" + sayi1);
        System.out.println("Motor y:" + sayi2);
        System.out.println("Motor z:" + sayi3);
        System.out.println("Renk:" + renk);
    }
}
