package pro.sky.java.course2;

public class Truck extends Transport {

    @Override
    public void service() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку у грузовика");
        }
        System.out.println("Проверяем двигатель у грузовика");
        System.out.println("Проверяем прицеп");
    }
}
