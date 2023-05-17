package io.github.nnkwrik.common.token.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 */
@Configuration
public class SolverConfig implements WebMvcConfigurer {

    @Autowired
    private JWTResolver jwtResolver;

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(jwtResolver);
    }
}
