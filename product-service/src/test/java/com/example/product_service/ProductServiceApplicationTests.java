package com.example.product_service;
/*
import com.example.product_service.dto.ProductRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;
import org.testcontainers.shaded.com.google.common.net.MediaType;

import java.math.BigDecimal;

@SpringBootTest
// to add test containers
@Testcontainers
@AutoConfigureMockMvc
class ProductServiceApplicationTests {

	@Container
	static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:4.4.4");
	@Autowired
	private MockMvc mocMvc;
	@Autowired
	private ObjectMapper objectMapper;

	static void setProperties(DynamicPropertyRegistry dynDynamicPropertyRegistry){
		dynDynamicPropertyRegistry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
	}
	@Test
	void shouldCreateProduct() {
		ProductRequest productRequest = getProductResquest();
		String productRequestString = objectMapper.writeValueAsString(productRequest);
		mocMvc.perform(MockMvcRequestBuilders.post("/api/product"))
				.contentType(MediaType.APPLICATION_JSON)
				.content(productRequestString))
			.andExpect(status().isCreated());
	}

	private ProductRequest getProductResquest(){
		return ProductRequest.builder()
				.name("iPhone 13")
				.description("iPhone 13")
				.price(BigDecimal.valueOf(1200))
				.build();
	}

}
*/