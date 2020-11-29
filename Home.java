package lab9;
import java.util.*;

public class Home {
    private ArrayList<Places> masApartment=new ArrayList<Places>();

    public void addApartment(Places m){
        masApartment.add(m);
    }
    public void removeApartment(Places m){
        masApartment.remove(m);
    }
    public Home(){

    }
    public Boolean findApartment(Places m){
        return masApartment.contains(m);
    }
    public Home(ArrayList<Places> n){
        masApartment=n;
    }
    public void printHome(){
        System.out.println("В доме: ");
        for (Places a:masApartment){
            System.out.println("\t"+a.toString());
        }
    }
    public void kolPLaces(){
        int i=0;
        int j=0;
        for (Places a:masApartment){
            if (a instanceof Apartment) {
                i++;
            }
            if (a instanceof Office) {
                j++;
            }
        }
        System.out.println(i+" квартир, "+j+" офисов");
    }
}
