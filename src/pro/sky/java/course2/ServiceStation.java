package pro.sky.java.course2;

public class ServiceStation {

    public void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        transport.service();
    }

    public void check(Transport[] transports) {

        if (transports != null) {
            for (int i = 0; i < transports.length; i++) {
                System.out.println("Обслуживаем " + transports[i].getModelName());
                transports[i].service();
            }
        }
    }
}
