package com.greatlearning.library.springBootApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.greatlearning.library.springBootApp.model.GreatLearning;




@Controller
public class ExambleController {
	
	
	@GetMapping("/info")
	@ResponseBody
	public GreatLearning get() {
		
		GreatLearning grt = new GreatLearning();
		grt.setCoursename("introduction to controller mapping");
		grt.setCoursetype("it");
		grt.setInstructorName("jaseel");
		
		return grt;
	}
	
	@PostMapping("customInfo")
	public GreatLearning customInfo(String coursName,String CourseType,String Instructor) {
		GreatLearning grtcust = new GreatLearning();
		grtcust.setCoursename(coursName);
		grtcust.setCoursetype(CourseType);
		grtcust.setInstructorName(Instructor);
		
		return grtcust;
	}

}
