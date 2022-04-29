
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>References a shipping method by key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingMethodKeyReferenceImpl.class)
public interface ShippingMethodKeyReference extends KeyReference {

    String SHIPPING_METHOD = "shipping-method";

    public static ShippingMethodKeyReference of() {
        return new ShippingMethodKeyReferenceImpl();
    }

    public static ShippingMethodKeyReference of(final ShippingMethodKeyReference template) {
        ShippingMethodKeyReferenceImpl instance = new ShippingMethodKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ShippingMethodKeyReferenceBuilder builder() {
        return ShippingMethodKeyReferenceBuilder.of();
    }

    public static ShippingMethodKeyReferenceBuilder builder(final ShippingMethodKeyReference template) {
        return ShippingMethodKeyReferenceBuilder.of(template);
    }

    default <T> T withShippingMethodKeyReference(Function<ShippingMethodKeyReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodKeyReference>";
            }
        };
    }
}
