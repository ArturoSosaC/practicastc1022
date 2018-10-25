import java.util.*;
public class NumerosCirculares {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    String p;
    boolean prim, cir=true;
    System.out.print("Introduzca un número: ");
    p=s.next();
    for(int con=0; con<p.length(); con++){
      prim=primo(Character.getNumericValue(p.charAt(con)));
      if(prim)
        System.out.println(p.charAt(con)+" es primo");
      else{
        System.out.println(p.charAt(con)+" no es primo");
        cir=false;
      }
    }
    if(cir)
      System.out.println("El numero "+p+" es primo circular");
    else
      System.out.println("El numero "+p+" no es primo circular");
  }

  public static boolean primo(int p){
    boolean prim=true;
    for(int con=2; con<p; con++){
      if(p%con==0)
        prim=false;
    }
    return prim;
  }
}
