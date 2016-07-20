package com.github.onsdigital.babbage.controller;

import org.apache.http.client.fluent.Request;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class DataController {

    @RequestMapping("**/data")
    public String getData(HttpServletRequest request) throws IOException {

        String uri = request.getRequestURI().toString();

        String response = Request.Get("https://www.ons.gov.uk" + uri)
                .execute()
                .returnContent()
                .asString();

        return response;

//        return "WHERES MY DATA";
    }
}

