package it.woodchuck.structure;

/**
 * Created by Catramos on 11/02/2016.
 */
public class Coordinates {

    int x,y;


    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinates(String[] strings){
        this.x = Integer.parseInt(strings[0]);
        this.y = Integer.parseInt(strings[1]);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
