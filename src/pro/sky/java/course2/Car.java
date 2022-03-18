package pro.sky.java.course2;

public class Car extends Transport {

    @Override
    public void service() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку у машины");
        }
        System.out.println("Проверяем двигатель у машины");
    }
}
