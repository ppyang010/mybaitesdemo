import bean.A;
import bean.B;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class APP {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        A bean1 = context.getBean(A.class);
        B bean2 = context.getBean(B.class);
        System.out.println(bean1);
        System.out.println(bean2);
        System.in.read();
    }
}
