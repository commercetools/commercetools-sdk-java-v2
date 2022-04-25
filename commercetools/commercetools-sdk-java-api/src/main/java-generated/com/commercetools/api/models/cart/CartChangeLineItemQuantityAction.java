
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartChangeLineItemQuantityActionImpl.class)
public interface CartChangeLineItemQuantityAction extends CartUpdateAction {

    String CHANGE_LINE_ITEM_QUANTITY = "changeLineItemQuantity";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.
    *  For storing money values in fractions of the minor unit in a currency, use <a href="ctp:api:type:HighPrecisionMoneyDraft">HighPrecisionMoneyDraft</a> instead.</p>
    */
    @Valid
    @JsonProperty("externalPrice")
    public Money getExternalPrice();

    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

    public void setLineItemId(final String lineItemId);

    public void setQuantity(final Long quantity);

    public void setExternalPrice(final Money externalPrice);

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    public static CartChangeLineItemQuantityAction of() {
        return new CartChangeLineItemQuantityActionImpl();
    }

    public static CartChangeLineItemQuantityAction of(final CartChangeLineItemQuantityAction template) {
        CartChangeLineItemQuantityActionImpl instance = new CartChangeLineItemQuantityActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setExternalPrice(template.getExternalPrice());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        return instance;
    }

    public static CartChangeLineItemQuantityActionBuilder builder() {
        return CartChangeLineItemQuantityActionBuilder.of();
    }

    public static CartChangeLineItemQuantityActionBuilder builder(final CartChangeLineItemQuantityAction template) {
        return CartChangeLineItemQuantityActionBuilder.of(template);
    }

    default <T> T withCartChangeLineItemQuantityAction(Function<CartChangeLineItemQuantityAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartChangeLineItemQuantityAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartChangeLineItemQuantityAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartChangeLineItemQuantityAction>";
            }
        };
    }
}
