public class Person {
    private int age;
    private int money;

    public Person(int age, int money) {
        this.age = age;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", money=" + money +
                '}';
    }
}
