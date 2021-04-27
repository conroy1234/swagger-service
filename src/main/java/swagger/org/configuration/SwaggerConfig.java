package swagger.org.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig implements SwaggerContact{
	

	@Bean
	public Docket apiDoch() {		
		
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO)
				.consumes(DEFAULT_PRODUCE_AND_CONSUME).produces(DEFAULT_PRODUCE_AND_CONSUME);
	}

}
