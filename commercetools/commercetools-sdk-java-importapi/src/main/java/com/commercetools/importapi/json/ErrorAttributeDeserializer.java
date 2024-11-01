
package com.commercetools.importapi.json;

import static com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT;

import java.io.IOException;
import java.util.*;

import com.commercetools.importapi.models.common.*;
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

        JsonNodeType valueNodeType = valueNode.getNodeType();
        switch (valueNodeType) {
            case BOOLEAN:
                return BooleanAttributeBuilder.of()
                        .name(node.get("name").asText())
                        .value(valueNode.asBoolean())
                        .build();

            case NUMBER:
                return NumberAttributeBuilder.of().name(node.get("name").asText()).value(valueNode.asDouble()).build();
            case STRING:
                return TextAttributeBuilder.of().name(node.get("name").asText()).value(valueNode.asText()).build();
            case OBJECT:
                if (valueNode.has("key") && valueNode.has("label")) {
                    JsonNode label = valueNode.get("label");
                    if (label.getNodeType() == OBJECT) {
                        return LocalizableEnumAttributeBuilder.of()
                                .name(node.get("name").asText())
                                .value(valueNode.get("key").textValue())
                                .build();
                    }
                    return EnumAttributeBuilder.of()
                            .name(node.get("name").asText())
                            .value(valueNode.get("key").textValue())
                            .build();
                }
                if (valueNode.has("currencyCode")) {
                    return MoneyAttributeBuilder.of()
                            .name(node.get("name").asText())
                            .value(typedMoneyBuilder -> typedMoneyBuilder.centPrecisionBuilder()
                                    .currencyCode(valueNode.get("currencyCode").asText())
                                    .centAmount(valueNode.get("centAmount").asLong())
                                    .fractionDigits(valueNode.get("fractionDigits").asInt()))
                            .build();
                }
                if (valueNode.has("typeId")) {
                    return ReferenceAttributeBuilder.of()
                            .name(node.get("name").asText())
                            // this is not working because reference contains ID and KeyReference requires ID
                            //                            .value((KeyReference) p.getCodec().treeAsTokens(valueNode).readValueAs(getTypeRef(valueNode.get("typeId").asText())))
                            .value(new KeyReference() {
                                @Override
                                public String getKey() {
                                    return valueNode.get("id").asText();
                                }

                                @Override
                                public ReferenceType getTypeId() {
                                    return getReferenceType(valueNode.get("typeId").asText());
                                }

                                @Override
                                public void setKey(String key) {
                                }
                            })
                            .build();
                }
                return LocalizableTextAttributeBuilder.of()
                        .name(node.get("name").asText())
                        .value(localizedStringBuilder -> {
                            valueNode.fields()
                                    .forEachRemaining(nodeEntry -> localizedStringBuilder.addValue(nodeEntry.getKey(),
                                        nodeEntry.getValue().asText()));
                            return localizedStringBuilder;
                        })
                        .build();
            case ARRAY:
                JsonNode firstElement = valueNode.get(0);
                JsonNodeType firstElementNodeType = firstElement.getNodeType();
                switch (firstElementNodeType) {
                    case STRING:
                        List<String> stringValues = new ArrayList<>();
                        valueNode.elements().forEachRemaining(element -> stringValues.add(element.asText()));
                        return TextSetAttributeBuilder.of().name(node.get("name").asText()).value(stringValues).build();
                    case NUMBER:
                        List<Double> numberValues = new ArrayList<>();
                        valueNode.elements().forEachRemaining(element -> numberValues.add(element.asDouble()));
                        return NumberSetAttributeBuilder.of()
                                .name(node.get("name").asText())
                                .value(numberValues)
                                .build();
                    case BOOLEAN:
                        List<Boolean> booleanValues = new ArrayList<>();
                        valueNode.elements().forEachRemaining(element -> booleanValues.add(element.asBoolean()));
                        return BooleanSetAttributeBuilder.of()
                                .name(node.get("name").asText())
                                .value(booleanValues)
                                .build();
                    case OBJECT:
                        if (firstElement.has("key") && firstElement.has("label")) {
                            List<String> keys = new ArrayList<>();
                            valueNode.iterator()
                                    .forEachRemaining(jsonNode -> jsonNode.fields().forEachRemaining(nodeEntry -> {
                                        String key = nodeEntry.getKey();
                                        if (key.equals("key")) {
                                            keys.add(nodeEntry.getValue().asText());
                                        }
                                    }));
                            JsonNode label = firstElement.get("label");
                            if (label.getNodeType() == OBJECT) {
                                return LocalizableEnumSetAttributeBuilder.of()
                                        .name(node.get("name").asText())
                                        .value(keys)
                                        .build();
                            }
                            return EnumSetAttributeBuilder.of().name(node.get("name").asText()).value(keys).build();
                        }
                        if (firstElement.has("typeId")) {
                            List<KeyReference> keyReferences = new ArrayList<>();
                            valueNode.iterator().forEachRemaining(nodeEntry -> {
                                keyReferences.add(new KeyReference() {
                                    @Override
                                    public String getKey() {
                                        return nodeEntry.get("id").asText();
                                    }

                                    @Override
                                    public ReferenceType getTypeId() {
                                        return getReferenceType(nodeEntry.get("typeId").asText());
                                    }

                                    @Override
                                    public void setKey(String key) {
                                    }
                                });
                            });
                            return ReferenceSetAttributeBuilder.of()
                                    .name(node.get("name").asText())
                                    .value(keyReferences)
                                    .build();
                        }
                        if (firstElement.has("currencyCode")) {
                            List<TypedMoney> values = new ArrayList<>();
                            valueNode.iterator().forEachRemaining(nodeEntry -> {
                                values.add(MoneyBuilder.of()
                                        .currencyCode(nodeEntry.get("currencyCode").asText())
                                        .centAmount(nodeEntry.get("centAmount").asLong())
                                        .fractionDigits(nodeEntry.get("fractionDigits").asInt())
                                        .build());
                            });
                            return MoneySetAttributeBuilder.of().name(node.get("name").asText()).value(values).build();
                        }

                        List<LocalizedString> values = new ArrayList<>();
                        valueNode.iterator().forEachRemaining(jsonNode -> {
                            LocalizedStringBuilder localizedStringBuilder = LocalizedStringBuilder.of();
                            jsonNode.fields()
                                    .forEachRemaining(nodeEntry -> localizedStringBuilder.addValue(nodeEntry.getKey(),
                                        nodeEntry.getValue().asText()));
                            values.add(localizedStringBuilder.build());
                        });
                        return LocalizableTextSetAttributeBuilder.of()
                                .name(node.get("name").asText())
                                .value(values)
                                .build();
                }
            default:
                AttributeImpl attribute = new AttributeImpl();
                attribute.setName(node.get("name").asText());
                return attribute;
        }
    }

    private ReferenceType getReferenceType(String typeId) {
        return Arrays.stream(ReferenceType.ReferenceTypeEnum.values())
                .filter(referenceTypeEnum -> referenceTypeEnum.getJsonName().equals(typeId))
                .findFirst()
                .orElse(null);
    }
}
