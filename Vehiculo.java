public class Vehiculo{
    protected String marca;
    protected int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima){
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarVehiculo(){
        System.out.println("Vehiculo de Marca: "+marca+", Velocidad Maxima: "+velocidadMaxima+" Km/H");
    }
}