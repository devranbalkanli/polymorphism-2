
public class Nokta extends Shape {
	protected int x,y;
	
	public Nokta(int x,int y) {
		this.x=x;
		this.y=y;
		}
    public double alan() {
    	return 0;
    }
    public void print() {
    	System.out.println("("+x+","+y+")");
    }
}
