/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.org.chaclacayo.pyfinal2.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pe.org.chaclacayo.pyfinal2.entity.Registro;
import pe.org.chaclacayo.pyfinal2.servicios.RegistroService;

/**
 *
 * @author Asus
 */
@Controller
@RequestMapping("/reg")
public class RegistroController {

    @Autowired
    private RegistroService registroService;
    @GetMapping("/all")
    public String listarReg(Model model){
        model.addAttribute("registro1", registroService.readAll());
        return "reg/listarRegi";
    }

    @GetMapping("/form")
    public String createReg(Model model){
        model.addAttribute("titulo", "Registrar Registro");
        model.addAttribute("registro", new Registro());
        return "reg/formReg";
    }
    @PostMapping("/add")
    public String saveReg(@Valid @ModelAttribute Registro Reg, BindingResult result, Model model, RedirectAttributes attributes){
        registroService.create(Reg);
        //model.addAttribute("categorias", categoriaService.readAll());
        return "redirect:/reg/all";
    }
    @GetMapping("/del/{id}")
    public String deleteReg(Model model, @PathVariable("id") Integer idreg ){
        registroService.delete(idreg);
        return "redirect:/reg/all";
    }//PUT,PATCH,GET;DELETE,POST
    @GetMapping("/edit/{id}")
    public String editReg(Model model, @PathVariable("id") Integer idreg ){
        Registro registro = registroService.read(idreg);
        model.addAttribute("titulo", "Modificar Registro");
        model.addAttribute("registro", registro);
        return "reg/formReg";
    }
    @PostMapping("/{id}")
    public String readReg(Model model, @PathVariable("id") Integer idreg ){
        model.addAttribute("reg", registroService.read(idreg));

        return "redirect:/reg";
    }

}
