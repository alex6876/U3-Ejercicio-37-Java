public class Lavarropa extends Electrodomestico {

    private double capacidadKg;
    private int programasLavado;

    public Lavarropa(String marca, double precioBase,
                     double coeficienteConsumo,
                     String categoriaEnergetica,
                     double capacidadKg, int programasLavado) {

        super(marca, precioBase, coeficienteConsumo, categoriaEnergetica);

        this.capacidadKg = capacidadKg;
        this.programasLavado = programasLavado;
    }

    @Override
    public double calcularCostoOperativoAnual() {

        double costoBase = super.calcularCostoOperativoAnual();

        return costoBase + (costoBase * 0.05);
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Capacidad: " + capacidadKg + " kg");
        System.out.println("Programas de lavado: " + programasLavado);
    }
}