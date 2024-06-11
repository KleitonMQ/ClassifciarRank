import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        
        String heroName = "Denubio";
        int xp = 2005; 

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
