package com.sprhib.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import com.sprhib.model.Boot;


/**
 * Created by Ja on 16.06.2017.
 */
public class DropDownBootController extends BootController{

    //public DropDownBootController(){
    //    setCommandClass(Boot.class);
     //   setCommandName("newBoot");
    //}

    protected Map referenceData(HttpServletRequest request) throws Exception {

        Map referenceData = new HashMap();

        Map<String,String> gender = new LinkedHashMap<String,String>();
        gender.put("K", "Kobieta");
        gender.put("M", "Mężczyzna");
        gender.put("U", "Unisex");
        referenceData.put("genderList", gender);

        Map<String,String> javaSkill = new LinkedHashMap<String,String>();
        javaSkill.put("Hibernate", "Hibernate");
        javaSkill.put("Spring", "Spring");
        javaSkill.put("Apache Wicket", "Apache Wicket");
        javaSkill.put("Struts", "Struts");
        referenceData.put("javaSkillsList", javaSkill);

        return referenceData;
    }
}
