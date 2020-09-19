/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kkebabci.tweetanalyser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lenovo
 */

@RestController
public class ApiController {
    
    @GetMapping("/health-check")
    String healthCheck() {
        return "OK";
    }
}
