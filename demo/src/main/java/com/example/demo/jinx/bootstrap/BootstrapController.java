package com.example.demo.jinx.bootstrap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/bootstrap")
public class BootstrapController {
	@RequestMapping(value = "/Bootstrap", method = RequestMethod.GET)
	public String showBootstrap(){
		return "Bootstrap";
	}
}
