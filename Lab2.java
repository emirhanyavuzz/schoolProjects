import java.util.Scanner;
public class lab2
{
 public static void main(String[] args)
 {
  String st1 = "Sahibi olmayan bir elmas bulursan, o elmas senindir.";
  String st2 = st1.toUpperCase();
  System.out.println(st2);
  int a = st1.lastIndexOf("elmas");
  System.out.print("Cumlede gecen son \"elmas\" kelimesinin indisi: ");
  System.out.println(a);
  int b = st2.lastIndexOf("ada");
  System.out.print(b);
  System.out.println("  Yani \"ada\" kelimesi bulunamadi.");
  String st3 = st1.substring(10,26) ;
  System.out.println("Cumlenin 10. ve 26. indexi arasindaki metin:"+ st3 );
  System.out.print("Metindeki bosluklar silindiginde:   " );
  String st4 = st1.replace(" " , "");
  System.out.println(st4);
  //Soru iki
  Scanner keyboard = new Scanner (System.in);
  System.out.print("Isminizi giriniz:  ");
  String isim = keyboard.nextLine();
  System.out.print("Soyisminizi giriniz:  ");
  String soyisim = keyboard.nextLine();
  System.out.print("Dogum tarihinizi giriniz:(Format : gg/aa/yyyy)");
  String dogumTarihi = keyboard.next();
  String yil = dogumTarihi.substring(6,10);
  int yil1=Integer.valueOf(yil);
  int yas=2022-yil1;
  System.out.print("Favori sayinizi giriniz:  ");
  int favori = keyboard.nextInt();
  System.out.print("Maasinizi giriniz:  ");
  double maas = keyboard.nextDouble();
  System.out.print(isim + " " + soyisim + " " + yas)  ;
  System.out.print(" yasindadir. Favori sayisi " + favori);
  System.out.print(" ve maasi ");
  System.out.print((int)maas );
  System.out.print("\'dir");
 }
}
