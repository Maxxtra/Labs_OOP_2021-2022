public class UserFactory {
    public static User createUser(String type, String firstname, String lastName) {
        if (type.equals("Parent")) {
            return new Parent(firstname, lastName);
        } else if (type.equals("Teacher")) {
            return new Teacher(firstname, lastName);
        } else if (type.equals("Student")) {
            return new Student(firstname, lastName);
        } else if (type.equals("Assistant")) {
            return new Assistant(firstname,lastName);
        }

        return null;
    }
}