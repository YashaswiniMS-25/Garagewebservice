package com.wolken.wolkenapp.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@Component
public class Police {
	
	
//	@Value("Rama")
//	public void setName(String name) {
//		this.name = name;
//	}
//	@Value("7")
//	public void setExperience(String experience) {
//		this.experience = experience;
//	}
	@Autowired
	  public Police(@Value("Mohan")String name,@Value("7") String experience) {
	  
	  this.name = name; this.experience = experience; }
	 
	
	private String name;
	private String experience;
	
	
	
	

}
