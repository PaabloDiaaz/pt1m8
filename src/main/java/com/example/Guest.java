package com.example;

/**
 * 
 *
 * @author pdiaz
 */
public class Guest extends Persona{
    private String nationality;

    /**
     * Constructs a new Guest instance.
     *
     * @param nationality The nationality of the guest.
     */
    public Guest(String name, String identifier, String nationality) {
        super(name, identifier);
        this.nationality = nationality;
    }
    
    /**
     * Retrieves the nationality of the guest.
     *
     * @return The nationality of the guest.
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the nationality of the guest.
     *
     * @param nationality The new nationality of the guest.
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Returns a string representation of the guest.
     *
     * @return A string representation of the guest.
     */
    @Override
    public String toString() {
        return "Guest [nationality=" + nationality + "]";
    }

   
}
