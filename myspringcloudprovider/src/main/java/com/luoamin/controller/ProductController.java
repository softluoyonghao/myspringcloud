package com.luoamin.controller;

import com.luoamin.service.ProductService;
import com.luoamin.vo.Product;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Resource
    private ProductService productService;

    @RequestMapping(value="/get/{id}")
    public Object get(@PathVariable("id") long id) {
        return this.productService.get(id) ;
    }
    @RequestMapping(value="/add")
    public Object add(@RequestBody Product product) {
        return this.productService.add(product) ;
    }
    @RequestMapping(value="/list")
    public List list() {

        List obj= this.productService.list() ;
        return obj;
    }

}