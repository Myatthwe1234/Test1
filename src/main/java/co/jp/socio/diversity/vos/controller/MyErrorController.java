package co.jp.socio.diversity.vos.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyErrorController {
public String forwardURL="";
	Logger log = LogManager.getLogger(MyErrorController.class);
	@GetMapping("")
	@RequestMapping("/index")
	public String index() {
		return "/error/error";
	}
	
	@RequestMapping("/myerror")
	public String error(@RequestParam(name = "errorId") String errorId) {
		 if(errorId==null || errorId==""){ 
			 return "redirect:/index"; 
		 }
		 else {
			 return "/error/error_"+errorId; 
		 }
	
	}
	
	@RequestMapping("/errPage")
	 public String handleError(ModelMap model,HttpServletRequest request) {
	 Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
	 
	 if (status != null) {
	     Integer statusCode = Integer.valueOf(status.toString());
	     
	     if(statusCode == HttpStatus.NOT_FOUND.value()) {
	    	 model.put("status", statusCode); 
		     model.put("error", "404 NOT FOUND."); 
	         return "/error/404_error";
	     }
	     else if(statusCode == HttpStatus.UNAUTHORIZED.value()) {
	    	 model.put("status", statusCode); 
		     model.put("error", "UNAUTHORIZED."); 
	         return "/error/404_error";
	     }
	     else {
	    	 model.put("status", statusCode); 
		     model.put("error", "UNAUTHORIZED."); 
	         return "/error/404_error";
	     }
	 }
	 
	 return "/error/error_unknown";
	}
	
}
