
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetLineItemTotalPriceActionImpl.class)
public interface StagedOrderSetLineItemTotalPriceAction extends StagedOrderUpdateAction {

    String SET_LINE_ITEM_TOTAL_PRICE = "setLineItemTotalPrice";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

    public void setLineItemId(final String lineItemId);

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    public static StagedOrderSetLineItemTotalPriceAction of() {
        return new StagedOrderSetLineItemTotalPriceActionImpl();
    }

    public static StagedOrderSetLineItemTotalPriceAction of(final StagedOrderSetLineItemTotalPriceAction template) {
        StagedOrderSetLineItemTotalPriceActionImpl instance = new StagedOrderSetLineItemTotalPriceActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        return instance;
    }

    public static StagedOrderSetLineItemTotalPriceActionBuilder builder() {
        return StagedOrderSetLineItemTotalPriceActionBuilder.of();
    }

    public static StagedOrderSetLineItemTotalPriceActionBuilder builder(
            final StagedOrderSetLineItemTotalPriceAction template) {
        return StagedOrderSetLineItemTotalPriceActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetLineItemTotalPriceAction(
            Function<StagedOrderSetLineItemTotalPriceAction, T> helper) {
        return helper.apply(this);
    }
}
