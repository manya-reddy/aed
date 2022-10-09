/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Manya 
 */
public class Empdetails {
    
    private ArrayList<Emp> empHistory;
    private Date lastUpdatedDate;
    
    public Empdetails() {
        this.empHistory = new ArrayList<Emp>();
   
    }

    public ArrayList<Emp> getEmpHistory() {
        return empHistory;
    }

    public void setEmpHistory(ArrayList<Emp> empHistory) {
        this.empHistory = empHistory;
    }

  
    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }
    
    
    public void addNewEmployee(Emp newEmp){
        //car newCar = new car();    
        empHistory.add(newEmp);
        //return newCar;

    }
    
    
    public void deleteEmployee(Emp e){
        empHistory.remove(e);
    }
   
}
