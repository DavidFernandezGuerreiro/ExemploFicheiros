
package Lectura;

import Persoas.Alumno;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dfernandezguerreiro
 */
public class LerObxetos {
    Scanner sc;
    File fich;
    String[]lista;
    String linea;
    
    public void lerObxetos(){
        
        
        Alumno al; //Creo una variable de la clase Alumno.
        
        try {
            sc=new Scanner(new File("/home/local/DANIELCASTELAO/dfernandezguerreiro/Escritorio/alumnos.txt")); //<-Creado de una tacada, se puede crear en más pasos. (LerNumeros,etc).
            while(sc.hasNextLine()){ //Mientras me que de una linea por leer.
                linea=sc.nextLine();
                lista=linea.split("\\s*,\\s*");
                al=new Alumno(lista[0],Integer.parseInt(lista[1]));
                System.out.println(al);
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro lectura obxetos");
        }
    }
    
    public  ArrayList<Alumno> listaSuspensos(){
        ArrayList<Alumno>suspensos=new ArrayList();
        Alumno al=null; //Creo una variable de la clase Alumno.
        
        try {
            sc=new Scanner(new File("/home/local/DANIELCASTELAO/dfernandezguerreiro/Escritorio/alumnos.txt")); //<-Creado de una tacada, se puede crear en más pasos. (LerNumeros,etc).
            while(sc.hasNextLine()){ //Mientras me que de una linea por leer.
                linea=sc.nextLine();
                lista=linea.split("\\s*,\\s*");
                al=new Alumno(lista[0],Integer.parseInt(lista[1]));
                if(al.getNota()<5){
                    suspensos.add(al);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro lectura obxetos");
        }
        return suspensos;
    }
    
}
