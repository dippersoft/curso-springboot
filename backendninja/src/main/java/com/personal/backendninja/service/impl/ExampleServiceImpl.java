package com.personal.backendninja.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.personal.backendninja.component.ExampleComponent;
import com.personal.backendninja.model.Person;
import com.personal.backendninja.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {

	private static final Log LOG= LogFactory.getLog(ExampleServiceImpl.class);
	
	@Override
	public List<Person> getPeople() {

		List<Person> people = new ArrayList<>();
		people.add(new Person("Miguel", 38));
		people.add(new Person("Jesus", 34));
		people.add(new Person("Leon", 26));
		people.add(new Person("Oscar", 44));
		LOG.info("LLEGO al servicio");

		return people;

	}

}
