
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.zone.ZoneResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingMethodRemoveShippingRateActionImpl.class)
public interface ShippingMethodRemoveShippingRateAction extends ShippingMethodUpdateAction {

    String REMOVE_SHIPPING_RATE = "removeShippingRate";

    @NotNull
    @Valid
    @JsonProperty("zone")
    public ZoneResourceIdentifier getZone();

    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRateDraft getShippingRate();

    public void setZone(final ZoneResourceIdentifier zone);

    public void setShippingRate(final ShippingRateDraft shippingRate);

    public static ShippingMethodRemoveShippingRateAction of() {
        return new ShippingMethodRemoveShippingRateActionImpl();
    }

    public static ShippingMethodRemoveShippingRateAction of(final ShippingMethodRemoveShippingRateAction template) {
        ShippingMethodRemoveShippingRateActionImpl instance = new ShippingMethodRemoveShippingRateActionImpl();
        instance.setZone(template.getZone());
        instance.setShippingRate(template.getShippingRate());
        return instance;
    }

    public static ShippingMethodRemoveShippingRateActionBuilder builder() {
        return ShippingMethodRemoveShippingRateActionBuilder.of();
    }

    public static ShippingMethodRemoveShippingRateActionBuilder builder(
            final ShippingMethodRemoveShippingRateAction template) {
        return ShippingMethodRemoveShippingRateActionBuilder.of(template);
    }

    default <T> T withShippingMethodRemoveShippingRateAction(
            Function<ShippingMethodRemoveShippingRateAction, T> helper) {
        return helper.apply(this);
    }
}
