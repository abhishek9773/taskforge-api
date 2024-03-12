package com.api.taskforge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.taskforge.model.Product;
import com.api.taskforge.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductRepository productRepo;

  @Override
  public Product saveProduct(Product product) {
    return productRepo.save(product);
  }

  @Override
  public List<Product> getallproduct() {
    return productRepo.findAll();
  }

  @Override
  public Product getProductById(Integer id) {
    return productRepo.findById(id).get();
  }

  @Override
  public String deleteproduct(Integer id) {
    Product product = productRepo.findById(id).get();

    if (product != null) {
      productRepo.delete(product);
      return "Product Delete Sucessfully";
    }

    return "Something is wrong";
  }

}
