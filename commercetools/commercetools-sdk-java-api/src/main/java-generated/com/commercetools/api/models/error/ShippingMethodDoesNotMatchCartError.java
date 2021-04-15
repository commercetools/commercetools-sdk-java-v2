
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingMethodDoesNotMatchCartErrorImpl.class)
public interface ShippingMethodDoesNotMatchCartError extends ErrorObject {

    String SHIPPING_METHOD_DOES_NOT_MATCH_CART = "ShippingMethodDoesNotMatchCart";

    public static ShippingMethodDoesNotMatchCartError of() {
        return new ShippingMethodDoesNotMatchCartErrorImpl();
    }

    public static ShippingMethodDoesNotMatchCartError of(final ShippingMethodDoesNotMatchCartError template) {
        ShippingMethodDoesNotMatchCartErrorImpl instance = new ShippingMethodDoesNotMatchCartErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static ShippingMethodDoesNotMatchCartErrorBuilder builder() {
        return ShippingMethodDoesNotMatchCartErrorBuilder.of();
    }

    public static ShippingMethodDoesNotMatchCartErrorBuilder builder(
            final ShippingMethodDoesNotMatchCartError template) {
        return ShippingMethodDoesNotMatchCartErrorBuilder.of(template);
    }

    default <T> T withShippingMethodDoesNotMatchCartError(Function<ShippingMethodDoesNotMatchCartError, T> helper) {
        return helper.apply(this);
    }
}
