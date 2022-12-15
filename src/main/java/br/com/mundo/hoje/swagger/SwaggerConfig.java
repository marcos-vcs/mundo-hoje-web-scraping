package br.com.mundo.hoje.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Mundo-hoje web scraping")
                .description("This project does the web scraping of the IBGE (Brazilian Institute of Geography and Statistics) news open API.")
                .version("1.0.0")
                .license("MIT License")
                .licenseUrl("https://github.com/marcos-vcs/mundo-hoje-web-scraping/blob/main/LICENSE")
                .contact(new Contact("Marcos Sousa", "https://github.com/marcos-vcs", "marcosviniciocardoso123@gmail.com"))
                .build();
    }
}
