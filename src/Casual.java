public class Casual extends Zapato {
    boolean tieneHebilla;

    public Casual(String marca, String modelo, double talla, double precio, boolean tieneHebilla){
        super(marca, modelo, talla, precio);
        this.tieneHebilla = tieneHebilla;
    }

    public boolean getTieneHebilla(){
        return this.tieneHebilla;
    }
    public void setTieneHebilla(boolean tieneHebilla){
        this.tieneHebilla = tieneHebilla;
    }
}