package SingletonDesignPattern;

public class singletonExample1
 {
    //create private static 
    private static singletonExample1 instance;

    //create private constructor 
    private singletonExample1()
    {

    }
    public  static singletonExample1 getInstance()
    {
        if(instance==null)
        {
            instance=new singletonExample1();
        }
        return instance;
    }
    public void messageToshow()
    {
        System.out.println("Hello from singleton");
    }
    public static void main(String[] args) 
    {
        singletonExample1 singleton1=singletonExample1.getInstance();
        singletonExample1 singleton2=singletonExample1.getInstance();
        if(singleton1==singleton2)
        {
            System.out.println("Both Reference point to the same instance");
        }
        singleton1.messageToshow();

    }

}
