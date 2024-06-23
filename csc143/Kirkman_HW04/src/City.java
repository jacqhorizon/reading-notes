/**
 * Represents a single city
 *
 * @author Jacq Kirkman
 * @version 1.0 May 2024
 */
public class City implements Comparable<City> {
    private String name;
    private String country;
    private String state;
    private int population;

    /**
     * City full constructor
     *
     * @param name       name of the city
     * @param country    city's country
     * @param state      city's state
     * @param population population of city
     */
    public City(String name, String country, String state, int population) {
        setName(name);
        setCountry(country);
        setState(state);
        setPopulation(population);
    }

    /**
     * City partial constructor
     *
     * @param name       name of the city
     * @param country    city's country
     * @param population population of city
     */
    public City(String name, String country, int population) {
        this(name, country, "None", population);
    }

    /**
     * Set a new name
     *
     * @param name must not be null or empty
     */
    public void setName(String name) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Name must not be null or empty");
        this.name = name;

    }

    /**
     * Set a new country
     *
     * @param country must not be null or empty
     */
    public void setCountry(String country) {
        if (country == null || country.isEmpty())
            throw new IllegalArgumentException("Country must not be null or empty");
        this.country = country;
    }

    /**
     * Set a new state
     *
     * @param state can be null, must not be empty
     */
    public void setState(String state) {
        if (state != null && state.isEmpty())
            throw new IllegalArgumentException("State must not be empty");
        this.state = state;
    }

    /**
     * Set a new population
     *
     * @param population cannot be negative
     */
    public void setPopulation(int population) {
        if (population < 0)
            throw new IllegalArgumentException("Population cannot be negative");
        this.population = population;
    }

    /**
     * Retrieve the city's name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieve the city's country
     *
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Retrieve the city's state
     *
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * Retrieve the city's population
     *
     * @return population
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Returns a string representation of the object
     *
     * @return string representation
     */
    @Override
    public String toString() {
        String tmp = "";
        if (state != null) {
            tmp = state;
        }
        return String.format("Name:%10s, Country:%10s, State:%10s, Population: %10d", name, country, tmp, population);
    }

    /**
     * Compares two cities by sort type
     *
     * @param other the city to be compared.
     * @return an integer representing the order of the objects
     */
    @Override
    public int compareTo(City other) {
        return this.name.compareTo(other.name);
    }

}
