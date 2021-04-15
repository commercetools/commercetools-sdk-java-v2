
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AttributeLocalizableTextTypeImpl.class)
public interface AttributeLocalizableTextType extends AttributeType {

    String LTEXT = "ltext";

    public static AttributeLocalizableTextType of() {
        return new AttributeLocalizableTextTypeImpl();
    }

    public static AttributeLocalizableTextType of(final AttributeLocalizableTextType template) {
        AttributeLocalizableTextTypeImpl instance = new AttributeLocalizableTextTypeImpl();
        return instance;
    }

    public static AttributeLocalizableTextTypeBuilder builder() {
        return AttributeLocalizableTextTypeBuilder.of();
    }

    public static AttributeLocalizableTextTypeBuilder builder(final AttributeLocalizableTextType template) {
        return AttributeLocalizableTextTypeBuilder.of(template);
    }

    default <T> T withAttributeLocalizableTextType(Function<AttributeLocalizableTextType, T> helper) {
        return helper.apply(this);
    }
}
