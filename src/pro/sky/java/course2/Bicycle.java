package pro.sky.java.course2;

public class Bicycle extends Transport {
    @Override
    public void service() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку у велосипеда");
        }
    }
}
