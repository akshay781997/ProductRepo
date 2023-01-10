package com.ap.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.dto.ProductRequest;
import com.ap.dto.ProductResponse;
import com.ap.model.Product;
import com.ap.repository.ProductRepository;
import com.ap.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void createProduct(ProductRequest productRequest) {
		
		Product product=Product.builder().
				name(productRequest.getName())
				.description(productRequest.getDescription())
				.price(productRequest.getPrice()).build();
		
		productRepository.save(product);
		log.info("product "+product.getId()+" is created");
		
	}

	@Override
	public List<ProductResponse> getAllProduct() {
		
		List<Product> product = productRepository.findAll();
		
		List<ProductResponse> list = product.stream().map(this::mapToProductResponse).toList();
			
		return list;
		
	 
	}
	
	public ProductResponse mapToProductResponse(Product product)
	{
		return ProductResponse.builder()
				.id(product.getId())
				.name(product.getName())
				.description(product.getDescription())
				.price(product.getPrice()).build();
	}
	
	

}
