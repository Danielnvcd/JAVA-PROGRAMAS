package javaapplication16;

public class JavaApplication16 {

public static void main(String[] args) {
        // Crear productos
        ProductoFresco productoFresco1 = new ProductoFresco("2023-08-01", "Lote001", "2023-07-01", "España");
        ProductoFresco productoFresco2 = new ProductoFresco("2023-08-15", "Lote002", "2023-07-05", "Italia");
        ProductoRefrigerado productoRefrigerado1 = new ProductoRefrigerado("2023-09-01", "Lote003",
                "12345", "2023-07-02", "4°C", "Francia");
        ProductoRefrigerado productoRefrigerado2 = new ProductoRefrigerado("2023-09-15", "Lote004",
                "54321", "2023-07-06", "6°C", "Alemania");
        ProductoRefrigerado productoRefrigerado3 = new ProductoRefrigerado("2023-09-30", "Lote005",
                "67890", "2023-07-10", "3°C", "Portugal");
        ProductoCongeladoAgua productoCongeladoAgua1 = new ProductoCongeladoAgua("2023-10-01", "Lote006",
                "2023-07-03", "España", "-12°C", 10);
        ProductoCongeladoAgua productoCongeladoAgua2 = new ProductoCongeladoAgua("2023-10-15", "Lote007",
                "2023-07-07", "Italia", "-10°C", 5);
        ProductoCongeladoAire productoCongeladoAire1 = new ProductoCongeladoAire("2023-10-30", "Lote008",
                "2023-07-04", "Francia", "-15°C", 80, 10, 5, 5);
        ProductoCongeladoAire productoCongeladoAire2 = new ProductoCongeladoAire("2023-11-01", "Lote009",
                "2023-07-08", "Alemania", "-18°C", 70, 20, 5, 5);
        ProductoCongeladoNitrogeno productoCongeladoNitrogeno1 = new ProductoCongeladoNitrogeno("2023-11-15",
                "Lote010", "2023-07-09", "Portugal", "-20°C", "Método A", 60);
        // Mostrar información de los productos
        productoFresco1.mostrarInformacion();
        System.out.println();
        productoFresco2.mostrarInformacion();
        System.out.println();
        productoRefrigerado1.mostrarInformacion();
        System.out.println();
        productoRefrigerado2.mostrarInformacion();
        System.out.println();
        productoRefrigerado3.mostrarInformacion();
        System.out.println();
        productoCongeladoAgua1.mostrarInformacion();
        System.out.println();
        productoCongeladoAgua2.mostrarInformacion();
        System.out.println();
        productoCongeladoAire1.mostrarInformacion();
        System.out.println();
        productoCongeladoAire2.mostrarInformacion();
        System.out.println();
        productoCongeladoNitrogeno1.mostrarInformacion();
    }
}
// Clase principal Producto con atributos 
    class Producto {
    private String fechaCaducidad;
    private String numeroLote;
    public Producto(String fechaCaducidad, String numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    public String getNumeroLote() {
        return numeroLote;
    }
    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }
    public void mostrarInformacion() {
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
        System.out.println("Número de lote: " + numeroLote);
    }
}
// Clase ProductoFresco, subclase de Producto
class ProductoFresco extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;
    public ProductoFresco(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }
    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }
    public String getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("País de origen: " + paisOrigen);
    }
}
// Clase ProductoRefrigerado, subclase de Producto
class ProductoRefrigerado extends Producto {
    private String codigoSupervision;
    private String fechaEnvasado;
    private String temperaturaRecomendada;
    private String paisOrigen;
    public ProductoRefrigerado(String fechaCaducidad, String numeroLote, String codigoSupervision,String fechaEnvasado, String temperaturaRecomendada, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.codigoSupervision = codigoSupervision;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaRecomendada = temperaturaRecomendada;
        this.paisOrigen = paisOrigen;
    }
    public String getCodigoSupervision() {
        return codigoSupervision;
    }
    public void setCodigoSupervision(String codigoSupervision) {
        this.codigoSupervision = codigoSupervision;
    }
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }
    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }
    public String getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }
    public void setTemperaturaRecomendada(String temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    public String getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Código de supervisión: " + codigoSupervision);
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("Temperatura recomendada: " + temperaturaRecomendada);
        System.out.println("País de origen: " + paisOrigen);
    }
}
// Clase ProductoCongelado, subclase de Producto
class ProductoCongelado extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;
    private String temperaturaRecomendada;
    public ProductoCongelado(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen,String temperaturaRecomendada) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }
    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }
    public String getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    public String getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }
    public void setTemperaturaRecomendada(String temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("País de origen: " + paisOrigen);
        System.out.println("Temperatura recomendada: " + temperaturaRecomendada);
    }
}
// Clase ProductoCongeladoAire, subclase de ProductoCongelado
class ProductoCongeladoAire extends ProductoCongelado {
    private int porcentajeNitrogeno;
    private int porcentajeOxigeno;
    private int porcentajeDioxidoCarbono;
    private int porcentajeVaporAgua;
    public ProductoCongeladoAire(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen,String temperaturaRecomendada, int porcentajeNitrogeno, int porcentajeOxigeno,int porcentajeDioxidoCarbono, int porcentajeVaporAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }
    public int getPorcentajeNitrogeno() {
        return porcentajeNitrogeno;
    }
    public void setPorcentajeNitrogeno(int porcentajeNitrogeno) {
        this.porcentajeNitrogeno = porcentajeNitrogeno;
    }
    public int getPorcentajeOxigeno() {
        return porcentajeOxigeno;
    }
    public void setPorcentajeOxigeno(int porcentajeOxigeno) {
        this.porcentajeOxigeno = porcentajeOxigeno;
    }
    public int getPorcentajeDioxidoCarbono() {
        return porcentajeDioxidoCarbono;
    }
    public void setPorcentajeDioxidoCarbono(int porcentajeDioxidoCarbono) {
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
    }
    public int getPorcentajeVaporAgua() {
        return porcentajeVaporAgua;
    }
    public void setPorcentajeVaporAgua(int porcentajeVaporAgua) {
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Porcentaje de nitrógeno: " + porcentajeNitrogeno);
        System.out.println("Porcentaje de oxígeno: " + porcentajeOxigeno);
        System.out.println("Porcentaje de dióxido de carbono: " + porcentajeDioxidoCarbono);
        System.out.println("Porcentaje de vapor de agua: " + porcentajeVaporAgua);
    }
}
// Clase ProductoCongeladoAgua, subclase de ProductoCongelado
class ProductoCongeladoAgua extends ProductoCongelado {
    private int salinidadAgua;
    public ProductoCongeladoAgua(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen,String temperaturaRecomendada, int salinidadAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.salinidadAgua = salinidadAgua;
    }
    public int getSalinidadAgua() {
        return salinidadAgua;
    }
    public void setSalinidadAgua(int salinidadAgua) {
        this.salinidadAgua = salinidadAgua;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Salinidad del agua: " + salinidadAgua);
    }
}
// Clase ProductoCongeladoNitrógeno, subclase de ProductoCongelado
class ProductoCongeladoNitrogeno extends ProductoCongelado {
    private String metodoCongelacion;
    private int tiempoExposicionNitrogeno;

    public ProductoCongeladoNitrogeno(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen,String temperaturaRecomendada, String metodoCongelacion, int tiempoExposicionNitrogeno) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
    }
    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }
    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }
    public int getTiempoExposicionNitrogeno() {
        return tiempoExposicionNitrogeno;
    }

    public void setTiempoExposicionNitrogeno(int tiempoExposicionNitrogeno) {
        this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Método de congelación: " + metodoCongelacion);
        System.out.println("Tiempo de exposición al nitrógeno: " + tiempoExposicionNitrogeno + " segundos");
    }
}
