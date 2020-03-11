/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Project.model;
package Models;
/**
 *
 * @author hp
 */
public class p {
    	String fname;
	String lname;
	String email;
	String pswd;
	char gender;
String contactno;
String ccno;
int status; //0 for admin // 1 for manager // 2 for client

public p() {
	// TODO Auto-generated constructor stub
	fname =null;
	lname=null;
	email=null;
	pswd=null;
	contactno=null;
	ccno=null;
status = 2;
}

public p(String fname, String lname, String email, String pswd, String contactno, String ccno	) 
{
	this.fname = fname;
	this.lname = lname;
	this.email = email;
	this.pswd = pswd;
	this.contactno = contactno;
	this.ccno = ccno;
	this.status = 2;
//sql query
}

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getCcno() {
        return ccno;
    }

    public void setCcno(String ccno) {
        this.ccno = ccno;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

public boolean varification(String e,String p)
{
boolean flag = false;

return flag;
}
}
