
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
@JsonDeserialize(as = CartSetLineItemTotalPriceActionImpl.class)
public interface CartSetLineItemTotalPriceAction extends CartUpdateAction {

    String SET_LINE_ITEM_TOTAL_PRICE = "setLineItemTotalPrice";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

    public void setLineItemId(final String lineItemId);

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    public static CartSetLineItemTotalPriceAction of() {
        return new CartSetLineItemTotalPriceActionImpl();
    }

    public static CartSetLineItemTotalPriceAction of(final CartSetLineItemTotalPriceAction template) {
        CartSetLineItemTotalPriceActionImpl instance = new CartSetLineItemTotalPriceActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        return instance;
    }

    public static CartSetLineItemTotalPriceActionBuilder builder() {
        return CartSetLineItemTotalPriceActionBuilder.of();
    }

    public static CartSetLineItemTotalPriceActionBuilder builder(final CartSetLineItemTotalPriceAction template) {
        return CartSetLineItemTotalPriceActionBuilder.of(template);
    }

    default <T> T withCartSetLineItemTotalPriceAction(Function<CartSetLineItemTotalPriceAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemTotalPriceAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemTotalPriceAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetLineItemTotalPriceAction>";
            }
        };
    }
}
