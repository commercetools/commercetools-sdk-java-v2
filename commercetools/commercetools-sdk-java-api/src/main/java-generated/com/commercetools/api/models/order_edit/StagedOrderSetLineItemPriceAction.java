
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetLineItemPriceActionImpl.class)
public interface StagedOrderSetLineItemPriceAction extends StagedOrderUpdateAction {

    String SET_LINE_ITEM_PRICE = "setLineItemPrice";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
    *  <p>For storing money values in fractions of the minor unit in a currency, use <a href="ctp:api:type:HighPrecisionMoneyDraft">HighPrecisionMoneyDraft</a> instead.</p>
    */
    @Valid
    @JsonProperty("externalPrice")
    public Money getExternalPrice();

    public void setLineItemId(final String lineItemId);

    public void setExternalPrice(final Money externalPrice);

    public static StagedOrderSetLineItemPriceAction of() {
        return new StagedOrderSetLineItemPriceActionImpl();
    }

    public static StagedOrderSetLineItemPriceAction of(final StagedOrderSetLineItemPriceAction template) {
        StagedOrderSetLineItemPriceActionImpl instance = new StagedOrderSetLineItemPriceActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalPrice(template.getExternalPrice());
        return instance;
    }

    public static StagedOrderSetLineItemPriceActionBuilder builder() {
        return StagedOrderSetLineItemPriceActionBuilder.of();
    }

    public static StagedOrderSetLineItemPriceActionBuilder builder(final StagedOrderSetLineItemPriceAction template) {
        return StagedOrderSetLineItemPriceActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetLineItemPriceAction(Function<StagedOrderSetLineItemPriceAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemPriceAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemPriceAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetLineItemPriceAction>";
            }
        };
    }
}
