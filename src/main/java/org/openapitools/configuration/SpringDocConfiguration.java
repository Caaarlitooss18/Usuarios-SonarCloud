package org.openapitools.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "org.openapitools.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("TubeFlix - Gestion de Usuarios - OpenAPI 3.0")
                                .description("Es la descripción del microservicio de Usuarios para la aplicacion de video online. En el se definen las operaciones que se realizarán sobre los usuarios asi como sus propiedades.")
                                .version("1.0.0")
                )
        ;
    }
}