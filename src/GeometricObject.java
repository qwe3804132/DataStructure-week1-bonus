import java.util.Date;



public class GeometricObject implements Comparable<GeometricObject>{
	
	private String color;
    private Date date;
	private boolean filled;
	
	public GeometricObject(Date date){
    	this.color="white";
    	this.filled=false;
    	try {
        	this.date=date;
    	}catch(Exception e) {
              System.out.println("date is not correct");
    	}
    }



    public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = true;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

@Override
public String toString(){
	return this.color +this.filled +this.date;
    
}

@Override
public int compareTo(GeometricObject o) {
	if (o instanceof GeometricObject) {
		//Circle otherGeometricObject = (Circle) o;
		if (this.getColor().equals(o.getColor())&&this.isFilled()==(o.isFilled()))
				{
			return 0;
				}
		return 1;
	}else {
		return 1;
	}		
}



}