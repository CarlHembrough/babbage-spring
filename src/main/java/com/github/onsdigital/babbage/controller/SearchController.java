package com.github.onsdigital.babbage.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.onsdigital.babbage.model.SearchResponse;
import org.apache.http.client.fluent.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.io.InputStream;

@Controller
public class SearchController {

    @RequestMapping("/search")
    public String getData(@RequestParam(value="q", required=false, defaultValue="") String query,
                          Model model) throws IOException {

        if (query != null && query.length() > 0) {
            String uri = "https://www.ons.gov.uk/search/data?q=" + query;

            InputStream response = Request.Get(uri)
                    .execute()
                    .returnContent()
                    .asStream();

            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            SearchResponse searchResponse = mapper.readValue(response, SearchResponse.class);

            model.addAttribute("search", searchResponse);
            model.addAttribute("query", query);
        }

        return "search";
    }
}
