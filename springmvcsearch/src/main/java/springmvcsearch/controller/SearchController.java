package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	@RequestMapping("/home")
	public String home() {
		System.out.println("going to home view....");
		return"home";
	}
	@RequestMapping("/search")
	
	public RedirectView search(@RequestParam("querybox")String query) {
		System.out.println(query);
		
		String uri="https://www.google.com/search?q="+query;
		RedirectView redirectView =new RedirectView();
        redirectView.setUrl(uri);
		return redirectView ;
		
	}

}
