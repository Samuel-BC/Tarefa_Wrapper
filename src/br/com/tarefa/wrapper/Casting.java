package br.com.tarefa.wrapper;

import java.util.Scanner;

public class Casting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor primitivo int: ");

        int numPrimitivo = scanner.nextInt();
        Short numWrapper = (short) numPrimitivo;

        System.out.println("Conversão de int para Short\n" + "Valor primitivo int: " + numPrimitivo + "\n" + "Valor wrapper Short: " + numWrapper);
        scanner.close();
    }
}
