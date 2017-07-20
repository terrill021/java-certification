
import java.util.LinkedList;


public class Usuario {
    private String nombre;
    private double credito;
    private final LinkedList<Subasta> subastaPropietario = new LinkedList();
    private LinkedList<Subasta> subastasGanadas = new LinkedList();
    private LinkedList<Puja> misPujasAceptadas = new LinkedList();
    private LinkedList<Puja> misPujas = new LinkedList();
    
    public Usuario() {
    }
    
    public void agregaSubastaGanada(Subasta subasta){
        this.subastasGanadas.addLast(subasta);
    }
    
    public void misSubastas(Subasta subasta){
        this.subastaPropietario.addLast(subasta);
    }
    
    public void agregaPuja(Puja  puja){
        this.misPujas.add(puja);
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public LinkedList<Subasta> getSubastaPropietario() {
        return subastaPropietario;
    }

    public void setSubastaPropietario(Subasta subasta) {
        this.misSubastas(subasta);
        
    }

    public LinkedList<Puja> getMisPujasAceptadas() {
        return misPujasAceptadas;
    }

    public void setMisPujasAceptadas(LinkedList<Puja> misPujasAceptadas) {
        this.misPujasAceptadas = misPujasAceptadas;
    }

    public LinkedList<Puja> getMisPujas() {
        return misPujas;
    }

    public void setMisPujas(LinkedList<Puja> misPujas) {
        this.misPujas = misPujas;
    }

    public LinkedList<Subasta> getSubastasGanadas() {
        return subastasGanadas;
    }

    public void setSubastasGanadas(LinkedList<Subasta> subastasGanadas) {
        this.subastasGanadas = subastasGanadas;
    }
    
}
