public class Gerente extends Empleado  {
    protected String departamento;

    public Gerente(String nombre, int salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostarDetalles(){
        super.mostarDetalles();
        System.out.println("Departamento: "+ departamento);
    }
}
