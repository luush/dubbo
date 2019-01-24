package dagger.start;

import org.lszjaf.dagger.service.DubboService;
import org.lszjaf.dagger.service.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] luush) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        System.out.println("dubbo consumer start");
        TestService testService = context.getBean(TestService.class);
        DubboService dubboService = context.getBean(DubboService.class);

        for(int i=0;i<100;i++){

            System.out.println();
            System.out.println(testService.getName("1221"));
            System.out.println();
            System.out.println(dubboService.getNumber("1314"));
        }
    }
}
