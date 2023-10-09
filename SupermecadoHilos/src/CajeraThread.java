public class CajeraThread {
    private String nombre;
    private Cliente cliente;
    private long initialTime;

    public CajeraThread(){}

    public CajeraThread(String nombre, Cliente cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    public void run(){
        System.out.println("La cajera " + this.nombre +
                " comienza a procesar la compra del cliente " +
                this.cliente.getNombre() + " en el tiempo " +
                (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");

        for(int i = 0; i< this.cliente.getCarroCompra().length; i++){
            //Se procesa el pedido en X segundos
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesando el producto " + (i + 1) + " del cliente " +
                    this.cliente.getNombre() + " -> Tiempo: " +
                    (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
        }

        System.out.println("La cajera " + this.nombre + " ha terminado de procesar "
                + this.cliente.getNombre() + " en el tiempo: " +
                (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
    }

    private void esperarXsegundos(int segundos) {
        try{
            Thread.sleep(segundos * 1000);
        }catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
