import java.util.Date;
public class Rectangle extends GeometricObject{
     private double width;
     public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	private double height;
		public Rectangle(Date date,double width,double height) throws Exception {
		// TODO Auto-generated constructor stub
		super(date);
		if(width>0&&height>0) {
		this.width=width;
		this.height=height;
		}else {
			throw new Exception("Both width and height have to biger to 0");
		}
	}
		
	public double getArea() {
		return width*height;
	}
	
	public double getPerimeter() {
		return 2*(width+height);
	}
	
	
	 public int compareTo(Rectangle o) {
			if (super.compareTo(o) == 0)
			{
				if(this.getHeight()==o.getHeight()&&this.getWidth()==o.getWidth()) {
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
		return "The color is:"+this.getColor()+"\nThe Class is:"+this.getClass()+"\nThe Area is:"+this.getArea()+"\nThe Perimeter is:"+this.getPerimeter()+"\nThe create timr is:" +this.getDate()+"\n";
	}

}
