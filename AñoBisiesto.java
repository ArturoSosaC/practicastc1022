import java.util.*;
public class AñoBisiesto {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int n, con=0;
    boolean bis=false;
    System.out.print("Introduzca un año: ");
    n=s.nextInt();
    if(n%4==0 && n%100!=0)
      bis=true;
    if(n%400==0)
      bis=true;
    if(bis)
      System.out.println("El año "+n+" es bisiesto");
    else
      System.out.println("El año "+n+" no es bisiesto");
  }

}
