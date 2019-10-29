package boletin6_2;
import java.util.*;
/**
 *
 * @author mmartinezcosta
 */
public class Boletin6_2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
  
    Scanner sc=new Scanner(System.in);
    short numero1;
    short numero2;
    
        System.out.println("Dime el valor del primer número:");
    numero1=sc.nextShort();
        System.out.println("Dime el valor para el segundo número:");
    numero2=sc.nextShort();
    
    short suma=(short)(numero1+numero2);
    short resta=(short)(numero1-numero2);
    
        if (numero1>=numero2){
            System.out.println("Resultado de la resta: "+resta);
            System.out.println("Resultado de la suma: "+suma);
        }
        else
            System.out.println("Resultado de la suma: "+suma);
    } 
}
