
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderDeletedMessagePayloadImpl implements OrderDeletedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.order.Order order;

    @JsonCreator
    OrderDeletedMessagePayloadImpl(@JsonProperty("order") final com.commercetools.api.models.order.Order order) {
        this.order = order;
        this.type = ORDER_DELETED;
    }

    public OrderDeletedMessagePayloadImpl() {
        this.type = ORDER_DELETED;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.order.Order getOrder() {
        return this.order;
    }

    public void setOrder(final com.commercetools.api.models.order.Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderDeletedMessagePayloadImpl that = (OrderDeletedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(order, that.order).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(order).toHashCode();
    }

}
