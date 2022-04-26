/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicare;

/**
 *
 * @author Christian
 */
public class HospitalPharmacy extends Pharmacy{
    private String hospitalName;
    private int floorNumber;
    
    public HospitalPharmacy(String hospitalName, int floorNumber){
        this.hospitalName = hospitalName;
        this.floorNumber = floorNumber;
    }
    
    public void setHospitalName(String hospitalName){ this.hospitalName = hospitalName;;}
    public void setFloorNumber(int floorNumber){ this.floorNumber = floorNumber;}
    public String getHospitalName(){ return hospitalName;}
    public int getFloorNumber(){ return floorNumber;}
    
    public String toString(){
        return hospitalName + "\n" + floorNumber + "\n" + super.toString();
    }
}
