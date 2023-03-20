public class HeroMover {
    public static void moveHero(Hero hero,String[][] woodMap,String[] directions){
        for(String direction : directions){
            switch (direction) {
                case "N" -> hero.moveNorth(woodMap);
                case "S" -> hero.moveSouth(woodMap);
                case "E" -> hero.moveEast(woodMap);
                case "O" -> hero.moveWest(woodMap);
                default -> throw new IllegalArgumentException("Invalid direction : "
                        + direction);
            }
        }
    }
}
