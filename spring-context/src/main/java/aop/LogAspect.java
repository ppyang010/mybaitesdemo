package aop;

import org.aspectj.lang.JoinPoint;

public class LogAspect {

    public void before(JoinPoint point){
        System.out.println("LogAspect.before()");
        System.out.println(point);
    }
}
