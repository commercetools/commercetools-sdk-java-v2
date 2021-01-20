
package com.commercetools.api.models.cart;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CartSetLineItemShippingDetailsActionImpl;
import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetLineItemShippingDetailsActionImpl.class)
public interface CartSetLineItemShippingDetailsAction extends CartUpdateAction {

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
}
