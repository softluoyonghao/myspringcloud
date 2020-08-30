package com.luoamin.service.impl;


import com.luoamin.mapper.ProductMapper;
import com.luoamin.service.ProductService;
import com.luoamin.vo.Product;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public Product get(long id) {
        return productMapper.findById(id);
    }

    @Override
    public boolean add(Product product) {
        return productMapper.create(product);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }
}