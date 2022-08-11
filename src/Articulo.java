public class Articulo {

    //ATRIBUTOS
    private String descripcion;
    private double precioVenta;
    private int stock;

        //CONSTRUCTOR: El constructor es un método que no tiene tipo de dato, se llama igual que la clase. Recibe como
        //parámetros los valores que se desea asignar inicialmente a los atributos, es decir, los valores iniciales.
        //Se puede usar para inicializar los atributos.
        public Articulo(String descripcion, int cantidad, double precio){
            this.descripcion=descripcion; //Para diferenciar el atributo del parametro utilizamos "this" ya que tienen el mismo nombre.
            // This hace referencia al objeto u instancia con el que se estát rabajando.
            precioVenta=precio;
            stock=cantidad;
        }

        //METODOS
        public boolean hayStock(){
            return stock > 0;
        }
        public double consultarPrecio(){
            return precioVenta;
        }

        //GETTERS: Los métodos get permiten acceder al valor de un atributo para una consulta o para usar ese valor en otra operación.
        public String getDescripcion(){
            return descripcion;
        }
        public double getPrecioVenta(){
            return precioVenta;
        }
        public int getStock(){
            return stock;
        }
        //SETTERS: Los métodos set permiten cambiar el valor de un atributo, reciben por parámetro el nuevo valor
        // y lo asignan al atributo correspondiente.
        public void setDescripcion(String descripcion){
            this.descripcion = descripcion;
        }
        public void setPrecioVenta(double precio){
            precioVenta=precio;
        }
        public void setStock(int stock){
            this.stock=stock;
        }

        //PARA EMPEZAR A USAR ESTA CLASE
        public static void main(String[] args) {
            //INSTANCIAS
            Articulo articulo = new Articulo("Auto", 1, 100000);
            if(articulo.hayStock()){
                System.out.println("Hay stock");
            }else{
                System.out.println("No hay stock");
            }
            System.out.println(articulo.consultarPrecio());
            System.out.println(articulo.getDescripcion());
        }
}
