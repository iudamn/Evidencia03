class vendedorSopaipillas {
    private String nombre;
    private int edad;
    private int sopaipasxdia;
    private int preciox1;

    public vendedorSopaipillas(String nombre, int edad, int sopaipasxdia, int preciox1){
        this.nombre = nombre;
        this.edad = edad;
        this.sopaipasxdia = sopaipasxdia;
        this.preciox1 = preciox1;
    }


    public void mostrar() {
        System.out.println("------" + nombre + "------");
        System.out.println("Edad: " + edad);
        System.out.println("Sopaipillas vendidas POR DÍA: " + sopaipasxdia);
        System.out.println("Precio por cada sopaipilla: " + preciox1);
    }

    public int dineroGanado(){
        int resultado= sopaipasxdia*preciox1;
        System.out.println("El dinero ganado fue de: " +resultado);
        return resultado;
    }

    public String toString(){
        return nombre+";"+edad+";"+ sopaipasxdia+";"+preciox1;
    }

}
