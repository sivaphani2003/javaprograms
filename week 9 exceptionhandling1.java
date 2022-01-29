class TryCatchExample1 
{  
  public static void main(String[] args) 
  {    
    int data=50/0; //may throw exception        
    System.out.println("rest of the code");        
  }    
}  
//throws error and rest of the code is not executed
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at TryCatchExample1.main(TryCatchExample1.java:7)
