
package com.commercetools.api.models.order;

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
 * OrderSetDeliveryCustomTypeAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetDeliveryCustomTypeActionImpl implements OrderSetDeliveryCustomTypeAction, ModelBase {

    private String action;

    private String deliveryId;

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSetDeliveryCustomTypeActionImpl(@JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type,
            @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.deliveryId = deliveryId;
        this.type = type;
        this.fields = fields;
        this.action = SET_DELIVERY_CUSTOM_TYPE;
    }

    /**
     * create empty instance
     */
    public OrderSetDeliveryCustomTypeActionImpl() {
        this.action = SET_DELIVERY_CUSTOM_TYPE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p>Defines the Type that extends the Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Delivery.</p>
     */

    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Delivery.</p>
     */

    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public void setDeliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
    }

    public void setFields(final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSetDeliveryCustomTypeActionImpl that = (OrderSetDeliveryCustomTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(deliveryId, that.deliveryId)
                .append(type, that.type)
                .append(fields, that.fields)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(deliveryId).append(type).append(fields).toHashCode();
    }

}
