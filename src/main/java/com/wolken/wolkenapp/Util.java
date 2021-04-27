package com.wolken.wolkenapp;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.wolkenapp.Bean.Police;
import com.wolken.wolkenapp.Bean.PoliceStation;

public class Util {
	public static void main(String[] args) {
		
	
	 Logger logger=Logger.getLogger("Util");
	 
	 logger.info("inside util");
	ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("context.xml");
	PoliceStation bean1= applicationcontext.getBean(PoliceStation.class);
	logger.info("policestation");
	logger.info(bean1.getArea());
	logger.info(bean1.getNoOfPolice());

	Police bean2=applicationcontext.getBean(Police.class);
	logger.info("police");
	logger.info(bean2.getName());
	logger.info(bean2.getExperience());
	
	
	}
}
