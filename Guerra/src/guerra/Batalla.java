package guerra;

import java.util.List;

/*
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class Batalla {
    private int id;
    private String nombre;
    private List<Unidad> unidadesInvolucradas;
    
    public Batalla(int id, String nombre, List<Unidad> unidadesInvolucradas){
        this.id = id;
        this.nombre = nombre;
        this.unidadesInvolucradas = unidadesInvolucradas;
    }
    public void iniciar(){
        System.out.println("La batalla " + nombre + " ha comenzado.");
        for(Unidad unidad : unidadesInvolucradas){
            unidad.atacar();
        }
    }
    public void finalizar(){
        System.out.println("La batalla " + nombre + " ha terminado.");
    }
        //Getter's y setter's.
    public int getId(){return id;}
    public String getNombre(){return nombre;}
    public List<Unidad> getUnidadesInvolucradas(){return unidadesInvolucradas;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setUnidadesInvolucradas(List<Unidad> unidadesInvolucradas){this.unidadesInvolucradas = unidadesInvolucradas;}
}
    