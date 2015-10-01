package priycf;

import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Priyanka Sekhar
 *
 */
@Controller
public class WebController extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/results").setViewName("results");
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "index";
	}

	@RequestMapping(value = "/dropouts.html", method = RequestMethod.GET)
	public String showDropOuts(Model model) {
		Country country = new Country();

		model.addAttribute("ctry", country);
		return "dropouts";
	}

	@RequestMapping(value = "/dropouts.html", method = RequestMethod.POST)
	public String showDropSubmit(@ModelAttribute Country country, Model model) {
		AggregatedMetrics fe = new AggregatedMetrics();
		String x = fe.getDropOut(country.getCtryname());
		country.setDropoutrate(x);
		model.addAttribute("ctry", country);
		return "dropoutresult";
	}

	@RequestMapping(value = "/benefactor.html", method = RequestMethod.GET)
	public String showBenefactor(Person person) {
		return "benefactor";
	}

	@RequestMapping(value = "/report.html", method = RequestMethod.GET)
	public String showForm(Report report) {
		return "report";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String checkPersonInfo(@Valid Report report, BindingResult bindingResult) {
		// if (bindingResult.hasErrors()) {
		// return "report";
		// }
		return "redirect:/results";
	}
}
