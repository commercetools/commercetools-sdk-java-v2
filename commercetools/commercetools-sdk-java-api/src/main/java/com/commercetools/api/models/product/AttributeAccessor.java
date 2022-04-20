
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

public class AttributeAccessor {
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
        return (Boolean) attribute.getValue();
    }

    public static Double asDouble(final Attribute attribute) {
        return (Double) attribute.getValue();
    }

    public static LocalizedString asLocalizedString(final Attribute attribute) {
        return (LocalizedString) attribute.getValue();
    }

    public static AttributePlainEnumValue asEnum(final Attribute attribute) {
        return (AttributePlainEnumValue) attribute.getValue();
    }

    public static AttributeLocalizedEnumValue asLocalizedEnum(final Attribute attribute) {
        return (AttributeLocalizedEnumValue) attribute.getValue();
    }

    public static Long asLong(final Attribute attribute) {
        return (Long) attribute.getValue();
    }

    public static Reference asReference(final Attribute attribute) {
        return (Reference) attribute.getValue();
    }

    public static TypedMoney asMoney(final Attribute attribute) {
        return (TypedMoney) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<String> asSetString(final Attribute attribute) {
        return (List<String>) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<Boolean> asSetBoolean(final Attribute attribute) {
        return (List<Boolean>) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<Double> asSetDouble(final Attribute attribute) {
        return (List<Double>) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<LocalizedString> asSetLocalizedString(final Attribute attribute) {
        return (List<LocalizedString>) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<AttributePlainEnumValue> asSetEnum(final Attribute attribute) {
        return (List<AttributePlainEnumValue>) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<AttributeLocalizedEnumValue> asSetLocalizedEnum(final Attribute attribute) {
        return (List<AttributeLocalizedEnumValue>) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<Long> asSetLong(final Attribute attribute) {
        return (List<Long>) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<Reference> asSetReference(final Attribute attribute) {
        return (List<Reference>) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<TypedMoney> asSetMoney(final Attribute attribute) {
        return (List<TypedMoney>) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<Attribute> asNested(final Attribute attribute) {
        return (List<Attribute>) attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    public static List<List<Attribute>> asSetNested(final Attribute attribute) {
        return (List<List<Attribute>>) attribute.getValue();
    }
}
