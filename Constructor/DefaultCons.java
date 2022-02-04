class DefaultCons {
    DefaultCons() {
        System.out.println("Default constructor");
    }

    public void mymethod() {
        System.out.println("Void method of the class");
    }

    public static void main(String args[]) {
        DefaultCons obj = new DefaultCons();
        obj.mymethod();
    }
}