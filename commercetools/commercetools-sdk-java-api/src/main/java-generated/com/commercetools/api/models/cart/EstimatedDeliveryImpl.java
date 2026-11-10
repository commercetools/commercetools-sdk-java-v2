
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Estimated time window during which a shipment is expected to be delivered. The window is anchored to the selected Shipping Method and the shipping destination.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EstimatedDeliveryImpl implements EstimatedDelivery, ModelBase {

    private java.time.ZonedDateTime from;

    private java.time.ZonedDateTime until;

    /**
     * create instance with all properties
     */
    @JsonCreator
    EstimatedDeliveryImpl(@JsonProperty("from") final java.time.ZonedDateTime from,
            @JsonProperty("until") final java.time.ZonedDateTime until) {
        this.from = from;
        this.until = until;
    }

    /**
     * create empty instance
     */
    public EstimatedDeliveryImpl() {
    }

    /**
     *  <p>Date and time (UTC) of the earliest expected delivery.</p>
     */

    public java.time.ZonedDateTime getFrom() {
        return this.from;
    }

    /**
     *  <p>Date and time (UTC) of the latest expected delivery. When both <code>from</code> and <code>until</code> are set, <code>until</code> must be equal to or later than <code>from</code>.</p>
     */

    public java.time.ZonedDateTime getUntil() {
        return this.until;
    }

    public void setFrom(final java.time.ZonedDateTime from) {
        this.from = from;
    }

    public void setUntil(final java.time.ZonedDateTime until) {
        this.until = until;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        EstimatedDeliveryImpl that = (EstimatedDeliveryImpl) o;

        return new EqualsBuilder().append(from, that.from)
                .append(until, that.until)
                .append(from, that.from)
                .append(until, that.until)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(from).append(until).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("from", from)
                .append("until", until)
                .build();
    }

    @Override
    public EstimatedDelivery copyDeep() {
        return EstimatedDelivery.deepCopy(this);
    }
}
