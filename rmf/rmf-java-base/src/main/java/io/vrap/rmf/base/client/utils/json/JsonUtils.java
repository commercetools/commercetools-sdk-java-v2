
package io.vrap.rmf.base.client.utils.json;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import io.vrap.rmf.base.client.utils.json.modules.ZonedDateTimeDeserializationModule;
import io.vrap.rmf.base.client.utils.json.modules.ZonedDateTimeSerializationModule;

public class JsonUtils {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static {
        ServiceLoader<SimpleModule> loader = ServiceLoader.load(SimpleModule.class,
            SimpleModule.class.getClassLoader());

        OBJECT_MAPPER.registerModule(new JavaTimeModule()) //provides serialization and deserialization for LocalDate and LocalTime (JSR310 Jackson module)
                .registerModule(new ZonedDateTimeSerializationModule()) //custom serializer for LocalDate, LocalTime and ZonedDateTime
                .registerModule(new ZonedDateTimeDeserializationModule()) //custom deserializer for ZonedDateTime
                .registerModules(loader).setSerializationInclusion(JsonInclude.Include.NON_NULL) //ignore null fields
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).configure(
                    SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

    public static byte[] toJsonByteArray(Object value) throws JsonProcessingException {
        return OBJECT_MAPPER.writeValueAsBytes(value);
    }

    public static String toJsonString(Object value) throws JsonProcessingException {
        return OBJECT_MAPPER.writeValueAsString(value);
    }

    public static <T> T fromJsonString(String content, Class<T> clazz) throws IOException {
        return OBJECT_MAPPER.readValue(content, clazz);
    }

    public static <T> T fromJsonByteArray(byte[] content, Class<T> clazz) throws IOException {
        return OBJECT_MAPPER.readValue(content, clazz);
    }

    public static <T> T fromInputStream(InputStream content, Class<T> clazz) throws IOException {
        return OBJECT_MAPPER.readValue(content, clazz);
    }

    public static ObjectMapper getConfiguredObjectMapper() {
        return OBJECT_MAPPER;
    }

    /**
     * Very simple way to "erase" passwords -
     * replaces all field values whose names contains {@code 'pass'} by {@code '**removed from output**'}.
     */
    private static JsonNode secure(JsonNode node) {
        if (node.isObject()) {
            ObjectNode objectNode = (ObjectNode) node;
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> field = fields.next();
                if (field.getValue().isTextual() && (field.getKey().toLowerCase().contains("pass")
                        || field.getKey().toLowerCase().contains("access_token"))) {
                    objectNode.put(field.getKey(), "**removed from output**");
                }
                else {
                    secure(field.getValue());
                }
            }
            return objectNode;
        }
        else if (node.isArray()) {
            ArrayNode arrayNode = (ArrayNode) node;
            Iterator<JsonNode> elements = arrayNode.elements();
            while (elements.hasNext()) {
                secure(elements.next());
            }
            return arrayNode;
        }
        else {
            return node;
        }
    }

    /**
     * Pretty prints a given JSON string.
     *
     * @param json JSON code as String which should be formatted
     * @return <code>json</code> formatted
     */
    public static String prettyPrint(final String json) {
        return executing(() -> {
            final ObjectMapper jsonParser = new ObjectMapper();
            final JsonNode jsonTree = jsonParser.readValue(json, JsonNode.class);
            secure(jsonTree);
            final ObjectWriter writer = jsonParser.writerWithDefaultPrettyPrinter();
            return writer.writeValueAsString(jsonTree);
        });
    }

    private static <T> T executing(final SupplierThrowingIOException<T> supplier) {
        try {
            return supplier.get();
        }
        catch (final IOException e) {
            throw new JsonException(e);
        }
    }

    @FunctionalInterface
    private interface SupplierThrowingIOException<T> {
        T get() throws IOException;
    }
}
