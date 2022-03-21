package pro.sky.java.course2;

public class Car extends Transport {

    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
    }
}
