public abstract class Telefono extends Articulo {
        private String sistemaoperativo;
        private String color;
        
        public String getColor() {
            return color;
        }
        
        public void setColor(String color) {
            this.color = color;
        }
        
        public String getSistemaoperativo() {
            return sistemaoperativo;
        }
        
        public void setSistemaoperativo(String sistemaoperativo) {
            this.sistemaoperativo = sistemaoperativo;
        }
        
        public Telefono(String sistemaoperativo) {
            this.sistemaoperativo = sistemaoperativo;
        }
        
        public Telefono(Articulo articulo, String sistemaoperativo, String color) {
            super(articulo);
            this.sistemaoperativo = sistemaoperativo;
        }

        @Override 
        public double obtenerprecio(){
            return getPrecio();
        }
        @Override
        public void MostrarDatos() {
            System.out.println("\n\t----- Telefono -----");
            System.out.println("Nombre: "+ getnombre()+"Modelo: "+getModelo()+"Sistema operativo: "+getSistemaoperativo()+"Color: "+ getColor()+"Descripcion: "+getDescripcion()+"Precio Normal: "+obtenerprecio()+ "Precio Neto: "+obtenerprecio());
        }
        
}
