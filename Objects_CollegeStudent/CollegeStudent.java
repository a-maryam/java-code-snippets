public class CollegeStudent
{
  public static double costPerHour = 125;
  private String name;
  private String courseTitle;
  private String courseNumber;
  private int credits;
  private double courseFee;
  

 public CollegeStudent()
 {
    name = "";
    courseTitle = "";
    courseNumber = "";
    credits = 0;
    courseFee = 0.0;
 }
 
 public CollegeStudent(String name, String courseTitle, int credits, String courseNumber)
 {
   this.name = name;
   this.courseTitle = courseTitle;
   this.credits = credits;
   this.courseNumber = courseNumber;
 }
 
 public String getName()
 {
   return name;
 }
 
 public String getCourseTitle()
 {
   return courseTitle;
 }
 
 public String getCourseNumber()
 {
   return courseNumber;
 }
 
 public int getCredits()
 {
   return credits;
 }
 
 public double getCourseFee()
 {
   return courseFee;
 }
 
  public void setName(String first, String last)
 {
   name = first + " " + last;
 }
 
 public void setCourseTitle(String newCourseTitle)
 {
   courseTitle = newCourseTitle;
 }
 
 public void setCourseNumber(String newCourseNumber)
 {
   courseNumber = newCourseNumber;
 }
 
 public void setCredits(int newCredits)
 {
   credits = newCredits;
 }
 
 public double setCourseFee(double newCourseFee)
 {
  return courseFee = newCourseFee;
 }
 
 public String toString()
 {
   return "name: " + name + ", " + "course title: " + courseTitle + ", course number: " + courseNumber + ", credits: " + credits + ", course fee: " + (credits * costPerHour);
 }
 
 
 
 
 
 
}