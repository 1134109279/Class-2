import bean.Party;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //创建SpringIOC容器对象
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        //从IOC容器里面获取BEAN实例
        HelloWord helloWord=(HelloWord) context.getBean("helloword");
        helloWord.sayHello();

        Party party = (Party) context.getBean("party");
        party.printInfo();
    }
}
