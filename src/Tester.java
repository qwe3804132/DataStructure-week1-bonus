import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tester {

	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

                System.out.println("lets go\n");
                //System.out.println("This is Circle");
                //Circle obj1 = new Circle(date, 19.4);
                Circle circle1 = new Circle(date, 20);	
                Circle circle2 = new Circle(date, 20);	

                GeometricObject obj1=circle1;
                GeometricObject obj2=circle2;
                GeometricObject obj3 =new Rectangle(date,10,20);
                GeometricObject obj4 =new Rectangle(date,10,20);

                System.out.print(obj1);
                System.out.println("---------------");
                System.out.print(obj2);
                System.out.println("---------------");
                System.out.print(obj3);
                System.out.println("---------------");
                System.out.print(obj4);


                
                
                
                //System.out.println(obj1.compareTo(obj2));
                //aa.setColor("blue");
                //System.out.println("\nchanged  Rectangle color to blue\n");
                //obj2.setColor("blue");
                //System.out.print(obj2);

                //System.out.println(obj1.compareTo(obj2));


               // System.out.println(aa);
                //System.out.println("This is Rectangle");
                
                //Rectangle b = new Rectangle(date,12.14,11.6);
               // GeometricObject bb=b.compareTo(b);
                //System.out.println(bb);
                System.out.print("\nnow lets test on two different Circle\n");
                //Circle obj3=new Circle(date, 20);
                if(obj1.compareTo(obj2)==0) {
                	System.out.println("This two has same circle and same filled status,But are they same circle at all?");
                	if(circle1.compareTo(circle2)==0) {
                		System.out.println("now they are totally same");
                	}else {
                		System.out.println("sorry ,the detail is different ");
                		}
                 {
                	

                		
                	}
                }else {
                	System.out.println("They have different color or filled");
                }
                //Circle obj4=new Circle(date, 21);	

                //System.out.print(obj3);
                System.out.println("---------------");
                System.out.print("\nnow lets change the color\n");
                obj1.setColor("red");
                if(obj1.compareTo(obj2)==0) {
                	System.out.println("This two has same circle and same filled status,But are they same circle at all?");
                	if(circle1.compareTo(circle2)==0) {
                		System.out.println("now they are totally same");
                	}else {
                		System.out.println("sorry ,the detail is different ");
                		}
                 {
                	

                		
                	}
                }else {
                	System.out.println("They have different color or filled");
                }


                //System.out.print(obj4);


                
	}

}
