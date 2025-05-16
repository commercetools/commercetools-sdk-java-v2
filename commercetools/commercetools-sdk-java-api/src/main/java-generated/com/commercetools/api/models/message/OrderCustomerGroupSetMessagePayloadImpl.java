
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
 *  <p>Generated after a successful Set Customer Group update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomerGroupSetMessagePayloadImpl implements OrderCustomerGroupSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    private com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderCustomerGroupSetMessagePayloadImpl(
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup,
            @JsonProperty("oldCustomerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup) {
        this.customerGroup = customerGroup;
        this.oldCustomerGroup = oldCustomerGroup;
        this.type = ORDER_CUSTOMER_GROUP_SET;
    }

    /**
     * create empty instance
     */
    public OrderCustomerGroupSetMessagePayloadImpl() {
        this.type = ORDER_CUSTOMER_GROUP_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>CustomerGroup on the Order after the Set Customer Group update action.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>CustomerGroup on the Order before the Set Customer Group update action.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupReference getOldCustomerGroup() {
        return this.oldCustomerGroup;
    }

    public void setCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
    }

    public void setOldCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup) {
        this.oldCustomerGroup = oldCustomerGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderCustomerGroupSetMessagePayloadImpl that = (OrderCustomerGroupSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customerGroup, that.customerGroup)
                .append(oldCustomerGroup, that.oldCustomerGroup)
                .append(type, that.type)
                .append(customerGroup, that.customerGroup)
                .append(oldCustomerGroup, that.oldCustomerGroup)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(customerGroup).append(oldCustomerGroup).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("customerGroup", customerGroup)
                .append("oldCustomerGroup", oldCustomerGroup)
                .build();
    }

    @Override
    public OrderCustomerGroupSetMessagePayload copyDeep() {
        return OrderCustomerGroupSetMessagePayload.deepCopy(this);
    }
}
