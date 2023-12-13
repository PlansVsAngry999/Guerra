package guerra;
/**
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class CampoEntrenamiento {
    private int id;
    private String ubicacion;
    
    public CampoEntrenamiento(int id, String ubicacion){
        this.id = id;
        this.ubicacion = ubicacion;
    }
    public void entrenarUnidad(Unidad unidad){
        System.out.println("Entrenando a la unidad: " + unidad.getNombre());
    }
        //Getter's y setter's.
    public int getId(){return id;}
    public String getUbicacion(){return ubicacion;}
    public void setId(int id){this.id = id;}
    public void setUbicacion(String ubicacion){ this.ubicacion = ubicacion;}
}