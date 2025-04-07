public class Main {
    public static void main(String[] args) {
        // Выбор завода A
        CarFactory factoryA = new FactoryA();
        Car sedanA = factoryA.createCar("Sedan");
        sedanA.assemble();

        // Выбор завода B
        CarFactory factoryB = new FactoryB();
        Car suvB = factoryB.createCar("SUV");
        suvB.assemble();
    }
}