import interfaces.Course;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        BeanFactory container = new ClassPathXmlApplicationContext("config.xml");

        //Course course= (Course) container.getBean("course");
        //course.course();

        Course course = (Course) container.getBean("Java");
        course.getTeachingHours();

        //*****************************Another way of calling the class method without down-casting***************

        Course course1 = container.getBean("Selenium", Course.class);
        course1.getTeachingHours();
    }
}
