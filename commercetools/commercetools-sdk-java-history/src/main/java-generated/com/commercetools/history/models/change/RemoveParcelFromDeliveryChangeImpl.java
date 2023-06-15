
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

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Remove Parcel From Delivery on Orders.</li>
 *   <li>Remove Parcel From Delivery on Staged Orders.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveParcelFromDeliveryChangeImpl implements RemoveParcelFromDeliveryChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.Parcel previousValue;

    private String deliveryId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RemoveParcelFromDeliveryChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.Parcel previousValue,
            @JsonProperty("deliveryId") final String deliveryId) {
        this.change = change;
        this.previousValue = previousValue;
        this.deliveryId = deliveryId;
        this.type = REMOVE_PARCEL_FROM_DELIVERY_CHANGE;
    }

    /**
     * create empty instance
     */
    public RemoveParcelFromDeliveryChangeImpl() {
        this.type = REMOVE_PARCEL_FROM_DELIVERY_CHANGE;
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
     *  <p>Value before the change.</p>
     */

    public com.commercetools.history.models.common.Parcel getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p><code>id</code> of the Delivery from which the Parcel was removed.</p>
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.Parcel previousValue) {
        this.previousValue = previousValue;
    }

    public void setDeliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RemoveParcelFromDeliveryChangeImpl that = (RemoveParcelFromDeliveryChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(deliveryId, that.deliveryId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(deliveryId)
                .toHashCode();
    }

}
