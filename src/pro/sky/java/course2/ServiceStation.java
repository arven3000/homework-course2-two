package pro.sky.java.course2;

public class ServiceStation {

    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }

    public void check(Transport[] transports) {

        if (transports != null) {
            for (int i = 0; i < transports.length; i++) {
                System.out.println("Обслуживаем " + transports[i].getModelName());
                for (int j = 0; j < transports[i].getWheelsCount(); j++) {
                    transports[i].updateTyre();
                }
                if (transports[i].getWheelsCount() == 4) {
                    ((Car) transports[i]).checkEngine();
                }

                if (transports[i].getWheelsCount() > 4) {
                    ((Truck) transports[i]).checkEngine();
                    ((Truck) transports[i]).checkTrailer();
                }
            }
        }

    }
}
