/*1. Write a Student dass Iin lava with data members as Rollno, Course and a method as regtster for
enralling to a course. Write another dass Kiitian derived from Student having a method hostel-
request to request for hostel accommodation. Write the complete program to check the
Inheritance of Kittian object.*/


class Student {
    String Rollno;
    String Course;
  
    public void register(String course) {
      this.Course = course;
      System.out.println("Registered for " + course);
    }
  }
  class Kiitian extends Student {
    public void hostel_request() {
      System.out.println("Hostel accommodation requested");
    }
  }
  public class lab7_1 {
    public static void main(String[] args) {
      Kiitian k = new Kiitian();
      k.register("Computer Science");
      k.hostel_request();
}
}
