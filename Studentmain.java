import java.util.Scanner;

class Student {
  int rollno;
  long phoneno;
  String address;

  public void dispaly() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the rollno");
    rollno = sc.nextInt();
    System.out.println("enter the phoneno");
    phoneno = sc.nextLong();
    System.out.println("enter the address");
    address = sc.next();
  }

  void show() {
    System.out.println("rollno=" + rollno);
    System.out.println("phoneno=" + phoneno);
    System.out.println("address=" + address);
  }
}

class Studentmain {
  public static void main(String args[]) {
    Student a = new Student();
    a.dispaly();
    System.out.println("sam details");
    a.show();
    Student b = new Student();
    b.dispaly();
    System.out.println("john details");
    b.show();

  }
}