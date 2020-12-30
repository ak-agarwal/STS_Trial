package com.winpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.winpoint.model.BatchDetails;
import com.winpoint.model.Course;
import com.winpoint.repository.BatchDetialsRepository;
import com.winpoint.repository.CourseRepository;
import com.winpoint.repository.StreamsRepository;

@Controller
public class AllUsersController {

	@Autowired
	StreamsRepository stream;

	@RequestMapping(value = "AllUser", method = RequestMethod.GET)
	public ModelAndView showAllUserPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("AllUser");
		mv.addObject("streamList", stream.findAll());
		return mv;
	}

	@Autowired
	CourseRepository CourseRepository;

	@RequestMapping(value = "/StreamCourseTypeCourses", method = RequestMethod.POST)
	public @ResponseBody List<Course> showCourse(@RequestParam("streamId") String streamId,
			@RequestParam("courseTypeId") String courseTypeId) {
		return CourseRepository.findByCourseTypeIdAndName(Integer.parseInt(courseTypeId), Integer.parseInt(streamId));
	}

	@Autowired
	BatchDetialsRepository batchDetialsRepository;

	@RequestMapping(value = "/BatchNames", method = RequestMethod.POST)
	public @ResponseBody List<?> showCourse(@RequestParam("courseId") String courseId) {
		List<BatchDetails> list = batchDetialsRepository.findAll();

		for (BatchDetails batchDetails : list) {
			if (batchDetails.getMappingCourse().getCourseId() != Integer.parseInt(courseId)) {
				list.remove(batchDetails);
			}
		}
		return list;
	}

}
