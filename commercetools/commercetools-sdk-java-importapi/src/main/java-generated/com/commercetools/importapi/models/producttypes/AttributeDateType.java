
package com.commercetools.importapi.models.producttypes;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.producttypes.AttributeDateTypeImpl;
import com.commercetools.importapi.models.producttypes.AttributeType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AttributeDateTypeImpl.class)
public interface AttributeDateType extends AttributeType {

    public static AttributeDateType of() {
        return new AttributeDateTypeImpl();
    }

    public static AttributeDateType of(final AttributeDateType template) {
        AttributeDateTypeImpl instance = new AttributeDateTypeImpl();
        return instance;
    }

    public static AttributeDateTypeBuilder builder() {
        return AttributeDateTypeBuilder.of();
    }

    public static AttributeDateTypeBuilder builder(final AttributeDateType template) {
        return AttributeDateTypeBuilder.of(template);
    }

    default <T> T withAttributeDateType(Function<AttributeDateType, T> helper) {
        return helper.apply(this);
    }
}
