
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomLineItemShippingDetailsActionImpl.class)
public interface StagedOrderSetCustomLineItemShippingDetailsAction extends StagedOrderUpdateAction {

    String SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS = "setCustomLineItemShippingDetails";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    public void setCustomLineItemId(final String customLineItemId);

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public static StagedOrderSetCustomLineItemShippingDetailsAction of() {
        return new StagedOrderSetCustomLineItemShippingDetailsActionImpl();
    }

    public static StagedOrderSetCustomLineItemShippingDetailsAction of(
            final StagedOrderSetCustomLineItemShippingDetailsAction template) {
        StagedOrderSetCustomLineItemShippingDetailsActionImpl instance = new StagedOrderSetCustomLineItemShippingDetailsActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    public static StagedOrderSetCustomLineItemShippingDetailsActionBuilder builder() {
        return StagedOrderSetCustomLineItemShippingDetailsActionBuilder.of();
    }

    public static StagedOrderSetCustomLineItemShippingDetailsActionBuilder builder(
            final StagedOrderSetCustomLineItemShippingDetailsAction template) {
        return StagedOrderSetCustomLineItemShippingDetailsActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetCustomLineItemShippingDetailsAction(
            Function<StagedOrderSetCustomLineItemShippingDetailsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomLineItemShippingDetailsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomLineItemShippingDetailsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetCustomLineItemShippingDetailsAction>";
            }
        };
    }
}
