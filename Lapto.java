public abstract class Lapto extends Articulo implements PrecioLaptop {
    private int ram;
    private String tarjetagrafica;
    private double preciolap;

    public double getPreciolap() {
        return preciolap;
    }

    public void setPreciolap(double preciolap) {
        this.preciolap = preciolap;
    }
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getTarjetagrafica() {
        return tarjetagrafica;
    }

    public void setTarjetagrafica(String tarjetagrafica) {
        this.tarjetagrafica = tarjetagrafica;
    }

    public Lapto(Articulo articulo, int ram, String tarjetagrafica, double preciolap) {
        super(articulo);
        this.ram = ram;
        this.tarjetagrafica = tarjetagrafica;
        this.preciolap=preciolap;
    }


    @Override
    public double obtenerprecio() {
        return calcularprecio(preciolap);
    }
    @Override
    public double calcularprecio(double impuestos) {
        return impuestos * getPrecio();
    }
  
    @Override
    public void MostrarDatos() {
        System.out.println("\n\t----- Telefono -----");
        System.out.println("Nombre: "+ getnombre()+"Modelo: "+getModelo()+"Ram: "+getRam()+"Tarjeta grafica: "+ getTarjetagrafica()+"Descripcion: "+getDescripcion()+"Precio Normal: "+obtenerprecio()+ "Precio Neto: "+calcularprecio(preciolap));
    }
}
