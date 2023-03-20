import java.util.Objects;

public class Hero implements Movements {
    //WoodMap woodMap;
    int [] position;

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    @Override
    public String toString() {
      /*  return "Hero{" +
                "position=" + Arrays.toString(position) +
                '}';*/
         return "Le personnage doit se trouver en ("+position[1]+","+position[0]+")";
    }


    @Override
    public Boolean moveNorth(String[][] woodMap) {
        int[] currentPosition=getPosition();
        int[] nextPosition={currentPosition[0]-1,currentPosition[1]};
        if(!Objects.equals(woodMap[nextPosition[0]][nextPosition[1]], "#")){
            setPosition(nextPosition);
            return true;
        }
        return false;
    }

    @Override
    public Boolean moveSouth(String[][] woodMap) {
        int[] currentPosition=getPosition();
        int[] nextPosition={currentPosition[0]+1,currentPosition[1]};
        if(!Objects.equals(woodMap[nextPosition[0]][nextPosition[1]], "#")){
            setPosition(nextPosition);
            return true;
        }
        return false;
    }

    @Override
    public Boolean moveEast(String[][] woodMap) {
        int[] currentPosition=getPosition();
        int[] nextPosition={currentPosition[0],currentPosition[1]+1};
        if(!Objects.equals(woodMap[nextPosition[0]][nextPosition[1]], "#")){
            setPosition(nextPosition);
            return true;
        }
        return false;
    }

    @Override
    public Boolean moveWest(String[][] woodMap) {
        int[] currentPosition=getPosition();
        int[] nextPosition={currentPosition[0],currentPosition[1]-1};
        if(!Objects.equals(woodMap[nextPosition[0]][nextPosition[1]], "#")){
            setPosition(nextPosition);
            return true;
        }
        return false;
    }


}
