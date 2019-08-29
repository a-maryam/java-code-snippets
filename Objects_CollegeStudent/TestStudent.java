import javax.swing.JOptionPane;
import java.util.ArrayList;

public class TestStudent 
{
  public static void main(String[] args)
  {
    
    String[] courseNumber = {"MTH151", "MTH201", "ITF215", "ENG101", "HIS210", "BIO120"};
    String[] courseTitle = {"Statistics", "Calculus I", "Programming in Java", "Composition", "US History", "Biology"};
    int[] creditHours = {3, 4, 4, 3, 3, 4};
    int response = 1;
    ArrayList <CollegeStudent> obj = new ArrayList<CollegeStudent>();
    
    do{
      obj.add(makeStudent(courseNumber, courseTitle, creditHours));
      response = JOptionPane.showConfirmDialog (null, "Do again?");
    }while(response==0);
    
    sort(obj);
    display(obj);
    
    }
  
  public static void sort(ArrayList<CollegeStudent> obj)
  {
    int min;
    
    CollegeStudent temp;
    for(int index = 0; index<obj.size()-1; index++)
    {
      min=index;
      for(int scan = index; scan < obj.size(); scan++)
        if(obj.get(scan).getName().compareTo(obj.get(min).getName())>0)
          min = scan;
       
      
      obj.add(obj.get(min));
      obj.remove(min);
      
  }
  }
  
  public static int linearSearch(String[] courseNumber, String target)
  {
    target = target.toUpperCase();
    for(int index=0; index<courseNumber.length;index++)
      if(target.equals(courseNumber[index]))
        return index;
    return -1;
  }
  
  public static CollegeStudent makeStudent(String[] courseNumber, String[] courseTitle, int[] creditHours)
  {
    int pos = -1;
    String courseNum = null;
    String first = JOptionPane.showInputDialog("Enter first name: ");
    String last = JOptionPane.showInputDialog("Enter last name: ");
    
    do{
      courseNum = JOptionPane.showInputDialog("Enter course number: ");
      pos = linearSearch(courseNumber, courseNum);
    }while(pos==-1);
      
    CollegeStudent omegaOfPedagogy = new CollegeStudent( last + ", "+ first, courseTitle[pos], creditHours[pos], courseNum);
    return omegaOfPedagogy;
  }

 public static void display(ArrayList<CollegeStudent> obj)
 {
   for(CollegeStudent temp: obj)
     System.out.println(temp + "\n");
 }
  
  
}