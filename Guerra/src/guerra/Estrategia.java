package guerra;
/**
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class Estrategia {
    private int id;
    private String descripcion;
    
    public Estrategia(int id, String descripcion){
        this.id = id;
        this.descripcion = descripcion;
    }
        //Getter's y setter's.
    public int getId(){return id;}
    public String getDescripcion(){return descripcion;}
    public void setId(int id){this.id = id;}
    public void setDescripcion(String descripcion){this.descripcion = descripcion;}
}
