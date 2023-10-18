package in.ashokit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public String welcomeMsg_display(Model model) {
		
		String str = "welcome mr sripal yadav...!";
		model.addAttribute("msg", str);
		
		
		
	/*	ModelAndView model = new ModelAndView();
		
		
		model.addObject("key", "WELCOME TO THE SPRING MVC...!");
		model.setViewName("index");*/
		return "index";
		
		
		
	}

	 @GetMapping("/wish")
	public String wishMsg(Model model) {
		
		 model.addAttribute("msg","good morining sripal Yadav");
		
		System.out.println("jenkintest");
		
		return"index";
	}
	
}
