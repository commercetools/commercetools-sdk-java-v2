
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ShippingMethodAddShippingRateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodAddShippingRateActionImpl implements ShippingMethodAddShippingRateAction, ModelBase {

    private String action;

    private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;

    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    @JsonCreator
    ShippingMethodAddShippingRateActionImpl(
            @JsonProperty("zone") final com.commercetools.api.models.zone.ZoneResourceIdentifier zone,
            @JsonProperty("shippingRate") final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.zone = zone;
        this.shippingRate = shippingRate;
        this.action = ADD_SHIPPING_RATE;
    }

    public ShippingMethodAddShippingRateActionImpl() {
        this.action = ADD_SHIPPING_RATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Zone to which the ShippingRate should be added.</p>
     */

    public com.commercetools.api.models.zone.ZoneResourceIdentifier getZone() {
        return this.zone;
    }

    /**
     *  <p>Value to add to <code>shippingRates</code>.</p>
     */

    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate() {
        return this.shippingRate;
    }

    public void setZone(final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
        this.zone = zone;
    }

    public void setShippingRate(final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingMethodAddShippingRateActionImpl that = (ShippingMethodAddShippingRateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(zone, that.zone)
                .append(shippingRate, that.shippingRate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(zone).append(shippingRate).toHashCode();
    }

}
