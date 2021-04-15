
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderRemoveLineItemActionImpl.class)
public interface StagedOrderRemoveLineItemAction extends StagedOrderUpdateAction {

    String REMOVE_LINE_ITEM = "removeLineItem";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @JsonProperty("quantity")
    public Double getQuantity();

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

    public void setQuantity(final Double quantity);

    public void setExternalPrice(final Money externalPrice);

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    public void setShippingDetailsToRemove(final ItemShippingDetailsDraft shippingDetailsToRemove);

    public static StagedOrderRemoveLineItemAction of() {
        return new StagedOrderRemoveLineItemActionImpl();
    }

    public static StagedOrderRemoveLineItemAction of(final StagedOrderRemoveLineItemAction template) {
        StagedOrderRemoveLineItemActionImpl instance = new StagedOrderRemoveLineItemActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setExternalPrice(template.getExternalPrice());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        instance.setShippingDetailsToRemove(template.getShippingDetailsToRemove());
        return instance;
    }

    public static StagedOrderRemoveLineItemActionBuilder builder() {
        return StagedOrderRemoveLineItemActionBuilder.of();
    }

    public static StagedOrderRemoveLineItemActionBuilder builder(final StagedOrderRemoveLineItemAction template) {
        return StagedOrderRemoveLineItemActionBuilder.of(template);
    }

    default <T> T withStagedOrderRemoveLineItemAction(Function<StagedOrderRemoveLineItemAction, T> helper) {
        return helper.apply(this);
    }
}
