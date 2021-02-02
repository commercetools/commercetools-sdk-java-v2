
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AttributeTimeTypeImpl.class)
public interface AttributeTimeType extends AttributeType {

    String TIME = "time";

    public static AttributeTimeType of() {
        return new AttributeTimeTypeImpl();
    }

    public static AttributeTimeType of(final AttributeTimeType template) {
        AttributeTimeTypeImpl instance = new AttributeTimeTypeImpl();
        return instance;
    }

    public static AttributeTimeTypeBuilder builder() {
        return AttributeTimeTypeBuilder.of();
    }

    public static AttributeTimeTypeBuilder builder(final AttributeTimeType template) {
        return AttributeTimeTypeBuilder.of(template);
    }

    default <T> T withAttributeTimeType(Function<AttributeTimeType, T> helper) {
        return helper.apply(this);
    }
}
