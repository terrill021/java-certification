/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoenum;

enum TipoUsuario {

    ADMINISTRADOR(1), CLIENTE(2), USUARIO(3);

    TipoUsuario(int x) {
        this.tipo = x;
    }
    private int tipo;

    public int getTipo() {
        return this.tipo;
    }
}

class Usuario {

    TipoUsuario tipo;
}


public class UsoEnum {

    public static void main(String[] abc) {

        Usuario usuario = new Usuario();
        usuario.tipo = TipoUsuario.ADMINISTRADOR;
        System.out.println(usuario.tipo.getTipo());
    }

}
