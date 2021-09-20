
package io.vrap.rmf.base.client.utils.json;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;
import io.vrap.rmf.base.client.utils.json.modules.ZonedDateTimeDeserializationModule;
import io.vrap.rmf.base.client.utils.json.modules.ZonedDateTimeSerializationModule;

/**
 * Class with methods to customize the JSON serialization/deserialization
 */
public class JsonUtils {

    private static final ObjectMapper OBJECT_MAPPER;

    static {
        OBJECT_MAPPER = createObjectMapper();
    }

    /**
     * creates a new {@link ObjectMapper } instance
     * @return ObjectMapper
     */
    public static ObjectMapper createObjectMapper() {
        return createObjectMapper(name -> null);
    }

    /**
     *
     * @param options configuration for jackson modules supplied by a {@link ModuleSupplier}
     * @return ObjectMapper
     */
    public static ObjectMapper createObjectMapper(final ModuleOptions options) {
        ServiceLoader<SimpleModule> loader = ServiceLoader.load(SimpleModule.class,
            SimpleModule.class.getClassLoader());

        ServiceLoader<ModuleSupplier> suppliers = ServiceLoader.load(ModuleSupplier.class,
            ModuleSupplier.class.getClassLoader());
        final List<SimpleModule> moduleList = new ArrayList<>();
        suppliers.iterator().forEachRemaining(moduleSupplier -> moduleList.add(moduleSupplier.getModule(options)));

        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule()) //provides serialization and deserialization for LocalDate and LocalTime (JSR310 Jackson module)
                .registerModule(new ZonedDateTimeSerializationModule()) //custom serializer for LocalDate, LocalTime and ZonedDateTime
                .registerModule(new ZonedDateTimeDeserializationModule()) //custom deserializer for ZonedDateTime
                .registerModules(loader)
                .registerModules(moduleList)
                .setSerializationInclusion(JsonInclude.Include.NON_NULL) //ignore null fields
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        return objectMapper;
    }

    /**
     * serializes the given object to JSON as a byte array
     * @param value object to be serialized
     * @return json byte array
     * @throws JsonProcessingException serialization errors
     */
    public static byte[] toJsonByteArray(final Object value) throws JsonProcessingException {
        return OBJECT_MAPPER.writeValueAsBytes(value);
    }

    /**
     * serializes the given object to JSON as a byte array
     * @param value object to be serialized
     * @return json string
     * @throws JsonProcessingException serialization errors
     */
    public static String toJsonString(final Object value) throws JsonProcessingException {
        return OBJECT_MAPPER.writeValueAsString(value);
    }

    /**
     * deserializes the given json string to the given class
     * @param clazz class to serialize to
     * @param content json as string
     * @return deserialized object
     * @throws IOException deserialization errors
     */
    public static <T> T fromJsonString(final String content, final Class<T> clazz) throws IOException {
        return OBJECT_MAPPER.readValue(content, clazz);
    }

    /**
     * deserializes the given json string to the given class
     * @param clazz class to serialize to
     * @param content json as byte array
     * @return deserialized object
     * @throws IOException deserialization errors
     */
    public static <T> T fromJsonByteArray(final byte[] content, final Class<T> clazz) throws IOException {
        return OBJECT_MAPPER.readValue(content, clazz);
    }

    /**
     * deserializes the given json string to the given class
     * @param clazz class to serialize to
     * @param content json as inputstream
     * @return deserialized object
     * @throws IOException deserialization errors
     */
    public static <T> T fromInputStream(final InputStream content, final Class<T> clazz) throws IOException {
        return OBJECT_MAPPER.readValue(content, clazz);
    }

    /**
     * default {@link ObjectMapper}
     * @return ObjectMapper
     */
    public static ObjectMapper getConfiguredObjectMapper() {
        return OBJECT_MAPPER;
    }

    /**
     * Very simple way to "erase" passwords -
     * replaces all field values whose names contains {@code 'pass'} by {@code '**removed from output**'}.
     * @param node Json object to be redacted
     * @return Json object
     */
    private static JsonNode secure(final JsonNode node) {
        if (node.isObject()) {
            ObjectNode objectNode = (ObjectNode) node;
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> field = fields.next();
                if (field.getValue().isTextual() && (field.getKey().toLowerCase().contains("pass")
                        || field.getKey().toLowerCase().contains("access_token")
                        || field.getKey().toLowerCase().contains("refresh_token"))) {
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
