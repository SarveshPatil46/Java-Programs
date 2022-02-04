class ParameterizedConstructor {
    int length;
    int breadth;

    ParameterizedConstructor(int len, int bre) {
        length = len;
        breadth = bre;
    }
}

class RectangleDemo {
    public static void main(String args[]) {
        ParameterizedConstructor r1 = new ParameterizedConstructor(20, 10);
        System.out.println("Length of Rectangle : " + r1.length);
        System.out.println("Breadth of Rectangle : " + r1.breadth);
    }
}