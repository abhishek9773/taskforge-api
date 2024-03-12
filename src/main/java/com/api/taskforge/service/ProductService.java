package com.api.taskforge.service;

import java.util.List;

import com.api.taskforge.model.Product;

public interface ProductService {

  public Product saveProduct(Product product);

  public List<Product> getallproduct();

  public Product getProductById(Integer id);

  public String deleteproduct(Integer id);
}
