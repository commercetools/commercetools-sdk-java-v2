
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AttributePlainEnumValueImpl.class)
public interface AttributePlainEnumValue {

    @NotNull
    @JsonProperty("key")
    public String getKey();

    @NotNull
    @JsonProperty("label")
    public String getLabel();

    public void setKey(final String key);

    public void setLabel(final String label);

    public static AttributePlainEnumValue of() {
        return new AttributePlainEnumValueImpl();
    }

    public static AttributePlainEnumValue of(final AttributePlainEnumValue template) {
        AttributePlainEnumValueImpl instance = new AttributePlainEnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public static AttributePlainEnumValueBuilder builder() {
        return AttributePlainEnumValueBuilder.of();
    }

    public static AttributePlainEnumValueBuilder builder(final AttributePlainEnumValue template) {
        return AttributePlainEnumValueBuilder.of(template);
    }

    default <T> T withAttributePlainEnumValue(Function<AttributePlainEnumValue, T> helper) {
        return helper.apply(this);
    }
}
