
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
@JsonDeserialize(as = CartSetLineItemShippingDetailsActionImpl.class)
public interface CartSetLineItemShippingDetailsAction extends CartUpdateAction {

    String SET_LINE_ITEM_SHIPPING_DETAILS = "setLineItemShippingDetails";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    public void setLineItemId(final String lineItemId);

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public static CartSetLineItemShippingDetailsAction of() {
        return new CartSetLineItemShippingDetailsActionImpl();
    }

    public static CartSetLineItemShippingDetailsAction of(final CartSetLineItemShippingDetailsAction template) {
        CartSetLineItemShippingDetailsActionImpl instance = new CartSetLineItemShippingDetailsActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    public static CartSetLineItemShippingDetailsActionBuilder builder() {
        return CartSetLineItemShippingDetailsActionBuilder.of();
    }

    public static CartSetLineItemShippingDetailsActionBuilder builder(
            final CartSetLineItemShippingDetailsAction template) {
        return CartSetLineItemShippingDetailsActionBuilder.of(template);
    }

    default <T> T withCartSetLineItemShippingDetailsAction(Function<CartSetLineItemShippingDetailsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemShippingDetailsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemShippingDetailsAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetLineItemShippingDetailsAction>";
            }
        };
    }
}
