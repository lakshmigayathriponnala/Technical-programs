/* JFM1T9_Assignment4:
     Extend and enhance the previous inheritance program where collegeName, designation and 
     work() method are common to all the teachers and declared in the base class in the way
     that all child classes like MathTeacher, EnglishTeacher and MusicTeacher do not need to 
     write this code and can use directly from base class. 

     Sample Output:
     Math Teacher         IIT
     English Teacher      IIT
     Music Teacher        IIT
*/
class Teacher1{
  String Designation;
  String CollegeName;
  void work(){
  System.out.println(Designation+ "     "+ CollegeName);
  }
}

//Add MathTeacher class

class MathTeacher extends Teacher1{
  String Designation="Math Teacher";
  String CollegeName="IIT";
  void work()
  {
    System.out.println(Designation + "     "+ CollegeName);
}
}

//Add EnglishTeacher class
 
class EnglishTeacher extends Teacher1{
   
 String Designation="English Teacher";
  String CollegeName="IIT";
  void work()
  {
    System.out.println(Designation + "   "+ CollegeName);
}
}

//Add MusicTeacher class

class MusicTeacher extends Teacher1{
    String Designation="Music Teacher";
  String CollegeName="IIT";
  void work()
  {
    System.out.println(Designation + "       "
                       +CollegeName);
}
}

 
class CollegePrincipal {

//Add the main method here and create all different types of Teacher objects and print there college name designation.
public static void main(String args[]){
  Teacher1 t=new Teacher1();
  MathTeacher mt=new MathTeacher();
  EnglishTeacher et=new  EnglishTeacher();
  MusicTeacher mt1=new MusicTeacher();
  mt.work();
  et.work();
  mt1.work();
 
}
}