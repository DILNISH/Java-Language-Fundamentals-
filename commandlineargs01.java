public class Commandlineargs01
{
    public static void main(String[] args) {
                for(int i=0;i<=args.length;i++)  
                {
                    System.out.println(args[i]);
                } 
                
                //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
	at commandlineargs01.main(commandlineargs01.java:8)

    }
} 
