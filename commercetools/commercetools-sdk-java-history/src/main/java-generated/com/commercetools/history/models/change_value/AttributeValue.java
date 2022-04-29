
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AttributeValueImpl.class)
public interface AttributeValue {

    @NotNull
    @JsonProperty("name")
    public String getName();

    @NotNull
    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static AttributeValue of() {
        return new AttributeValueImpl();
    }

    public static AttributeValue of(final AttributeValue template) {
        AttributeValueImpl instance = new AttributeValueImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static AttributeValueBuilder builder() {
        return AttributeValueBuilder.of();
    }

    public static AttributeValueBuilder builder(final AttributeValue template) {
        return AttributeValueBuilder.of(template);
    }

    default <T> T withAttributeValue(Function<AttributeValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeValue>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeValue>";
            }
        };
    }
}
