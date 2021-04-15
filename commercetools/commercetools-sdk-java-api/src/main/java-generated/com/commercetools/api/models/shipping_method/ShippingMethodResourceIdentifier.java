
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingMethodResourceIdentifierImpl.class)
public interface ShippingMethodResourceIdentifier extends ResourceIdentifier {

    String SHIPPING_METHOD = "shipping-method";

    public static ShippingMethodResourceIdentifier of() {
        return new ShippingMethodResourceIdentifierImpl();
    }

    public static ShippingMethodResourceIdentifier of(final ShippingMethodResourceIdentifier template) {
        ShippingMethodResourceIdentifierImpl instance = new ShippingMethodResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ShippingMethodResourceIdentifierBuilder builder() {
        return ShippingMethodResourceIdentifierBuilder.of();
    }

    public static ShippingMethodResourceIdentifierBuilder builder(final ShippingMethodResourceIdentifier template) {
        return ShippingMethodResourceIdentifierBuilder.of(template);
    }

    default <T> T withShippingMethodResourceIdentifier(Function<ShippingMethodResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
