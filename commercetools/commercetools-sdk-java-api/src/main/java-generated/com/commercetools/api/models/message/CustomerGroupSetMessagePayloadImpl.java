
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
public class CustomerGroupSetMessagePayloadImpl implements CustomerGroupSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerGroupSetMessagePayloadImpl(
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        this.type = CUSTOMER_GROUP_SET;
    }

    /**
     * create empty instance
     */
    public CustomerGroupSetMessagePayloadImpl() {
        this.type = CUSTOMER_GROUP_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Customer Group that was set during the Set Customer Group update action.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    public void setCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerGroupSetMessagePayloadImpl that = (CustomerGroupSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customerGroup, that.customerGroup)
                .append(type, that.type)
                .append(customerGroup, that.customerGroup)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(customerGroup).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("customerGroup", customerGroup)
                .build();
    }

    @Override
    public CustomerGroupSetMessagePayload copyDeep() {
        return CustomerGroupSetMessagePayload.deepCopy(this);
    }
}
