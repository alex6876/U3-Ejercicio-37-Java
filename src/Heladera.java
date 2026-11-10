public class Heladera extends Electrodomestico {

    private double capacidadFreezer;
    private boolean tecnologiaNoFrost;

    public Heladera(String marca, double precioBase,
                    double coeficienteConsumo,
                    String categoriaEnergetica,
                    double capacidadFreezer,
                    boolean tecnologiaNoFrost) {

        super(marca, precioBase, coeficienteConsumo, categoriaEnergetica);

        this.capacidadFreezer = capacidadFreezer;
        this.tecnologiaNoFrost = tecnologiaNoFrost;
    }

    @Override
    public double calcularCostoOperativoAnual() {

        double costoBase = super.calcularCostoOperativoAnual();

        return costoBase + (costoBase * 0.08);
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Capacidad del freezer: "
                + capacidadFreezer + " litros");

        System.out.println("Tecnologia No Frost: " + tecnologiaNoFrost);
    }
}