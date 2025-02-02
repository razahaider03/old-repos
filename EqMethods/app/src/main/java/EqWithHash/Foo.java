package EqWithHash;

public class Foo {
    String id;
    String whatevs;

    Foo(String id, String whatevs) {
        this.id = id;
        this.whatevs = whatevs;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Foo) {
            return ((Foo)other).id.equals(this.id);
        }
        return  false;
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
}