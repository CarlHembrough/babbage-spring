package com.github.onsdigital.babbage.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrollController {

        @RequestMapping("/troll")
        public String greeting() {
                return "<code>░░░░░░░░▄▀▀████████▀██████▄▄▄▄▄▄░░░░░░░░</br>\n" +
                        "░░░░░░▄▀░▄▀░░▄▄▄▄▄░▀▄▄▄▄▄▄▀▀▀▄▄░▀▄░░░░░░</br>\n" +
                        "░░░░▄▀░░▀░▄▄▀░░░░░▀█▄░░░▄▀▀▀▀▄▀▀░░█░░░░░</br>\n" +
                        "░░░▄▀░░░░▄▀░▄███▀▀▄░▀░░█░▄▄▄▄▄░░▄▄█▄░░░░</br>\n" +
                        "░▄▀░░▄▀▀▄░░▀▀░▄▀▀▀██░░░██▀▀▀░▀▀░▀▀▀██▄░░</br>\n" +
                        "█░░▄▀░▄▄░▀▀░▀▀░░▄░▄▄░░░░█▄░░▄▄▀▀▀█▄░██░░</br>\n" +
                        "▀░░▀░▀▀░▀▀░░░░░▀░▀░░░░░░░▀▀▀░░░░░░░░░░░░</br>\n" +
                        "▄▄▄▄░░▄▄▄▄░░░▄▄▄░░▄▄▄▄░░▄▄░░░▄▄▄░▄▄░░░▄▄</br>\n" +
                        "██░██░██░██░██░██░██▄█▀░██░░░██▄░███▄███</br>\n" +
                        "██▀▀░░██▀█▄░██░██░██░██░██░░░██▀░██▀█▀██</br>\n" +
                        "██░░░░██░██░▀█▄█▀░████▀░████░███░██░░░██</br>\n" +
                        "░░░░░░░░░░░░░░░░░░░▄▄▄▄░░░░░░░░░░░░░░░░░</br>\n" +
                        "░░░░░░░░░░░░░░░░▄███▀▀▀██▄░░░░░░░░░░░░░░</br>\n" +
                        "░░░░░░░░░░░░░░░░███░░░░░███░░░░░░░░░░░░░</br>\n" +
                        "░░░░░░░░░░░░░░░░░░░░▄▄▄██▀░░░░░░░░░░░░░░</br>\n" +
                        "░░░░░░░░░░░░░░░░░░░██▀▀░░░░░░░░░░░░░░░░░</br>\n" +
                        "░░░░░░░░░░░░░░░░░░░██░░░░░░░░░░░░░░░░░░░</br>\n" +
                        "░░░░░░░░░░░░░░░░░░░▄▄░░░░░░░░░░░░░░░░░░░</br>\n" +
                        "░░░░░░░░░░░░░░░░░░░▀▀░░░░░░░░░░░░░░░░░░░</code>";
        }


        @RequestMapping("/troll/whatever")
        public String greeting2() {
                return "troll whatever";
        }

        @RequestMapping("/troll/whatever/**")
        public String greeting3() {
                return "troll WOOOOO";
        }

}
