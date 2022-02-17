/*
* Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o
* caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n.
* A última linha não deve conter nenhum espaço.
 * */


package br.com.proway.capgemini.questao1;

public class Main {
    public static final int SIZE = 10;
    public static final int STAIR_WIDTH = 10;
    public static final String TREAD = "-";
    public static final String RISER = "|";
    public static final String NOSING = "+";
    public static final String HOLLOW = " ";

    public static void main(String[] args)
    {

        StringBuilder tread = new StringBuilder();
        tread.append((NOSING + TREAD.repeat((STAIR_WIDTH - 2))).repeat(SIZE));
        tread.append(NOSING);

        StringBuilder riser = new StringBuilder();
        riser.append((RISER + HOLLOW.repeat((STAIR_WIDTH - 2))).repeat(SIZE));
        riser.append(RISER);

        for (int i = 0; i < SIZE; ++i) {
            int offset = tread.length() - (((STAIR_WIDTH - 1) * i) + STAIR_WIDTH);
            printSpaces(offset);
            System.out.println(tread.substring(offset));
            printSpaces(offset);
            System.out.println(riser.substring(offset));
        }
        System.out.println(tread);
    }

    public static void printSpaces(int count)
    {
        for (int i = 0; i < count; ++i)
            System.out.print(" ");
    }
}