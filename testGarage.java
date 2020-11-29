package lab9;
import java.util.*;

public class testGarage {
    public static void main(String[] args) {
        GarageCar myGarage=new GarageCar(); //создаем новый гараж
        Car myCar1=new Car("Ford", 200,"qwe123","Mustang",2,false); //создаем легковую машину
        myGarage.addCar(myCar1); // добавляем ее в гараж

        Car myCar2=new Car("q",1,"w2","e",3,true);
        myGarage.addCar(myCar2);
        myGarage.removeCar(myCar2);

        myGarage.addCar(new Car("LADA", 140,"rty345", "Kalina", 4, false));//добавляем еще одну машину
        Truck myTruck=new Truck("Dove",160,"ghj678","DTS",700,true);//создаем грузовик
        myGarage.addCar(myTruck); //добавляем его в гараж
        myGarage.printGarage(); //выводи на экран содержимое гаража
        if (myGarage.findCar(myCar1)) { //ищем машину
            System.out.println("Да");
        }
        else {
            System.out.println("Нет");
        }

    }
}
