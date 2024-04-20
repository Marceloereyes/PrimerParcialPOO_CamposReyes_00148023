public abstract class Articulo {
    private String nombre;
    private String modelo;
    private String descripcion;
    private double Precio;

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public Articulo() {
    }

    public Articulo(String nombre, String modelo, String descripcion, double Precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.Precio = Precio;
    }

    public Articulo(Articulo articulo) {
        nombre = articulo.nombre;
        modelo = articulo.modelo;
        descripcion = articulo.descripcion;
        Precio = articulo.Precio;

    }

    public abstract void MostrarDatos();
    public abstract void AgregarArticulo();
    public abstract void modificarArticulo();
    public abstract int obtenerTipoArticulo();
    public abstract double obtenerprecio();
}

