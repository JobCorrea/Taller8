public class Coche extends Vehiculo{
    protected int numeroDePuertas;
    
    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }
    @Override
    public void mostrarVehiculo(){
        super.mostrarVehiculo();
        System.out.println("Numero De Puertas: "+numeroDePuertas);
    }
    
}
