public class Main {

    public static void main(String[] args) {

        Perro perro = new Perro("Rocky", 5, "Carlos", "Pastor Aleman");

        Gato gato = new Gato("Luna", 3, "Maria", true);

        Ave ave = new Ave("Piolin", 2, "Pedro", 150);

        System.out.println("===== FICHAS DE ANIMALES =====");

        Animal[] animales = {perro, gato, ave};

        for (Animal animal : animales) {

            animal.imprimirFicha();
        }

        System.out.println("\n===== VACUNACION =====");

        perro.registrarVacuna("Rabia");
        perro.registrarVacuna("Parvovirus");

        gato.registrarVacuna("Triple Felina");

        System.out.println("Vacunas de Rocky: " + perro.getVacunasAplicadas());

        System.out.println("Vacunas de Luna: " + gato.getVacunasAplicadas());

        System.out.println("===== SEGUROS =====");

        Clinica clinica = new Clinica("VetCare", "Bogota");

        Asegurable[] asegurables = {perro, gato, clinica};

        for (Asegurable asegurable : asegurables) {

            System.out.println("Poliza: " + asegurable.obtenerNumeroPoliza());

            System.out.println("Prima anual: $" + asegurable.calcularPrimaSeguro());

            System.out.println("-------------------------");
        }

        System.out.println("\n===== AGREGANDO CONEJO =====");

        Conejo conejo = new Conejo("Nube", 2, "Andres");

        Animal[] animalesActualizados = {perro, gato, ave, conejo};

        for (Animal animal : animalesActualizados) {

            animal.imprimirFicha();
        }
    }
}