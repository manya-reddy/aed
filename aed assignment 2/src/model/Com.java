/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author manya
 */
public class Com {
    
    private String com;
    private String comid;
    private String cityid;

    public Com() {
    }
    
    
    public String getCom() {
        return com;
    }

    public void setCommunity(String community) {
        this.com = community;
    }

    public String getComid() {
        return comid;
    }

    public void setCommunityID(String communityID) {
        this.comid = communityID;
    }
    
    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityID) {
        this.cityid = cityID;
    }
    
    @Override
    public String toString(){
        return com;
        
    }
    
}
