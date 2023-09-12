
package com.commercetools.api.models.product;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.models.product_type.AttributePlainEnumValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

import io.vrap.rmf.base.client.utils.json.JsonException;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

/**
 * Accessor for retrieving type safe attribute values
 */
public class AttributeAccessor {

    private final Attribute attribute;

    public AttributeAccessor(Attribute attribute) {
        this.attribute = attribute;
    }

    public static AttributeAccessor of(Attribute attribute) {
        return new AttributeAccessor(attribute);
    }

    public LocalDate asDate() {
        return asDate(attribute);
    }

    public LocalTime asTime() {
        return asTime(attribute);
    }

    public ZonedDateTime asDateTime() {
        return asDateTime(attribute);
    }

    public List<LocalDate> asSetDate() {
        return asSetDate(attribute);
    }

    public List<LocalTime> asSetTime() {
        return asSetTime(attribute);
    }

    public List<ZonedDateTime> asSetDateTime() {
        return asSetDateTime(attribute);
    }

    public String asString() {
        return asString(attribute);
    }

    public Boolean asBoolean() {
        return asBoolean(attribute);
    }

    public Double asDouble() {
        return asDouble(attribute);
    }

    public LocalizedString asLocalizedString() {
        return asLocalizedString(attribute);
    }

    public AttributePlainEnumValue asEnum() {
        return asEnum(attribute);
    }

    public AttributeLocalizedEnumValue asLocalizedEnum() {
        return asLocalizedEnum(attribute);
    }

    public Long asLong() {
        return asLong(attribute);
    }

    public Reference asReference() {
        return asReference(attribute);
    }

    public TypedMoney asMoney() {
        return asMoney(attribute);
    }

    public List<String> asSetString() {
        return asSetString(attribute);
    }

    public List<Boolean> asSetBoolean() {
        return asSetBoolean(attribute);
    }

    public List<Double> asSetDouble() {
        return asSetDouble(attribute);
    }

    public List<LocalizedString> asSetLocalizedString() {
        return asSetLocalizedString(attribute);
    }

    public List<AttributePlainEnumValue> asSetEnum() {
        return asSetEnum(attribute);
    }

    public List<AttributeLocalizedEnumValue> asSetLocalizedEnum() {
        return asSetLocalizedEnum(attribute);
    }

    public List<Long> asSetLong() {
        return asSetLong(attribute);
    }

    public List<Reference> asSetReference() {
        return asSetReference(attribute);
    }

    public List<TypedMoney> asSetMoney() {
        return asSetMoney(attribute);
    }

    public List<Attribute> asNested() {
        return asNested(attribute);
    }

    public List<List<Attribute>> asSetNested() {
        return asSetNested(attribute);
    }

    public static Map<String, Object> asAttributeMap(final ProductVariant variant) {
        return variant.getAttributes().stream().collect(Collectors.toMap(Attribute::getName, Attribute::getValue));
    }

    public static Map<String, Attribute> asMap(final ProductVariant variant) {
        return asMap(variant.getAttributes());
    }

    public static Map<String, Attribute> asMap(final List<Attribute> attributes) {
        return attributes.stream().collect(Collectors.toMap(Attribute::getName, attribute -> attribute));
    }

