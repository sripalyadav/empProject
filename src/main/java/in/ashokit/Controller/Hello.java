package in.ashokit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class WishController {
	
	
	
	@GetMapping("/hello")
	public String display_WishMsg(@RequestParam("bookId") int bookId,@RequestParam("bookName") String bookName, Model model) {
		
            String key="inf";
		    String value="HELLO  WELCOME TO THE BOOKS STORE::  " +"BookId:"+bookId+" , BookName:"+bookName;
		model.addAttribute(key,value);	
		System.out.println(value);
		
		
		return "hello";
	}
}

