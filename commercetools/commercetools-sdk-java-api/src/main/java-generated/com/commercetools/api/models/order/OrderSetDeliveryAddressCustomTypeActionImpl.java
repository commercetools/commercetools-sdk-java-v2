
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetDeliveryAddressCustomTypeActionImpl implements OrderSetDeliveryAddressCustomTypeAction {

    private String action;

    private String deliveryId;

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    private com.commercetools.api.models.type.FieldContainer fields;

    @JsonCreator
    OrderSetDeliveryAddressCustomTypeActionImpl(@JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type,
            @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.deliveryId = deliveryId;
        this.type = type;
        this.fields = fields;
        this.action = SET_DELIVERY_ADDRESS_CUSTOM_TYPE;
    }

    public OrderSetDeliveryAddressCustomTypeActionImpl() {
        this.action = SET_DELIVERY_ADDRESS_CUSTOM_TYPE;
    }

    public String getAction() {
        return this.action;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

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

        OrderSetDeliveryAddressCustomTypeActionImpl that = (OrderSetDeliveryAddressCustomTypeActionImpl) o;

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
