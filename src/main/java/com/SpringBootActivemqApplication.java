package com;

import java.util.concurrent.ExecutorService;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.boot.SpringApplication;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;


public class SpringBootActivemqApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootActivemqApplication.class, args);
   
     /*   ApplicationContext context = new AnnotationConfigApplicationContext(SpringBootActivemqApplication.class);
        JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
        ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 5);
        fillQueue(jmsTemplate,threadPool,1000);*/
/*       
    	TUserService tUserService=(TUserService)SpringUtils.getBean("TUserService");
    	
        String path=tUserService.getUserPath(null);
        System.out.println(path);*/
        //设置
      //  TCache.getCache("lastTick");
        
      
    }
    
    private static void fillQueue(final JmsTemplate jmsTemplate, ExecutorService threadPool, int millis) {
        long time = System.currentTimeMillis() + millis;
        
        while (System.currentTimeMillis() < time) {
            threadPool.execute(new Runnable() {
                public void run() {
                	jmsTemplate.setDefaultDestinationName("DLQ");
                    jmsTemplate.send(new MessageCreator() {
                        @Override
                        public Message createMessage(Session session) throws JMSException {
                        	System.out.println("fasongchenggong");
                            return session.createTextMessage("good mornning");
                        }
                    });
                }
            });
        }
    }
}
