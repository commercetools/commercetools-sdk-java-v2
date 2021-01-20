
package com.commercetools.api.models.order;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.ItemState;
import com.commercetools.api.models.order.OrderImportLineItemStateActionImpl;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderImportLineItemStateActionImpl.class)
public interface OrderImportLineItemStateAction extends OrderUpdateAction {

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @NotNull
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    public void setLineItemId(final String lineItemId);

    @JsonIgnore
    public void setState(final ItemState... state);

    public void setState(final List<ItemState> state);

    public static OrderImportLineItemStateAction of() {
        return new OrderImportLineItemStateActionImpl();
    }

    public static OrderImportLineItemStateAction of(final OrderImportLineItemStateAction template) {
        OrderImportLineItemStateActionImpl instance = new OrderImportLineItemStateActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setState(template.getState());
        return instance;
    }

    public static OrderImportLineItemStateActionBuilder builder() {
        return OrderImportLineItemStateActionBuilder.of();
    }

    public static OrderImportLineItemStateActionBuilder builder(final OrderImportLineItemStateAction template) {
        return OrderImportLineItemStateActionBuilder.of(template);
    }

    default <T> T withOrderImportLineItemStateAction(Function<OrderImportLineItemStateAction, T> helper) {
        return helper.apply(this);
    }
}
