import java.util.*;
public class NumerosPerfectos {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int n, sum=0;
    boolean repeat=true;
    System.out.print("Introduzca un número: ");
    n=s.nextInt();
    for(int con=1; con<n; con++){
      if(n%con==0)
        sum+=con;
    }
    if(n==sum)
      System.out.println("El numero "+n+" es perfecto");
    else
      System.out.println("El numero "+n+" no es perfecto");
  }

}
