package task_4;

public class SecondClassNewSolution extends FirstAbstractClassNewSolution{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getResult() {
        System.out.println("age: " + getAge() + ", name: " + getName());
    }

    @Override
    public void getResultOne() {
        System.out.println("reference on base class with new solution");
    }
}
