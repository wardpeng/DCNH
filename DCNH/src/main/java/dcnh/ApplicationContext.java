package dcnh;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
@MapperScan("dcnh.mapper")
public class ApplicationContext {
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationContext.class, args);
		
	}
}
