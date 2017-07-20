/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoenum;

public class Carta {

    enum TipoCarta {

        PICAS("picas"), TREBOL("treboles"), CORAZONES("corazones"), DIAMANTES("diamantes");

        TipoCarta(String tipo) {
            this.tipo = tipo;
        }
        private String tipo;

        public String getTipo() {
            return tipo;
        }
    }

    enum NumCarta {

        AS(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7),
        OCHO(8), NUEVE(9), DIEZ(10), JOTA(11), REINA(12), REY(13), JOCKER(14);

        NumCarta(int num) {
            this.numero = num;
        }
        public String getLidCode(){
            return "b";
        }
        private int numero;

        public int getNumero() {
            return numero;
        }
    }

    TipoCarta tipoCarta;
    NumCarta numCarta;

    public static void main(String[] a) {
        Carta carta = new Carta();
        carta.numCarta = Carta.NumCarta.AS;
        carta.tipoCarta = Carta.TipoCarta.CORAZONES;
        System.out.println(carta.numCarta.getNumero() + " " + carta.tipoCarta.getTipo());
    }

}
