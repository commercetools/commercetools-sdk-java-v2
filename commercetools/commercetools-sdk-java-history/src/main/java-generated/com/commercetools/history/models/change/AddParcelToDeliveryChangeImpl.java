
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
 *   <li>Add Parcel on Orders.</li>
 *   <li>Add Parcel on Staged Orders.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddParcelToDeliveryChangeImpl implements AddParcelToDeliveryChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.Parcel nextValue;

    private String deliveryId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AddParcelToDeliveryChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.Parcel nextValue,
            @JsonProperty("deliveryId") final String deliveryId) {
        this.change = change;
        this.nextValue = nextValue;
        this.deliveryId = deliveryId;
        this.type = ADD_PARCEL_TO_DELIVERY_CHANGE;
    }

    /**
     * create empty instance
     */
    public AddParcelToDeliveryChangeImpl() {
        this.type = ADD_PARCEL_TO_DELIVERY_CHANGE;
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
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.Parcel getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p><code>id</code> of the Delivery to which the Parcel was added.</p>
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setNextValue(final com.commercetools.history.models.common.Parcel nextValue) {
        this.nextValue = nextValue;
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

        AddParcelToDeliveryChangeImpl that = (AddParcelToDeliveryChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .append(deliveryId, that.deliveryId)
                .append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .append(deliveryId, that.deliveryId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(nextValue)
                .append(deliveryId)
                .toHashCode();
    }

}
