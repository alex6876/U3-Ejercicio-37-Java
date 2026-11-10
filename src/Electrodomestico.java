public class Electrodomestico {

    protected String marca;
    protected double precioBase;
    protected double coeficienteConsumo;
    protected String categoriaEnergetica;

    public Electrodomestico(String marca, double precioBase,
                            double coeficienteConsumo,
                            String categoriaEnergetica) {

        this.marca = marca;
        this.precioBase = precioBase;
        this.coeficienteConsumo = coeficienteConsumo;
        this.categoriaEnergetica = categoriaEnergetica;
    }

    public double calcularGastoElectricoAnual() {

        double consumoAnual = 1000 * coeficienteConsumo;

        return consumoAnual * 150;
    }

    public double obtenerTasaEnergetica() {

        switch (categoriaEnergetica.toUpperCase()) {

            case "A":
                return 0.0;

            case "B":
                return 0.05;

            case "C":
                return 0.10;

            case "D":
                return 0.15;

            default:
                return 0.20;
        }
    }

    public double calcularCostoOperativoAnual() {

        double gastoElectrico = calcularGastoElectricoAnual();

        return gastoElectrico + (gastoElectrico * obtenerTasaEnergetica());
    }

    public void mostrarInformacion() {

        System.out.println("Marca: " + marca);
        System.out.println("Precio base: $" + precioBase);
        System.out.println("Coeficiente de consumo: " + coeficienteConsumo);
        System.out.println("Categoria energetica: " + categoriaEnergetica);
    }
}