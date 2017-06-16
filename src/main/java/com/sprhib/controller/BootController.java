package com.sprhib.controller;

import com.sprhib.model.Boot;
import com.sprhib.model.Product;
import com.sprhib.service.BootService;
import com.sprhib.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Ja on 16.06.2017.
 */
@RequestMapping("/buty")
@Controller
public class BootController {

    @Autowired
    private BootService bootService;

    @RequestMapping
    public String list(Model model) {
        model.addAttribute("boots", bootService.getBoots());
        return "boots";
    }


    @RequestMapping("/buty")
    public String getProductById(@RequestParam("id") Integer bootId, Model model) {
        model.addAttribute("boot", bootService.getBoot(bootId));
        model.addAttribute("boots1", bootService.getBoots());
        return "boot";
    }
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getAddNewProductForm(Model model) {
        Boot newProduct = new Boot();
        model.addAttribute("newBoot", newProduct);
        return "addBoot";
    }

    @RequestMapping(value = "/add", method =RequestMethod.POST)
    public String processAddNewProductForm(@ModelAttribute Boot newBoot, BindingResult result) {
        String[] suppressedFields = result.getSuppressedFields();
        if (suppressedFields.length > 0) {
            throw new RuntimeException("Próba wiązania niedozwolonych pól:" + StringUtils.arrayToCommaDelimitedString(suppressedFields));
        }


        System.out.println("nowy produkt to: "+newBoot.getModel()+" id: "+newBoot.getIdboots());
        bootService.addBoot(newBoot);
        return "redirect:/buty";
    }

    @ModelAttribute("genderList")
    public Map<String, String> genderList()
    {
        Map<String,String> genderList = new LinkedHashMap<String,String>();
        genderList.put("K", "Kobieta");
        genderList.put("M", "Mężczyzna");
        genderList.put("U", "Unisex");
        return genderList;
    }


    @InitBinder
    public void initialiseBinder(WebDataBinder binder) {
        //binder.setDisallowedFields("unitsInOrder", "discontinued");
        binder.setAllowedFields("idboots", "brand", "model", "product_code", "gender", "color", "category", "description", "price", "size");
    }

}
