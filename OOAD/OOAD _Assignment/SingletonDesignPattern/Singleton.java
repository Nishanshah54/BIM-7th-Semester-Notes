package SingletonDesignPattern;

/**
 * Singleton
 */
public class Singleton 
{   
    // 1. private static instance variables 
    //2.private constructor  
    //3. public static method
    //4.Additonal methords

    //5.main methord and call methord
    
    private static Singleton instance;
    // static variable to hold single instance of the class
    private Singleton()
    {
        //private constructor to private instantiation from outside the class

    }
    public static Singleton getInstance()
    {
        if(instance==null)
        {
            instance=new Singleton();
        }
        return instance;
    }
     
    public void showmessage()
    {
        System.out.println("Hello  from Singleton message");
    }

    public static void main(String[] args) 
    {
        Singleton singleton1=Singleton.getInstance();
    
        Singleton singleton2=Singleton.getInstance();
        
        if(singleton1==singleton2)
        {
            System.out.println(" Both reference  point to the same instance same  instance");
        }
        singleton1.showmessage();
        singleton2.showmessage();
    }
    

    
}
