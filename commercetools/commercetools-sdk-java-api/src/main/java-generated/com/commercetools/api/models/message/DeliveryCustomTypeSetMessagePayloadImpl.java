
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
 *  <p>Generated after adding a Custom Type to a Delivery using the Set Custom Type update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryCustomTypeSetMessagePayloadImpl implements DeliveryCustomTypeSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.type.CustomFields customFields;

    private String previousTypeId;

    private String deliveryId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DeliveryCustomTypeSetMessagePayloadImpl(
            @JsonProperty("customFields") final com.commercetools.api.models.type.CustomFields customFields,
            @JsonProperty("previousTypeId") final String previousTypeId,
            @JsonProperty("deliveryId") final String deliveryId) {
        this.customFields = customFields;
        this.previousTypeId = previousTypeId;
        this.deliveryId = deliveryId;
        this.type = DELIVERY_CUSTOM_TYPE_SET;
    }

    /**
     * create empty instance
     */
    public DeliveryCustomTypeSetMessagePayloadImpl() {
        this.type = DELIVERY_CUSTOM_TYPE_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The Custom Fields that have been set.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustomFields() {
        return this.customFields;
    }

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     */

    public String getPreviousTypeId() {
        return this.previousTypeId;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public void setCustomFields(final com.commercetools.api.models.type.CustomFields customFields) {
        this.customFields = customFields;
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

        DeliveryCustomTypeSetMessagePayloadImpl that = (DeliveryCustomTypeSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customFields, that.customFields)
                .append(previousTypeId, that.previousTypeId)
                .append(deliveryId, that.deliveryId)
                .append(type, that.type)
                .append(customFields, that.customFields)
                .append(previousTypeId, that.previousTypeId)
                .append(deliveryId, that.deliveryId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(customFields)
                .append(previousTypeId)
                .append(deliveryId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("customFields", customFields)
                .append("previousTypeId", previousTypeId)
                .append("deliveryId", deliveryId)
                .build();
    }

    @Override
    public DeliveryCustomTypeSetMessagePayload copyDeep() {
        return DeliveryCustomTypeSetMessagePayload.deepCopy(this);
    }
}
