import java.util.Scanner;
public class TestPolymorphism {
	
	public static void main(String[]args) {
		
		Shape s[]=new Shape[3]; /*�nce shape s�n�f�n�n dizi elemanlar�n�(abstract metotlar�)deklare edelim.
		                         
		                         Yani �nce �st s�n�f� nesne olarak tan�ml�yoruz.
		                         ka� eleman� varsa onun say�s�n� yaz�yoruz 
		                         sa� tarafta parantez i�ine*/ 
		                                           
		
		// 2.ad�m: Alt s�n�f�n nesnelerini tek tek yarat�yoruz.
		
		Nokta n=new Nokta(100,200);
		Daire d=new Daire(10,20,5);
		Silindir si=new Silindir(11,22,5,10);
		
		
		/* 3.Ad�m:  2.ad�mda olu�turdu�umuz nesneleri shape s�n�f�n�n dizi elemanlar�na
		atamas�n� yap�yoruz    ALT SINIF �ST SINIFA E��TLENEB�L�R */
		
		s[0]=n;
		s[1]=d;
		s[2]=si;
		
		/* 4.ad�m: bir d�ng� i�inde abstract metotlar� dizi elemanlar�na uyguluyoruz.
		
		 /* BURADA TEK B�R SATIRLA YAN� TEK B�R FONKS�YONLA B�RDEN FAZLA SONU� ELDE ED�YORUZ
         ��TE BUNA POLYMORPH�SM D�YORUZ.TEK FONKLA B�RDEN FAZLA SONU� ELDE ETMEK POLYMORPH�SM OLUYOR*/
		
		for (int i=0; i<s.length; i++) {
			s[i].print();
			System.out.println("Alan:"+s[i].alan());
		}
		
		// Alternatif olarak kullan�c�dan de�er alarak da polymorphism yapt�rabiliriz
		
		Scanner scan=new Scanner(System.in);
		int j;
		System.out.print("Nokta icin 0, Daire icin 1, Silindir icin 2 giriniz:");
		j=scan.nextInt();
		s[j].print();
		System.out.println("Sectiginiz Alan:"+s[j].alan());
	}

}
