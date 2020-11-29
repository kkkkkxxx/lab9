package lab9;
import java.util.*;

public class Apartment extends Places {
    private String type;
    private int floor;
    private int numRooms;

    public Apartment(){
        super();
        type="";
        floor=1;
        numRooms=1;
    }
    public Apartment(String nazvan, String adres, int plo, String tip, int fl, int rooms){
        super(nazvan, adres, plo);
        type=tip;
        floor=fl;
        numRooms=rooms;
    }

    public void setType(String tip){
        type=tip;
    }
    public void setFloor(int fl){
        floor=fl;
    }
    public void setNumRooms(int rooms){
        numRooms=rooms;
    }
    public String getType(){
        return type;
    }
    public int getFloor(){
        return floor;
    }
    public int getNumRooms(){
        return numRooms;
    }
    public String toString(){
        return getName()+" "+getAddress()+" "+getSquare()+" "+type+" "+floor+" "+numRooms;
    }
}
