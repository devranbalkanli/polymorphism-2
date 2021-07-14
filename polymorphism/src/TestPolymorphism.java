import java.util.Scanner;
public class TestPolymorphism {
	
	public static void main(String[]args) {
		
		Shape s[]=new Shape[3]; /*önce shape sýnýfýnýn dizi elemanlarýný(abstract metotlarý)deklare edelim.
		                         
		                         Yani önce üst sýnýfý nesne olarak tanýmlýyoruz.
		                         kaç elemaný varsa onun sayýsýný yazýyoruz 
		                         sað tarafta parantez içine*/ 
		                                           
		
		// 2.adým: Alt sýnýfýn nesnelerini tek tek yaratýyoruz.
		
		Nokta n=new Nokta(100,200);
		Daire d=new Daire(10,20,5);
		Silindir si=new Silindir(11,22,5,10);
		
		
		/* 3.Adým:  2.adýmda oluþturduðumuz nesneleri shape sýnýfýnýn dizi elemanlarýna
		atamasýný yapýyoruz    ALT SINIF ÜST SINIFA EÞÝTLENEBÝLÝR */
		
		s[0]=n;
		s[1]=d;
		s[2]=si;
		
		/* 4.adým: bir döngü içinde abstract metotlarý dizi elemanlarýna uyguluyoruz.
		
		 /* BURADA TEK BÝR SATIRLA YANÝ TEK BÝR FONKSÝYONLA BÝRDEN FAZLA SONUÇ ELDE EDÝYORUZ
         ÝÞTE BUNA POLYMORPHÝSM DÝYORUZ.TEK FONKLA BÝRDEN FAZLA SONUÇ ELDE ETMEK POLYMORPHÝSM OLUYOR*/
		
		for (int i=0; i<s.length; i++) {
			s[i].print();
			System.out.println("Alan:"+s[i].alan());
		}
		
		// Alternatif olarak kullanýcýdan deðer alarak da polymorphism yaptýrabiliriz
		
		Scanner scan=new Scanner(System.in);
		int j;
		System.out.print("Nokta icin 0, Daire icin 1, Silindir icin 2 giriniz:");
		j=scan.nextInt();
		s[j].print();
		System.out.println("Sectiginiz Alan:"+s[j].alan());
	}

}
