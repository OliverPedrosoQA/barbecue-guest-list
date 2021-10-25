package modelo;

import javax.swing.JOptionPane;

public class Guest { //o obejtivo de criar uma classe com os objetos e métodos, é que os objetos são criados protegidos dentro da sua
                     // classe original, no caso, na classe Guest, e não são alterados diretamente. Para os objetos serem referenciados 
                     // nas outras classes, são usados os métodos getter e setter da classe original do objetos

    private String name;
    private String whatsApp;
    private boolean youngerThan12;
    private float totalPayment;
    public int contador;


    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }
   
     public float getTotalPayment() {
        return totalPayment;
    }

    public String getName() {
        return name;
    }

    public String getWhatsApp() {
        return whatsApp;
    }

    public boolean isYoungerThan12() {
        return youngerThan12;
    }
     
     public void setName(String name) {
        this.name = name;
    }

    public void setWhatsApp(String whatsApp) {
        this.whatsApp = whatsApp;
    }
    
    public void setYoungerThan12(boolean youngerThan12) {
        this.youngerThan12 = youngerThan12;
    }
    
    public void setTotalPayment(String payment) {
        totalPayment = Float.parseFloat(payment);
        
        if (totalPayment <= 0 && youngerThan12 == false) {
            JOptionPane.showMessageDialog(null, "Guests older than 12 must pay.");
        }
        else if (totalPayment > 0 && youngerThan12 == true) {
            JOptionPane.showMessageDialog(null, "Guests under 12 have free entrance.");
        }
        else {
            totalPayment = Float.parseFloat(payment);
        }        
    }
    
    @Override
    public String toString() {
        return contador + " - " + name + " - R$ " + totalPayment + " - " +  whatsApp ;
    } 
}
