class Cajas {
    public static void main(String[] args) {
     final int JORNADA = 12*60; //en minutos
     final int MAX_ARTICULOS=15;
     final int MIN_ARTICULOS=5;
     final double probCliente=0.6;
     boolean llegaCliente=false;
     int articulosVendidos=0;
     int numeroArticulos1=0;
     int numeroArticulos2=0;
     int numeroArticulos3=0;
     int numeroArticulos4=0;
     int cola=0;
     int minutosSinCola=0;
     int clientesAtendidos=0;
     for (int i=JORNADA-1; i>0; i--) { //menos 1 minuto porque la gente no llega a caja en el minuto 0
        llegaCliente=false;
        if(Math.random()<probCliente) {
            cola++;
            llegaCliente=true;
        }
        if(cola>0 && numeroArticulos1<=0){
            cola--;
            numeroArticulos1=(int)(Math.random()*(MAX_ARTICULOS-MIN_ARTICULOS+1)+MIN_ARTICULOS); //+1 porque no puede haber 0 artículos
            clientesAtendidos++;
        }
        if(cola>0 && numeroArticulos2<=0){
            cola--;
            numeroArticulos2=(int)(Math.random()*(MAX_ARTICULOS-MIN_ARTICULOS+1)+MIN_ARTICULOS);
            clientesAtendidos++;
        }
        if(cola>0 && numeroArticulos3<=0){
            cola--;
            numeroArticulos3=(int)(Math.random()*(MAX_ARTICULOS-MIN_ARTICULOS+1)+MIN_ARTICULOS);
            clientesAtendidos++;
        }
        if(cola>0 && numeroArticulos4<=0){
            cola--;
            numeroArticulos4=(int)(Math.random()*(MAX_ARTICULOS-MIN_ARTICULOS+1)+MIN_ARTICULOS);
            clientesAtendidos++;
        }
        if(numeroArticulos1>0) {
            numeroArticulos1--;
            articulosVendidos++;
        }
        if(numeroArticulos2>0) {
            numeroArticulos2--;
            articulosVendidos++;
        }
        if(numeroArticulos3>0) {
            numeroArticulos3--;
            articulosVendidos++;
        }
        if(numeroArticulos4>0) {
            numeroArticulos4--;
            articulosVendidos++;
        }
        if(cola<=0) {
            minutosSinCola++;
        }
        System.out.println(llegaCliente ? "Ha llegado un cliente" : "No ha llegado ningún cliente");
        System.out.println("Número de clientes en cola: " + cola);
        System.out.println("Número de artículos en caja 1: " + numeroArticulos1);
        System.out.println("Número de artículos en caja 2: " + numeroArticulos2);
        System.out.println("Número de artículos en caja 3: " + numeroArticulos3);
        System.out.println("Número de artículos en caja 4: " + numeroArticulos4);
     }   
     System.out.println("Número de clientes atendidos: " + clientesAtendidos);
     System.out.println("Número de artículos vendidos: " + articulosVendidos);
     System.out.println("Número de clientes en cola al final del día: " + cola);
     System.out.println("Minutos sin cola: " + minutosSinCola);
    }
}