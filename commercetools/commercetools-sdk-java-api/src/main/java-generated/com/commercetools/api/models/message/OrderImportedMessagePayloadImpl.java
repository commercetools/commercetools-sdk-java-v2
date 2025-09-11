
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders/import:POST" rel="nofollow">Order Import</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderImportedMessagePayloadImpl implements OrderImportedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.order.Order order;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderImportedMessagePayloadImpl(@JsonProperty("order") final com.commercetools.api.models.order.Order order) {
        this.order = order;
        this.type = ORDER_IMPORTED;
    }

    /**
     * create empty instance
     */
    public OrderImportedMessagePayloadImpl() {
        this.type = ORDER_IMPORTED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> that was imported.</p>
     */

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

        OrderImportedMessagePayloadImpl that = (OrderImportedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(order, that.order)
                .append(type, that.type)
                .append(order, that.order)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(order).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("order", order)
                .build();
    }

    @Override
    public OrderImportedMessagePayload copyDeep() {
        return OrderImportedMessagePayload.deepCopy(this);
    }
}
