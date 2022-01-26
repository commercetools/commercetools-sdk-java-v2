
package com.commercetools.api.models.type;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.TypedMoney;

public class CustomFieldsAccessor {
    private final Map<String, Object> values;

    public CustomFieldsAccessor(CustomFields customFields) {
        this.values = Optional.ofNullable(customFields.getFields())
                .map(FieldContainer::values)
                .orElse(Collections.emptyMap());
    }

    public CustomFieldsAccessor(FieldContainer fieldContainer) {
        this.values = fieldContainer.values();
    }

    public LocalDate asDate(final String field) {
        Object value = values.get(field);
        if (value instanceof LocalDate) {
            return (LocalDate) value;
        }
        return LocalDate.parse((String) value, DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public LocalTime asTime(final String field) {
        Object value = values.get(field);
        if (value instanceof LocalTime) {
            return (LocalTime) value;
        }
        return LocalTime.parse((String) value, DateTimeFormatter.ISO_LOCAL_TIME);
    }

    public ZonedDateTime asDateTime(final String field) {
        Object value = values.get(field);
        if (value instanceof ZonedDateTime) {
            return (ZonedDateTime) value;
        }
        return ZonedDateTime.parse((String) value, DateTimeFormatter.ISO_ZONED_DATE_TIME);
    }

    @SuppressWarnings("unchecked")
    public List<LocalDate> asSetDate(final String field) {
        return ((List<Object>) values.get(field)).stream().map(value -> {
            if (value instanceof LocalDate) {
                return (LocalDate) value;
            }
            return LocalDate.parse((String) value, DateTimeFormatter.ISO_LOCAL_DATE);
        }).collect(Collectors.toList());
    }

    @SuppressWarnings("unchecked")
    public List<LocalTime> asSetTime(final String field) {
        return ((List<Object>) values.get(field)).stream().map(value -> {
            if (value instanceof LocalTime) {
                return (LocalTime) value;
            }
            return LocalTime.parse((String) value, DateTimeFormatter.ISO_LOCAL_TIME);
        }).collect(Collectors.toList());
    }

    @SuppressWarnings("unchecked")
    public List<ZonedDateTime> asSetDateTime(final String field) {
        return ((List<Object>) values.get(field)).stream().map(value -> {
            if (value instanceof ZonedDateTime) {
                return (ZonedDateTime) value;
            }
            return ZonedDateTime.parse((String) value, DateTimeFormatter.ISO_ZONED_DATE_TIME);
        }).collect(Collectors.toList());
    }

    public String asString(final String field) {
        return (String) values.get(field);
    }

    public Boolean asBoolean(final String field) {
        return (Boolean) values.get(field);
    }

    public Double asDouble(final String field) {
        return (Double) values.get(field);
    }

    public LocalizedString asLocalizedString(final String field) {
        return (LocalizedString) values.get(field);
    }

    public CustomFieldEnumValue asEnum(final String field) {
        return (CustomFieldEnumValue) values.get(field);
    }

    public CustomFieldLocalizedEnumValue asLocalizedEnum(final String field) {
        return (CustomFieldLocalizedEnumValue) values.get(field);
    }

    public Long asLong(final String field) {
        return (Long) values.get(field);
    }

    public Reference asReference(final String field) {
        return (Reference) values.get(field);
    }

    public TypedMoney asMoney(final String field) {
        return (TypedMoney) values.get(field);
    }

    @SuppressWarnings("unchecked")
    public List<String> asSetString(final String field) {
        return (List<String>) values.get(field);
    }

    @SuppressWarnings("unchecked")
    public List<Boolean> asSetBoolean(final String field) {
        return (List<Boolean>) values.get(field);
    }

    @SuppressWarnings("unchecked")
    public List<Double> asSetDouble(final String field) {
        return (List<Double>) values.get(field);
    }

    @SuppressWarnings("unchecked")
    public List<LocalizedString> asSetLocalizedString(final String field) {
        return (List<LocalizedString>) values.get(field);
    }

    @SuppressWarnings("unchecked")
    public List<CustomFieldEnumValue> asSetEnum(final String field) {
        return (List<CustomFieldEnumValue>) values.get(field);
    }

    @SuppressWarnings("unchecked")
    public List<CustomFieldLocalizedEnumValue> asSetLocalizedEnum(final String field) {
        return (List<CustomFieldLocalizedEnumValue>) values.get(field);
    }

    @SuppressWarnings("unchecked")
    public List<Long> asSetLong(final String field) {
        return (List<Long>) values.get(field);
    }

    @SuppressWarnings("unchecked")
    public List<Reference> asSetReference(final String field) {
        return (List<Reference>) values.get(field);
    }

    @SuppressWarnings("unchecked")
    public List<Money> asSetMoney(final String field) {
        return (List<Money>) values.get(field);
    }
}
