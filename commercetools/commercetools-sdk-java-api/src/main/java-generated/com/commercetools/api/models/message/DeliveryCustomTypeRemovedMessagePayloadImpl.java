
package com.commercetools.api.models.message;

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
 *  <p>Generated after removing a Custom Type from a Delivery using the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetDeliveryCustomTypeAction" rel="nofollow">Set Custom Type</a> update action with empty parameters.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryCustomTypeRemovedMessagePayloadImpl implements DeliveryCustomTypeRemovedMessagePayload, ModelBase {

    private String type;

    private String previousTypeId;

    private String deliveryId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DeliveryCustomTypeRemovedMessagePayloadImpl(@JsonProperty("previousTypeId") final String previousTypeId,
            @JsonProperty("deliveryId") final String deliveryId) {
        this.previousTypeId = previousTypeId;
        this.deliveryId = deliveryId;
        this.type = DELIVERY_CUSTOM_TYPE_REMOVED;
    }

    /**
     * create empty instance
     */
    public DeliveryCustomTypeRemovedMessagePayloadImpl() {
        this.type = DELIVERY_CUSTOM_TYPE_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     */

    public String getPreviousTypeId() {
        return this.previousTypeId;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public void setPreviousTypeId(final String previousTypeId) {
        this.previousTypeId = previousTypeId;
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

        DeliveryCustomTypeRemovedMessagePayloadImpl that = (DeliveryCustomTypeRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(previousTypeId, that.previousTypeId)
                .append(deliveryId, that.deliveryId)
                .append(type, that.type)
                .append(previousTypeId, that.previousTypeId)
                .append(deliveryId, that.deliveryId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(previousTypeId).append(deliveryId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("previousTypeId", previousTypeId)
                .append("deliveryId", deliveryId)
                .build();
    }

    @Override
    public DeliveryCustomTypeRemovedMessagePayload copyDeep() {
        return DeliveryCustomTypeRemovedMessagePayload.deepCopy(this);
    }
}
