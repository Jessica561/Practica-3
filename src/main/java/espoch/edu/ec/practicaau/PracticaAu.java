
package espoch.edu.ec.practicaau;

import estudiante.Estudiante;
import java.util.ArrayList;


public class PracticaAu {

    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        estudiantes.add (new Estudiante("Ana",20,7.8));
        estudiantes.add (new Estudiante("Luis",22,6.2));
        estudiantes.add (new Estudiante("Carlos",21,9.8));
        estudiantes.add (new Estudiante("XD",26,6.1));
        estudiantes.add (new Estudiante("HOLA",29,8.5));
        
        System.out.println("Lista estudiante");
        for (Estudiante estudiante: estudiantes){
            estudiante.mostrarInfo();
            estudiante.getEdad();
            estudiante.getPromedio();
            estudiante.getNombre();
        } 
        //Modificacion del objeto luis 
        System.out.println("Modificar el promedio");
        Estudiante estudianteLuis = estudiantes.get(2);
        estudianteLuis.setEdad(80);
        //Dato modificado Luis 
        System.out.println("lista despues de a modificacion");
        for (Estudiante estudiante:estudiantes){
            estudiante.mostrarInfo();
            
            System.out.println("EL tuni vale pipi");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        System.out.println("Info");
        for(Estudiante a: estudiante){
           a.mostrarInfo();
        }
        
        ArrayList<String>nombres=new ArrayList<>();
        
        nombres.add("Genesis");
        nombres.add("Camila");
        nombres.add("Edy");
        nombres.add("hola");
        nombres.add("joshep");
        nombres.add("XD");
        
        System.out.println("Nombres listas:");
        for (String nombre:nombres){
            System.out.println(nombre);
        }
        
        /*Eliminar
        nombres.remove("hola");
        System.out.println("Lista de eliminar hola");
        for (String nombre:nombres){
            System.out.println(nombre);
        }
        
        nombres.remove(0);
        System.out.println("Lista eliminar elemet");
        for (String nombre:nombres){
            System.out.println(nombre);
        }
        
        System.out.println("Tamaño de lista:" +nombres.size());
        */
    }
    
}
