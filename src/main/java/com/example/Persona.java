package com.example;

/**
 * Represents a person.
 *
 * @author pdiaz
 */
public abstract class Persona {

    private String name;
    private String identifier;

    /**
     * Constructs a new Persona instance.
     *
     * @param name       The name of the person.
     * @param identifier The identifier of the person.
     */
    public Persona(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    /**
     * Retrieves the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name The new name of the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the identifier of the person.
     *
     * @return The identifier of the person.
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the identifier of the person.
     *
     * @param identifier The new identifier of the person.
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Returns a string representation of the person.
     *
     * @return A string representation of the person.
     */
    @Override
    public String toString() {
        return "Persona [name=" + name + ", identifier=" + identifier + "]";
    }
}
