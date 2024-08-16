/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrera;

/**
 *
 * @author hernan
 */
class Carrera {
    private static final Object testigo = new Object();
    private static long startTime;
    private static int turno = 1;

    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Atleta 1", 1);
        Atleta atleta2 = new Atleta("Atleta 2", 2);
        Atleta atleta3 = new Atleta("Atleta 3", 3);
        Atleta atleta4 = new Atleta("Atleta 4", 4);

        startTime = System.currentTimeMillis();
        
        atleta1.start();
        atleta2.start();
        atleta3.start();
        atleta4.start();
        
        synchronized (testigo) {
            testigo.notify(); 
        }
    }

    static class Atleta extends Thread {
        private String nombre;
        private int numeroAtleta;

        public Atleta(String nombre, int numeroAtleta) {
            this.nombre = nombre;
            this.numeroAtleta = numeroAtleta;
        }

        @Override
        public void run() {
            synchronized (testigo) {
                try {
                    while (numeroAtleta != turno) {
                        testigo.wait(); 
                    }

                    long tiempoCarrera = (long) (90 + Math.random() * 20);
                    System.out.println(nombre + " está corriendo...");
                    Thread.sleep(tiempoCarrera);

                    long tiempoTranscurrido = System.currentTimeMillis() - startTime;
                    System.out.println(nombre + " ha terminado la carrera en " + tiempoTranscurrido / 1000.0 + " segundos.");

                    turno++; 
                    testigo.notifyAll(); 

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

