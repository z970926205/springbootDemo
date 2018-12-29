package com.example.demo.jinx.vue;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class VueController {
	@RequestMapping("/vue")
	public String showLogin(ModelMap map) {
		map.put("jinx", "jinx");
		return "vue";
	}
}
