
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethodRemoveShippingRateAction" rel="nofollow">Remove ShippingRate</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodRemoveShippingRateChangeImpl implements ShippingMethodRemoveShippingRateChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.ZoneResourceIdentifier zone;

    private com.commercetools.history.models.common.ShippingRate previousValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingMethodRemoveShippingRateChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("zone") final com.commercetools.history.models.common.ZoneResourceIdentifier zone,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.ShippingRate previousValue) {
        this.change = change;
        this.zone = zone;
        this.previousValue = previousValue;
        this.type = SHIPPING_METHOD_REMOVE_SHIPPING_RATE_CHANGE;
    }

    /**
     * create empty instance
     */
    public ShippingMethodRemoveShippingRateChangeImpl() {
        this.type = SHIPPING_METHOD_REMOVE_SHIPPING_RATE_CHANGE;
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
     *  <p>Zone from which the ShippingRate was removed.</p>
     */

    public com.commercetools.history.models.common.ZoneResourceIdentifier getZone() {
        return this.zone;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public com.commercetools.history.models.common.ShippingRate getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setZone(final com.commercetools.history.models.common.ZoneResourceIdentifier zone) {
        this.zone = zone;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.ShippingRate previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingMethodRemoveShippingRateChangeImpl that = (ShippingMethodRemoveShippingRateChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(zone, that.zone)
                .append(previousValue, that.previousValue)
                .append(type, that.type)
                .append(change, that.change)
                .append(zone, that.zone)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(change).append(zone).append(previousValue).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("zone", zone)
                .append("previousValue", previousValue)
                .build();
    }

    @Override
    public ShippingMethodRemoveShippingRateChange copyDeep() {
        return ShippingMethodRemoveShippingRateChange.deepCopy(this);
    }
}
