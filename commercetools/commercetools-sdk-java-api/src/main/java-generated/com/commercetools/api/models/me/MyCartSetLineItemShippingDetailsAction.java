
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCartSetLineItemShippingDetailsActionImpl.class)
public interface MyCartSetLineItemShippingDetailsAction extends MyCartUpdateAction {

    String SET_LINE_ITEM_SHIPPING_DETAILS = "setLineItemShippingDetails";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    public void setLineItemId(final String lineItemId);

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public static MyCartSetLineItemShippingDetailsAction of() {
        return new MyCartSetLineItemShippingDetailsActionImpl();
    }

    public static MyCartSetLineItemShippingDetailsAction of(final MyCartSetLineItemShippingDetailsAction template) {
        MyCartSetLineItemShippingDetailsActionImpl instance = new MyCartSetLineItemShippingDetailsActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    public static MyCartSetLineItemShippingDetailsActionBuilder builder() {
        return MyCartSetLineItemShippingDetailsActionBuilder.of();
    }

    public static MyCartSetLineItemShippingDetailsActionBuilder builder(
            final MyCartSetLineItemShippingDetailsAction template) {
        return MyCartSetLineItemShippingDetailsActionBuilder.of(template);
    }

    default <T> T withMyCartSetLineItemShippingDetailsAction(
            Function<MyCartSetLineItemShippingDetailsAction, T> helper) {
        return helper.apply(this);
    }
}
