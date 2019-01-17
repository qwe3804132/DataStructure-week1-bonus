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
                GeometricObject obj1=new Circle(date, 20);	
                GeometricObject obj2=new Circle(date, 21);	
                GeometricObject obj3 =new Rectangle(date,10,20);
                GeometricObject obj4 =new Rectangle(date,10,20);

                System.out.print(obj1);
                System.out.println("---------------");
                System.out.print(obj2);
                System.out.println("---------------");
                System.out.print(obj3);
                System.out.println("---------------");
                System.out.print(obj4);


                
                
                
                System.out.println(obj1.compareTo(obj2));
                //aa.setColor("blue");
                System.out.println("\nchanged  Rectangle color to blue\n");
                obj2.setColor("blue");
                System.out.print(obj2);

                System.out.println(obj1.compareTo(obj2));


               // System.out.println(aa);
                //System.out.println("This is Rectangle");
                
                Rectangle b = new Rectangle(date,12.14,11.5);
               // GeometricObject bb=b.compareTo(b);
                //System.out.println(bb);
                System.out.print("\nnow lets test on two different Circle\n");
                //Circle obj3=new Circle(date, 20);
                //Circle obj4=new Circle(date, 21);	

                System.out.print(obj3);
                System.out.println("---------------");

                System.out.print(obj4);

                System.out.print(obj3.compareTo(obj4));


                
	}

}
