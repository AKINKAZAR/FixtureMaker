import java.util.*;

public class Main {

    public static void main(String[] args) {


        List<String> teams = Arrays.asList("Beşiktaş", "Galatasaray", "Fenerbahçe",
                "Bursaspor", "Trabzonspor",
                "Boluspor", "Erzurum");

        FixtureBuilder fixtureBuilder = new FixtureBuilder(teams);
        Map<Integer, Set<Soccer>> soccerMap = fixtureBuilder.build();

        for (Map.Entry<Integer, Set<Soccer>> entry : soccerMap.entrySet()) {
            System.out.println("Round " + entry.getKey());

            for (Soccer soccer : entry.getValue()) {
                System.out.println(soccer.toString());
            }
            System.out.println("-------------------------------");
            System.out.println();
        }

    }

}
