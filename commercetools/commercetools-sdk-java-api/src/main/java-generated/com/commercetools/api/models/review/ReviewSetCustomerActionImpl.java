
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewSetCustomerActionImpl implements ReviewSetCustomerAction {

    private String action;

    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    @JsonCreator
    ReviewSetCustomerActionImpl(
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        this.action = SET_CUSTOMER;
    }

    public ReviewSetCustomerActionImpl() {
        this.action = SET_CUSTOMER;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>The customer who created the review.
    *  If <code>customer</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReviewSetCustomerActionImpl that = (ReviewSetCustomerActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(customer, that.customer).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customer).toHashCode();
    }

}
