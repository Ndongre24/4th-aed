/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author Neha
 */

  public class Encounter {
    
    private int encounterno;
    private int encpatientid;
    private ArrayList<VitalSign> vitalSignList;

    public int getEncpatientid() {
        return encpatientid;
    }

    public void setEncpatientid(int encpatientid) {
        this.encpatientid = encpatientid;
    }
    
    public Encounter(){
    vitalSignList = new ArrayList<>();
    }

    public int getEncounterno() {
        return encounterno;
    }

    public void setEncounterno(int encounterno) {
        this.encounterno = encounterno;
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    
    public void addVitalSign(VitalSign vitalSign){
    this.vitalSignList.add(vitalSign);
            }
    
}
