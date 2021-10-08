package com.goliathnerd.inventorytracking;

/**
 * The Outsourced class holds and mutates the information of given company,
 * of which a part is ordered from.
 * @author trevorevans 
 */
public class Outsourced {
    String compName;

    /**
     * getCompName
     * @return company name in which the part is being attained from
     */
    public String getComName() {
        return compName;
    }

    /**
     * accepts the name of the company that the part is being attained from.
     * It sets that string to compName
     * @param comName 
     */
    public void setComName(String comName) {
        this.compName = comName;
    }
}
