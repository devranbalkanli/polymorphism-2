
public class Silindir extends Daire{
	protected int h; //daire s�n�f�na h ekliyoruz.��nk� silindir olmas� i�in h laz�m
	
	public Silindir(int x,int y,int r,int h) {
		super(x,y,r);
		this.h=h;
	}
	public void print() {
		System.out.println("("+x+","+y+"),"+r+","+h);
	}
	public double alan() {
		return (2*pi*r*r)+(2*pi*r*h);
	}
	public double hacim() {
		return pi*r*r*h;
	}

}
