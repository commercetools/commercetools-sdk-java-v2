
package com.commercetools.api.models.order_edit;

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
 *  <p>Setting the Order's <code>customerId</code> does not recalculate prices or discounts on the Order. If the Customer belongs to a Customer Group, <code>customerGroup</code> on the Order is updated automatically.</p>
 *  <p>Produces the OrderCustomerSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetCustomerIdActionImpl implements StagedOrderSetCustomerIdAction, ModelBase {

    private String action;

    private String customerId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetCustomerIdActionImpl(@JsonProperty("customerId") final String customerId) {
        this.customerId = customerId;
        this.action = SET_CUSTOMER_ID;
    }

    /**
     * create empty instance
     */
    public StagedOrderSetCustomerIdActionImpl() {
        this.action = SET_CUSTOMER_ID;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of an existing Customer. If empty, any existing value is removed.</p>
     */

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetCustomerIdActionImpl that = (StagedOrderSetCustomerIdActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customerId, that.customerId)
                .append(action, that.action)
                .append(customerId, that.customerId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customerId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("customerId", customerId)
                .build();
    }

}
