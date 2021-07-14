
public class Daire extends Nokta{
	protected int r; //nokta sýnýfýnda tanýmlanan þeylere ek olarak sadece r yarýçapýný tanýmladýk protected ile
	
	public Daire(int x,int y,int r) {
		super(x,y);  //nokta sýnýfýndaki this.lý þeyleri direkt aldýk super(); kullanarak
		
		this.r=r;    // superde aldýklarýmýza ek olarak yarýçapý tanýmladýk constructorda
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
	
//bir dairenin yarýçapý alaný ve çevresi olduðundan r tanýmladýk ve alan ile çevre fonklarýný yazdýk
	
}
