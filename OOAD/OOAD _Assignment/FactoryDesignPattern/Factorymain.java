
/**
 * Factorymain
 * @nishan_shah
 */
import Phone.OS;
import Phone.OperationFactory;
import Phone.Android;
import Phone.ISO;
import Phone.windows;

public class Factorymain
 {
public static void main(String[] args)
        {
            
            // testing 1
                // OS obj=new Android();
                // obj.spec();
                // OS obj1=new ISO();
                // obj1.spec();
                // OS obj2=new ISO();
                // obj2.spec();
            
            //Testing 2
            OperationFactory osf=new OperationFactory();
                    // testing 3
                        //   OS obj=osf.getInstance("Closed");
                    // Testing 4
                        //   OS obj=osf.getInstance("Open");
                    // testing 5
                        OS obj=osf.getInstance("windows");

                    obj.spec();
            
        }
    
}