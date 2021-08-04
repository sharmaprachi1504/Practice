package com.test.project1.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController {
	@RequestMapping("add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		int a = Integer.parseInt(request.getParameter("t1"));
		int b = Integer.parseInt(request.getParameter("t2"));

		int c = a + b;
		mv.setViewName("resultpage");
		mv.addObject("result", c);

		return mv;
	}

	@RequestMapping("subtract")
	public ModelAndView subtract(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		int a = Integer.parseInt(request.getParameter("t1"));
		int b = Integer.parseInt(request.getParameter("t2"));

		int c = a - b;
		mv.setViewName("resultpage");
		mv.addObject("result", c);

		return mv;
	}

	@RequestMapping("multiply")
	public ModelAndView multiply(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		int a = Integer.parseInt(request.getParameter("t1"));
		int b = Integer.parseInt(request.getParameter("t2"));

		int c = a * b;
		mv.setViewName("resultpage");
		mv.addObject("result", c);

		return mv;
	}

	@RequestMapping("divide")
	public ModelAndView divide(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		int a = Integer.parseInt(request.getParameter("t1"));
		int b = Integer.parseInt(request.getParameter("t2"));

		int c = a / b;
		mv.setViewName("resultpage");
		mv.addObject("result", c);

		return mv;
	}

}
