package com.wolken.wolkenapp.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@Component
public class PoliceStation {
	@Value("Sringeri")
	private String area;
	@Value("10")
	private String noOfPolice;
	@Autowired
	private Police police;

}
