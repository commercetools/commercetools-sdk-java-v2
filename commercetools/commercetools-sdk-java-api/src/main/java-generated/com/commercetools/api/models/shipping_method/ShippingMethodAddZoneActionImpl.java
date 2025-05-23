
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
 * ShippingMethodAddZoneAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodAddZoneActionImpl implements ShippingMethodAddZoneAction, ModelBase {

    private String action;

    private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingMethodAddZoneActionImpl(
            @JsonProperty("zone") final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
        this.zone = zone;
        this.action = ADD_ZONE;
    }

    /**
     * create empty instance
     */
    public ShippingMethodAddZoneActionImpl() {
        this.action = ADD_ZONE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to add to <code>zoneRates</code>.</p>
     */

    public com.commercetools.api.models.zone.ZoneResourceIdentifier getZone() {
        return this.zone;
    }

    public void setZone(final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
        this.zone = zone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingMethodAddZoneActionImpl that = (ShippingMethodAddZoneActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(zone, that.zone)
                .append(action, that.action)
                .append(zone, that.zone)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(zone).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("zone", zone)
                .build();
    }

    @Override
    public ShippingMethodAddZoneAction copyDeep() {
        return ShippingMethodAddZoneAction.deepCopy(this);
    }
}
