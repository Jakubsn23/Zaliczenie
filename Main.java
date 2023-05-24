 import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Podaj pierwszą liczbę:");
    float l1 = scan.nextFloat();
    System.out.println("Podaj drugą liczbę:");
    float l2 = scan.nextFloat();
    System.out.println("Podaj trzecią liczbę:");
    float l3 = scan.nextFloat();

    float najmnliczba = znajdznajmnliczbe(l1, l2, l3);
    System.out.println("Najmniejsza liczba to: " + najmnliczba);
    }

    public static float znajdznajmnliczbe(float a, float b, float c)
      {
        float najmn = a; 
      
      if(b < najmn)
      {
        najmn = b;
      }
       if(c < najmn)
       {
         najmn = c;
       }
       return najmn; 
  }
}
