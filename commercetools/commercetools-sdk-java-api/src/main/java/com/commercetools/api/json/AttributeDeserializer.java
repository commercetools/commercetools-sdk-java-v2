
package com.commercetools.api.json;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.product.Attribute;
import com.commercetools.api.models.product.AttributeBuilder;
import com.commercetools.api.models.product.AttributeImpl;
import com.commercetools.api.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.models.product_type.AttributePlainEnumValue;

import tools.jackson.core.JsonParser;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ValueDeserializer;
import tools.jackson.databind.node.JsonNodeType;

public class AttributeDeserializer extends ValueDeserializer<AttributeImpl> {

    private static Pattern p = Pattern.compile("^[0-9]");
    private static Pattern dateTime = Pattern.compile(
        "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T[0-9]{2}:[0-9]{2}:[0-9]{2}([.][0-9]{1,9})?(Z|[+-][0-9]{2}:[0-9]{2})");
    private static Pattern date = Pattern.compile("^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])");
    private static Pattern time = Pattern.compile("^[0-9]{2}:[0-9]{2}:[0-9]{2}([.][0-9]{1,9})?");

    private static final TypeReference<Boolean> BOOLEAN_TYPE = new TypeReference<Boolean>() {
    };
    private static final TypeReference<Long> LONG_TYPE = new TypeReference<Long>() {
    };
    private static final TypeReference<Double> DOUBLE_TYPE = new TypeReference<Double>() {
    };
    private static final TypeReference<ZonedDateTime> ZONED_DATE_TIME_TYPE = new TypeReference<ZonedDateTime>() {
    };
    private static final TypeReference<LocalDate> LOCAL_DATE_TYPE = new TypeReference<LocalDate>() {
    };
    private static final TypeReference<LocalTime> LOCAL_TIME_TYPE = new TypeReference<LocalTime>() {
    };
    private static final TypeReference<String> STRING_TYPE = new TypeReference<String>() {
    };
    private static final TypeReference<AttributeLocalizedEnumValue> LOCALIZED_ENUM_TYPE = new TypeReference<AttributeLocalizedEnumValue>() {
    };
    private static final TypeReference<AttributePlainEnumValue> ENUM_TYPE = new TypeReference<AttributePlainEnumValue>() {
    };
    private static final TypeReference<TypedMoney> MONEY_TYPE = new TypeReference<TypedMoney>() {
    };
    private static final TypeReference<Reference> REFERENCE_TYPE = new TypeReference<Reference>() {
    };
    private static final TypeReference<Attribute> NESTED_TYPE = new TypeReference<Attribute>() {
    };
    private static final TypeReference<LocalizedString> LOCALIZED_STRING_TYPE = new TypeReference<LocalizedString>() {
    };
    private static final TypeReference<JsonNode> JSON_NODE_TYPE = new TypeReference<JsonNode>() {
    };

    private static final TypeReference<List<Boolean>> BOOLEAN_LIST_TYPE = new TypeReference<List<Boolean>>() {
    };
    private static final TypeReference<List<Long>> LONG_LIST_TYPE = new TypeReference<List<Long>>() {
    };
    private static final TypeReference<List<Double>> DOUBLE_LIST_TYPE = new TypeReference<List<Double>>() {
    };
    private static final TypeReference<List<ZonedDateTime>> ZONED_DATE_TIME_LIST_TYPE = new TypeReference<List<ZonedDateTime>>() {
    };
    private static final TypeReference<List<LocalDate>> LOCAL_DATE_LIST_TYPE = new TypeReference<List<LocalDate>>() {
    };
    private static final TypeReference<List<LocalTime>> LOCAL_TIME_LIST_TYPE = new TypeReference<List<LocalTime>>() {
    };
    private static final TypeReference<List<String>> STRING_LIST_TYPE = new TypeReference<List<String>>() {
    };
    private static final TypeReference<List<AttributeLocalizedEnumValue>> LOCALIZED_ENUM_LIST_TYPE = new TypeReference<List<AttributeLocalizedEnumValue>>() {
    };
    private static final TypeReference<List<AttributePlainEnumValue>> ENUM_LIST_TYPE = new TypeReference<List<AttributePlainEnumValue>>() {
    };
    private static final TypeReference<List<TypedMoney>> MONEY_LIST_TYPE = new TypeReference<List<TypedMoney>>() {
    };
    private static final TypeReference<List<Reference>> REFERENCE_LIST_TYPE = new TypeReference<List<Reference>>() {
    };
    private static final TypeReference<List<Attribute>> NESTED_LIST_TYPE = new TypeReference<List<Attribute>>() {
    };
    private static final TypeReference<List<List<Attribute>>> SET_NESTED_LIST_TYPE = new TypeReference<List<List<Attribute>>>() {
    };
    private static final TypeReference<List<LocalizedString>> LOCALIZED_STRING_LIST_TYPE = new TypeReference<List<LocalizedString>>() {
    };
    private static final TypeReference<List<JsonNode>> JSON_NODE_LIST_TYPE = new TypeReference<List<JsonNode>>() {
    };

