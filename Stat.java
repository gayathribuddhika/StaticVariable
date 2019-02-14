
package staticvariable;


public class Stat {
    private String firstName;
    private String lastName;
    private static int members = 0;
    
    public Stat(String fn, String ln){
        firstName = fn;
        lastName = ln;
        members++;
        
        System.out.printf("The Constructor for %s %s, The Members in the club is:%d\n",firstName,lastName,members);
    }
}
