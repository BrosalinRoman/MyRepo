public class FactoryB implements CarFactory {
    @Override
    public Car createCar(String type) {
        if ("Sedan".equalsIgnoreCase(type)) {
            return new Sedan();
        } else if ("SUV".equalsIgnoreCase(type)) {
            return new SUV();
        }
        throw new IllegalArgumentException("Неизвестный тип автомобиля: " + type);
    }
}
