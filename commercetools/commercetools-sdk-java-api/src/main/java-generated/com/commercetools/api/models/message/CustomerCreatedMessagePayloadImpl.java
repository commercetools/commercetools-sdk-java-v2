
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
 *  <p>Generated after a successful Create Customer request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerCreatedMessagePayloadImpl implements CustomerCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.customer.Customer customer;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerCreatedMessagePayloadImpl(
            @JsonProperty("customer") final com.commercetools.api.models.customer.Customer customer) {
        this.customer = customer;
        this.type = CUSTOMER_CREATED;
    }

    /**
     * create empty instance
     */
    public CustomerCreatedMessagePayloadImpl() {
        this.type = CUSTOMER_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Customer that was created.</p>
     */

    public com.commercetools.api.models.customer.Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(final com.commercetools.api.models.customer.Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerCreatedMessagePayloadImpl that = (CustomerCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customer, that.customer)
                .append(type, that.type)
                .append(customer, that.customer)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(customer).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("customer", customer)
                .build();
    }

}
