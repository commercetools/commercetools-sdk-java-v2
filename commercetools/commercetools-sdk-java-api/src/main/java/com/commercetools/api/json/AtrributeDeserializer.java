
package com.commercetools.api.json;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.regex.Pattern;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.product.*;
import com.commercetools.api.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.models.product_type.AttributePlainEnumValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;

public class AtrributeDeserializer extends JsonDeserializer<AttributeImpl> {

    private static Pattern p = Pattern.compile("^[0-9]");
    private static Pattern dateTime = Pattern
            .compile("^[0-9]{4}-[0-9]{2}-[0-9]{2}T[0-9]{2}:[0-9]{2}:[0-9]{2}[.][0-9]{1,6}");
    private static Pattern date = Pattern.compile("^[0-9]{4}-[0-9]{2}-[0-9]{2}");
    private static Pattern time = Pattern.compile("^[0-9]{2}:[0-9]{2}:[0-9]{2}[.][0-9]{1,6}");

    private final boolean deserializeAsDate;

    public AtrributeDeserializer(boolean deserializeAsDateString) {
        this.deserializeAsDate = !deserializeAsDateString;
    }

    public AtrributeDeserializer() {
        this.deserializeAsDate = true;
    }

    @Override
    public AttributeImpl deserialize(JsonParser p, DeserializationContext ctx) throws IOException {

        JsonNode node = p.readValueAsTree();
        JsonNode valueNode = node.get("value");

        AttributeBuilder builder = Attribute.builder();
        builder.name(node.get("name").asText());

        return (AttributeImpl) builder.value(p.getCodec().treeAsTokens(valueNode).readValueAs(typeRef(valueNode)))
                .build();
    }

    private TypeReference<?> typeRef(JsonNode valueNode) {
        JsonNodeType valueNodeType = valueNode.getNodeType();
        switch (valueNodeType) {
            case BOOLEAN:
                return new TypeReference<Boolean>() {
                };
            case NUMBER:
                if (valueNode.isInt() || valueNode.isLong()) {
                    return new TypeReference<Long>() {
                    };
                }
                return new TypeReference<Double>() {
                };
            case STRING:
                if (deserializeAsDate) {
                    String val = valueNode.asText();
                    if (p.matcher(val).find()) {
                        if (dateTime.matcher(val).find()) {
                            return new TypeReference<ZonedDateTime>() {
                            };
                        }
                        if (date.matcher(val).matches()) {
                            return new TypeReference<LocalDate>() {
                            };
                        }
                        if (time.matcher(val).matches()) {
                            return new TypeReference<LocalTime>() {
                            };
                        }
                    }
                }
                return new TypeReference<String>() {
                };
            case OBJECT:
                if (valueNode.has("key") && valueNode.has("label")) {
                    JsonNode label = valueNode.get("label");
                    if (label.getNodeType() == JsonNodeType.OBJECT) {
                        return new TypeReference<AttributeLocalizedEnumValue>() {
                        };
                    }
                    return new TypeReference<AttributePlainEnumValue>() {
                    };
                }
                if (valueNode.has("currencyCode")) {
                    return new TypeReference<TypedMoney>() {
                    };
                }
                if (valueNode.has("typeId")) {
                    return new TypeReference<Reference>() {
                    };
                }
                if (valueNode.has("value")) {
                    return new TypeReference<Attribute>() {
                    };
                }
                return new TypeReference<LocalizedString>() {
                };
            case ARRAY:
                JsonNode first = valueNode.get(0);
                switch (elemType(first)) {
                    case STRING:
                        return new TypeReference<List<String>>() {
                        };
                    case DATE:
                        return new TypeReference<List<LocalDate>>() {
                        };
                    case DATETIME:
                        return new TypeReference<List<ZonedDateTime>>() {
                        };
                    case TIME:
                        return new TypeReference<List<LocalTime>>() {
                        };
                    case NUMBER:
                        return new TypeReference<List<Double>>() {
                        };
                    case LONG:
                        return new TypeReference<List<Long>>() {
                        };
                    case BOOLEAN:
                        return new TypeReference<List<Boolean>>() {
                        };
                    case ENUM:
                        return new TypeReference<List<AttributePlainEnumValue>>() {
                        };
                    case LOCALIZED_ENUM:
                        return new TypeReference<List<AttributeLocalizedEnumValue>>() {
                        };
                    case LOCALIZED_STRING:
                        return new TypeReference<List<LocalizedString>>() {
                        };
                    case MONEY:
                        return new TypeReference<List<TypedMoney>>() {
                        };
                    case REFERENCE:
                        return new TypeReference<List<Reference>>() {
                        };
                    case NESTED:
                        return new TypeReference<List<Attribute>>() {
                        };
                    case SET_NESTED:
                        return new TypeReference<List<List<Attribute>>>() {
                        };
                    default:
                        return new TypeReference<List<JsonNode>>() {
                        };
                }
            default:
                return new TypeReference<JsonNode>() {
                };
        }
    }

    private ElemType elemType(JsonNode valueNode) {
        if (valueNode == null) {
            return ElemType.JSON_NODE;
        }
        JsonNodeType valueNodeType = valueNode.getNodeType();
        switch (valueNodeType) {
            case OBJECT:
                if (valueNode.has("key") && valueNode.has("label")) {
                    JsonNode label = valueNode.get("label");
                    if (label.getNodeType() == JsonNodeType.OBJECT) {
                        return ElemType.LOCALIZED_ENUM;
                    }
                    return ElemType.ENUM;
                }
                if (valueNode.has("currencyCode")) {
                    return ElemType.MONEY;
                }
                if (valueNode.has("typeId")) {
                    return ElemType.REFERENCE;
                }
                if (valueNode.has("value")) {
                    return ElemType.NESTED;
                }
                return ElemType.LOCALIZED_STRING;
            case NUMBER:
                if (valueNode.isInt() || valueNode.isLong()) {
                    return ElemType.LONG;
                }
                return ElemType.NUMBER;
            case STRING:
                if (deserializeAsDate) {
                    String val = valueNode.asText();
                    if (p.matcher(val).find()) {
                        if (dateTime.matcher(val).find()) {
                            return ElemType.DATETIME;
                        }
                        if (date.matcher(val).matches()) {
                            return ElemType.DATE;
                        }
                        if (time.matcher(val).matches()) {
                            return ElemType.TIME;
                        }
                    }
                }
                return ElemType.STRING;
            case ARRAY:
                return ElemType.SET_NESTED;
            case BOOLEAN:
                return ElemType.BOOLEAN;
            default:
                return ElemType.JSON_NODE;
        }
    }

    private enum ElemType {
        STRING,
        DATE,
        DATETIME,
        TIME,
        NUMBER,
        LONG,
        BOOLEAN,
        ENUM,
        LOCALIZED_ENUM,
        LOCALIZED_STRING,
        REFERENCE,
        MONEY,
        JSON_NODE,
        NESTED,
        SET_NESTED
    }
}
