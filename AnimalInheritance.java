/*   JFM1T10_Assignment2:

     Create a class Animal that has a method makeSound(). 
     Then create two subclasses of Animal class: Horse and Cat that extends Animal class and 
     provide their specific implementation of makeSound() method.

     Sample Output:
     The animal makes a sound
     The Horse says: wee wee
     The Cat says: meow meow

*/
class Animal
  {
    //Add Animal class and Create Sound() method 
    public void makeSound()
    {
      System.out.println("the animal makes a sound");
    }
  }

//Add Horse class that extends Animal class
class Horse extends Animal
  {
    public void makeSound()
    {
      System.out.println("the horse says:wee wee");
    }
  }
//Add Cat class that extends Animal class
class Cat extends Animal
  {
    public void makeSound()
    {
      System.out.println("the cat says:meow meow");
    }
  }



class  AnimalInheritance {
 
//Add main method here
  public static void main(String args[])
  {
    //Create all 3 Animal objects and add to an array 
    Animal a=new Animal();
    Horse h=new Horse();
    Cat c=new Cat();
    a.makeSound();
    h.makeSound();
    c.makeSound();
  }

}

