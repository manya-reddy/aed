/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author manya
 */
public class Datahistory{
    
    
    
    private ArrayList<House> history;
   
    public Datahistory (){
        this.history= new ArrayList<House>();
        
    }

    public ArrayList<House> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<House> history) {
        this.history = history;
    }
    
    
    public House addHouses(){
        House Houses=new House();
        history.add(Houses);
        return Houses;

        
      }
    
    public void deleteHouses(House hs){
        history.remove(hs);
    }
    
     public void updateHouses(House hs){
        
        history.set(0,hs );
    }
}