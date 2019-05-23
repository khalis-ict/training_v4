/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ict.khalis.training_v4.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author Khalis
 */
@Controller
public class ProductController {
    @GetMapping("/")
    public String list(){
        return "products";
    }
}
