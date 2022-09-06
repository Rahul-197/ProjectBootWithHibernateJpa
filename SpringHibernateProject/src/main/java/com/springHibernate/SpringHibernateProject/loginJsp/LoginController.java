package com.springHibernate.SpringHibernateProject.loginJsp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ComponentScan({"com.springHibernate.SpringHibernateProject"})
public class LoginController {
	@RequestMapping(value = "/UserLogins", method = RequestMethod.GET)
    public String GotoUserLoginPage() 
    {
	//	System.out.println("userId : " +userId+" ; password : "+password);
    	return "UserLogin";//<==jsp file name
    }
	@RequestMapping(value = "/UserLogin",method =RequestMethod.POST)
    public String welComeLoginPage(ModelMap map,@RequestParam String userId,String password)
    {
		if(userId.equals("admin")&&password.equals("root"))
		{
			return "welcome";
		}
		map.put("errorMsg", "please provide the correct userId and password");
//		System.out.println("userId : " +userId+" ; password : "+password);
    	return "UserLogin";//<==jsp file name
    }
}
