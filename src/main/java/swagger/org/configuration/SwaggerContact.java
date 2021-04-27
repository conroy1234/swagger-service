package swagger.org.configuration;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;

public interface SwaggerContact {

	Set<String> DEFAULT_PRODUCE_AND_CONSUME = new HashSet<String>(Arrays.asList("application/jasn", "application/xml"));

	Contact DEFAULT_CONTACT = new Contact("conroy white", "http://www.testing.com", "conroyaw@gmail.com");
	ApiInfo DEFAULT_API_INFO = new ApiInfo("TEST DOCUMENT", "SWAGGER TEST", "1.0", "urn:tos", DEFAULT_CONTACT,
			"Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
}
