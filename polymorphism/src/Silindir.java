
public class Silindir extends Daire{
	protected int h; //daire sınıfına h ekliyoruz.çünkü silindir olması için h lazım
	
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
