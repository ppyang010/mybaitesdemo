package bean;

import org.springframework.beans.factory.annotation.Autowired;

public class B {

    public A a;

    public A getA() {
        return a;
    }

    public B setA(A a) {
        this.a = a;
        return this;
    }
}
