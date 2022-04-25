
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>References an order by key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderKeyReferenceImpl.class)
public interface OrderKeyReference extends KeyReference {

    String ORDER = "order";

    public static OrderKeyReference of() {
        return new OrderKeyReferenceImpl();
    }

    public static OrderKeyReference of(final OrderKeyReference template) {
        OrderKeyReferenceImpl instance = new OrderKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static OrderKeyReferenceBuilder builder() {
        return OrderKeyReferenceBuilder.of();
    }

    public static OrderKeyReferenceBuilder builder(final OrderKeyReference template) {
        return OrderKeyReferenceBuilder.of(template);
    }

    default <T> T withOrderKeyReference(Function<OrderKeyReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<OrderKeyReference>";
            }
        };
    }
}
