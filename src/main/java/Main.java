import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int alcool = 0, gasolina = 0, diesel = 0;
    int codigo;

    System.out.print("Qual tipo de Combustível que você deseja: 1. Álcool; 2. Gasolina; 3. Diesel; 4. Fim: ");
    codigo = sc.nextInt();

    while (codigo != 4) { 
      if (codigo == 1) {
        alcool = alcool + 1;
      } else if (codigo == 2) {
        gasolina = gasolina + 1;
      } else if (codigo == 3) {
        diesel = diesel + 1;
      } else { 
        
        System.out.println("");
        System.out.println("Código inválido, Tente novamente.");
        
      }
      System.out.print("Qual tipo de Combustível que você deseja: 1. Álcool; 2. Gasolina; 3. Diesel; 4. Fim: ");
      codigo = sc.nextInt();
    }

    System.out.println("");
    System.out.println("Muito Obrigado");
    System.out.println("");
    System.out.println("Vendas de Álcool: " + alcool);
    System.out.println("Vendas de Gasolina: " + gasolina);
    System.out.println("Vendas de Diesel: " + diesel);
    
    sc.close();
  }
}