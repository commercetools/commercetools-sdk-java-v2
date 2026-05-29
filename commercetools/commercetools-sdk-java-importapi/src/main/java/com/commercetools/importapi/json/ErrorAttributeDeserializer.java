
package com.commercetools.importapi.json;

import static tools.jackson.databind.node.JsonNodeType.OBJECT;

import java.util.*;

import com.commercetools.importapi.models.common.*;
import com.commercetools.importapi.models.productvariants.*;
import tools.jackson.core.JsonParser;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.node.JsonNodeType;
import tools.jackson.databind.ValueDeserializer;

public class ErrorAttributeDeserializer extends ValueDeserializer<Attribute> {
    protected ErrorAttributeDeserializer() {
    }

    @Override
    public Attribute deserialize(JsonParser p, DeserializationContext ctxt) {
        JsonNode node = p.readValueAsTree();
        JsonNode valueNode = node.get("value");

        JsonNodeType valueNodeType = valueNode.getNodeType();
        switch (valueNodeType) {
            case BOOLEAN:
                return BooleanAttributeBuilder.of()
                        .name(node.get("name").asString())
                        .value(valueNode.asBoolean())
                        .build();

            case NUMBER:
                return NumberAttributeBuilder.of().name(node.get("name").asString()).value(valueNode.asDouble()).build();
            case STRING:
                return TextAttributeBuilder.of().name(node.get("name").asString()).value(valueNode.asString()).build();
            case OBJECT:
                return createAttributeFromObject(node);
            case ARRAY:
                JsonNode firstElement = valueNode.get(0);
                JsonNodeType firstElementNodeType = firstElement.getNodeType();
                switch (firstElementNodeType) {
                    case STRING:
                        List<String> stringValues = new ArrayList<>();
                        valueNode.values().iterator().forEachRemaining(element -> stringValues.add(element.asString()));
                        return TextSetAttributeBuilder.of().name(node.get("name").asString()).value(stringValues).build();
                    case NUMBER:
                        List<Double> numberValues = new ArrayList<>();
                        valueNode.values().iterator().forEachRemaining(element -> numberValues.add(element.asDouble()));
                        return NumberSetAttributeBuilder.of()
                                .name(node.get("name").asString())
                                .value(numberValues)
                                .build();
                    case BOOLEAN:
                        List<Boolean> booleanValues = new ArrayList<>();
                        valueNode.values().iterator().forEachRemaining(element -> booleanValues.add(element.asBoolean()));
                        return BooleanSetAttributeBuilder.of()
                                .name(node.get("name").asString())
                                .value(booleanValues)
                                .build();
                    case OBJECT:
                        return createSetAttributeFromObject(node);
                }
            default:
                AttributeImpl attribute = new AttributeImpl();
                attribute.setName(node.get("name").asString());
                return attribute;
        }
    }

    private ReferenceType getReferenceType(String typeId) {
        return Arrays.stream(ReferenceType.ReferenceTypeEnum.values())
                .filter(referenceTypeEnum -> referenceTypeEnum.getJsonName().equals(typeId))
                .findFirst()
                .orElse(null);
    }

    private Attribute createAttributeFromObject(JsonNode node) {
        JsonNode valueNode = node.get("value");
        if (valueNode.has("key") && valueNode.has("label")) {
            JsonNode label = valueNode.get("label");
            if (label.getNodeType() == OBJECT) {
                return LocalizableEnumAttributeBuilder.of()
                        .name(node.get("name").asString())
                        .value(valueNode.get("key").asString())
                        .build();
            }
            return EnumAttributeBuilder.of()
                    .name(node.get("name").asString())
                    .value(valueNode.get("key").asString())
                    .build();
        }
        if (valueNode.has("currencyCode")) {
            return MoneyAttributeBuilder.of()
                    .name(node.get("name").asString())
                    .value(typedMoneyBuilder -> typedMoneyBuilder.centPrecisionBuilder()
                            .currencyCode(valueNode.get("currencyCode").asString())
                            .centAmount(valueNode.get("centAmount").asLong())
                            .fractionDigits(valueNode.get("fractionDigits").asInt()))
                    .build();
        }
        if (valueNode.has("typeId")) {
            return ReferenceAttributeBuilder.of()
                    .name(node.get("name").asString())
                    // this is not working because reference contains ID and KeyReference requires ID
                    //                            .value((KeyReference) p.getCodec().treeAsTokens(valueNode).readValueAs(getTypeRef(valueNode.get("typeId").asText())))
                    .value(createKeyReference(valueNode))
                    .build();
        }
        return LocalizableTextAttributeBuilder.of().name(node.get("name").asString()).value(localizedStringBuilder -> {
            valueNode.properties().iterator()
                    .forEachRemaining(nodeEntry -> localizedStringBuilder.addValue(nodeEntry.getKey(),
                        nodeEntry.getValue().asString()));
            return localizedStringBuilder;
        }).build();
    }

    private Attribute createSetAttributeFromObject(JsonNode node) {
        JsonNode valueNode = node.get("value");
        JsonNode firstElement = valueNode.get(0);
        if (firstElement.has("key") && firstElement.has("label")) {
            List<String> keys = new ArrayList<>();
            valueNode.iterator().forEachRemaining(jsonNode -> jsonNode.properties().iterator().forEachRemaining(nodeEntry -> {
                String key = nodeEntry.getKey();
                if (key.equals("key")) {
                    keys.add(nodeEntry.getValue().asString());
                }
            }));
            JsonNode label = firstElement.get("label");
            if (label.getNodeType() == OBJECT) {
                return LocalizableEnumSetAttributeBuilder.of().name(node.get("name").asString()).value(keys).build();
            }
            return EnumSetAttributeBuilder.of().name(node.get("name").asString()).value(keys).build();
        }
        if (firstElement.has("typeId")) {
            List<KeyReference> keyReferences = new ArrayList<>();
            valueNode.iterator().forEachRemaining(nodeEntry -> {
                keyReferences.add(createKeyReference(nodeEntry));
            });
            return ReferenceSetAttributeBuilder.of().name(node.get("name").asString()).value(keyReferences).build();
        }
        if (firstElement.has("currencyCode")) {
            List<TypedMoney> values = new ArrayList<>();
            valueNode.iterator().forEachRemaining(nodeEntry -> {
                values.add(MoneyBuilder.of()
                        .currencyCode(nodeEntry.get("currencyCode").asString())
                        .centAmount(nodeEntry.get("centAmount").asLong())
                        .fractionDigits(nodeEntry.get("fractionDigits").asInt())
                        .build());
            });
            return MoneySetAttributeBuilder.of().name(node.get("name").asString()).value(values).build();
        }

        List<LocalizedString> values = new ArrayList<>();
        valueNode.iterator().forEachRemaining(jsonNode -> {
            LocalizedStringBuilder localizedStringBuilder = LocalizedStringBuilder.of();
            jsonNode.properties().iterator()
                    .forEachRemaining(nodeEntry -> localizedStringBuilder.addValue(nodeEntry.getKey(),
                        nodeEntry.getValue().asString()));
            values.add(localizedStringBuilder.build());
        });
        return LocalizableTextSetAttributeBuilder.of().name(node.get("name").asString()).value(values).build();
    }

    private KeyReference createKeyReference(JsonNode node) {
        return new KeyReference() {
            @Override
            public String getKey() {
                return node.get("id").asString();
            }

            @Override
            public ReferenceType getTypeId() {
                return getReferenceType(node.get("typeId").asString());
            }

            @Override
            public void setKey(String key) {
            }

            @Override
            public KeyReference copyDeep() {
                return null;
            }
        };
    }
}
