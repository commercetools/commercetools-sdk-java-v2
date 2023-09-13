
package com.commercetools.api.models.product;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.List;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.models.product_type.AttributePlainEnumValue;

public class AttributeAccess {
    private final Attribute attribute;

    public AttributeAccess(Attribute attribute) {
        this.attribute = attribute;
    }

    public static AttributeAccess of(Attribute attribute) {
        return new AttributeAccess(attribute);
    }

    public LocalDate asDate() {
        return AttributeAccessor.asDate(attribute);
    }

    public LocalTime asTime() {
        return AttributeAccessor.asTime(attribute);
    }

    public ZonedDateTime asDateTime() {
        return AttributeAccessor.asDateTime(attribute);
    }

    public List<LocalDate> asSetDate() {
        return AttributeAccessor.asSetDate(attribute);
    }

    public List<LocalTime> asSetTime() {
        return AttributeAccessor.asSetTime(attribute);
    }

    public List<ZonedDateTime> asSetDateTime() {
        return AttributeAccessor.asSetDateTime(attribute);
    }

    public String asString() {
        return AttributeAccessor.asString(attribute);
    }

    public Boolean asBoolean() {
        return AttributeAccessor.asBoolean(attribute);
    }

    public Double asDouble() {
        return AttributeAccessor.asDouble(attribute);
    }

    public LocalizedString asLocalizedString() {
        return AttributeAccessor.asLocalizedString(attribute);
    }

    public AttributePlainEnumValue asEnum() {
        return AttributeAccessor.asEnum(attribute);
    }

    public AttributeLocalizedEnumValue asLocalizedEnum() {
        return AttributeAccessor.asLocalizedEnum(attribute);
    }

    public Long asLong() {
        return AttributeAccessor.asLong(attribute);
    }

    public Reference asReference() {
        return AttributeAccessor.asReference(attribute);
    }

    public TypedMoney asMoney() {
        return AttributeAccessor.asMoney(attribute);
    }

    public List<String> asSetString() {
        return AttributeAccessor.asSetString(attribute);
    }

    public List<Boolean> asSetBoolean() {
        return AttributeAccessor.asSetBoolean(attribute);
    }

    public List<Double> asSetDouble() {
        return AttributeAccessor.asSetDouble(attribute);
    }

    public List<LocalizedString> asSetLocalizedString() {
        return AttributeAccessor.asSetLocalizedString(attribute);
    }

    public List<AttributePlainEnumValue> asSetEnum() {
        return AttributeAccessor.asSetEnum(attribute);
    }

    public List<AttributeLocalizedEnumValue> asSetLocalizedEnum() {
        return AttributeAccessor.asSetLocalizedEnum(attribute);
    }

    public List<Long> asSetLong() {
        return AttributeAccessor.asSetLong(attribute);
    }

    public List<Reference> asSetReference() {
        return AttributeAccessor.asSetReference(attribute);
    }

    public List<TypedMoney> asSetMoney() {
        return AttributeAccessor.asSetMoney(attribute);
    }

    public List<Attribute> asNested() {
        return AttributeAccessor.asNested(attribute);
    }

    public List<List<Attribute>> asSetNested() {
        return AttributeAccessor.asSetNested(attribute);
    }
}
