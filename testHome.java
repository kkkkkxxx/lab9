package lab9;
import java.util.*;

public class testHome {
    public static void main(String[] args) {
        Home myHome=new Home();
        Apartment myApartment1=new Apartment("КВ1", "Ленина 1", 123, "студия", 3, 2);
        myHome.addApartment(myApartment1);

        Apartment myApartment2=new Apartment("q","w",1,"e",2,2);
        myHome.addApartment(myApartment2);
        myHome.removeApartment(myApartment2);

        myHome.addApartment(new Apartment("a","s",1,"d",2,3));
        Office myOffice=new Office("z","x",123,"f",5);
        myHome.addApartment(myOffice);
        myHome.printHome();
        if (myHome.findApartment(myApartment1)){
            System.out.println("да");
        }
        else {
            System.out.println("нет");
        }
        myHome.kolPLaces();
    }
}
