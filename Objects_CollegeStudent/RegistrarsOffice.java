import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class RegistrarsOffice
{
  
  
  public static void main(String[] args)
  {
    int response;
     do{
     makeStudent().toString();
     response = JOptionPane.showConfirmDialog (null, "Do again?");
    } while(response == JOptionPane.YES_OPTION);
  }
  
   public static CollegeStudent makeStudent()
  {
    int credits;
    String first, last, title, cNumber, credits$;
    
    first = JOptionPane.showInputDialog("Enter first name");
    last = JOptionPane.showInputDialog("Enter last name");
    title = JOptionPane.showInputDialog("Enter course title");
    credits$ = JOptionPane.showInputDialog("Enter credits");
    credits = Integer.parseInt(credits$);
    cNumber = JOptionPane.showInputDialog("Enter course number");

    CollegeStudent student = new CollegeStudent(last + ", " + first, title, credits, cNumber);
    
    return student;
  }
    
    
  
  
  
  
  
  
}