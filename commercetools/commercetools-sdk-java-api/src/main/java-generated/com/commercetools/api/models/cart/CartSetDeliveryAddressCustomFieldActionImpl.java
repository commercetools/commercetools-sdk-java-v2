
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetDeliveryAddressCustomFieldActionImpl implements CartSetDeliveryAddressCustomFieldAction {

    private String action;

    private String deliveryId;

    private String name;

    private java.lang.Object value;

    @JsonCreator
    CartSetDeliveryAddressCustomFieldActionImpl(@JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("name") final String name, @JsonProperty("value") final java.lang.Object value) {
        this.deliveryId = deliveryId;
        this.name = name;
        this.value = value;
        this.action = SET_DELIVERY_ADDRESS_CUSTOM_FIELD;
    }

    public CartSetDeliveryAddressCustomFieldActionImpl() {
        this.action = SET_DELIVERY_ADDRESS_CUSTOM_FIELD;
    }

    public String getAction() {
        return this.action;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public String getName() {
        return this.name;
    }

    public java.lang.Object getValue() {
        return this.value;
    }

    public void setDeliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetDeliveryAddressCustomFieldActionImpl that = (CartSetDeliveryAddressCustomFieldActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(deliveryId, that.deliveryId)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(deliveryId).append(name).append(value).toHashCode();
    }

}
