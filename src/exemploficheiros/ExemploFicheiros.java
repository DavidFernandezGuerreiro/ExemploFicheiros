
package exemploficheiros;

import Escritura.EscribirFicheiro;
import Lectura.LerFicheiro;
import Lectura.LerPalabras;
import Lectura.LerNumeros;
import Lectura.LerObxetos;
import Persoas.Alumno;
import java.util.ArrayList;

/**
 *
 * @author dfernandezguerreiro
 */
public class ExemploFicheiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LerFicheiro obx=new LerFicheiro();
//        obx.leerLineas();
        
        LerPalabras obxP=new LerPalabras();
//        obxP.lerPalabras();

        LerNumeros obxN=new LerNumeros();
//        obxN.lerNumeros();
//        obxN.sumarPares();

        LerObxetos obxO=new LerObxetos();
//        obxO.lerObxetos();
//        ArrayList<Alumno>suspensos;
//        suspensos=obxO.listaSuspensos();
//        System.out.println(suspensos.toString());
        
        EscribirFicheiro obxE=new EscribirFicheiro();
        obxE.escribirFrases();
    }
    
}
