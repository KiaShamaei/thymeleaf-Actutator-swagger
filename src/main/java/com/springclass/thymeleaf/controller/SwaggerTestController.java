package com.springclass.thymeleaf.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Tag(name = "list of product" ,description = "this is test of swagger")
public class SwaggerTestController {
    @GetMapping("/product")
    public String getString(){
        return "helloWorld!";
    }
    @GetMapping("/product2")
    @Operation(summary = "this method return a string")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200" , description = "ok kia"),
            @ApiResponse(responseCode = "400" , description = "bad response kia")
    })
    public String getString2(){
        return "hello world!";
    }
}
