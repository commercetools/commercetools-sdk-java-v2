
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderRemoveDeliveryActionImpl implements OrderRemoveDeliveryAction, ModelBase {

    private String action;

    private String deliveryId;

    @JsonCreator
    OrderRemoveDeliveryActionImpl(@JsonProperty("deliveryId") final String deliveryId) {
        this.deliveryId = deliveryId;
        this.action = REMOVE_DELIVERY;
    }

    public OrderRemoveDeliveryActionImpl() {
        this.action = REMOVE_DELIVERY;
    }

    public String getAction() {
        return this.action;
    }

    public String getDeliveryId() {
        return this.deliveryId;
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

        OrderRemoveDeliveryActionImpl that = (OrderRemoveDeliveryActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(deliveryId, that.deliveryId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(deliveryId).toHashCode();
    }

}
