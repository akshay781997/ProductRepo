package com.ap;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
class OrderServiceApplicationTests {
	
	MySQLContainer mySQLContainer=new MySQLContainer();

	@Test
	void contextLoads() {
	}

}
