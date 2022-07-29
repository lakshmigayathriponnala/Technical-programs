/* JFM1T9_Assignment3:
     Create a base class Teacher and a sub class ComputerTeacher.
     class ComputerTeacher extends the designation and collegename properties and work() method from base Teacher class,
     you need not declare these properties and method in ComputerTeacher sub class .
     Try accessing these properties using child class object in Main method.
  
     Sample Output:
     Designation       CollegeName
     ComputerTeacher      IIT
*/

class Teacher {
  void Work()
  {
    System.out.println("Work:Teaching");
  }
  void Designation()
  {
    System.out.println("Designation:Computer Teacher");
  }
  void CollegeName()
  {
    System.out.println("College name:IIT");
  }
}

class ComputerTeacher extends Teacher {
  public static void main(String args[])
  {
    ComputerTeacher c=new ComputerTeacher();
    c.Work();
    c.Designation();
    c.CollegeName();
    
  }


}

