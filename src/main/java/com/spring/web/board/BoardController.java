package com.spring.web.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
	
	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public String list(Model model) {
		
		return "/board/list";
	}

}
