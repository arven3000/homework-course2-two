package pro.sky.java.course2;

public class Truck extends Transport implements Engine{

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовика");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
