package co.jp.socio.diversity.vos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.validation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import co.jp.socio.diversity.vos.model.UserInfo;
import co.jp.socio.diversity.vos.repository.UserRepository;

@Controller
@SpringBootApplication
public class LoginController {
	
	Logger log = LogManager.getLogger(LoginController.class);
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	protected MessageSource messageSource;
	
	@GetMapping("")
	@RequestMapping("/")
	public String index() {
		/*
		 * loginForm.setLoginId("hoge"); loginForm.setPassword(18);
		 * model.addAttribute("loginForm",loginForm);
		 */
		 return "redirect:/login";
	}

	@RequestMapping("/login")
    public String showLoginPage(ModelMap model){
        return "/login/login";
    }
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String loginId, @RequestParam String password){
		try{	
		boolean isValidUser = userRepo.validateUser(loginId, password);
		 
		if (!isValidUser) { 
			//errors.rejectValue("error_page_login_0001","error_page_login_0001");
			model.put("errorMessage",  messageSource.getMessage("error_page_login_0001", null, Locale.JAPAN));
			 return "/login/login"; 
		}
		//log.info("-- count");
		//log.info(userRepo.count());
		log.info("login user: " + loginId + "  -- login name: " + loginId);
		model.put("name", loginId); 
		//model.put("password", password);
		}catch (Exception e) {
        	log.error("",e);
        	return "redirect:/myerror/?errorId=unknown";
		}

		List<Map<String, Object>> list=userRepo.selectAll("user_info");
		//List<UserInfo> list= userRepo.getAllUsers();
		
		model.put("list", list); 
		return "/login/main";
    }
	
	@RequestMapping(value="/logout")
    public String logout(){
		log.info("-- logout");
		return "redirect:/login";
    }
	
}
