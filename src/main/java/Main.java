import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Hero, this is you map:");
        String[][] woodMap=WoodMap.getWoodMap("src/main/resources/carte.txt");
        MapPrinter.printWoodMap(woodMap);
        Hero hero = new Hero();
        int[] startPoint;
        String[] steps;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String[] startPointString = br.readLine().split(",");
            startPoint = new int[] {Integer.parseInt(startPointString[1]), Integer.parseInt(startPointString[0])};
            steps = br.readLine().split("");
            hero.setPosition(startPoint);
            System.out.println(hero);
            System.out.println("You want walk "+ steps.length + " steps" );
            HeroMover.moveHero(hero,woodMap,steps);
            System.out.println(hero);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
