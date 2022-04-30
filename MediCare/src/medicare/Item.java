/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicare;

/**
 *
 * @author Christian
 */
public class Item {
    public String itemName;
    public int itemCount;
    public float itemCosts;
    
    public Item(String itemName, int itemCount, float itemCosts){
        this.itemName = itemName;
        this.itemCount = itemCount;
        this.itemCosts = itemCosts;
    }
    
    public String getItemName(){ return itemName; }
    public int getItemCount(){ return itemCount; }
    public float getItemCosts(){ return itemCosts; }
    
    @Override
    public String toString(){
        return itemName + "\n" + itemCount + "\n" + itemCosts;
    }
}
