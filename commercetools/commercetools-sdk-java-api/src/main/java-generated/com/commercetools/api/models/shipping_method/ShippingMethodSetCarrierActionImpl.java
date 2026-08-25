
package com.commercetools.api.models.shipping_method;

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
 * ShippingMethodSetCarrierAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodSetCarrierActionImpl implements ShippingMethodSetCarrierAction, ModelBase {

    private String action;

    private String carrier;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingMethodSetCarrierActionImpl(@JsonProperty("carrier") final String carrier) {
        this.carrier = carrier;
        this.action = SET_CARRIER;
    }

    /**
     * create empty instance
     */
    public ShippingMethodSetCarrierActionImpl() {
        this.action = SET_CARRIER;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Name of the carrier that delivers the parcel, for example <code>DHL</code>. If <code>carrier</code> is absent or <code>null</code>, it is removed if it exists.</p>
     */

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(final String carrier) {
        this.carrier = carrier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingMethodSetCarrierActionImpl that = (ShippingMethodSetCarrierActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(carrier, that.carrier)
                .append(action, that.action)
                .append(carrier, that.carrier)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(carrier).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("carrier", carrier)
                .build();
    }

    @Override
    public ShippingMethodSetCarrierAction copyDeep() {
        return ShippingMethodSetCarrierAction.deepCopy(this);
    }
}
