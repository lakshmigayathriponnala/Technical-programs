
class Shape {
  public void print_shape() {
    System.out.println("This is shape");
  }
}

// Rectangle class is subclass of Shape class
class Rectangle extends Shape {
  void print_rect() {
    System.out.println("This is rectangular shape");
  }
}

// Circle class is subclass of Shape class
class Circle extends Rectangle {
  void print_circle() {
    System.out.println("This is circular shape");
  }
}

// Square class is subclass of Rectangle class
class Square extends Circle {
  void print_square() {
    System.out.println("Square is a rectangle");
  }
}

// main class
class Main {
  public static void main(String[] args) {
    Square sq = new Square(); // creating object of Square class
    sq.print_shape(); // Object of Square class calling function of Shape class
    sq.print_rect();
    sq.print_circle();
    sq.print_square(); // Object of Square class calling function of Rectangle class
  }
}
