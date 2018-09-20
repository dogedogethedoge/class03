package pl.class03;

public class JavaDemo {
  
  static int x = 2;
  
  public static void main(String[] args) {
    {
      
      int y = 0;
      int x = 0;
      
      outer: while (y < 10) {
        inner: while (x < 10) {
          // ...
          if (x == 5) break outer;
          x = x + 1;
        }
        y = y + 1;
        x = 0;
      }
      
    }
  }
}
