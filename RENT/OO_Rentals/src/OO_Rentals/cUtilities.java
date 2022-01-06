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
public class cUtilities {
    //Member variables
    private Double localtax;
    private Double waterbill;
    private Double electricity;
    
    //Accessor functions
    public Double getlocaltax(){
        return localtax;
    }
    public void setlocaltax(Double localtax){
        this.localtax = localtax;
    }
    
    public Double getwaterbill(){
        return waterbill;
    }
    public void setwaterbill(Double waterbill){
        this.waterbill = waterbill;
    }
    
    public Double getelectricity(){
        return electricity;
    }
    public void setelectricity(Double electricity){
        this.electricity = electricity;
    }
}

