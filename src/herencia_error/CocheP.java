package herencia_error;

public class CocheP extends VehiculoP {
    public Coche(String marca) {
        super(marca);
    }

    public void mostrarMarca() {
        System.out.println(marca); // ERROR: marca tiene acceso privado
    }
}
