
import java.util.Scanner;


public class IfEjemplo {
    
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in); 
      
      // Ejemplo
      //System.out.print("Escribe la hora: ");
      //int hora = scanner.nextInt();     
      
      /*
      if(hora<12){
            System.out.println("Es por la mañana");
        }else if(hora <15){
            System.out.println("Es por la tarde");
        }else{
            System.out.println("Es por la noche");
        }
        
      */
      
      /*
      if(hora == 20){          
          System.out.println("Es por la tarde");
      }
      */
      
      System.out.print("Escribe la primer nota: ");
      int nota1 = scanner.nextInt();
      
      System.out.print("Escribe la segunda nota: ");
      int nota2 = scanner.nextInt();
      
      int resultado = nota1+ nota2;
      if(resultado >=7){// Ejercicio 1
            System.out.println("Aprobo");
        }// Ejercicio 2
      else{
            System.out.println("Perdio");
        }

      
      // IF Ternario
      /*System.out.print("Escribe la hora: ");
      int hora = scanner.nextInt();
      String horario = hora < 12 ? "Es por la mañana" : "Es por la noche";
        System.out.println("El horario es: "+ horario);*/
    
    }
    
}
