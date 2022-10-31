/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author manya
 */
public class House {
    private String houseName;
    private String houseid;
    private String communityid;

    public House() {
    }
    

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseid() {
        return houseid;
    }

    public void setHouselId(String houseid) {
        this.houseid = houseid;
    }

    public String getCommunityid() {
        return communityid;
    }

    public void setCommunityId(String communityId) {
        this.communityid = communityid;
    }
    
    @Override
    public String toString(){
        return houseName;
    }
    
    
}
