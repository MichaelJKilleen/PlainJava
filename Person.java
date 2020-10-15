import java.util.Objects;

class Person {
    public enum Species {
        HUMAN, ANIMAL, UNKNOWN
    }

    private String name;
    private Integer age;
    private Species species;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.species = Species.UNKNOWN;
    }

    public Person(String name, Integer age, Species species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public Person() {
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

    public Species getSpecies() {
        return this.species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Person name(String name) {
        this.name = name;
        return this;
    }

    public Person age(Integer age) {
        this.age = age;
        return this;
    }

    public Person species(Species species) {
        this.species = species;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age)
                && Objects.equals(species, person.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, species);
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", age='" + getAge() + "'" + ", species='" + getSpecies() + "'"
                + "}";
    }

}