package guerra;
/**
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class Cuartel {
    private int id;
    private String ubicacion;
    private int capacidad;
    
    public Cuartel(int id, String ubicacion, int capacidad){
        this.id = id;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
    }
    public void reclutarUnidad(){
        System.out.println("Una nueva unidad ha sido reclutada.");
    }
        //Getter's y setter's.
    public int getId(){return id;}
    public String getUbicacion(){return ubicacion;}
    public int getCapacidad(){return capacidad;}
    public void setId(int id){this.id = id;}
    public void setUbicacion(String ubicacion){this.ubicacion = ubicacion;}
    public void setCapacidad(int capacidad){this.capacidad = capacidad;}
    
    
}
