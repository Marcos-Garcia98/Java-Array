
package principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Array de 40 Contactos
      Contactos [] listadoContactos = new Contactos [40];  
        //Lector de consola
      Scanner lector = new Scanner (System.in);
      int opcion =0;
      int posicion = 0;
      do{
      //Opciones de menu
      
         do {
            System.out.println("1- Crear contacto");
            System.out.println("2- imprimir lista contacto");
            System.out.println("3- salir");
            System.out.println("Indique la opcion elegida");
            opcion = lector.nextInt();
            lector.nextLine();
         } while (opcion<1 || opcion>3);
         switch (opcion){
            case 1: {
                if(posicion<40){
                    //recogida de los datos por el usuario
                    System.out.println("Indique nombre");
                    String nombre = lector.nextLine();
                    System.out.println("Indique telefono");
                    String telefono = lector.nextLine();
                    System.out.println("Indique correo");
                    String correo = lector.nextLine();
                    //creo el objeto contacto
                    Contactos contacto = new Contactos(nombre,telefono,correo);
                    //Añado el contacto al Array y aumento la posicion 
                    //de escritura del Array
                    listadoContactos[posicion]= contacto;
                    posicion++;
                 }else{
                    System.out.println("La lista esta llena, pase por caja");
                  } 
                 break;
                 }
                 case 2: {
                      if(posicion>0){
                        for (int i = 0; i<posicion; i++ ){
                            System.out.println(listadoContactos[i].toString());
                        }
                     }else{
                          System.out.println("No hay contactos en la lista");
                      }
                       
                      
                 
                   }
             
        }
     }while(opcion>0 && opcion<3);
    
    }
    
}
