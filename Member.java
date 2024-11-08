package HW3;
/**
 * Class representing a library member.
 * Extends the abstract Person class and specifies the role as "Member".
 */
public class Member extends Person{
    public Member(String name, String id) {
        super(name, id);

    /**
     * Constructs a new Member with the specified name and ID.
     *
     * @param name the name of the member
     * @param id   the unique identifier (member ID) for the library member
     */
    }
    public String describe() {
        return "Member";
    }
}
