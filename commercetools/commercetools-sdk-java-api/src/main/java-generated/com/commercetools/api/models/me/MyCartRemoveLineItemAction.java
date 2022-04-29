
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCartRemoveLineItemActionImpl.class)
public interface MyCartRemoveLineItemAction extends MyCartUpdateAction {

    String REMOVE_LINE_ITEM = "removeLineItem";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

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

    @Valid
    @JsonProperty("shippingDetailsToRemove")
    public ItemShippingDetailsDraft getShippingDetailsToRemove();

    public void setLineItemId(final String lineItemId);

    public void setQuantity(final Long quantity);

    public void setExternalPrice(final Money externalPrice);

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    public void setShippingDetailsToRemove(final ItemShippingDetailsDraft shippingDetailsToRemove);

    public static MyCartRemoveLineItemAction of() {
        return new MyCartRemoveLineItemActionImpl();
    }

    public static MyCartRemoveLineItemAction of(final MyCartRemoveLineItemAction template) {
        MyCartRemoveLineItemActionImpl instance = new MyCartRemoveLineItemActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setExternalPrice(template.getExternalPrice());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        instance.setShippingDetailsToRemove(template.getShippingDetailsToRemove());
        return instance;
    }

    public static MyCartRemoveLineItemActionBuilder builder() {
        return MyCartRemoveLineItemActionBuilder.of();
    }

    public static MyCartRemoveLineItemActionBuilder builder(final MyCartRemoveLineItemAction template) {
        return MyCartRemoveLineItemActionBuilder.of(template);
    }

    default <T> T withMyCartRemoveLineItemAction(Function<MyCartRemoveLineItemAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartRemoveLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartRemoveLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartRemoveLineItemAction>";
            }
        };
    }
}
