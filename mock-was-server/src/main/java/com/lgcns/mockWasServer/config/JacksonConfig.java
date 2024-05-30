package com.lgcns.mockWasServer.config;

import java.time.format.DateTimeFormatter;

import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

@Configuration
public class JacksonConfig {

	// @Bean
	// public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
	// 	MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
	// 	ObjectMapper objectMapper = new ObjectMapper();
	// 	SimpleModule module = new SimpleModule();
	//
	// 	module.addSerializer(LocalDate.class, new JsonSerializer<LocalDate>() {
	// 		@Override
	// 		public void serialize(LocalDate localDate, JsonGenerator jsonGenerator,
	// 			SerializerProvider serializerProvider) throws IOException {
	//
	// 			jsonGenerator.writeString(DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDate));
	// 		}
	// 	});
	//
	// 	objectMapper.registerModule(module);
	// 	jsonConverter.setObjectMapper(objectMapper);
	//
	// 	return jsonConverter;
	// }

	@Bean
	public Jackson2ObjectMapperBuilderCustomizer jackson2ObjectMapperBuilderCustomizer() {
		return jacksonObjectMapperBuilder -> {
			DateTimeFormatter localDateSerializeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

			jacksonObjectMapperBuilder.serializers(new LocalDateSerializer(localDateSerializeFormatter));
		};
	}
}
