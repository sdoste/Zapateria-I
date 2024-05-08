public class ZapatoElegante {
    private String marca, modelo;
    private double talla, precio;

    public ZapatoElegante(String marca, String modelo, double talla, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.talla = talla;
        this.precio = precio;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getTalla() {
        return talla;
    }
    public void setTalla(double talla) {
        this.talla = talla;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}