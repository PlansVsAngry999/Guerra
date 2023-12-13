package guerra;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class Main {
    public static void main(String[] args){
            //Crear unidades.
        Unidad soldado = new Unidad(1, "Soldado Ivan", 100);
        Unidad arquero = new Unidad(2, "Arquero Oliver", 80);
            //Crear armas.
        Arma espada = new Arma(1, "Espada", 50);
        Arma arco = new Arma(2, "Arco", 30);
            //Crear cuartel.
        Cuartel cuartel = new Cuartel(1, "Cuartel campal", 100);
        cuartel.reclutarUnidad(); //Simula la reclutación de una geidad.
            //Crear campo de entrenamiento.
        CampoEntrenamiento campo = new CampoEntrenamiento(1, "Campo de la Victoria");
        campo.entrenarUnidad(soldado);
        campo.entrenarUnidad(arquero);
            //Crear un general.
        General general = new General(1, "General Mawk", 15);
        general.dirigirUnidades();
            //Crear estrategia.
        Estrategia estrategia = new Estrategia(1, "Ataque por sorpersas");
        System.out.println("Estrategia" + estrategia.getDescripcion());
            //Preparar y ejecutar batalla.
        List<Unidad> unidadesEnBatalla = Arrays.asList(soldado, arquero);
        Batalla batalla = new Batalla(1, "Batalla del bosque Oscuro",unidadesEnBatalla);
        batalla.iniciar();
            //Acciones de las unidades en la batalla.
        soldado.atacar();
        arquero.atacar();
        batalla.finalizar();
            
    }
}
