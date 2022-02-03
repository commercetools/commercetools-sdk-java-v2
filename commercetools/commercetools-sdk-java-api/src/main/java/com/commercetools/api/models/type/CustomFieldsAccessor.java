
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

import javax.annotation.Nullable;

import com.commercetools.api.models.MapAccessor;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.TypedMoney;

public class CustomFieldsAccessor extends MapAccessor<Object> {
    private final Map<String, Object> values;

    public CustomFieldsAccessor(CustomFields customFields) {
        super(Optional.ofNullable(customFields.getFields()).map(FieldContainer::values).orElse(Collections.emptyMap()));
        this.values = Optional.ofNullable(customFields.getFields())
                .map(FieldContainer::values)
                .orElse(Collections.emptyMap());
    }

    public CustomFieldsAccessor(FieldContainer fieldContainer) {
        super(fieldContainer.values());
        this.values = fieldContainer.values();
    }

    @Nullable
    public LocalDate asDate(final String field) {
        return get(field, CustomFieldsAccessor::mapAsDate);
    }

    @Nullable
    public LocalTime asTime(final String field) {
        return get(field, CustomFieldsAccessor::mapAsTime);
    }

    @Nullable
    public ZonedDateTime asDateTime(final String field) {
        return get(field, CustomFieldsAccessor::mapAsDateTime);
    }

    @Nullable
    public List<LocalDate> asSetDate(final String field) {
        return get(field, CustomFieldsAccessor::mapAsSetDate);
    }

    @Nullable
    public List<LocalTime> asSetTime(final String field) {
        return get(field, CustomFieldsAccessor::mapAsSetTime);
    }

    @Nullable
    public List<ZonedDateTime> asSetDateTime(final String field) {
        return get(field, CustomFieldsAccessor::mapAsSetDateTime);
    }

    @Nullable
    public String asString(final String field) {
        return get(field, CustomFieldsAccessor::mapAsString);
    }

    @Nullable
    public Boolean asBoolean(final String field) {
        return get(field, CustomFieldsAccessor::mapAsBoolean);
    }

    @Nullable
    public Double asDouble(final String field) {
        return get(field, CustomFieldsAccessor::mapAsDouble);
    }

    @Nullable
    public LocalizedString asLocalizedString(final String field) {
        return get(field, CustomFieldsAccessor::mapAsLocalizedString);
    }

    @Nullable
    public CustomFieldEnumValue asEnum(final String field) {
        return get(field, CustomFieldsAccessor::mapAsEnum);
    }

    @Nullable
    public CustomFieldLocalizedEnumValue asLocalizedEnum(final String field) {
        return get(field, CustomFieldsAccessor::mapAsLocalizedEnum);
    }

    @Nullable
    public Long asLong(final String field) {
        return get(field, CustomFieldsAccessor::mapAsLong);
    }

    @Nullable
    public Reference asReference(final String field) {
        return get(field, CustomFieldsAccessor::mapAsReference);
    }

    @Nullable
    public TypedMoney asMoney(final String field) {
        return get(field, CustomFieldsAccessor::mapAsMoney);
    }

    @Nullable
    public List<String> asSetString(final String field) {
        return get(field, CustomFieldsAccessor::mapAsSetString);
    }

    @Nullable
    public List<Boolean> asSetBoolean(final String field) {
        return get(field, CustomFieldsAccessor::mapAsSetBoolean);
    }

    @Nullable
    public List<Double> asSetDouble(final String field) {
        return get(field, CustomFieldsAccessor::mapAsSetDouble);
    }

    @Nullable
    public List<LocalizedString> asSetLocalizedString(final String field) {
        return get(field, CustomFieldsAccessor::mapAsSetLocalizedString);
    }

    @Nullable
    public List<CustomFieldEnumValue> asSetEnum(final String field) {
        return get(field, CustomFieldsAccessor::mapAsSetEnum);
    }

    @Nullable
    public List<CustomFieldLocalizedEnumValue> asSetLocalizedEnum(final String field) {
        return get(field, CustomFieldsAccessor::mapAsSetLocalizedEnum);
    }

    @Nullable
    public List<Long> asSetLong(final String field) {
        return get(field, CustomFieldsAccessor::mapAsSetLong);
    }

    @Nullable
    public List<Reference> asSetReference(final String field) {
        return get(field, CustomFieldsAccessor::mapAsSetReference);
    }

    @Nullable
    public List<Money> asSetMoney(final String field) {
        return get(field, CustomFieldsAccessor::mapAsSetMoney);
    }

