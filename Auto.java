package lab9;

public class Auto {
    private String firm; //создаем закрытый член нашего класса с названием фирмы автомобиля
    private int maxSpeed; // закрытый член класса, содержащий максимальную скорость
    private String GosNomer;
    public void setFirm(String firma){ //открытая функция (метод класса) для задания
        firm=firma; //значения фирмы автомобиля
    }
    public void setMaxSpeed(int speed){ //открытая функция (метод класса) для задания
        maxSpeed=speed; //значения максимальной скорости автомобиля
    }
    public void setGosNomer(String gosNomer){
        GosNomer=gosNomer;
    }
    public int getMaxSpeed(){ //открытая функция (метод класса) для вывода значения
        return maxSpeed; //максимальной скорости
    }
    public String getFirm(){ //открытая функция (метод класса) для вывода значения
        return firm; //заданной фирмы
    }
    public String getGosNomer(){
        return GosNomer;
    }
    public Auto(){ // конструктор класса (без параметров)
        firm="Без названия";
        maxSpeed=0;
        GosNomer="Без номера";
    }
    public Auto(String firma, int speed, String gosNomer){ //конструктор класса (с параметрами)
        firm=firma;
        maxSpeed=speed;
        GosNomer=gosNomer;
    }
}
