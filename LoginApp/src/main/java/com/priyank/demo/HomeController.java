package com.priyank.demo;

import java.io.Console;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.User;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home() {
		System.out.println("login");
		return "index.html";
		
	}
	
	@RequestMapping("welcome")
	public String welcome(String user,String pass){
		if (user.equals("fresherpro") && pass.equals("fresherpro")) { 
			System.out.println(user.equals("fresherpro") && pass.equals("fresherpro"));
			System.out.println("success");
			return "welcome.html";
		}
		else {
			System.out.println("Error Incorrect username and password");
			System.out.println(user.equals("fresherpro") && pass.equals("fresherpro"));
			return "index.html";
		}

	}
}
