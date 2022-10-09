/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Manya
 */
public class Emp //implements Comparable<Employee>
{
    
    private String name;
    private int empid;
    private int age;
    private String gender;
    //private Date startDate;
    private String level;
    private String teamInfo;
    private String title;
    private String phno;
    private String  emailid;
    private byte[] Photo;
    private Image image;
     
        Date start_Date = new Date();
        
        // specify the date format to be used
        SimpleDateFormat date_format1 = new SimpleDateFormat("MM/dd/yyyy");
  
        String startDate = date_format1.format(start_Date); 

    public Date getStart_Date() {
        return start_Date;
    }

    public void setStart_Date(Date start_Date) {
        this.start_Date = start_Date;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Emp(String name, int empid, int age, String gender,  String startDate , String level, String teamInfo, String title, String phno,String  emailid) {
        this.name = name;
        this.empid = empid;
        this.age = age;
        this.gender = gender;
        this.startDate = startDate;
        this.level = level;
        this.teamInfo = teamInfo;
        this.title = title;
        this.phno = phno;
        this.emailid=emailid;
    }
    public Emp(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

   

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTeamInfo() {
        return teamInfo;
    }

    public void setTeamInfo(String teamInfo) {
        this.teamInfo = teamInfo;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String getphno() {
        return phno;
    }

    public void setphno(String phno) {
        this.phno = phno;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmail(String emailid) {
        this.emailid = emailid;
    }
    
    public byte[] getPhoto() {
        return Photo ;
    }

    public void setPhoto(byte[] Photo) {
        this.Photo = Photo;
    }

    public Image getImage() {
        return image;
    }

//     @Override
//    public int compareTo(Employee compareEmp) {
//        int compareeta = ((car)compareEmp).getEta();
//        return this.eta-compareeta;
//    }
    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return name ;
    }
    
    
}
