package pro.sky.java.course2;

public class Bicycle extends Transport {

    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }

    @Override
    public void service() {
        updateTyre();
    }
}
