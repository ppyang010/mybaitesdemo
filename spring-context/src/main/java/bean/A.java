package bean;


import org.springframework.beans.factory.annotation.Autowired;

public class A {
    public B b;

    public B getB() {
        return b;
    }

    public A setB(B b) {
        this.b = b;
        return this;
    }
}
