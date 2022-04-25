
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderReferenceImpl.class)
public interface OrderReference extends Reference, com.commercetools.api.models.Identifiable<Order> {

    String ORDER = "order";

    @Valid
    @JsonProperty("obj")
    public Order getObj();

    public void setObj(final Order obj);

    public static OrderReference of() {
        return new OrderReferenceImpl();
    }

    public static OrderReference of(final OrderReference template) {
        OrderReferenceImpl instance = new OrderReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static OrderReferenceBuilder builder() {
        return OrderReferenceBuilder.of();
    }

    public static OrderReferenceBuilder builder(final OrderReference template) {
        return OrderReferenceBuilder.of(template);
    }

    default <T> T withOrderReference(Function<OrderReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderReference>() {
            @Override
            public String toString() {
                return "TypeReference<OrderReference>";
            }
        };
    }
}
