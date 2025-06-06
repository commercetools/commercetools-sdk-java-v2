
package com.commercetools.history.models.label;

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
 * OrderLabel
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderLabelImpl implements OrderLabel, ModelBase {

    private String type;

    private String customerEmail;

    private String orderNumber;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderLabelImpl(@JsonProperty("customerEmail") final String customerEmail,
            @JsonProperty("orderNumber") final String orderNumber) {
        this.customerEmail = customerEmail;
        this.orderNumber = orderNumber;
        this.type = ORDER_LABEL;
    }

    /**
     * create empty instance
     */
    public OrderLabelImpl() {
        this.type = ORDER_LABEL;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Email address of the Customer that the Order belongs to.</p>
     */

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
     *  <p>User-defined unique identifier of the Order that is unique across a Project.</p>
     */

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public void setCustomerEmail(final String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setOrderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderLabelImpl that = (OrderLabelImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customerEmail, that.customerEmail)
                .append(orderNumber, that.orderNumber)
                .append(type, that.type)
                .append(customerEmail, that.customerEmail)
                .append(orderNumber, that.orderNumber)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(customerEmail).append(orderNumber).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("customerEmail", customerEmail)
                .append("orderNumber", orderNumber)
                .build();
    }

    @Override
    public OrderLabel copyDeep() {
        return OrderLabel.deepCopy(this);
    }
}
