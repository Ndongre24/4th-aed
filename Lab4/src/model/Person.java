/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Neha
 */

    public class Person {
        
    private String firstname;
    private String lastname;
    private int personage;
    private String personcityname;
    private String personcommunityname;
    private int personhouseno;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPersonage() {
        return personage;
    }

    public void setPersonage(int personage) {
        this.personage = personage;
    }

    public String getPersoncityname() {
        return personcityname;
    }

    public void setPersoncityname(String personcityname) {
        this.personcityname = personcityname;
    }

    public String getPersoncommunityname() {
        return personcommunityname;
    }

    public void setPersoncommunityname(String personcommunityname) {
        this.personcommunityname = personcommunityname;
    }

    public int getPersonhouseno() {
        return personhouseno;
    }

    public void setPersonhouseno(int personhouseno) {
        this.personhouseno = personhouseno;
    }
    
    @Override
    public String toString(){
        return firstname;
    }
      
}
