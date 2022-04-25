
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomShippingMethodChangeValueImpl.class)
public interface CustomShippingMethodChangeValue {

    @NotNull
    @JsonProperty("name")
    public String getName();

    public void setName(final String name);

    public static CustomShippingMethodChangeValue of() {
        return new CustomShippingMethodChangeValueImpl();
    }

    public static CustomShippingMethodChangeValue of(final CustomShippingMethodChangeValue template) {
        CustomShippingMethodChangeValueImpl instance = new CustomShippingMethodChangeValueImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static CustomShippingMethodChangeValueBuilder builder() {
        return CustomShippingMethodChangeValueBuilder.of();
    }

    public static CustomShippingMethodChangeValueBuilder builder(final CustomShippingMethodChangeValue template) {
        return CustomShippingMethodChangeValueBuilder.of(template);
    }

    default <T> T withCustomShippingMethodChangeValue(Function<CustomShippingMethodChangeValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomShippingMethodChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomShippingMethodChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<CustomShippingMethodChangeValue>";
            }
        };
    }
}
