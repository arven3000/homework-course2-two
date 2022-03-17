package pro.sky.java.course2;

public class Car extends Transport implements Engine {

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у машины");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель  у машины");
    }

}
