
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetCustomLineItemShippingDetailsActionImpl.class)
public interface CartSetCustomLineItemShippingDetailsAction extends CartUpdateAction {

    String SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS = "setCustomLineItemShippingDetails";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    public void setCustomLineItemId(final String customLineItemId);

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public static CartSetCustomLineItemShippingDetailsAction of() {
        return new CartSetCustomLineItemShippingDetailsActionImpl();
    }

    public static CartSetCustomLineItemShippingDetailsAction of(
            final CartSetCustomLineItemShippingDetailsAction template) {
        CartSetCustomLineItemShippingDetailsActionImpl instance = new CartSetCustomLineItemShippingDetailsActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    public static CartSetCustomLineItemShippingDetailsActionBuilder builder() {
        return CartSetCustomLineItemShippingDetailsActionBuilder.of();
    }

    public static CartSetCustomLineItemShippingDetailsActionBuilder builder(
            final CartSetCustomLineItemShippingDetailsAction template) {
        return CartSetCustomLineItemShippingDetailsActionBuilder.of(template);
    }

    default <T> T withCartSetCustomLineItemShippingDetailsAction(
            Function<CartSetCustomLineItemShippingDetailsAction, T> helper) {
        return helper.apply(this);
    }
}