    private final boolean deserializeAsDate;

    private final boolean deserializeNumberAsDouble;

    private final Map<String, TypeReference<?>> attributeTypes;
    private final ValueDeserializerCache valueCache = new ValueDeserializerCache();

    public AttributeDeserializer(boolean deserializeAsDateString, boolean deserializeNumberAsDouble,
            final Map<String, TypeReference<?>> attributeTypes) {
        this.deserializeAsDate = !deserializeAsDateString;
        this.deserializeNumberAsDouble = deserializeNumberAsDouble;
        this.attributeTypes = attributeTypes;
    }

    public AttributeDeserializer(boolean deserializeAsDateString) {
        this.deserializeAsDate = !deserializeAsDateString;
        this.deserializeNumberAsDouble = false;
        this.attributeTypes = null;
    }

    public AttributeDeserializer(boolean deserializeAsDateString, boolean deserializeNumberAsDouble) {
        this.deserializeAsDate = !deserializeAsDateString;
        this.deserializeNumberAsDouble = deserializeNumberAsDouble;
        this.attributeTypes = null;
    }

    public AttributeDeserializer() {
        this.deserializeAsDate = true;
        this.deserializeNumberAsDouble = false;
        this.attributeTypes = null;
    }

    @Override
    public AttributeImpl deserialize(JsonParser p, DeserializationContext ctx) {

        JsonNode node = p.readValueAsTree();
        JsonNode valueNode = node.get("value");

        String name = node.get("name").asString();
        AttributeBuilder builder = Attribute.builder();
        builder.name(name);

        final TypeReference<?> ref = (attributeTypes != null && attributeTypes.containsKey(name))
                ? attributeTypes.get(name)
                : typeRef(valueNode);
        return (AttributeImpl) builder.value(valueCache.readValue(p, ctx, ref, valueNode)).build();
    }

    private TypeReference<?> typeRef(JsonNode valueNode) {
        JsonNodeType valueNodeType = valueNode.getNodeType();
        switch (valueNodeType) {
            case BOOLEAN:
                return BOOLEAN_TYPE;
            case NUMBER:
                if (!deserializeNumberAsDouble && (valueNode.isInt() || valueNode.isLong())) {
                    return LONG_TYPE;
                }
                return DOUBLE_TYPE;
            case STRING:
                if (deserializeAsDate) {
                    String val = valueNode.asString();
                    if (p.matcher(val).find()) {
                        if (dateTime.matcher(val).find()) {
                            return ZONED_DATE_TIME_TYPE;
                        }
                        if (date.matcher(val).matches()) {
                            return LOCAL_DATE_TYPE;
                        }
                        if (time.matcher(val).matches()) {
                            return LOCAL_TIME_TYPE;
                        }
                    }
                }
                return STRING_TYPE;
            case OBJECT:
                if (valueNode.has("key") && valueNode.has("label")) {
                    JsonNode label = valueNode.get("label");
                    if (label.getNodeType() == JsonNodeType.OBJECT) {
                        return LOCALIZED_ENUM_TYPE;
                    }
                    return ENUM_TYPE;
                }
                if (valueNode.has("currencyCode")) {
                    return MONEY_TYPE;
                }
                if (valueNode.has("typeId")) {
                    return REFERENCE_TYPE;
                }
                if (valueNode.has("value")) {
                    return NESTED_TYPE;
                }
                return LOCALIZED_STRING_TYPE;
            case ARRAY:
                JsonNode first = valueNode.get(0);
                switch (elemType(first)) {
                    case STRING:
                        return STRING_LIST_TYPE;
                    case DATE:
                        return LOCAL_DATE_LIST_TYPE;
                    case DATETIME:
                        return ZONED_DATE_TIME_LIST_TYPE;
                    case TIME:
                        return LOCAL_TIME_LIST_TYPE;
                    case NUMBER:
                        return DOUBLE_LIST_TYPE;
                    case LONG:
                        return LONG_LIST_TYPE;
                    case BOOLEAN:
                        return BOOLEAN_LIST_TYPE;
                    case ENUM:
                        return ENUM_LIST_TYPE;
                    case LOCALIZED_ENUM:
                        return LOCALIZED_ENUM_LIST_TYPE;
                    case LOCALIZED_STRING:
                        return LOCALIZED_STRING_LIST_TYPE;
                    case MONEY:
                        return MONEY_LIST_TYPE;
                    case REFERENCE:
                        return REFERENCE_LIST_TYPE;
                    case NESTED:
                        return NESTED_LIST_TYPE;
                    case SET_NESTED:
                        return SET_NESTED_LIST_TYPE;
                    default:
                        return JSON_NODE_LIST_TYPE;
                }
            default:
                return JSON_NODE_TYPE;
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
                if (!deserializeNumberAsDouble && (valueNode.isInt() || valueNode.isLong())) {
                    return ElemType.LONG;
                }
                return ElemType.NUMBER;
            case STRING:
                if (deserializeAsDate) {
                    String val = valueNode.asString();
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
