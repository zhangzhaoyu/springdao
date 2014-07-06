package cn.bjfu.springdao.web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.bjfu.springdao.jpa.domain.execise.Employee;
import cn.bjfu.springdao.jpa.domain.execise.Head;
import cn.bjfu.springdao.jpa.domain.execise.Nose;
import cn.bjfu.springdao.jpa.service.IDocumentService;
import cn.bjfu.springdao.jpa.service.IEmployeeService;
import cn.bjfu.springdao.jpa.service.IHeadNoseService;
import cn.bjfu.springdao.jpa.service.IParkingSpaceService;
import cn.bjfu.springdao.jpa.service.IUserService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = Logger.getLogger(HomeController.class);
	@Autowired
	private IUserService userService;
	@Autowired
	private IDocumentService documentService;
	@Autowired
	private IEmployeeService employeeService;
	@Autowired
	private IParkingSpaceService spaceService;
	
	@Autowired
	private IHeadNoseService headNoseService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		
		/*Head head = new Head();
		head.setName("head02");
		Nose nose = new Nose();
		nose.setName("nose02");
		this.headNoseService.save(nose);
		head.setNose(nose);
		
		this.headNoseService.save(head);*/
		
		//List<Head> list = this.headNoseService.findAll();
		//System.out.println(list);
		System.out.println("----------------------------");
		Nose noses = this.headNoseService.findNoseById(1);
		System.out.println(noses + "head : " + noses.getHead());
		
		Nose nose = new Nose();
		nose.setName("nose03");
		
		this.headNoseService.save(nose);
		
		List<Employee> listEmp = employeeService.findAllEmployees();
		System.out.println(listEmp);
		model.addAttribute("serverTime", formattedDate );
		return "home";
	}
	
}
