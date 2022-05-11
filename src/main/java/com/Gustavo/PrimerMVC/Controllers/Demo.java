package com.Gustavo.PrimerMVC.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo {

	@GetMapping("demo/")
	public String Index() {
		return "demo/Index";
	
}
}
