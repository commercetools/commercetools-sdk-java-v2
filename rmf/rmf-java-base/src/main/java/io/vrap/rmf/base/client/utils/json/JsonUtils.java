
package io.vrap.rmf.base.client.utils.json;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;
import io.vrap.rmf.base.client.utils.json.modules.SubTypeModule;
import io.vrap.rmf.base.client.utils.json.modules.ZonedDateTimeDeserializationModule;
import io.vrap.rmf.base.client.utils.json.modules.ZonedDateTimeSerializationModule;
import io.vrap.rmf.base.client.utils.json.modules.deserializers.LocalDateDeserializationModule;

/**
 * Class with methods to customize the JSON serialization/deserialization
 */
public class JsonUtils {

    private static class ObjectMapperHolder {
        static final ObjectMapper OBJECT_MAPPER = createObjectMapper();
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

        return JsonMapper.builder()
                .addModule(new JavaTimeModule()) //provides serialization and deserialization for LocalDate and LocalTime (JSR310 Jackson module)
                .addModule(new ZonedDateTimeSerializationModule()) //custom serializer for LocalDate, LocalTime and ZonedDateTime
                .addModule(new ZonedDateTimeDeserializationModule()) //custom deserializer for ZonedDateTime
                .addModule(new LocalDateDeserializationModule()) //custom deserializer for LocalDate
                .addModule(new SubTypeModule("com.commercetools"))
                .addModules(loader)
                .addModules(moduleList)
                .serializationInclusion(JsonInclude.Include.NON_NULL) //ignore null fields
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                .configure(DeserializationFeature.USE_LONG_FOR_INTS, true)
                .configure(MapperFeature.REQUIRE_TYPE_ID_FOR_SUBTYPES, false)
                .build();
    }

    /**
     * serializes the given object to JSON as a byte array
     * @param value object to be serialized
     * @return json byte array
     * @throws JsonProcessingException serialization errors
     */
    public static byte[] toJsonByteArray(final Object value) throws JsonProcessingException {
        return getConfiguredObjectMapper().writeValueAsBytes(value);
    }

    /**
     * serializes the given object to JSON as a byte array
     * @param value object to be serialized
     * @return json string
     * @throws JsonProcessingException serialization errors
     */
    public static String toJsonString(final Object value) throws JsonProcessingException {
        return getConfiguredObjectMapper().writeValueAsString(value);
    }

    /**
     * deserializes the given json string to the given class
     * @param clazz class to serialize to
     * @param content json as string
     * @param <T> type of the result
     * @return deserialized object
     */
    public static <T> T fromJsonString(final String content, final Class<T> clazz) {
        return executing(() -> getConfiguredObjectMapper().readValue(content, clazz));
    }

    /**
     * Reads a Java object from JSON data (String).
     *
     * @param jsonAsString  the JSON data which represents sth. of type {@code <T>}
     * @param typeReference the full generic type information about the object to create
     * @param <T>           the type of the result
     * @return the created objected
     */
    public static <T> T fromJsonString(final String jsonAsString, final TypeReference<T> typeReference) {
        return executing(() -> getConfiguredObjectMapper().readValue(jsonAsString, typeReference));
    }

    /**
     * Reads a Java object from JsonNode data.
     * <p>
     *
     * @param jsonNode      the JSON data which represents sth. of type {@code <T>}
     * @param typeReference the full generic type information about the object to create
     * @param <T>           the type of the result
     * @return the created objected
     */
    public static <T> T fromJsonNode(final JsonNode jsonNode, final TypeReference<T> typeReference) {
        return executing(() -> getConfiguredObjectMapper().readerFor(typeReference).readValue(jsonNode));
    }

    /**
     * Converts a commercetools Composable Commerce Java object to JSON as {@link JsonNode}.
     * <p>If {@code value} is of type String and contains JSON data, that will be ignored, {@code value} will be treated as just any String.
     * If you want to parse a JSON String to a JsonNode use {@link JsonUtils#parse(java.lang.String)} instead.</p>
     * <p>
     *
     * @param value the object to convert
     * @return new json
     */
    public static JsonNode toJsonNode(final Object value) {
        return getConfiguredObjectMapper().valueToTree(value);
    }

