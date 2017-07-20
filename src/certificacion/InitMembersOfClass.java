package certificacion;

class ClasePadre {

    
    ClasePadre() {
        System.out.println("constructor clase padre");
        System.out.println("segunda linea constructor padre");
        
    }
}

public class InitMembersOfClass  extends ClasePadre{

    InitMembersOfClass(int x) {
        
        System.out.println("constructor default con paramentro clase hija");
    }

    InitMembersOfClass() {
       System.out.println("constructor default sin paramentro clase hija");
    }

    static {
        System.out.println("primer bloque static");
    }

    { // los bloques son los segundos en ser ejecutados y
// se ejecutan de acuerdo al orden en que se encuentran en la clase.
        System.out.println("primer bloque ");
    }

    {
        System.out.println("segundo bloque");
    }

    static {// los bloques static son los primeros en ser ejecutados y
// se ejecutan de acuerdo al orden en que se encuentran en la clase.
        System.out.println("segundo bloque estatic");
    }

    public static void main(String[] args) {
        new InitMembersOfClass();
        new InitMembersOfClass(7);
    }
}
