class exe2{
  public static void main(String[] args) {

    int row = 5,k=10;
    for (int i = 1;i <= row;i++) {
      for (int j =1;j <i+1;j++) {
      System.out.print(k++ + " ");
      }
      System.out.println("");
    }
  }
}