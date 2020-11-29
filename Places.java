package lab9;
import java.util.*;

public class Places {
    private String name;
    private String address;
    private int square;

    public void setName (String nazvan) {
        name=nazvan;
    }
    public void setAddress (String adres) {
        address=adres;
    }
    public void setSquare (int plo) {
        square=plo;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getSquare(){
        return square;
    }

    public Places() {
        name="Без названия";
        address="Без адреса";
        square=0;
    }
    public Places(String nazvan, String adres, int plo){
        name=nazvan;
        address=adres;
        square=plo;
    }
}
