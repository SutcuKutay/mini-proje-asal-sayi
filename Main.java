package miniProjeAsalSayi;
//Girilen sayinin asal sayi olup olmadigini bulan program.
import java.util.*;
public class Main {
	public static void main(String[] args) {
		asalMi();
	}
	public static void asalMi() {
		int sayi = sayiAl();
		System.out.println("Girilen sayi: " + sayi);
		if(asalKontrol(sayi)) {
			System.out.println("Girilen sayi asaldir.");
		}else {
			System.out.println("Girilen sayi asal degildir.");
		}
	}
	public static int sayiAl() {
		int input;
		System.out.println("Bir sayi giriniz.");
		Scanner s = new Scanner(System.in);
		input = s.nextInt();
		s.close();
		return input;
	}
	public static boolean asalKontrol(int sayi) {
		boolean sonuc;
		if(sayi % 2 == 1 || sayi == 2) {
			if(sayi == 1) {
				sonuc = false;
			}else {
				sonuc = true;
			}
		}else {
			sonuc = false;
		}
		return sonuc;
	}
}
