/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jessica.holam;

/**
 *
 * @author quind
 */
public class WagonR extends Car{
    private boolean isSedan=false;
    private String seats="4 seats";
    int MiLeage;

           
    
    public WagonR(boolean isSedan, String seats,int MyLeage)
    {
//        super(isSedan,seats,MyLeage);
        this.isSedan=isSedan;
        this.seats=seats;
    }

  

    public boolean isIsSedan() {
        return isSedan;
    }

    public void setIsSedan(boolean isSedan) {
        this.isSedan = isSedan;
    }

    @Override
    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public int getMiLeage() {
        return MiLeage;
    }

    public void setMiLeage(int MiLeage) {
        this.MiLeage = MiLeage;
    }

    
    @Override
    public String getMileage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    




}