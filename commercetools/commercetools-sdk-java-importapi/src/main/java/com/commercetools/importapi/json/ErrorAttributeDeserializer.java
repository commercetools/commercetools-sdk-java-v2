
package com.commercetools.importapi.json;

import java.io.IOException;
import java.util.Map;

import com.commercetools.importapi.models.productvariants.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;

public class ErrorAttributeDeserializer extends JsonDeserializer<Attribute> {
    protected ErrorAttributeDeserializer() {
    }

    @Override
    public Attribute deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        JsonNode node = p.readValueAsTree();
        JsonNode valueNode = node.get("value");

        JsonNodeType valueNodeType = node.getNodeType();
        switch (valueNodeType) {
            case BOOLEAN:
                return BooleanAttributeBuilder.of()
                        .name(node.get("name").asText())
                        .value(valueNode.get("value").asBoolean())
                        .build();

            case NUMBER:
                return NumberAttributeBuilder.of()
                        .name(node.get("name").asText())
                        .value(valueNode.get("value").asDouble())
                        .build();
            case STRING:
                return TextAttributeBuilder.of()
                        .name(node.get("name").asText())
                        .value(valueNode.get("value").asText())
                        .build();
            case OBJECT:
                if (valueNode.has("key") && valueNode.has("label")) {
                    JsonNode label = valueNode.get("label");
                    if (label.getNodeType() == JsonNodeType.OBJECT) {
                        return LocalizableEnumAttributeBuilder.of()
                                .name(node.get("name").asText())
                                .value(valueNode.get("value").asText())
                                .build();
                    }
                    ;
                    return EnumAttributeBuilder.of()
                            .name(node.get("name").asText())
                            .value(valueNode.get("label").asText())
                            .build();
                }
                ;
                //                if (valueNode.has("currencyCode")) {
                //                    return new TypeReference<TypedMoney>() {
                //                    };
                //                }
                //                if (valueNode.has("typeId")) {
                //                    return new TypeReference<Reference>() {
                //                    };
                //                }
                //                if (valueNode.has("value")) {
                //                    return new TypeReference<Attribute>() {
                //                    };
                //                }
                Map.Entry<String, JsonNode> nodeEntry = valueNode.fields().next();
                return LocalizableTextAttributeBuilder.of()
                        .name(node.get("name").asText())
                        .value(localizedStringBuilder -> localizedStringBuilder.addValue(nodeEntry.getKey(),
                            nodeEntry.getValue().asText()))
                        .build();

            default:
                return new AttributeImpl();
        }
    }
}