    /**
     * Parses a String containing JSON data and produces a {@link JsonNode}.
     *
     * @param jsonAsString json data
     * @return new JsonNode
     */
    public static JsonNode parse(final String jsonAsString) {
        return executing(() -> getConfiguredObjectMapper().readTree(jsonAsString));
    }

    /**
     * deserializes the given json string to the given class
     * @param clazz class to serialize to
     * @param content json as byte array
     * @return deserialized object
     * @throws JsonException deserialization errors
     * @param <T> type of the result
     */
    public static <T> T fromJsonByteArray(final byte[] content, final Class<T> clazz) {
        return executing(() -> getConfiguredObjectMapper().readValue(content, clazz));
    }

    /**
     * deserializes the given json string to the given class
     * @param clazz class to serialize to
     * @param content json as inputstream
     * @return deserialized object
     * @throws JsonException deserialization errors
     * @param <T> type of the result
     */
    public static <T> T fromInputStream(final InputStream content, final Class<T> clazz) {
        return executing(() -> getConfiguredObjectMapper().readValue(content, clazz));
    }

    /**
     * deserializes the given json string to the given class
     * @param typeReference the full generic type information about the object to create
     * @param content json as inputstream
     * @return deserialized object
     * @throws JsonException deserialization errors
     * @param <T> type of the result
     */
    public static <T> T fromInputStream(final InputStream content, final TypeReference<T> typeReference) {
        return executing(() -> getConfiguredObjectMapper().readValue(content, typeReference));
    }

    /**
     * Reads a UTF-8 JSON text file from the classpath of the current thread and transforms it into a Java object.
     *
     * @param resourcePath  the path to the resource. Example: If the file is located in "src/test/resources/foo/bar/product.json" then the path should be "foo/bar/product.json"
     * @param typeReference the full generic type information about the object to create
     * @param <T>           the type of the result
     * @return the created objected
     */
    public static <T> T readObjectFromResource(final String resourcePath, final TypeReference<T> typeReference) {
        return executing(() -> {
            final InputStream resourceAsStream = Thread.currentThread()
                    .getContextClassLoader()
                    .getResourceAsStream(resourcePath);
            return getConfiguredObjectMapper()
                    .readValue(new InputStreamReader(resourceAsStream, StandardCharsets.UTF_8.name()), typeReference);
        });
    }

    public static <T> T readObjectFromResource(final String resourcePath, final JavaType javaType) {
        return executing(() -> {
            final InputStream resourceAsStream = Thread.currentThread()
                    .getContextClassLoader()
                    .getResourceAsStream(resourcePath);
            return getConfiguredObjectMapper()
                    .readValue(new InputStreamReader(resourceAsStream, StandardCharsets.UTF_8.name()), javaType);
        });
    }

    public static <T> T readObjectFromResource(final String resourcePath, final Class<T> clazz) {
        return executing(() -> {
            final InputStream resourceAsStream = Thread.currentThread()
                    .getContextClassLoader()
                    .getResourceAsStream(resourcePath);
            return getConfiguredObjectMapper()
                    .readValue(new InputStreamReader(resourceAsStream, StandardCharsets.UTF_8.name()), clazz);
        });
    }

    /**
     * default {@link ObjectMapper}
     * @return ObjectMapper
     */
    public static ObjectMapper getConfiguredObjectMapper() {
        return ObjectMapperHolder.OBJECT_MAPPER;
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

    public static <T> T executing(final SupplierThrowingIOException<T> supplier) {
        try {
            return supplier.get();
        }
        catch (final IOException e) {
            throw new JsonException(e);
        }
    }

    @FunctionalInterface
    public interface SupplierThrowingIOException<T> {
        T get() throws IOException;
    }
}
