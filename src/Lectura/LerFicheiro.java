
package Lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dfernandezguerreiro
 */
public class LerFicheiro {
    Scanner sc;
    File fich; // <-Si voy a utilizar el fichero en más sitios.
    
    public void leerLineas(){
//        String resposta=null;
        //File fich=new File("/home/local/DANIELCASTELAO/dfernandezguerreiro/Escritorio/primeiro.txt"); //Con la ruta.
        fich=new File("segundo.txt"); //Con el nombre (fichero guardado en la carpeta del proyecto).
        try {
            sc=new Scanner(fich);
            while(sc.hasNextLine()){ //Mientras haya algo en la línea, lo lee.
//                resposta=sc.nextLine();
//                System.out.println(resposta);
                System.out.println(sc.nextLine()); //Con esta línea, obviamos la variable resposta.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("ERRO1"+ex.getMessage());
        }
        sc.close();
    }
}
