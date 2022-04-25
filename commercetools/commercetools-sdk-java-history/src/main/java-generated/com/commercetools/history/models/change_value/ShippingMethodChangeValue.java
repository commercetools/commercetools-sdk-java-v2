
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingMethodChangeValueImpl.class)
public interface ShippingMethodChangeValue {

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @JsonProperty("name")
    public String getName();

    public void setId(final String id);

    public void setName(final String name);

    public static ShippingMethodChangeValue of() {
        return new ShippingMethodChangeValueImpl();
    }

    public static ShippingMethodChangeValue of(final ShippingMethodChangeValue template) {
        ShippingMethodChangeValueImpl instance = new ShippingMethodChangeValueImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        return instance;
    }

    public static ShippingMethodChangeValueBuilder builder() {
        return ShippingMethodChangeValueBuilder.of();
    }

    public static ShippingMethodChangeValueBuilder builder(final ShippingMethodChangeValue template) {
        return ShippingMethodChangeValueBuilder.of(template);
    }

    default <T> T withShippingMethodChangeValue(Function<ShippingMethodChangeValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodChangeValue>";
            }
        };
    }
}
