
public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------- Usuarios ---------------------");
        
        Usuario Juan = new Usuario();
        Juan.setNombre("Juan");
        Juan.setCredito(100);
        System.out.println("El usuario " + Juan.getNombre() + " se ha unido al juego con $" + Juan.getCredito());
        
        Usuario Pedro = new Usuario();
        Pedro.setNombre("Pedro");
        Pedro.setCredito(150);
        System.out.println("El usuario " + Pedro.getNombre() + " se ha unido al juego con $" + Pedro.getCredito());
        
        Usuario Enrique = new Usuario();
        Enrique.setNombre("Enrique");
        Enrique.setCredito(300);
        System.out.println("El usuario " + Enrique.getNombre() + " se ha unido al juego con $" + Enrique.getCredito());
        
        System.out.println("-------------Termina mostrando usuarios------------\n");
        
        System.out.println("-----------------Tiempo de Subastas----------------");
        
        Subasta subastaDeJuan = new Subasta();//Haciendo la subasta

        subastaDeJuan.setDescripcion("Telefono Movil");
        subastaDeJuan.setPropietario(Juan);
        Juan.setSubastaPropietario(subastaDeJuan);
        
        System.out.println("El usuario " + subastaDeJuan.getPropietario().getNombre()
            + " ha comenzado una subasta con\ndescripción de ''" +
                subastaDeJuan.getDescripcion() + "''");
        System.out.println("----------------Fin tiempo subastas------------------\n");
        
        System.out.println("===============Subasta ''" + subastaDeJuan.getDescripcion()+ "'' abierta===========");
        System.out.println("-------------------Tiempo de pujas-----------------");
        
        Puja pujaDePedro = new Puja();
        pujaDePedro.setUsuario(Pedro);
        pujaDePedro.setSubasta(subastaDeJuan);
        pujaDePedro.setCantidadPuja(100);
        System.out.println("El usuario " + pujaDePedro.getUsuario().getNombre()
                + " intenta hacer una puja por $" + pujaDePedro.getCantidadPuja());
        
        Pedro.agregaPuja(pujaDePedro);//Agrega la puja a la cuenta de pedro
        subastaDeJuan.pujar(pujaDePedro);//Ingresa la Puja
        
        System.out.println("·················································");
        System.out.println("La mayor puja hasta ahora es del usuario: " + subastaDeJuan.getPujaMayor().getUsuario().getNombre());
        System.out.println("Por un valor de : $" + subastaDeJuan.getPujaMayor().getCantidadPuja());
        System.out.println("El producto a conseguir es: " + subastaDeJuan.getDescripcion());
        System.out.println("··················································\n");
        
        Puja pujaDeEnrique = new Puja();
        pujaDeEnrique.setUsuario(Enrique);
        pujaDeEnrique.setSubasta(subastaDeJuan);
        pujaDeEnrique.setCantidadPuja(50);
        System.out.println("El usuario " + pujaDeEnrique.getUsuario().getNombre()
                + " intenta hacer una puja por $" + pujaDeEnrique.getCantidadPuja());
        
        Enrique.agregaPuja(pujaDeEnrique);//Agrega la puja a la cuenta de Enrique
        subastaDeJuan.pujar(pujaDeEnrique);//Ingresa la Puja
        
        System.out.println("·················································");
        System.out.println("La mayor puja hasta ahora es del usuario: " + subastaDeJuan.getPujaMayor().getUsuario().getNombre());
        System.out.println("Por un valor de : $" + subastaDeJuan.getPujaMayor().getCantidadPuja());
        System.out.println("El producto a conseguir es: " + subastaDeJuan.getDescripcion());
        System.out.println("··················································\n");
        
        subastaDeJuan.cerrar(); //Cerrando
        System.out.println("-------------Tiempo de pujas terminado--------------\n\n");
        
        Puja pujaDeEnrique2 = new Puja();
        pujaDeEnrique2.setUsuario(Enrique);
        pujaDeEnrique2.setSubasta(subastaDeJuan);
        pujaDeEnrique2.setCantidadPuja(200);
        System.out.println("El usuario " + pujaDeEnrique2.getUsuario().getNombre()
                + " intenta hacer una puja por $" + pujaDeEnrique2.getCantidadPuja());
        
        Enrique.agregaPuja(pujaDeEnrique2);
        subastaDeJuan.pujar(pujaDeEnrique2);//Ingresa la Puja dos de Enrique
        
        System.out.println("·················································");
        System.out.println("La mayor puja hasta ahora es del usuario: " + subastaDeJuan.getPujaMayor().getUsuario().getNombre());
        System.out.println("Por un valor de : $" + subastaDeJuan.getPujaMayor().getCantidadPuja());
        System.out.println("El producto a conseguir es: " + subastaDeJuan.getDescripcion());
        System.out.println("··················································\n");
        
        subastaDeJuan.ejecutarSubasta(); //Ejecutando la subasta
        System.out.println("##############Subasta ejecutada###################");
        
        System.out.println("~~~~~~~~Mostrando credito de los usuarios~~~~~~~~");
        //Mostrando a Juan
        System.out.println("Nombre: " + Juan.getNombre() + "\tcredito: $" + Juan.getCredito());
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        //Mostrando a Pedro
        System.out.println("Nombre: " + Pedro.getNombre() + "\tcredito: $" + Pedro.getCredito());
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        //Mostrando a Enrique
        System.out.println("Nombre: " + Enrique.getNombre() + "\tcredito: $" + Enrique.getCredito());
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%\n\n");//Soy una division :'D
        
        //Mostrando todos los datos de los usuarios
        //Mostrando a Juan
        
        System.out.println("-------------Usuario 1: " + Juan.getNombre() + "------------");
        Juan.getMisPujas().clear();
        
        if (Juan.getSubastaPropietario().isEmpty()) {
            System.out.println("Usuario sin subastas");
        }else{
            System.out.println("Propietario de la(s) subasta(s):");
            for (int i = 0; i < Juan.getSubastaPropietario().size(); i++) {
                System.out.println(" -> " + Juan.getSubastaPropietario().get(i).getDescripcion());
            }
        }
        System.out.println("Pujas realizadas por " + Juan.getNombre());
        if (Juan.getMisPujas().isEmpty()) {
            System.out.println("-> El usuario " + Juan.getNombre() + " no tiene pujas realizadas");
        }else{
            for (int i = 0; i < Juan.getMisPujas().size(); i++) {
                //Producto y cantidad de las pujas (valor)
                System.out.println(" -> Puja ''" + Juan.getMisPujas().get(i).getSubasta().getDescripcion() + "'' por valor de $"
                + Juan.getMisPujas().get(i).getCantidadPuja());
            }
        }
        
        //Fin Juan
        System.out.println("\n");
        //Mostrando a Pedro
        
        System.out.println("-------------Usuario 2: " + Pedro.getNombre() + "-----------");
        if (Pedro.getSubastaPropietario().isEmpty()) {
            System.out.println("Usuario sin subastas");
        }else{
            System.out.println("Propietario de la(s) subasta(s):");
            for (int i = 0; i < Pedro.getSubastaPropietario().size(); i++) {
                System.out.println(" -> Puja ''" + Pedro.getMisPujas().get(i).getSubasta().getDescripcion() + "'' por valor de $"
                + Pedro.getMisPujas().get(i).getCantidadPuja());
            }
        }
        System.out.println("Pujas realizadas por " + Pedro.getNombre());
        if (Pedro.getMisPujas().isEmpty()) {
            System.out.println("-> El usuario " + Pedro.getNombre() + " no tiene pujas realizadas");
        }else{
            for (int i = 0; i < Pedro.getMisPujas().size(); i++) {
                //Producto y cantidad de las pujas (valor)
                System.out.println(" -> Puja ''" + Pedro.getMisPujas().get(i).getSubasta().getDescripcion() + "'' por valor de $"
                + Pedro.getMisPujas().get(i).getCantidadPuja());
            }
        }
        
        //Fin Pedro
        System.out.println("\n");
        //Mostrando a Enrique
        
        System.out.println("-------------Usuario 3: " + Enrique.getNombre() + "---------");
        if (Enrique.getSubastaPropietario().isEmpty()) {
            System.out.println("Usuario sin subastas");
        }else{
            System.out.println("Propietario de la(s) subasta(s):");
            for (int i = 0; i < Juan.getSubastaPropietario().size(); i++) {
                System.out.println(" -> " + Juan.getSubastaPropietario().get(i).getDescripcion());
            }
        }
        System.out.println("Pujas realizadas por " + Enrique.getNombre());
        if (Enrique.getMisPujas().isEmpty()) {
            System.out.println("-> El usuario " + Enrique.getNombre() + " no tiene pujas realizadas");
        }else{
            for (int i = 0; i < Enrique.getMisPujas().size(); i++) {
                //Producto y cantidad de las pujas (valor)
                System.out.println(" -> Puja ''" + Enrique.getMisPujas().get(i).getSubasta().getDescripcion() + "'' por valor de $"
                + Enrique.getMisPujas().get(i).getCantidadPuja());
            }
        }
        
        //Fin Enrique
    }   
}