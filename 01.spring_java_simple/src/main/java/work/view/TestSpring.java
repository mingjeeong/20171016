package work.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import work.dto.MessageBean;

public class TestSpring {

	public static void main(String[] args) {
		//MessageBean bean1 = new MessageBean();
		
		//bean configuration(bean-config.xml) 설정 기반으로 spring f/w에서 객체 생성 인젝션
		//IoC(DI) 컨테이너 : ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
		
		//bean 자동 인젝션 받는 방법 : bean-name (bean configuration)
		MessageBean bean1 = (MessageBean)context.getBean("messageBean");
		
		//bean 자동 인젝션 받는 방법 : bean-type ( beans configuration)
		MessageBean bean2 = context.getBean(MessageBean.class);
		
		//bean 자동 인젝션 받는 방법 : bean-name,bean-type (beans configuration)
		MessageBean bean3 = context.getBean("messageBean", MessageBean.class);
		
		System.out.println();
		bean1.sayMessage("홍길동");
		bean2.sayMessage("길라임");
		bean3.sayMessage("김주원");
		
		System.out.println();
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean3);
		
		bean1.setMessage("Spring DI");
		bean1.setMessage("Spring AOP");
		bean1.setMessage("Spring POJO");
		
		System.out.println();
		System.out.println(bean1.getMessage());
		System.out.println(bean2.getMessage());
		System.out.println(bean3.getMessage());
	}
}
