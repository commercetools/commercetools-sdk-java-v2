
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodAddZoneActionImpl implements ShippingMethodAddZoneAction {

    private String action;

    private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;

    @JsonCreator
    ShippingMethodAddZoneActionImpl(
            @JsonProperty("zone") final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
        this.zone = zone;
        this.action = ADD_ZONE;
    }

    public ShippingMethodAddZoneActionImpl() {
        this.action = ADD_ZONE;
    }

    public String getAction() {
        return this.action;
    }

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

        return new EqualsBuilder().append(action, that.action).append(zone, that.zone).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(zone).toHashCode();
    }

}
