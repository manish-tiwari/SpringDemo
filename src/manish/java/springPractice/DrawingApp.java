package manish.java.springPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by manish on 21-05-2017.
 */
public class DrawingApp {
    public static void main(String[] args) {
//        Triangle triangle = new Triangle();
//        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) applicationContext.getBean("triangle");
        triangle.draw();

    }
}
