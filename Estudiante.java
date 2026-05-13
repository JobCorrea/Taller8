public class Estudiante extends Persona {
    protected boolean  matricula;

    public Estudiante(String nombre, int edad, boolean  matricula){
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void mostrarPersona(){
        super.mostrarPersona();
        System.out.println("Matriculado: " + (matricula ? "si" : "no"));    }
}
