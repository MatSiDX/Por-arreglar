package pe.org.chaclacayo.pyfinal2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author admin
 */
@Controller
public class HomeController {

    @GetMapping
    public String index() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "formRegister";
    }

}
