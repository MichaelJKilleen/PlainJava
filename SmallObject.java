import java.util.Objects;

public class SmallObject {
    private String name;
    private Integer age;

    public SmallObject() {
    }

    public SmallObject(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public SmallObject(SmallObject smallObject) {
        this.age = smallObject.age;
        this.name = smallObject.name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public SmallObject name(String name) {
        this.name = name;
        return this;
    }

    public SmallObject age(Integer age) {
        this.age = age;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SmallObject)) {
            return false;
        }
        SmallObject smallObject = (SmallObject) o;
        return Objects.equals(name, smallObject.name) && Objects.equals(age, smallObject.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", age='" + getAge() + "'" + "}";
    }

}
