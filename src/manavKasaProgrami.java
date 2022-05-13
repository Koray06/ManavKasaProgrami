import java.util.Scanner;

public class manavKasaProgrami {

	public static void main(String[] args) {
		/*Java ile kullanıcıların manavdan almış oldukları ürünlerin 
		kilogram değerlerine göre toplam tutarını ekrana yazdıran 
		programı yazın.

		Meyveler ve KG Fiyatları

		Armut : 2,14 TL
		Elma : 3,67 TL
		Domates : 1,11 TL
		Muz: 0,95 TL
		Patlıcan : 5,00 TL */
		
		double armut,elma,domates,muz,patlican,toplam;
		
		Scanner imput = new Scanner(System.in) ;
		
		armut = 2.14;
		elma = 3.67;
		domates = 1.11;
		muz = 0.95;
		patlican = 5.0;
		
		
		System.out.println("Armut Kaç Kilo : " );
		armut = armut * imput.nextInt();
		System.out.println("elma Kaç Kilo : " );
		elma = elma * imput.nextInt();
		System.out.println("domates Kaç Kilo : " );
		domates = domates * imput.nextInt();
		System.out.println("muz Kaç Kilo : " );
		muz = muz * imput.nextInt();
		System.out.println("patlican Kaç Kilo : " );
		patlican = imput.nextInt();
		toplam =armut+elma+domates+muz+patlican;
		System.out.println("Toplam tutar ;" + toplam);
		
		
		
	}

}
