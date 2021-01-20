
package com.commercetools.api.models.order;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order.OrderReferenceImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderReferenceImpl.class)
public interface OrderReference extends Reference {

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
}
