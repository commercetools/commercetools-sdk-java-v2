
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderResourceIdentifierImpl.class)
public interface OrderResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Order> {

    String ORDER = "order";

    public static OrderResourceIdentifier of() {
        return new OrderResourceIdentifierImpl();
    }

    public static OrderResourceIdentifier of(final OrderResourceIdentifier template) {
        OrderResourceIdentifierImpl instance = new OrderResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static OrderResourceIdentifierBuilder builder() {
        return OrderResourceIdentifierBuilder.of();
    }

    public static OrderResourceIdentifierBuilder builder(final OrderResourceIdentifier template) {
        return OrderResourceIdentifierBuilder.of(template);
    }

    default <T> T withOrderResourceIdentifier(Function<OrderResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<OrderResourceIdentifier>";
            }
        };
    }
}
