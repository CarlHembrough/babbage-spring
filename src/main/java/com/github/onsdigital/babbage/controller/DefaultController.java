package com.github.onsdigital.babbage.controller;

import com.github.onsdigital.babbage.LocaleConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Controller
public class DefaultController {
    @RequestMapping("**")
    public ModelAndView renderPage(Locale locale) {

        // get data based URL

        // read the page type to determine the view


        Map<String, Object> model = new HashMap<>();
        model.put("labels", LocaleConfig.getLabels(locale));


        return new ModelAndView("home", model);

//        try {
//           // RequestDelegator.get(request, response);
//        } catch (Throwable e) {
//            //new ErrorHandler().handle(request, response, null, e);
//        }
//        return null;
        //return "GO RENDER THE PAGE";
    }
}
