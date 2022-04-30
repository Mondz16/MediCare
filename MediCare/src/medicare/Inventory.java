/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicare;

import java.util.ArrayList;

/**
 *
 * @author Christian
 */
public class Inventory {
    
    private int id;
    private ArrayList<Item> items ;
    
    public Inventory(int id){
        setID(id);
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public void addItem(String itemName, int itemCount, float itemCosts){
        Item newItem = new Item(itemName, itemCount, itemCosts);
        items.add(newItem);
    }
    
    public ArrayList<Item> getItems(int id){
        if(this.id == id){
            return items;
        }
        
        System.out.println("ArrayList of Items not found");
        return null;
    }
    
    public Item searchItem(String itemName){
        for(Item i: items){
            if(i.itemName.equalsIgnoreCase(itemName))
                return i;
        }
        
        System.out.println("Item not found!");
        return null;
    }
}
