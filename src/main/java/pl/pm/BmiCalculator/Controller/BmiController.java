package pl.pm.BmiCalculator.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.pm.BmiCalculator.BmiModel;

@Controller
public class BmiController {


    @GetMapping("/")
    public String home(){return "home";}

    @PostMapping("/calculate")
    public String calculate(@ModelAttribute BmiModel bmiModel, ModelMap modelMap){
        modelMap.addAttribute("result", bmiModel.bmi(bmiModel.getHeight(), bmiModel.getWeight()));
        return "home";
    }
}
