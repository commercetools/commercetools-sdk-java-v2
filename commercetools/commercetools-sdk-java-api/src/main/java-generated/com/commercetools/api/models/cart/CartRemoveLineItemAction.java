
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
@JsonDeserialize(as = CartRemoveLineItemActionImpl.class)
public interface CartRemoveLineItemAction extends CartUpdateAction {

    String REMOVE_LINE_ITEM = "removeLineItem";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @JsonProperty("quantity")
    public Long getQuantity();

    @Valid
    @JsonProperty("externalPrice")
    public Money getExternalPrice();

    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

    @Valid
    @JsonProperty("shippingDetailsToRemove")
    public ItemShippingDetailsDraft getShippingDetailsToRemove();

    public void setLineItemId(final String lineItemId);

    public void setQuantity(final Long quantity);

    public void setExternalPrice(final Money externalPrice);

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    public void setShippingDetailsToRemove(final ItemShippingDetailsDraft shippingDetailsToRemove);

    public static CartRemoveLineItemAction of() {
        return new CartRemoveLineItemActionImpl();
    }

    public static CartRemoveLineItemAction of(final CartRemoveLineItemAction template) {
        CartRemoveLineItemActionImpl instance = new CartRemoveLineItemActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setExternalPrice(template.getExternalPrice());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        instance.setShippingDetailsToRemove(template.getShippingDetailsToRemove());
        return instance;
    }

    public static CartRemoveLineItemActionBuilder builder() {
        return CartRemoveLineItemActionBuilder.of();
    }

    public static CartRemoveLineItemActionBuilder builder(final CartRemoveLineItemAction template) {
        return CartRemoveLineItemActionBuilder.of(template);
    }

    default <T> T withCartRemoveLineItemAction(Function<CartRemoveLineItemAction, T> helper) {
        return helper.apply(this);
    }
}
