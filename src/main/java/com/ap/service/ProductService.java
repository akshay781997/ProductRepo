package com.ap.service;


import java.util.List;

import com.ap.dto.ProductRequest;
import com.ap.dto.ProductResponse;

public interface ProductService {
		
	public void createProduct(ProductRequest productRequest);

	public List<ProductResponse> getAllProduct();

}
