/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicare;

/**
 *
 * @author Christian
 */
public class Account {
    private String username;
    private String password;
    private Inventory inventory;
    
    public Account(){};
    
    public Account(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public void SetInventory(Inventory inventory){
        this.inventory = inventory;
    }
    
    public String getUsername(){ return username; }
    public String getPassword(){ return password; }
    public Account getAccount(){ return this; }
    public Inventory getInventory() { return inventory;}
    
    @Override
    public String toString(){
        return username + "\n" + password;
    }
}
