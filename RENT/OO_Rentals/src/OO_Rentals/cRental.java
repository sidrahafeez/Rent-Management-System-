/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO_Rentals;

/**
 *
 * @author HP
 */
public class cRental  {
 
    private int flat;
    private int house;
    private Double cost;
    private Double numberofroom;
    private String location;
    
    
    
    public int getflat(){
        return flat;
    }
    public void setflat(int flat){
        this.flat = flat;
    }
    
    public int gethouse(){
        return house;
    }
    public void sethouse(int house){
        this.house = house;
    }
    
    public Double getcost(){
        return cost;
    }
    public void setcost(Double cost){
        this.cost = cost;
    }
    
    public Double getnumberofroom(){
        return numberofroom;
    }
    public void setnumberofroom(Double numberofroom){
        this.numberofroom = numberofroom;
    }
    
    public String getlocation(){
        return location;
    }
    public void setlocation(String location){
        this.location = location;
    }
}


  

