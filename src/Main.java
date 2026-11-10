public class Main {

    public static void main(String[] args) {

        Lavarropa lavarropa = new Lavarropa(
                "Samsung", 850000,
                0.8, "A",
                9, 12
        );

        Heladera heladera = new Heladera(
                "LG", 1200000,
                1.2, "B",
                80, true
        );

        Electrodomestico[] electrodomesticos = {
                lavarropa,
                heladera
        };

        System.out.println("===== REPORTE DE ELECTRODOMESTICOS =====");

        for (Electrodomestico electrodomestico : electrodomesticos) {

            System.out.println("\n------------------------------");

            electrodomestico.mostrarInformacion();

            System.out.println("Gasto electrico anual: $"
                    + electrodomestico.calcularGastoElectricoAnual());

            System.out.println("Costo operativo anual: $"
                    + electrodomestico.calcularCostoOperativoAnual());
        }
    }
}