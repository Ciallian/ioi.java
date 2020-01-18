package ioi.java;

/**

 @author Conchraidh
 */
public class ApplicationMain
{
	/**
	 @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		String name="Ciallian";
                int age=13;
		int number1=10;
                int number2=5;
                
                int answer=number1*number2;
                System.out.println(name);
		System.out.println(age);
                System.out.println(answer);
                
                //Way 1
                System.out.println("My name is " + name + 
                        "My age is" + age + 
                        "My answer is" + answer );
                  // Way 2
                 String outputText="My name is " + name + 
                        "My age is" + age + 
                        "My answer is" + answer ;    
                 System.out.println(outputText);
        
        }
        
        
		//System.out.println("1");
		//System.out.println("2");
		//System.out.println("3");
		//System.out.println("4");
		// TODO code application logic here
	}


