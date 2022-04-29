
package com.commercetools.api.models.product;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.MapAccessor;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.models.product_type.AttributePlainEnumValue;

public class AttributesAccessor extends MapAccessor<Attribute> {

    public AttributesAccessor(Map<String, Attribute> attributes) {
        super(attributes);
    }

    public static AttributesAccessor of(ProductVariant variant) {
        return new AttributesAccessor(AttributeAccessor.asMap(variant));
    }

    public static AttributesAccessor of(List<Attribute> attributes) {
        return new AttributesAccessor(AttributeAccessor.asMap(attributes));
    }

    public static AttributesAccessor of(Map<String, Attribute> attributes) {
        return new AttributesAccessor(attributes);
    }

    @Nullable
    public LocalDate asDate(final String key) {
        return get(key, AttributeAccessor::asDate);
    }

    @Nullable
    public LocalTime asTime(final String key) {
        return get(key, AttributeAccessor::asTime);
    }

    @Nullable
    public ZonedDateTime asDateTime(final String key) {
        return get(key, AttributeAccessor::asDateTime);
    }

    @Nullable
    public List<LocalDate> asSetDate(final String key) {
        return get(key, AttributeAccessor::asSetDate);
    }

    @Nullable
    public List<LocalTime> asSetTime(final String key) {
        return get(key, AttributeAccessor::asSetTime);
    }

    @Nullable
    public List<ZonedDateTime> asSetDateTime(final String key) {
        return get(key, AttributeAccessor::asSetDateTime);
    }

    @Nullable
    public String asString(final String key) {
        return get(key, AttributeAccessor::asString);
    }

    @Nullable
    public Boolean asBoolean(final String key) {
        return get(key, AttributeAccessor::asBoolean);
    }

    @Nullable
    public Double asDouble(final String key) {
        return get(key, AttributeAccessor::asDouble);
    }

    @Nullable
    public LocalizedString asLocalizedString(final String key) {
        return get(key, AttributeAccessor::asLocalizedString);
    }

    @Nullable
    public AttributePlainEnumValue asEnum(final String key) {
        return get(key, AttributeAccessor::asEnum);
    }

    @Nullable
    public AttributeLocalizedEnumValue asLocalizedEnum(final String key) {
        return get(key, AttributeAccessor::asLocalizedEnum);
    }

    @Nullable
    public Long asLong(final String key) {
        return get(key, AttributeAccessor::asLong);
    }

    @Nullable
    public Reference asReference(final String key) {
        return get(key, AttributeAccessor::asReference);
    }

    @Nullable
    public TypedMoney asMoney(final String key) {
        return get(key, AttributeAccessor::asMoney);
    }

    @Nullable
    public List<String> asSetString(final String key) {
        return get(key, AttributeAccessor::asSetString);
    }

    @Nullable
    public List<Boolean> asSetBoolean(final String key) {
        return get(key, AttributeAccessor::asSetBoolean);
    }

    @Nullable
    public List<Double> asSetDouble(final String key) {
        return get(key, AttributeAccessor::asSetDouble);
    }

    @Nullable
    public List<LocalizedString> asSetLocalizedString(final String key) {
        return get(key, AttributeAccessor::asSetLocalizedString);
    }

    @Nullable
    public List<AttributePlainEnumValue> asSetEnum(final String key) {
        return get(key, AttributeAccessor::asSetEnum);
    }

    @Nullable
    public List<AttributeLocalizedEnumValue> asSetLocalizedEnum(final String key) {
        return get(key, AttributeAccessor::asSetLocalizedEnum);
    }

    @Nullable
    public List<Long> asSetLong(final String key) {
        return get(key, AttributeAccessor::asSetLong);
    }

    @Nullable
    public List<Reference> asSetReference(final String key) {
        return get(key, AttributeAccessor::asSetReference);
    }

    @Nullable
    public List<TypedMoney> asSetMoney(final String key) {
        return get(key, AttributeAccessor::asSetMoney);
    }

    @Nullable
    public AttributesAccessor asNested(final String key) {
        return AttributesAccessor.of(get(key, AttributeAccessor::asNested));
    }

    @Nullable
    public List<AttributesAccessor> asSetNested(final String key) {
        return Objects.requireNonNull(get(key, AttributeAccessor::asSetNested))
                .stream()
                .map(AttributesAccessor::of)
                .collect(Collectors.toList());
    }
}
