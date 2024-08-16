/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrera;

/**
 *
 * @author hernan
 */
public class Atleta implements Runnable {
    private static final Object testigo = new Object();
    private static boolean tieneTestigo = true;
    private final int id;
    
    public Atleta(int id) {
        this.id = id;
    }

    public void run() {
        try {
            synchronized (testigo) {
                while (!tieneTestigo) {
                    testigo.wait(); 
                }

                long startTime = System.currentTimeMillis();
                System.out.println("Atleta " + id + " comienza a correr.");
                
                int tiempo = 9000 + (int) (Math.random() * 2000);
                Thread.sleep(tiempo);
                
                long endTime = System.currentTimeMillis();
                System.out.println("Atleta " + id + " termina de correr en " + (endTime - startTime) + " ms.");
                
                tieneTestigo = false;
                testigo.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void setTestigo(boolean estado) {
        synchronized (testigo) {
            tieneTestigo = estado;
            testigo.notifyAll();
        }
    }
}
