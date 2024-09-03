package Phone;
// package Phone.OS;

public class OperationFactory 
{
    public  OS getInstance(String str)
    {
        if(str.equals("Open"))
           return new Android();       
      else  if(str.equals("Closed"))       
            return new ISO();       
      else
            return new windows();
       
    }
    
}
