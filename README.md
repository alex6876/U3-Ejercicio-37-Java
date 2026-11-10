Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Eficiencia Energética y Costos Operativos de Electrodomésticos (Herencia, Sobrescritura y Polimorfismo en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# ⚡ Simulación de Eficiencia Energética de Electrodomésticos (Herencia y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema de análisis energético para línea blanca, implementando una jerarquía de clases mediante herencia para administrar distintos tipos de electrodomésticos (lavarropas y heladeras) con reglas de cálculo avanzadas para el gasto eléctrico anual, tasas por categoría de eficiencia energética y costos operativos especializados. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **generalización de atributos protegidos (`protected`)**, la utilización de constructores mediante `super`, la sobrescritura polimórfica de métodos (`@Override`), la evaluación de tarifas según condiciones lógicas (`switch`) y el procesamiento masivo mediante arreglos polimórficos en memoria.

---

## 🧩 Clases y Estructura del Sistema

Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Eficiencia Energética y Costos Operativos de Electrodomésticos (Herencia, Sobrescritura y Polimorfismo en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# ⚡ Simulación de Eficiencia Energética y Costos en Electrodomésticos (Herencia y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema de análisis energético para el hogar, implementando una jerarquía de clases mediante herencia para administrar distintos tipos de aparatos (lavarropas y heladeras) con reglas especializadas de cálculo de gasto eléctrico, tasas energéticas según categoría y costos operativos anuales. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **generalización de atributos protegidos (`protected`)**, la utilización de constructores mediante `super`, la sobrescritura polimórfica de métodos (`@Override`), la evaluación mediante estructuras condicionales y el procesamiento masivo de arreglos polimórficos en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base general, sus respectivas subclases especializadas y un punto de ejecución:

* **`Electrodomestico`**: Clase base que centraliza los atributos y comportamientos comunes de cualquier artefacto eléctrico.
* **Atributos protegidos (`protected`)**: `marca`, `precioBase`, `coeficienteConsumo` y `categoriaEnergetica`, permitiendo que las clases hijas accedan directamente a las especificaciones técnicas del equipo.
* **Constructor**: Inicializa los datos comunes de fabricación y consumo.
* **Métodos operativos**:
* `calcularGastoElectricoAnual()`: Calcula el consumo monetario anual base a partir del coeficiente y una tarifa estándar.
* `obtenerTasaEnergetica()`: Utiliza una estructura `switch` para determinar el recargo impositivo o tasa ecológica según la letra de eficiencia (`A` a `D` o superiores).
* `calcularCostoOperativoAnual()`: Integra el gasto eléctrico bruto con la tasa energética correspondiente.
* `mostrarInformacion()`: Imprime de forma estructurada la marca, el precio base, el coeficiente y la categoría energética.




* **`Lavarropa`**: Extiende de `Electrodomestico` para modelar máquinas de lavado automático.
* **Atributos privados (`private`)**: `capacidadKg` y `programasLavado`.
* **Constructor**: Invoca a `super(...)` para configurar los datos base y asigna la capacidad y variedad de programas.
* **Sobrescritura (`@Override`)**:
* `calcularCostoOperativoAnual()`: Reutiliza el cálculo base mediante `super.calcularCostoOperativoAnual()` y le añade un incremento operativo del 5% debido al uso de agua y calentamiento.
* `mostrarInformacion()`: Extiende la visualización base (`super.mostrarInformacion()`) añadiendo la capacidad en kilogramos y los programas de lavado.




* **`Heladera`**: Extiende de `Electrodomestico` para modelar equipos de refrigeración continua.
* **Atributos privados (`private`)**: `capacidadFreezer` y `tecnologiaNoFrost`.
* **Constructor**: Utiliza `super(...)` para inicializar los atributos heredados y configura el volumen del freezer y la tecnología del sistema.
* **Sobrescritura (`@Override`)**:
* `calcularCostoOperativoAnual()`: Integra el costo operativo base con un recargo del 8% asociado a la operación permanente de los compresores de frío.
* `mostrarInformacion()`: Reutiliza la lógica de la superclase e incorpora la capacidad del freezer en litros y el estado de la tecnología No Frost.




* **`Main`**: Punto de entrada del programa. Instancia un lavarropas Samsung y una heladera LG con parámetros técnicos específicos, los agrupa en un arreglo polimórfico de tipo `Electrodomestico[]`, y recorre la colección generando un reporte detallado que evalúa dinámicamente el gasto eléctrico y el costo operativo anual de cada equipo.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Clasificación Energética Dinámica:** El método `obtenerTasaEnergetica()` penaliza o beneficia económicamente a los aparatos según su categoría (desde un 0% de recargo para la clase `A` hasta un 20% para categorías rezagadas).
2. **Cálculo Polimórfico de Costos Operativos:** Cada subclase adapta el costo operativo general sumando un recargo porcentual específico según su naturaleza de consumo mecánico o térmico.
3. **Reutilización Estructural con `super`:** Las clases hijas delegan la presentación de la información base y el cómputo financiero elemental a la superclase, manteniendo un diseño limpio, modular y libre de duplicaciones.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
===== REPORTE DE ELECTRODOMESTICOS =====

------------------------------
Marca: Samsung
Precio base: $850000.0
Coeficiente de consumo: 0.8
Categoria energetica: A
Capacidad: 9.0 kg
Programas de lavado: 12
Gasto electrico anual: $120000.0
Costo operativo anual: $120000.0

------------------------------
Marca: LG
Precio base: $1200000.0
Coeficiente de consumo: 1.2
Categoria energetica: B
Capacidad del freezer: 80.0 litros
Tecnologia No Frost: true
Gasto electrico anual: $180000.0
Costo operativo anual: $194400.0

```

---

## 🚀 Conceptos de Programación Aplicados

* **Jerarquía de Eficiencia Energética:** Modelado de sistemas de consumo eléctrico mediante una estructura limpia de herencia orientada a objetos.
* **Sobrescritura y Ligadura Dinámica:** Implementación de algoritmos de costos especializados que extienden el comportamiento genérico de la superclase a través de `@Override`.
* **Diseño Modular:** Clara separación entre las reglas de cálculo energético y la ejecución de casos de prueba simulados en el cliente (`Main`).
