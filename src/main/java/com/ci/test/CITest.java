package com.ci.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ci.beans.Robot;

public class CITest {
	public static void main(String[] args) {
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("com/ci/common/application-context.xml"));
		//Robot robot=new beanFactory.getBean("robot",Robot.class);
		Robot robot=beanFactory.getBean("robot",Robot.class);
		
		robot.boot();
	}

}