    public static LocalDate asDate(final Attribute attribute) {
        Object value = attribute.getValue();
        if (value instanceof LocalDate) {
            return (LocalDate) value;
        }
        return LocalDate.parse((String) value, DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static LocalTime asTime(final Attribute attribute) {
        Object value = attribute.getValue();
        if (value instanceof LocalTime) {
            return (LocalTime) value;
        }
        return LocalTime.parse((String) value, DateTimeFormatter.ISO_LOCAL_TIME);
    }

    public static ZonedDateTime asDateTime(final Attribute attribute) {
        Object value = attribute.getValue();
        if (value instanceof ZonedDateTime) {
            return (ZonedDateTime) value;
        }
        return ZonedDateTime.parse((String) value, DateTimeFormatter.ISO_ZONED_DATE_TIME);
    }

    @SuppressWarnings("unchecked")
    public static List<LocalDate> asSetDate(final Attribute attribute) {
        return ((List<Object>) attribute.getValue()).stream().map(value -> {
            if (value instanceof LocalDate) {
                return (LocalDate) value;
            }
            return LocalDate.parse((String) value, DateTimeFormatter.ISO_LOCAL_DATE);
        }).collect(Collectors.toList());
    }

    @SuppressWarnings("unchecked")
    public static List<LocalTime> asSetTime(final Attribute attribute) {
        return ((List<Object>) attribute.getValue()).stream().map(value -> {
            if (value instanceof LocalTime) {
                return (LocalTime) value;
            }
            return LocalTime.parse((String) value, DateTimeFormatter.ISO_LOCAL_TIME);
        }).collect(Collectors.toList());
    }

    @SuppressWarnings("unchecked")
    public static List<ZonedDateTime> asSetDateTime(final Attribute attribute) {
        return ((List<Object>) attribute.getValue()).stream().map(value -> {
            if (value instanceof ZonedDateTime) {
                return (ZonedDateTime) value;
            }
            return ZonedDateTime.parse((String) value, DateTimeFormatter.ISO_ZONED_DATE_TIME);
        }).collect(Collectors.toList());
    }

    public static String asString(final Attribute attribute) {
        return (String) attribute.getValue();
    }

    public static Boolean asBoolean(final Attribute attribute) {
        if (attribute.getValue() instanceof Boolean) {
            return (Boolean) attribute.getValue();
        }
        if (attribute.getValue() instanceof JsonNode) {
            return ((JsonNode) attribute.getValue()).asBoolean();
        }
        throw new JsonException("invalid type");
    }

    public static Double asDouble(final Attribute attribute) {
        if (attribute.getValue() instanceof Double) {
            return (Double) attribute.getValue();
        }
        if (attribute.getValue() instanceof JsonNode) {
            return ((JsonNode) attribute.getValue()).asDouble();
        }
        throw new JsonException("invalid type");
    }

    public static LocalizedString asLocalizedString(final Attribute attribute) {
        if (attribute.getValue() instanceof LocalizedString) {
            return (LocalizedString) attribute.getValue();
        }
        if (attribute.getValue() instanceof JsonNode) {
            return JsonUtils.createObjectMapper().convertValue(attribute.getValue(), LocalizedString.class);
        }
        throw new JsonException("invalid type");
    }

    public static AttributePlainEnumValue asEnum(final Attribute attribute) {
        if (attribute.getValue() instanceof AttributePlainEnumValue) {
            return (AttributePlainEnumValue) attribute.getValue();
        }
        if (attribute.getValue() instanceof JsonNode) {
            return JsonUtils.createObjectMapper().convertValue(attribute.getValue(), AttributePlainEnumValue.class);
        }
        throw new JsonException("invalid type");
    }

    public static AttributeLocalizedEnumValue asLocalizedEnum(final Attribute attribute) {
        if (attribute.getValue() instanceof AttributeLocalizedEnumValue) {
            return (AttributeLocalizedEnumValue) attribute.getValue();
        }
        if (attribute.getValue() instanceof JsonNode) {
            return JsonUtils.createObjectMapper().convertValue(attribute.getValue(), AttributeLocalizedEnumValue.class);
        }
        throw new JsonException("invalid type");
    }

    public static Long asLong(final Attribute attribute) {
        if (attribute.getValue() instanceof Long) {
            return (Long) attribute.getValue();
        }
        if (attribute.getValue() instanceof JsonNode) {
            return ((JsonNode) attribute.getValue()).asLong();
        }
        throw new JsonException("invalid type");
    }

    public static Reference asReference(final Attribute attribute) {
        if (attribute.getValue() instanceof Reference) {
            return (Reference) attribute.getValue();
        }
        if (attribute.getValue() instanceof JsonNode) {
            return JsonUtils.createObjectMapper().convertValue(attribute.getValue(), Reference.class);
        }
        throw new JsonException("invalid type");
    }

    public static TypedMoney asMoney(final Attribute attribute) {
        if (attribute.getValue() instanceof TypedMoney) {
            return (TypedMoney) attribute.getValue();
        }
        if (attribute.getValue() instanceof JsonNode) {
            return JsonUtils.createObjectMapper().convertValue(attribute.getValue(), TypedMoney.class);
        }
        throw new JsonException("invalid type");
    }

    @SuppressWarnings("unchecked")
    public static List<String> asSetString(final Attribute attribute) {
        if (attribute.getValue() instanceof JsonNode) {
            return JsonUtils.fromJsonNode((JsonNode) attribute.getValue(), new TypeReference<List<String>>() {
            });
        }
        return (List<String>) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<Boolean> asSetBoolean(final Attribute attribute) {
        if (attribute.getValue() instanceof JsonNode) {
            return JsonUtils.fromJsonNode((JsonNode) attribute.getValue(), new TypeReference<List<Boolean>>() {
            });
        }
        return (List<Boolean>) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<Double> asSetDouble(final Attribute attribute) {
        if (attribute.getValue() instanceof JsonNode) {
            return JsonUtils.fromJsonNode((JsonNode) attribute.getValue(), new TypeReference<List<Double>>() {
            });
        }
        return (List<Double>) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<LocalizedString> asSetLocalizedString(final Attribute attribute) {
        if (attribute.getValue() instanceof JsonNode) {
            return JsonUtils.fromJsonNode((JsonNode) attribute.getValue(), new TypeReference<List<LocalizedString>>() {
            });
        }
        return (List<LocalizedString>) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<AttributePlainEnumValue> asSetEnum(final Attribute attribute) {
        if (attribute.getValue() instanceof JsonNode) {
            return JsonUtils.fromJsonNode((JsonNode) attribute.getValue(),
                new TypeReference<List<AttributePlainEnumValue>>() {
                });
        }
        return (List<AttributePlainEnumValue>) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<AttributeLocalizedEnumValue> asSetLocalizedEnum(final Attribute attribute) {
        if (attribute.getValue() instanceof JsonNode) {
            return JsonUtils.fromJsonNode((JsonNode) attribute.getValue(),
                new TypeReference<List<AttributeLocalizedEnumValue>>() {
                });
        }
        return (List<AttributeLocalizedEnumValue>) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<Long> asSetLong(final Attribute attribute) {
        if (attribute.getValue() instanceof JsonNode) {
            return JsonUtils.fromJsonNode((JsonNode) attribute.getValue(), new TypeReference<List<Long>>() {
            });
        }
        return (List<Long>) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<Reference> asSetReference(final Attribute attribute) {
        if (attribute.getValue() instanceof JsonNode) {
            return JsonUtils.fromJsonNode((JsonNode) attribute.getValue(), new TypeReference<List<Reference>>() {
            });
        }
        return (List<Reference>) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<TypedMoney> asSetMoney(final Attribute attribute) {
        if (attribute.getValue() instanceof JsonNode) {
            return JsonUtils.fromJsonNode((JsonNode) attribute.getValue(), new TypeReference<List<TypedMoney>>() {
            });
        }
        return (List<TypedMoney>) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<Attribute> asNested(final Attribute attribute) {
        if (attribute.getValue() instanceof JsonNode) {
            return JsonUtils.fromJsonNode((JsonNode) attribute.getValue(), new TypeReference<List<Attribute>>() {
            });
        }
        return (List<Attribute>) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<List<Attribute>> asSetNested(final Attribute attribute) {
        if (attribute.getValue() instanceof JsonNode) {
            return JsonUtils.fromJsonNode((JsonNode) attribute.getValue(), new TypeReference<List<List<Attribute>>>() {
            });
        }
        return (List<List<Attribute>>) attribute.getValue();
    }
}
