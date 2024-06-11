import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do herói: ");
        String heroName = scanner.nextLine();
        
        int xp = 0;
        boolean validXp = false;

        while (!validXp) {
            System.out.print("Digite a quantidade de XP: ");
            try {
                xp = scanner.nextInt();
                validXp = true; 

            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite um número inteiro para o XP.");
                scanner.next(); // Limpa a entrada inválida
            }
        }
        scanner.close();

        TreeMap<Integer, String> xpRanks = new TreeMap<>();
        xpRanks.put(0, "Ferro");
        xpRanks.put(1001, "Bronze");
        xpRanks.put(2001, "Prata");
        xpRanks.put(5001, "Ouro");
        xpRanks.put(7001, "Platina");
        xpRanks.put(8001, "Ascendente");
        xpRanks.put(9001, "Imortal");
        xpRanks.put(10001, "Radiante");

        Map.Entry<Integer, String> entry = xpRanks.floorEntry(xp);
        String rank = (entry != null) ? entry.getValue() : "Sem classificação";

        System.out.println("O herói " + heroName + " tem a classificação: " + rank);
    }
}
