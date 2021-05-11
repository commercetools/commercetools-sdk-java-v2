
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetShippingAddressAndShippingMethodActionImpl.class)
public interface StagedOrderSetShippingAddressAndShippingMethodAction extends StagedOrderUpdateAction {

    String SET_SHIPPING_ADDRESS_AND_SHIPPING_METHOD = "setShippingAddressAndShippingMethod";

    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodResourceIdentifier getShippingMethod();

    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setAddress(final BaseAddress address);

    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static StagedOrderSetShippingAddressAndShippingMethodAction of() {
        return new StagedOrderSetShippingAddressAndShippingMethodActionImpl();
    }

    public static StagedOrderSetShippingAddressAndShippingMethodAction of(
            final StagedOrderSetShippingAddressAndShippingMethodAction template) {
        StagedOrderSetShippingAddressAndShippingMethodActionImpl instance = new StagedOrderSetShippingAddressAndShippingMethodActionImpl();
        instance.setAddress(template.getAddress());
        instance.setShippingMethod(template.getShippingMethod());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    public static StagedOrderSetShippingAddressAndShippingMethodActionBuilder builder() {
        return StagedOrderSetShippingAddressAndShippingMethodActionBuilder.of();
    }

    public static StagedOrderSetShippingAddressAndShippingMethodActionBuilder builder(
            final StagedOrderSetShippingAddressAndShippingMethodAction template) {
        return StagedOrderSetShippingAddressAndShippingMethodActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetShippingAddressAndShippingMethodAction(
            Function<StagedOrderSetShippingAddressAndShippingMethodAction, T> helper) {
        return helper.apply(this);
    }
}
