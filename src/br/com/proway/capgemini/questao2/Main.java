/*
* Débora se inscreveu em uma rede social para se manter em contato com seus amigos.
* A página de cadastro exigia o preenchimento dos campos de nome e senha,
* porém a senha precisa ser forte. O site considera uma senha forte quando
* ela satisfaz os seguintes critérios:

 * */

package br.com.proway.capgemini.questao2;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String[] caracteresEspeciais = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+"};

        System.out.println("Informe sua senha: ");
        String senha = teclado.next();

        while (true) {
            for (int i = 0; i < caracteresEspeciais.length; i++) {
                if (!caracteresEspeciais[i].contains(senha)) {
                    System.out.println("Senha fraca!");
                }
            }

        }



    }
}
