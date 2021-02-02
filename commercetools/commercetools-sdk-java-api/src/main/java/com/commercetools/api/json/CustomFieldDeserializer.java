
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
import com.commercetools.api.models.type.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;

public class CustomFieldDeserializer extends JsonDeserializer<FieldContainerImpl> {

    private static Pattern p = Pattern.compile("^[0-9]");
    private static Pattern dateTime = Pattern.compile(
        "^[0-9]{4}-[0-9]{2}-[0-9]{2}T[0-9]{2}:[0-9]{2}:[0-9]{2}[.][0-9]{1,6}");
    private static Pattern date = Pattern.compile("^[0-9]{4}-[0-9]{2}-[0-9]{2}");
    private static Pattern time = Pattern.compile("^[0-9]{2}:[0-9]{2}:[0-9]{2}[.][0-9]{1,6}");

    @Override
    public FieldContainerImpl deserialize(JsonParser p, DeserializationContext ctx) throws IOException {

        JsonNode node = p.readValueAsTree();

        FieldContainerBuilder builder = FieldContainerBuilder.of();

        node.fields().forEachRemaining(
            nodeEntry -> builder.addValue(nodeEntry.getKey(), mapValue(p, nodeEntry.getValue())));

        return (FieldContainerImpl) builder.build();
    }

    private Object mapValue(JsonParser p, JsonNode nodeValue) {
        try {
            return p.getCodec().treeAsTokens(nodeValue).readValueAs(typeRef(nodeValue));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private TypeReference<?> typeRef(JsonNode valueNode) {
        JsonNodeType valueNodeType = valueNode.getNodeType();
        switch (valueNodeType) {
            case BOOLEAN:
                return new TypeReference<Boolean>() {
                };
            case NUMBER:
                return new TypeReference<Double>() {
                };
            case STRING:
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
                return new TypeReference<String>() {
                };
            case OBJECT:
                if (valueNode.has("key")) {
                    JsonNode label = valueNode.get("label");
                    if (label.getNodeType() == JsonNodeType.OBJECT) {
                        return new TypeReference<CustomFieldLocalizedEnumValue>() {
                        };
                    }
                    return new TypeReference<CustomFieldEnumValue>() {
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
                    case BOOLEAN:
                        return new TypeReference<List<Boolean>>() {
                        };
                    case ENUM:
                        return new TypeReference<List<CustomFieldEnumValue>>() {
                        };
                    case LOCALIZED_ENUM:
                        return new TypeReference<List<CustomFieldLocalizedEnumValue>>() {
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
        JsonNodeType valueNodeType = valueNode.getNodeType();
        switch (valueNodeType) {
            case OBJECT:
                if (valueNode.has("key")) {
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
                return ElemType.LOCALIZED_STRING;
            case NUMBER:
                return ElemType.NUMBER;
            case STRING:
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
                return ElemType.STRING;
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
        BOOLEAN,
        ENUM,
        LOCALIZED_ENUM,
        LOCALIZED_STRING,
        REFERENCE,
        MONEY,
        JSON_NODE
    }
}
