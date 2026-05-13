public class Main{
    public static void main(String[] args) {
        Vehiculo vh = new Vehiculo("BMW", 80);
        vh.mostrarVehiculo();

        Coche ch = new Coche("Mazda", 100, 4);
        ch.mostrarVehiculo();
        System.out.println();

        Persona p = new Persona("Jobsito", 25);
        p.mostrarPersona();
        Estudiante e = new Estudiante("Jobsito", 25, true);
        e.mostrarPersona();
    }
}