public class MapPrinter {

    public static void printWoodMap( String[][] woodMap){

        for (String[] strings : woodMap) {
            for (String string : strings) {
                System.out.print(string + "");
            }
            System.out.println();
        }

    }
}
