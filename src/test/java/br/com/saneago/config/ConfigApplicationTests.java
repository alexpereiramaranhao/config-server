package br.com.saneago.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.sanego.config.ConfigApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConfigApplication.class)
@WebAppConfiguration
public class ConfigApplicationTests {

	@Test
	public void contextLoads() {
	}

}
