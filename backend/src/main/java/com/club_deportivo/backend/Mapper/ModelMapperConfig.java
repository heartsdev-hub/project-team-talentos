package com.club_deportivo.backend.Mapper;

import com.club_deportivo.backend.DTO.UsuarioDTO.UsuarioCreateDTO;
import com.club_deportivo.backend.DTO.UsuarioDTO.UsuarioResponseDTO;
import com.club_deportivo.backend.Entity.Usuario;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper modelMapper (){
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        modelMapper.createTypeMap(Usuario.class, UsuarioResponseDTO.class);
        modelMapper.createTypeMap(UsuarioCreateDTO.class, Usuario.class);
        return modelMapper;
    }
}
