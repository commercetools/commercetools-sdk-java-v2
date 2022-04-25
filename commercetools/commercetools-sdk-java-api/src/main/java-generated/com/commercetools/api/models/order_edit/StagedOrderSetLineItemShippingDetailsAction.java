
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
@JsonDeserialize(as = StagedOrderSetLineItemShippingDetailsActionImpl.class)
public interface StagedOrderSetLineItemShippingDetailsAction extends StagedOrderUpdateAction {

    String SET_LINE_ITEM_SHIPPING_DETAILS = "setLineItemShippingDetails";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    public void setLineItemId(final String lineItemId);

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public static StagedOrderSetLineItemShippingDetailsAction of() {
        return new StagedOrderSetLineItemShippingDetailsActionImpl();
    }

    public static StagedOrderSetLineItemShippingDetailsAction of(
            final StagedOrderSetLineItemShippingDetailsAction template) {
        StagedOrderSetLineItemShippingDetailsActionImpl instance = new StagedOrderSetLineItemShippingDetailsActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    public static StagedOrderSetLineItemShippingDetailsActionBuilder builder() {
        return StagedOrderSetLineItemShippingDetailsActionBuilder.of();
    }

    public static StagedOrderSetLineItemShippingDetailsActionBuilder builder(
            final StagedOrderSetLineItemShippingDetailsAction template) {
        return StagedOrderSetLineItemShippingDetailsActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetLineItemShippingDetailsAction(
            Function<StagedOrderSetLineItemShippingDetailsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemShippingDetailsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemShippingDetailsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetLineItemShippingDetailsAction>";
            }
        };
    }
}
