public class Empleado {
    protected String nombre;
    protected int salario;

    public Empleado(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
    }


    public  void mostarDetalles(){
        System.out.println("Nombre: "+nombre+", Salario: "+ salario);
    }
}
