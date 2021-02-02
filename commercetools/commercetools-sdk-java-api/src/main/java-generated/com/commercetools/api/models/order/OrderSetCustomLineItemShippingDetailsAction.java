
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetCustomLineItemShippingDetailsActionImpl.class)
public interface OrderSetCustomLineItemShippingDetailsAction extends OrderUpdateAction {

    String SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS = "setCustomLineItemShippingDetails";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    public void setCustomLineItemId(final String customLineItemId);

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public static OrderSetCustomLineItemShippingDetailsAction of() {
        return new OrderSetCustomLineItemShippingDetailsActionImpl();
    }

    public static OrderSetCustomLineItemShippingDetailsAction of(
            final OrderSetCustomLineItemShippingDetailsAction template) {
        OrderSetCustomLineItemShippingDetailsActionImpl instance = new OrderSetCustomLineItemShippingDetailsActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    public static OrderSetCustomLineItemShippingDetailsActionBuilder builder() {
        return OrderSetCustomLineItemShippingDetailsActionBuilder.of();
    }

    public static OrderSetCustomLineItemShippingDetailsActionBuilder builder(
            final OrderSetCustomLineItemShippingDetailsAction template) {
        return OrderSetCustomLineItemShippingDetailsActionBuilder.of(template);
    }

    default <T> T withOrderSetCustomLineItemShippingDetailsAction(
            Function<OrderSetCustomLineItemShippingDetailsAction, T> helper) {
        return helper.apply(this);
    }
}
