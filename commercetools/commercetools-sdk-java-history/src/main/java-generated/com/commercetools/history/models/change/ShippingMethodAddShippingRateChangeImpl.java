
package com.commercetools.history.models.change;

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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethodAddShippingRateAction" rel="nofollow">Add ShippingRate</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodAddShippingRateChangeImpl implements ShippingMethodAddShippingRateChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.ZoneResourceIdentifier zone;

    private com.commercetools.history.models.common.ShippingRate nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingMethodAddShippingRateChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("zone") final com.commercetools.history.models.common.ZoneResourceIdentifier zone,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.ShippingRate nextValue) {
        this.change = change;
        this.zone = zone;
        this.nextValue = nextValue;
        this.type = SHIPPING_METHOD_ADD_SHIPPING_RATE_CHANGE;
    }

    /**
     * create empty instance
     */
    public ShippingMethodAddShippingRateChangeImpl() {
        this.type = SHIPPING_METHOD_ADD_SHIPPING_RATE_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Zone to which the ShippingRate was added.</p>
     */

    public com.commercetools.history.models.common.ZoneResourceIdentifier getZone() {
        return this.zone;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.ShippingRate getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setZone(final com.commercetools.history.models.common.ZoneResourceIdentifier zone) {
        this.zone = zone;
    }

    public void setNextValue(final com.commercetools.history.models.common.ShippingRate nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingMethodAddShippingRateChangeImpl that = (ShippingMethodAddShippingRateChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(zone, that.zone)
                .append(nextValue, that.nextValue)
                .append(type, that.type)
                .append(change, that.change)
                .append(zone, that.zone)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(change).append(zone).append(nextValue).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("zone", zone)
                .append("nextValue", nextValue)
                .build();
    }

    @Override
    public ShippingMethodAddShippingRateChange copyDeep() {
        return ShippingMethodAddShippingRateChange.deepCopy(this);
    }
}
