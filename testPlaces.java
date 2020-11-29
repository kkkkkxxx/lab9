package lab9;
import java.util.*;

public class testPlaces {
    public static void main(String[] args) {
        Places myPlace1=new Places();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите название помещения: ");
        String nazv=in.next();
        myPlace1.setName(nazv);

        System.out.println("Введите адрес помещения: ");
        String adr=in.next();
        myPlace1.setAddress(adr);

        System.out.println("Введите площадь помещения: ");
        int plos=in.nextInt();
        myPlace1.setSquare(plos);

        System.out.println("Помещение: "+myPlace1.getName()+" "+myPlace1.getAddress()+" "+myPlace1.getSquare());
        System.out.println();

        Apartment myApartment1=new Apartment("КВ1", "Ленина 1", 123, "студия", 3, 2);
        Apartment myApartment2=new Apartment();
        System.out.println("Введите название помещения: ");
        nazv=in.next();
        myApartment2.setName(nazv);
        System.out.println("Введите адрес помещения: ");
        adr=in.next();
        myApartment2.setAddress(adr);
        System.out.println("Введите площадь помещения: ");
        plos=in.nextInt();
        myApartment2.setSquare(plos);
        System.out.println("Введите тип квартиры: ");
        String t=in.next();
        myApartment2.setType(t);
        System.out.println("Введите количество этажей: ");
        int f=in.nextInt();
        myApartment2.setFloor(f);
        System.out.println("Введите количество комнат: ");
        int r=in.nextInt();
        myApartment2.setNumRooms(r);

        System.out.println();
        System.out.println("Первая квартира: "+myApartment1.toString());
        System.out.println("Вторая квартира: "+myApartment2.toString());

        Office myOffice=new Office();
        myOffice.setAllInfo();
        System.out.println(myOffice.toString());
    }
}
