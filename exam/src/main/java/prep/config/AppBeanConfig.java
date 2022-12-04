package prep.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AppBeanConfig {
    @Bean
   public ModelMapper modelMapper(){
        return new ModelMapper();

    }
}
