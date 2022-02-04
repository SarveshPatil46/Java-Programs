class ConsDemo {

    String language;

    // constructor with no parameter
    ConsDemo() {
        this.language = "Java";
    }

    // constructor with a single parameter
    ConsDemo(String language) {
        this.language = language;
    }

    public void getName() {
        System.out.println("Programming Langauage: " + this.language);
    }

    public static void main(String[] args) {

        // call constructor with no parameter
        ConsDemo obj1 = new ConsDemo();

        // call constructor with a single parameter
        ConsDemo obj2 = new ConsDemo("Python");

        obj1.getName();
        obj2.getName();
    }
}