package json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import json.modules.ZonedDateTimeDeserializationModule;
import json.modules.ZonedDateTimeSerializationModule;

import java.io.IOException;

public final class CommercetoolsJsonUtils {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static {
        OBJECT_MAPPER
                .registerModule(new JavaTimeModule()) //provides serialization and deserialization for LocalDate and LocalTime (JSR310 Jackson module)
                .registerModule(new ZonedDateTimeSerializationModule()) //custom serializer for LocalDate, LocalTime and ZonedDateTime
                .registerModule(new ZonedDateTimeDeserializationModule()) //custom deserializer for ZonedDateTime
                .setSerializationInclusion(JsonInclude.Include.NON_NULL) //ignore null fields
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }
    
    public static String toJsonString(Object value) throws JsonProcessingException {
        return OBJECT_MAPPER.writeValueAsString(value);
    }

    public static <T> T fromJsonString(String content, Class<T> clazz) throws IOException {
        return OBJECT_MAPPER.readValue(content, clazz);
    }
    
    public static ObjectMapper getConfiguredObjectMapper() {
        return OBJECT_MAPPER;
    }
}
