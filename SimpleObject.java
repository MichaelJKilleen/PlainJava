import java.util.Objects;

public class SimpleObject {

    private SmallObject smallObject;

    public SimpleObject() {
    }

    public SimpleObject(SimpleObject simpleObject) {
        this.smallObject = simpleObject.smallObject;
    }

    public SimpleObject(SmallObject smallObject) {
        this.smallObject = smallObject;
    }

    public SmallObject getSmallObject() {
        return new SmallObject(this.smallObject);
    }

    public void setSmallObject(SmallObject smallObject) {
        this.smallObject = smallObject;
    }

    public SimpleObject smallObject(SmallObject smallObject) {
        this.smallObject = smallObject;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SimpleObject)) {
            return false;
        }
        SimpleObject simpleObject = (SimpleObject) o;
        return Objects.equals(smallObject, simpleObject.smallObject);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(smallObject);
    }

    @Override
    public String toString() {
        return "{" + " smallObject='" + getSmallObject() + "'" + "}";
    }

}