    private static LocalDate mapAsDate(final Object value) {
        if (value instanceof LocalDate) {
            return (LocalDate) value;
        }
        return LocalDate.parse((String) value, DateTimeFormatter.ISO_LOCAL_DATE);
    }

    private static LocalTime mapAsTime(final Object value) {
        if (value instanceof LocalTime) {
            return (LocalTime) value;
        }
        return LocalTime.parse((String) value, DateTimeFormatter.ISO_LOCAL_TIME);
    }

    private static ZonedDateTime mapAsDateTime(final Object value) {
        if (value instanceof ZonedDateTime) {
            return (ZonedDateTime) value;
        }
        return ZonedDateTime.parse((String) value, DateTimeFormatter.ISO_ZONED_DATE_TIME);
    }

    @SuppressWarnings("unchecked")
    private static List<LocalDate> mapAsSetDate(final Object listValue) {
        return ((List<Object>) listValue).stream().map(value -> {
            if (value instanceof LocalDate) {
                return (LocalDate) value;
            }
            return LocalDate.parse((String) value, DateTimeFormatter.ISO_LOCAL_DATE);
        }).collect(Collectors.toList());
    }

    @SuppressWarnings("unchecked")
    private static List<LocalTime> mapAsSetTime(final Object listValue) {
        return ((List<Object>) listValue).stream().map(value -> {
            if (value instanceof LocalTime) {
                return (LocalTime) value;
            }
            return LocalTime.parse((String) value, DateTimeFormatter.ISO_LOCAL_TIME);
        }).collect(Collectors.toList());
    }

    @SuppressWarnings("unchecked")
    private static List<ZonedDateTime> mapAsSetDateTime(final Object listValue) {
        return ((List<Object>) listValue).stream().map(value -> {
            if (value instanceof ZonedDateTime) {
                return (ZonedDateTime) value;
            }
            return ZonedDateTime.parse((String) value, DateTimeFormatter.ISO_ZONED_DATE_TIME);
        }).collect(Collectors.toList());
    }

    private static String mapAsString(final Object value) {
        return (String) value;
    }

    private static Boolean mapAsBoolean(final Object value) {
        return (Boolean) value;
    }

    private static Double mapAsDouble(final Object value) {
        return (Double) value;
    }

    private static LocalizedString mapAsLocalizedString(final Object value) {
        return (LocalizedString) value;
    }

    private static CustomFieldEnumValue mapAsEnum(final Object value) {
        return (CustomFieldEnumValue) value;
    }

    private static CustomFieldLocalizedEnumValue mapAsLocalizedEnum(final Object value) {
        return (CustomFieldLocalizedEnumValue) value;
    }

    private static Long mapAsLong(final Object value) {
        return (Long) value;
    }

    private static Reference mapAsReference(final Object value) {
        return (Reference) value;
    }

    private static TypedMoney mapAsMoney(final Object value) {
        return (TypedMoney) value;
    }

    @SuppressWarnings("unchecked")
    private static List<String> mapAsSetString(final Object listValue) {
        return (List<String>) listValue;
    }

    @SuppressWarnings("unchecked")
    private static List<Boolean> mapAsSetBoolean(final Object listValue) {
        return (List<Boolean>) listValue;
    }

    @SuppressWarnings("unchecked")
    private static List<Double> mapAsSetDouble(final Object listValue) {
        return (List<Double>) listValue;
    }

    @SuppressWarnings("unchecked")
    private static List<LocalizedString> mapAsSetLocalizedString(final Object listValue) {
        return (List<LocalizedString>) listValue;
    }

    @SuppressWarnings("unchecked")
    private static List<CustomFieldEnumValue> mapAsSetEnum(final Object listValue) {
        return (List<CustomFieldEnumValue>) listValue;
    }

    @SuppressWarnings("unchecked")
    private static List<CustomFieldLocalizedEnumValue> mapAsSetLocalizedEnum(final Object listValue) {
        return (List<CustomFieldLocalizedEnumValue>) listValue;
    }

    @SuppressWarnings("unchecked")
    private static List<Long> mapAsSetLong(final Object listValue) {
        return (List<Long>) listValue;
    }

    @SuppressWarnings("unchecked")
    private static List<Reference> mapAsSetReference(final Object listValue) {
        return (List<Reference>) listValue;
    }

    @SuppressWarnings("unchecked")
    private static List<Money> mapAsSetMoney(final Object listValue) {
        return (List<Money>) listValue;
    }
}
