import com.tsd.tsdInterface.ProduceService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProducerTest {
    public static void main(String[] args){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("producer.xml");
        ProduceService bean = classPathXmlApplicationContext.getBean(ProduceService.class);
        //进行发送消息
        for (int i = 0; i < 100 ; i++) {
            bean.sendMessage("test" + i);
        }
        //当消息发送完后，关闭容器
        classPathXmlApplicationContext.close();
    }
}