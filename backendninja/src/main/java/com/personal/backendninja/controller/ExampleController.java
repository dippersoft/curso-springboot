package com.personal.backendninja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.personal.backendninja.component.ExampleComponent;
import com.personal.backendninja.service.ExampleService;

@Controller
@RequestMapping("/example")	
public class ExampleController {
	
	public static final String EXAMPLEVIEW="example";

	
	@Autowired
	@Qualifier("exampleService")
	private ExampleService exampleService;
	
	@Autowired
	@Qualifier("exampleComponent")
	private ExampleComponent exampleComponent;

	//primera forma
	@GetMapping("/exampleString")	
	public String exampleString(Model model) {
		exampleComponent.sayHello();
		model.addAttribute("people", exampleService.getPeople());
		return EXAMPLEVIEW;
	}
	
	//segunda forma
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView modelAndView= new ModelAndView(EXAMPLEVIEW);
		return modelAndView.addObject("people",exampleService.getPeople());
	}
	
	
}
