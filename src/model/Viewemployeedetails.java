 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;


/**
 *
 * @author manyareddy
 */
public class Viewemployeedetails {
    
    private ArrayList<employeedetails> view;
    
     
    public Viewemployeedetails() {
        
        this.view = new ArrayList<employeedetails>();
        
    }

    public ArrayList<employeedetails> getView() {
        return view;
    }

    public void setView(ArrayList<employeedetails> view) {
        this.view = view;
    }

    public employeedetails addnewdetails() {
        
        employeedetails newdetails = new employeedetails();
        view.add(newdetails);
        return newdetails;
    }
    
}
