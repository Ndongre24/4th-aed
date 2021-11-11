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


  public class EncounterHistory {
    
    private ArrayList<Encounter> encounterHistoryList;

    public EncounterHistory() {
        encounterHistoryList = new ArrayList<>();
    }

    
    public ArrayList<Encounter> getEncounterHistoryList() {
        return encounterHistoryList;
    }

    public void setEncounterHistoryList(ArrayList<Encounter> encounterHistoryList) {
        this.encounterHistoryList = encounterHistoryList;
    }
    
    public void addEncounterInList(Encounter encounter){
        encounterHistoryList.add(encounter);
    }
    
    
}
