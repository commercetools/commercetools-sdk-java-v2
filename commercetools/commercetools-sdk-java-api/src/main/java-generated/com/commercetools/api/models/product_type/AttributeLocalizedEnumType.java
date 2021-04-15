
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AttributeLocalizedEnumTypeImpl.class)
public interface AttributeLocalizedEnumType extends AttributeType {

    String LENUM = "lenum";

    @NotNull
    @Valid
    @JsonProperty("values")
    public List<AttributeLocalizedEnumValue> getValues();

    @JsonIgnore
    public void setValues(final AttributeLocalizedEnumValue... values);

    public void setValues(final List<AttributeLocalizedEnumValue> values);

    public static AttributeLocalizedEnumType of() {
        return new AttributeLocalizedEnumTypeImpl();
    }

    public static AttributeLocalizedEnumType of(final AttributeLocalizedEnumType template) {
        AttributeLocalizedEnumTypeImpl instance = new AttributeLocalizedEnumTypeImpl();
        instance.setValues(template.getValues());
        return instance;
    }

    public static AttributeLocalizedEnumTypeBuilder builder() {
        return AttributeLocalizedEnumTypeBuilder.of();
    }

    public static AttributeLocalizedEnumTypeBuilder builder(final AttributeLocalizedEnumType template) {
        return AttributeLocalizedEnumTypeBuilder.of(template);
    }

    default <T> T withAttributeLocalizedEnumType(Function<AttributeLocalizedEnumType, T> helper) {
        return helper.apply(this);
    }
}
