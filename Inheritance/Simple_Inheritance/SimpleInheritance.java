class Employee {
    float salary = 40000;
}

class SimpleInheritance extends Employee {
    int bonus = 10000;

    public static void main(String args[]) {
        SimpleInheritance p = new SimpleInheritance();

        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);
    }
}