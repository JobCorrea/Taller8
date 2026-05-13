public class Main{
    public static void main(String[] args) {
        Vehiculo vh = new Vehiculo("BMW", 80);
        vh.mostrarVehiculo();

        Coche ch = new Coche("Mazda", 100, 4);
        ch.mostrarVehiculo();
        System.out.println();
    }
}