public class ConsTypes {
    int id;
    String name;

    ConsTypes() {
        System.out.println("This a default constructor");
    }

    ConsTypes(int i, String n) {
        id = i;
        name = n;
    }

    public static void main(String[] args) {
        ConsTypes s = new ConsTypes();
        System.out.println("\nDefault Constructor values: \n");
        System.out.println("Student Id : " + s.id + "\nStudent Name : " + s.name);

        System.out.println("\nParameterized Constructor values: \n");
        ConsTypes consTypes = new ConsTypes(46, "Sarvesh");
        System.out.println("Student Id : " + consTypes.id + "\nStudent Name : " + consTypes.name);
    }
}