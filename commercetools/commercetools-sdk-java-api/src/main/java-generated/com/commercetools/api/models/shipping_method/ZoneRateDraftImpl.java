
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ZoneRateDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ZoneRateDraftImpl implements ZoneRateDraft, ModelBase {

    private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;

    private java.util.List<com.commercetools.api.models.shipping_method.ShippingRateDraft> shippingRates;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ZoneRateDraftImpl(@JsonProperty("zone") final com.commercetools.api.models.zone.ZoneResourceIdentifier zone,
            @JsonProperty("shippingRates") final java.util.List<com.commercetools.api.models.shipping_method.ShippingRateDraft> shippingRates) {
        this.zone = zone;
        this.shippingRates = shippingRates;
    }

    /**
     * create empty instance
     */
    public ZoneRateDraftImpl() {
    }

    /**
     *  <p>Sets the Zone for which the shippng rates are valid.</p>
     */

    public com.commercetools.api.models.zone.ZoneResourceIdentifier getZone() {
        return this.zone;
    }

    /**
     *  <p>Shipping rates for the <code>currencies</code> configured in the Project. The array must not contain two ShippingRates with the same CurrencyCode.</p>
     */

    public java.util.List<com.commercetools.api.models.shipping_method.ShippingRateDraft> getShippingRates() {
        return this.shippingRates;
    }

    public void setZone(final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
        this.zone = zone;
    }

    public void setShippingRates(
            final com.commercetools.api.models.shipping_method.ShippingRateDraft... shippingRates) {
        this.shippingRates = new ArrayList<>(Arrays.asList(shippingRates));
    }

    public void setShippingRates(
            final java.util.List<com.commercetools.api.models.shipping_method.ShippingRateDraft> shippingRates) {
        this.shippingRates = shippingRates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ZoneRateDraftImpl that = (ZoneRateDraftImpl) o;

        return new EqualsBuilder().append(zone, that.zone)
                .append(shippingRates, that.shippingRates)
                .append(zone, that.zone)
                .append(shippingRates, that.shippingRates)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(zone).append(shippingRates).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("zone", zone)
                .append("shippingRates", shippingRates)
                .build();
    }

    @Override
    public ZoneRateDraft copyDeep() {
        return ZoneRateDraft.deepCopy(this);
    }
}
