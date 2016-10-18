package github.tiMorpheus.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");

        Customer customer = (Customer) context.getBean("clientBean");

        System.out.println(customer);
    }
}
