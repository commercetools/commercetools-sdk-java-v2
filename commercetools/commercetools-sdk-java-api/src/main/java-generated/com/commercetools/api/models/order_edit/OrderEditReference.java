
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderEditReferenceImpl.class)
public interface OrderEditReference extends Reference {

    String ORDER_EDIT = "order-edit";

    @Valid
    @JsonProperty("obj")
    public OrderEdit getObj();

    public void setObj(final OrderEdit obj);

    public static OrderEditReference of() {
        return new OrderEditReferenceImpl();
    }

    public static OrderEditReference of(final OrderEditReference template) {
        OrderEditReferenceImpl instance = new OrderEditReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static OrderEditReferenceBuilder builder() {
        return OrderEditReferenceBuilder.of();
    }

    public static OrderEditReferenceBuilder builder(final OrderEditReference template) {
        return OrderEditReferenceBuilder.of(template);
    }

    default <T> T withOrderEditReference(Function<OrderEditReference, T> helper) {
        return helper.apply(this);
    }
}
