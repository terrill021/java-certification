
public class Puja {
    
    private Subasta subasta;
    private Usuario usuario;
    private double cantidadPuja;

    public Puja() {
    }

    public double getCantidadPuja() {
        return cantidadPuja;
    }

    public void setCantidadPuja(double cantidadPuja) {
        this.cantidadPuja = cantidadPuja;
    }

    public Subasta getSubasta() {
        return subasta;
    }

    public void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
