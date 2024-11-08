package HW3;
/**
 * Abstract class representing a person in a library system.
 * 
 */
public abstract class Person {
    protected String name;
    protected String id;

    /**
     *  A class for a  new Person with the specified name and ID.
     *
     * @param name the name of the person
     * @param id   the unique identifier for the person
     */

   public Person(String name, String id) {
       this.name = name;
       this.id = id;
   }

    /**
     * Abstract method to describe the type or role of the person.
     *
     * @return a string describing the type or role of the person
     */
   public abstract String describe();
}


