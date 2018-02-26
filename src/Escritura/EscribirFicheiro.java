
package Escritura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author dfernandezguerreiro
 */
public class EscribirFicheiro {
    File fich;
    PrintWriter escribir;

    public void escribirFrases(){
        try{
            fich=new File("frases.txt");
            escribir=new PrintWriter(new FileWriter(fich,true));
////            escribir=new PrintWriter(new File("frases2.txt")); //<- Tamén se pode facer así.
            escribir.println("primera frase");
            escribir.println("segunda frase");
            escribir.println("tercera frase");

        }catch(FileNotFoundException ex){
            System.out.println("erro de escritura");
        }catch(IOException ex){
            System.out.println("Erro4");
        }finally{
            escribir.close();
        }
    }
    
    
}
