package br.com.proway.capgemini.questao2;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {



        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        String nome = teclado.next();
        System.out.println("Informe a sua senha: ");
        String senha = teclado.next();

        while (true) {

            if (!validaSenha(senha) || senha.length() < 3 || !validaLetrasSenha(senha)) {

                System.out.println(nome + ", sua senha é fraca! Atenção aos requisitos:");
                System.out.println("Possuir no mínimo 6 caracteres.");
                System.out.println("Conter no mínimo 1 digito.");
                System.out.println("Conter no mínimo 1 letra em minúsculo.");
                System.out.println("Conter no mínimo 1 letra em maiúsculo.");
                System.out.println("Conter no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+");
                System.out.println("*".repeat(100));
                System.out.println("Informe a sua senha: ");
                senha = teclado.next();

            } else {
                System.out.printf("Parabéns %s!\n", nome);
                System.out.println("Senha cadastrada!");
                break;
            }
        }
    }

    // Funcao para validar se existe caracteres especiais e o tamanho da senha
    public static boolean validaSenha(String password) {
        return password.matches("(?=.*[}{.(&)#^!?~=+\\-_\\/*\\-+.\\|])(?=.*[a-zA-Z])(?=.*[0-9]).{6,}");
    }

    // Funcao para validar se existe letra maiuscula na senha
    public static boolean validaLetrasSenha(String password) {
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Y", "Z"};
        for (String letra : letras) {
            if (password.contains(letra)) {
                return true;
            }
        }
        return false;
    }
}