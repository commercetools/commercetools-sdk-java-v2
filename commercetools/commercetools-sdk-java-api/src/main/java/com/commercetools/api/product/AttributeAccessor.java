
package com.commercetools.api.product;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.commercetools.api.models.product.Attribute;
import com.commercetools.api.models.product.ProductVariant;

public class AttributeAccessor {
    public static Map<String, Object> asAttributeMap(final ProductVariant variant) {
        return variant.getAttributes().stream().collect(Collectors.toMap(Attribute::getName, Attribute::getValue));
    }

    public static Map<String, Attribute> asMap(final ProductVariant variant) {
        return variant.getAttributes().stream().collect(Collectors.toMap(Attribute::getName, attribute -> attribute));
    }

    public static LocalDate asDate(final Attribute attribute) {
        return LocalDate.parse((String) attribute.getValue(), DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static LocalTime asTime(final Attribute attribute) {
        return LocalTime.parse((String) attribute.getValue(), DateTimeFormatter.ISO_LOCAL_TIME);
    }

    public static ZonedDateTime asDateTime(final Attribute attribute) {
        return ZonedDateTime.parse((String) attribute.getValue(), DateTimeFormatter.ISO_ZONED_DATE_TIME);
    }

    @SuppressWarnings("unchecked")
    public static List<LocalDate> asSetDate(final Attribute attribute) {
        return ((List<String>) attribute.getValue()).stream()
                .map(s -> LocalDate.parse(s, DateTimeFormatter.ISO_LOCAL_DATE))
                .collect(Collectors.toList());
    }

    @SuppressWarnings("unchecked")
    public static List<LocalTime> asSetTime(final Attribute attribute) {
        return ((List<String>) attribute.getValue()).stream()
                .map(s -> LocalTime.parse(s, DateTimeFormatter.ISO_LOCAL_TIME))
                .collect(Collectors.toList());
    }

    @SuppressWarnings("unchecked")
    public static List<ZonedDateTime> asSetDateTime(final Attribute attribute) {
        return ((List<String>) attribute.getValue()).stream()
                .map(s -> ZonedDateTime.parse(s, DateTimeFormatter.ISO_ZONED_DATE_TIME))
                .collect(Collectors.toList());
    }

}
