
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
 *  <p>Generated when a Custom Field has been removed from the Delivery using the Set CustomField update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryCustomFieldRemovedMessagePayloadImpl
        implements DeliveryCustomFieldRemovedMessagePayload, ModelBase {

    private String type;

    private String name;

    private String deliveryId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DeliveryCustomFieldRemovedMessagePayloadImpl(@JsonProperty("name") final String name,
            @JsonProperty("deliveryId") final String deliveryId) {
        this.name = name;
        this.deliveryId = deliveryId;
        this.type = DELIVERY_CUSTOM_FIELD_REMOVED;
    }

    /**
     * create empty instance
     */
    public DeliveryCustomFieldRemovedMessagePayloadImpl() {
        this.type = DELIVERY_CUSTOM_FIELD_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public void setName(final String name) {
        this.name = name;
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

        DeliveryCustomFieldRemovedMessagePayloadImpl that = (DeliveryCustomFieldRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(name, that.name)
                .append(deliveryId, that.deliveryId)
                .append(type, that.type)
                .append(name, that.name)
                .append(deliveryId, that.deliveryId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(name).append(deliveryId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("name", name)
                .append("deliveryId", deliveryId)
                .build();
    }

}
