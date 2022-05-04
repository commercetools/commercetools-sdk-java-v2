
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
public class CustomerGroupSetMessagePayloadImpl implements CustomerGroupSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    @JsonCreator
    CustomerGroupSetMessagePayloadImpl(
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        this.type = CUSTOMER_GROUP_SET;
    }

    public CustomerGroupSetMessagePayloadImpl() {
        this.type = CUSTOMER_GROUP_SET;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:CustomerGroup">CustomerGroup</a>.</p>
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

        return new EqualsBuilder().append(type, that.type).append(customerGroup, that.customerGroup).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(customerGroup).toHashCode();
    }

}
