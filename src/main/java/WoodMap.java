import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WoodMap {


    public static  int[] getWoodMapDimensions(String fileMap) {
        int rows = 0;
        int columns = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileMap))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (rows == 0) {
                    String[] values = line.split("");
                    columns = values.length;
                }
                rows++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] dimensions = new int[] { rows, columns };
        return dimensions;
    }


    public static String[][] getWoodMap( String fileMap) {

        int[] dimensions = getWoodMapDimensions(fileMap);
        String[][] woodMap = new String[dimensions[0]][dimensions[1]];

        try (BufferedReader br = new BufferedReader(new FileReader(fileMap))) {
            String line;
            int rowIndex = 0;
            while ((line = br.readLine()) != null) {
                String[] values = line.split("");
                for (int i = 0; i < values.length; i++) {
                    woodMap[rowIndex][i] = values[i];
                }
                rowIndex++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return woodMap;
    }

}
