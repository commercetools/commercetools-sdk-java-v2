
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartChangeCustomLineItemQuantityActionImpl.class)
public interface CartChangeCustomLineItemQuantityAction extends CartUpdateAction {

    String CHANGE_CUSTOM_LINE_ITEM_QUANTITY = "changeCustomLineItemQuantity";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    public void setCustomLineItemId(final String customLineItemId);

    public void setQuantity(final Long quantity);

    public static CartChangeCustomLineItemQuantityAction of() {
        return new CartChangeCustomLineItemQuantityActionImpl();
    }

    public static CartChangeCustomLineItemQuantityAction of(final CartChangeCustomLineItemQuantityAction template) {
        CartChangeCustomLineItemQuantityActionImpl instance = new CartChangeCustomLineItemQuantityActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static CartChangeCustomLineItemQuantityActionBuilder builder() {
        return CartChangeCustomLineItemQuantityActionBuilder.of();
    }

    public static CartChangeCustomLineItemQuantityActionBuilder builder(
            final CartChangeCustomLineItemQuantityAction template) {
        return CartChangeCustomLineItemQuantityActionBuilder.of(template);
    }

    default <T> T withCartChangeCustomLineItemQuantityAction(
            Function<CartChangeCustomLineItemQuantityAction, T> helper) {
        return helper.apply(this);
    }
}
