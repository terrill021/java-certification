
import java.util.LinkedList;

public final class Subasta {
    private Usuario propietario;
    private String descripcion;
    private Puja pujaMayor = null;
    private Puja ultimaPuja;
    private boolean cerrado = false;
    private boolean ejecutada = false;
    private LinkedList<Puja> pujasAceptadas = new LinkedList();
    
    public Subasta() {
        this.cerrado = false;
        Puja vacia = new Puja();
        vacia.setCantidadPuja(0);
        vacia.setSubasta(null);
        vacia.setUsuario(null);
        this.setPujaMayor(vacia);
        this.setUltimaPuja(vacia);
    }

    public void pujar(Puja puja){
        
        if (puja.getCantidadPuja() == 0.0) {
            puja.setCantidadPuja(this.ultimaPuja.getCantidadPuja() + 1);            
        }
        
        this.setUltimaPuja(puja);//Hace de esta la ultima puja
        if (this.cerrado == true) {
            System.out.println("Puja de " + puja.getUsuario().getNombre() + " NO aceptada");
            System.out.println("Motivo -> La subasta ya se ha cerrado\n");
        }else{
            if (puja.getUsuario().getCredito() >= puja.getCantidadPuja()) { //Si la plata del usuario es mayor de la que pone en la puja
                if (puja.getSubasta().getPropietario() != puja.getUsuario()) {//Propietario de subasta no es quien hace la puja
                    if (puja.getCantidadPuja() >= this.pujaMayor.getCantidadPuja()) {//Cantidad de puja mayor que la mayor puja

                            System.out.println("Puja de " + puja.getUsuario().getNombre() + " aceptada :)\n");
                            this.pujasAceptadas.add(puja);
                            this.getPropietario().agregaPuja(puja);
                            this.setPujaMayor(puja);   
                    }else{
                        System.out.println("Puja de " + puja.getUsuario().getNombre() + " NO aceptada");
                        System.out.println("Motivo -> El valor de su puja NO es superior al mayor\n");
                    }
                }else{
                    System.out.println("Puja de " + puja.getUsuario().getNombre() + " NO aceptada");
                    System.out.println("Motivo -> Intenta hacer una puja en su propia subasta\n");
                }
            } else {
                System.out.println("Puja de " + puja.getUsuario().getNombre() + " NO aceptada");
                System.out.println("Motivo -> Dinero insuficiente, visite a los prestadiarios\n");
            }
        }
    }

    public void ejecutarSubasta(){
        if (this.isCerrado() == true) {
            double valorSubasta;
            valorSubasta = this.getPujaMayor().getCantidadPuja();//Dinero total de la subasta
            this.getPropietario().setCredito(this.getPropietario().getCredito()+valorSubasta);//Aumenta dinero del propietario
            this.pujaMayor.getUsuario().setCredito((this.pujaMayor.getUsuario().getCredito()-valorSubasta));
            this.getPujaMayor().getUsuario().agregaSubastaGanada(this);
        }else{
            System.out.println("La puja aun no ha sido cerrada");
        }
    }
    
    public void cerrar(){
        this.setCerrado(true);
        this.getPropietario().setMisPujasAceptadas(this.getPujasAceptadas());
        System.out.println("============= Subasta ''" + this.getDescripcion() + "'' cerrada ===========");
    }
    
    public boolean isCerrado() {
        return cerrado;
    }

    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getPropietario() {
        return propietario;
    }

    public void setPropietario(Usuario propietario) {
        this.propietario = propietario;
    }

    public LinkedList<Puja> getPujasAceptadas() {
        return pujasAceptadas;
    }

    public void setPujasAceptadas(LinkedList<Puja> pujasAceptadas) {
        this.pujasAceptadas = pujasAceptadas;
    }

    public boolean isEjecutada() {
        return ejecutada;
    }

    public void setEjecutada(boolean ejecutada) {
        this.ejecutada = ejecutada;
    }

    public Puja getPujaMayor() {
        return pujaMayor;
    }

    public void setPujaMayor(Puja pujaMayor) {
        this.pujaMayor = pujaMayor;
    }

    public Puja getUltimaPuja() {
        
        return ultimaPuja;
    }

    public void setUltimaPuja(Puja ultimaPuja) {
        this.ultimaPuja = ultimaPuja;
    }
    
    
}
