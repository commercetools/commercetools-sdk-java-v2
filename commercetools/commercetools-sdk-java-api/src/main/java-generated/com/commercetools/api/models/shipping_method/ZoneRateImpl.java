
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ZoneRateImpl implements ZoneRate, ModelBase {

    private com.commercetools.api.models.zone.ZoneReference zone;

    private java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> shippingRates;

    @JsonCreator
    ZoneRateImpl(@JsonProperty("zone") final com.commercetools.api.models.zone.ZoneReference zone,
            @JsonProperty("shippingRates") final java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> shippingRates) {
        this.zone = zone;
        this.shippingRates = shippingRates;
    }

    public ZoneRateImpl() {
    }

    public com.commercetools.api.models.zone.ZoneReference getZone() {
        return this.zone;
    }

    /**
    *  <p>The array does not contain two shipping rates with the same currency.</p>
    */
    public java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> getShippingRates() {
        return this.shippingRates;
    }

    public void setZone(final com.commercetools.api.models.zone.ZoneReference zone) {
        this.zone = zone;
    }

    public void setShippingRates(final com.commercetools.api.models.shipping_method.ShippingRate... shippingRates) {
        this.shippingRates = new ArrayList<>(Arrays.asList(shippingRates));
    }

    public void setShippingRates(
            final java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> shippingRates) {
        this.shippingRates = shippingRates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ZoneRateImpl that = (ZoneRateImpl) o;

        return new EqualsBuilder().append(zone, that.zone).append(shippingRates, that.shippingRates).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(zone).append(shippingRates).toHashCode();
    }

}
