
public class Daire extends Nokta{
	protected int r; //nokta s�n�f�nda tan�mlanan �eylere ek olarak sadece r yar��ap�n� tan�mlad�k protected ile
	
	public Daire(int x,int y,int r) {
		super(x,y);  //nokta s�n�f�ndaki this.l� �eyleri direkt ald�k super(); kullanarak
		
		this.r=r;    // superde ald�klar�m�za ek olarak yar��ap� tan�mlad�k constructorda
	}
	public double alan() {
		return pi*r*r;
	}
	public void print(){
		System.out.println("("+x+","+y+"),"+r);
	}
	public double cevre() {
		return 2*pi*r;
	}
	
//bir dairenin yar��ap� alan� ve �evresi oldu�undan r tan�mlad�k ve alan ile �evre fonklar�n� yazd�k
	
}
