import java.text.DecimalFormat;
import java.util.Date;


public class Circle extends GeometricObject{
	 DecimalFormat df = new DecimalFormat("#.00");

   public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	private double radius;
	
	public Circle(Date date,double radius) throws Exception {
		// TODO Auto-generated constructor stub
		super(date);
		if(radius>0) {
		this.radius=radius;
		}else {
			throw new Exception("raidus can not be minus");
		}
	}
	
	public double getArea() {
		final float PI=3.14f; 
		return PI*radius*radius;
	}
	public double getPerimeter() {
		final float PI=3.14f; 
		return 2*PI*radius;

	}
	public double getDiameter() {
     return 2*radius;

}
	
	
    public int compareTo(Circle o) {
		if (super.compareTo(o) == 0)
		{
			if(this.getRadius()==o.getRadius()) {
				return 0;
			}else {
				return 1;
			}	
		}
		else
		{
			return super.compareTo(o);
		}
		
	}

	@Override
	public String toString(){
		return "Color is:"+this.getColor()+"\nThe Class is:"+this.getClass()+"\nThe Create time is:" +this.getDate()+ "\nThe area is:"+df.format(this.getArea())+"\nThe Perimeter is:"+df.format(this.getPerimeter())+"\nThe Diameter is:"+df.format(this.getDiameter())+"\n";

	}
}
