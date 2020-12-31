package com.winpoint.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.winpoint.model.UserProfile;
import com.winpoint.repository.UserProfileRepository;



@Controller
public class LoginController {
	
	@Autowired
	UserProfileRepository userProfileRepositroy;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView LoginPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LoginForm");	
		return mv;
	}
	
	
	@RequestMapping(value = "loginUser", method = RequestMethod.POST)
	public @ResponseBody String check(@RequestParam String username,@RequestParam String password) {
		JSONObject data = new JSONObject();
		UserProfile userObject = userProfileRepositroy.findByEmailId(username).get(0);
		if (password.equals(userObject.getPassword())) {
			if (userObject.getMappingUserCategory().getUserCategoryId() == 1) {
				data.put("message", "success");
				data.put("location","clientDash");
				data.put("user", username);
			} else {
				data.put("message", "success");
				data.put("location","employeeDash");
				data.put("user", username);
			}

		} else {
			data.put("message", "fail");
		}
		String dataString = data.toString();
		return dataString;
	}
	

}
