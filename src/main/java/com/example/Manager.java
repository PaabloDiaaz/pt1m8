package com.example;

import java.util.Date;

/**
 * Represents a manager.
 *
 * @author pdiaz
 */
public class Manager extends Persona {
    private Date startDate;
    private int experience;

    /**
     * Constructs a new Manager instance.
     *
     * @param startDate  The start date of the manager.
     * @param experience The experience of the manager.
     */
    public Manager(String name, String identifier, Date startDate, int experience) {
        super(name, identifier);
        this.startDate = startDate;
        this.experience = experience;
    }

    /**
     * Retrieves the start date of the manager.
     *
     * @return The start date of the manager.
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the start date of the manager.
     *
     * @param startDate The new start date of the manager.
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Retrieves the experience of the manager.
     *
     * @return The experience of the manager.
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Sets the experience of the manager.
     *
     * @param experience The new experience of the manager.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     * Returns a string representation of the manager.
     *
     * @return A string representation of the manager.
     */
    @Override
    public String toString() {
        return "Manager [startDate=" + startDate + ", experience=" + experience + "]";
    }

   
    
}
