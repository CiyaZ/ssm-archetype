#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import ${package}.bean.User;
import ${package}.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Test index page controller
 *
 * @author CiyaZ
 */
@Controller
public class IndexController
{
	private final TestService testService;

	@Autowired
	public IndexController(TestService testService)
	{
		this.testService = testService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model)
	{
		User user = testService.getUserById(1L);
		model.addAttribute("user", user);
		return "index";
	}
}
