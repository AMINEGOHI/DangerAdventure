import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    void heroAssertLocation(){
        Hero hero=new Hero();
        int[] startPoint= {3,1};
        hero.setPosition(startPoint);
        assertArrayEquals(startPoint, hero.getPosition());

    }

    @Test
    void heroGoEast(){
        String[][] woodMap=WoodMap.getWoodMap("src/main/resources/carte.txt");
        Hero hero=new Hero();
        int[] heroMapStartPosition = {3,1};
        int[] endPoint= {3,2};
        hero.setPosition(heroMapStartPosition);
        hero.moveEast(woodMap);
        assertArrayEquals(endPoint,hero.getPosition());


    }
}