/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filavirtual;

/**
 *
 * @author hernan
 */
class Concert {
    private int ticketsAvailable = 10;  

    public synchronized boolean sellTicket(String buyer) {
        if (ticketsAvailable > 0) {
            System.out.println(buyer + " compró una entrada. Entradas restantes: " + (ticketsAvailable - 1));
            ticketsAvailable--;
            return true;
        } else {
            System.out.println(buyer + " intentó comprar una entrada, pero ya no hay disponibles.");
            return false;
        }
    }
}

class TicketSeller implements Runnable {
    private Concert concert;
    private String buyerName;

    public TicketSeller(Concert concert, String buyerName) {
        this.concert = concert;
        this.buyerName = buyerName;
    }

    @Override
    public void run() {
        while (true) {
            if (!concert.sellTicket(buyerName)) {
                break;  
            }
            try {
                Thread.sleep(100);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ConcertBooking {
    public static void main(String[] args) {
        Concert concert = new Concert();

        Thread buyer1 = new Thread(new TicketSeller(concert, "Comprador 1"));
        Thread buyer2 = new Thread(new TicketSeller(concert, "Comprador 2"));
        Thread buyer3 = new Thread(new TicketSeller(concert, "Comprador 3"));
        Thread buyer4 = new Thread(new TicketSeller(concert, "Comprador 4"));
        Thread buyer5 = new Thread(new TicketSeller(concert, "Comprador 5"));
        Thread buyer6 = new Thread(new TicketSeller(concert, "Comprador 6"));
        Thread buyer7 = new Thread(new TicketSeller(concert, "Comprador 7"));
        Thread buyer8 = new Thread(new TicketSeller(concert, "Comprador 8"));
        Thread buyer9 = new Thread(new TicketSeller(concert, "Comprador 9"));
        Thread buyer10 = new Thread(new TicketSeller(concert, "Comprador 10"));
        Thread buyer11 = new Thread(new TicketSeller(concert, "Comprador 11"));
        Thread buyer12 = new Thread(new TicketSeller(concert, "Comprador 12"));
        Thread buyer13 = new Thread(new TicketSeller(concert, "Comprador 13"));
        Thread buyer14 = new Thread(new TicketSeller(concert, "Comprador 14"));
        Thread buyer15 = new Thread(new TicketSeller(concert, "Comprador 15"));

        // Iniciando los hilos
        buyer1.start();
        buyer2.start();
        buyer3.start();
        buyer4.start();
        buyer5.start();
        buyer6.start();
        buyer7.start();
        buyer8.start();
        buyer9.start();
        buyer10.start();
        buyer11.start();
        buyer12.start();
        buyer13.start();
        buyer14.start();
        buyer15.start();
    }
}
