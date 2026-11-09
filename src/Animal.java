public abstract class Animal {

    protected String nombre;
    protected int edad;
    protected String nombreDueño;

    public Animal(String nombre, int edad, String nombreDueño) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueño = nombreDueño;
    }

    public abstract double calcularCostoConsulta();

    public void imprimirFicha() {

        System.out.println("----- FICHA DEL ANIMAL -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dueño: " + nombreDueño);
        System.out.println("Costo consulta: $" + calcularCostoConsulta());
        System.out.println("----------------------------");
    }
}