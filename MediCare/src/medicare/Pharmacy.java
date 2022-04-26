/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicare;

/**
 *
 * @author Christian
 */
public class Pharmacy {
    protected String name;
    protected String description;
    protected int timeOpen;
    protected int timeClose;
    protected float longitude;
    protected float latitude;
    protected String location;
    // protected Inventory inventory
    
    public Pharmacy(){
        name = "";
        description = "";
        timeOpen = 0;
        timeClose = 0;
        longitude = 0;
        latitude = 0;
        location = "";
    }
    
    public Pharmacy(String name, String desc, int timeOpen, int timeClose, String location){
        SetPharmacy(name, desc, timeOpen, timeClose, location);
    }
    
    public void SetPharmacy(String name, String description, int timeOpen, int timeClose, String location){
        this.name = name;
        this.description = description;
        this.timeOpen = timeOpen;
        this.timeClose = timeClose;
        this.location = location;
    }
    
    // Setters
    public void setName(String name){ this.name = name; }
    public void setDescription(String description){ this.description = description; }
    public void setTime(int timeOpen, int timeClose){ this.timeOpen = timeOpen; this.timeClose = timeClose; }
    // public void setInventory(String name){ this.name = name; }
    public void setLocation(String location){ this.location = location; }
    public void setCoordinates(float longitude, float latitude){ this.longitude = longitude; this.latitude = latitude; }
    
    // Getters
    public String getName(){return name;}
    public String getDescription(){return description;}
    public int getTimeOpen(){return timeOpen;}
    public int getTimeClose(){return timeClose;}
    public String getLocation(){return location;}
    public float getLongitude(){return longitude;}
    public float getLattitude(){return latitude;}
    public String getCoordinates(){return longitude + " , " + latitude;}
    //public String getInventory(){return inventory;}
    
    public String toString(){
        return name + "\n" + description + "\n" + timeOpen + "\n" + timeClose + "\n" + longitude + "\n" + latitude + "\n" + location;
    }
}
