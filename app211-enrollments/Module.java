
/**
 * This class will maintan information on
 * course modules
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Module
{
    private int credit;
    private String code;
    private String title;
 
    /**
     * Constructor will initialise all the variables
     */
    public Module(String code, String title)
    {
        this.code = code;
        this.title = title;
        credit = 15;
    }
    
    public String getCode()
    {
        return code;
    }
    
    public void setCredit(int credit)
    {
        this.credit =credit;
    }
    
    
    /**
     * Print the details of the course, the list
     * of students enrolled and the module
     */
    public void print()
    {
        
        System.out.println(" Module Code: " + 
                           code + ": " + title);
                           
        System.out.println();
    }
  
}
