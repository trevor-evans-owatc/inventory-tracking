package com.goliathnerd.inventorytracking;

/**
 * The InHouse class holds the setter and getter the machine id
 * @author trevor Evans
 */
public class InHouse {
    int machineId;
    
    /**
     * getMachineId is the getter that returns the an integer that is the 
     * identification number for the machine which manufactures a specific part.
     * @return int machineId
     */
    public int getMachineId() {
        return machineId;
    }
    
    /**
     * setMachineId takes it's integer argument and sets to the manufacturing 
     * machine's identification number.
     * @param machineId 
     */
    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }
}
