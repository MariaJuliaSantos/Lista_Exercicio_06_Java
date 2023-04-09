import java.util.Scanner;

public class App {

    public static void main(String[] args) {
//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
        double area;
        double raio;
        Scanner teclado = new Scanner(System.in);
        {

            System.out.println("Digite o raio o circulo:");

            raio = teclado.nextDouble();

            area = 3.14 * Math.pow(raio, 2);

            System.out.println("A área do circulo é:" + area);

        }
    }
}