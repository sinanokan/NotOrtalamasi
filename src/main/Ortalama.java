package main;

import java.util.Scanner;

public class Ortalama {

	public static void main(String[] args) {
		//değişkenleri oluşturma
		int mat,fizik,kimya,turkce,tarih,muzik;
		
		//Scanner sinifini tanımladik
		Scanner tara = new Scanner(System.in);
		
		//Kullanicidan değerleri aliyoruz
		System.out.print("Matematik Notunuz: ");
		mat = tara.nextInt();
		
		System.out.print("Fizik Notunuz: ");
		fizik = tara.nextInt();
		
		System.out.print("Kimya Notunuz: ");
		kimya = tara.nextInt();
		
		System.out.print("Turkce Notunuz: ");
		turkce = tara.nextInt();
		
		System.out.print("Tarih Notunuz: ");
		tarih = tara.nextInt();
		
		System.out.print("Muzik Notunuz: ");
		muzik = tara.nextInt();
		
		int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
		double ort = toplam/6.0;
		
		System.out.println("Ortalamniz: "+ort);
		
		System.out.println((ort>=60)? "Gecti":"Kaldi");
	}

}
