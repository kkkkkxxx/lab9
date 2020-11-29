package lab9;
import java.util.*;

public class Office extends Places{
    private String firm;
    private int floor;

    public Office(){
        super();
        firm="";
        floor=1;
    }
    public Office(String nazvan, String adres, int plo, String firma, int fl){
        super(nazvan, adres, plo);
        firm=firma;
        floor=fl;
    }
    public void setFirm(String firma){
        firm=firma;
    }
    public void setFloor(int fl){
        floor=fl;
    }
    public String getFirm(){
        return firm;
    }
    public int getFloor(){
        return floor;
    }

    public void setAllInfo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название помещения: ");
        String nazv=in.next();
        setName(nazv);
        System.out.println("Введите адрес помещения: ");
        String adr=in.next();
        setAddress(adr);
        System.out.println("Введите площадь помещения: ");
        int plos=in.nextInt();
        setSquare(plos);
        System.out.println("Введите название фирмы: ");
        firm=in.next();
        System.out.println("Введите этаж: ");
        floor=in.nextInt();
        System.out.println();
    }

    public String toString(){
        return getName()+" "+getAddress()+" "+getSquare()+" "+firm+" "+floor;
    }
}
