package br.com.questao;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CartaoCredito credito = new CartaoCredito("15/10/2023, 15:00",325,5000.0,"0747-1836-5735-2846", "Mastercard", "Tugas Mafia");
        System.out.println(credito.imprimirCupomFiscal());

        CartaoDebito debito = new CartaoDebito("03/10/2077, 23:99", 980,330.5,"9847-5974-2387-5742", "Gabriel");
        System.out.println(debito.imprimirCupomFiscal());

        Pix pix = new Pix("29/02/2003",839, 2398,true);
        System.out.println(pix.imprimirCupomFiscal());
    }
}