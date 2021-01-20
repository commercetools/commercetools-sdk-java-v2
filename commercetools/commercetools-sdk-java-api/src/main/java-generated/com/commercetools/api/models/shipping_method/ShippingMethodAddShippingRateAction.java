
package com.commercetools.api.models.shipping_method;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.shipping_method.ShippingMethodAddShippingRateActionImpl;
import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.zone.ZoneResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingMethodAddShippingRateActionImpl.class)
public interface ShippingMethodAddShippingRateAction extends ShippingMethodUpdateAction {

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

    public static ShippingMethodAddShippingRateAction of() {
        return new ShippingMethodAddShippingRateActionImpl();
    }

    public static ShippingMethodAddShippingRateAction of(final ShippingMethodAddShippingRateAction template) {
        ShippingMethodAddShippingRateActionImpl instance = new ShippingMethodAddShippingRateActionImpl();
        instance.setZone(template.getZone());
        instance.setShippingRate(template.getShippingRate());
        return instance;
    }

    public static ShippingMethodAddShippingRateActionBuilder builder() {
        return ShippingMethodAddShippingRateActionBuilder.of();
    }

    public static ShippingMethodAddShippingRateActionBuilder builder(
            final ShippingMethodAddShippingRateAction template) {
        return ShippingMethodAddShippingRateActionBuilder.of(template);
    }

    default <T> T withShippingMethodAddShippingRateAction(Function<ShippingMethodAddShippingRateAction, T> helper) {
        return helper.apply(this);
    }
}
