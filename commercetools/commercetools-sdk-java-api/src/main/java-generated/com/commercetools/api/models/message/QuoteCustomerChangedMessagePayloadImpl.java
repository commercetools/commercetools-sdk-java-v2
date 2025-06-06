
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
 *  <p>Generated after a successful Change Customer update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteCustomerChangedMessagePayloadImpl implements QuoteCustomerChangedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.customer.CustomerReference customer;

    private com.commercetools.api.models.customer.CustomerReference previousCustomer;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteCustomerChangedMessagePayloadImpl(
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer,
            @JsonProperty("previousCustomer") final com.commercetools.api.models.customer.CustomerReference previousCustomer) {
        this.customer = customer;
        this.previousCustomer = previousCustomer;
        this.type = QUOTE_CUSTOMER_CHANGED;
    }

    /**
     * create empty instance
     */
    public QuoteCustomerChangedMessagePayloadImpl() {
        this.type = QUOTE_CUSTOMER_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The Buyer who now owns the Quote.</p>
     */

    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>The previous Buyer.</p>
     */

    public com.commercetools.api.models.customer.CustomerReference getPreviousCustomer() {
        return this.previousCustomer;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
    }

    public void setPreviousCustomer(final com.commercetools.api.models.customer.CustomerReference previousCustomer) {
        this.previousCustomer = previousCustomer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        QuoteCustomerChangedMessagePayloadImpl that = (QuoteCustomerChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customer, that.customer)
                .append(previousCustomer, that.previousCustomer)
                .append(type, that.type)
                .append(customer, that.customer)
                .append(previousCustomer, that.previousCustomer)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(customer).append(previousCustomer).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("customer", customer)
                .append("previousCustomer", previousCustomer)
                .build();
    }

    @Override
    public QuoteCustomerChangedMessagePayload copyDeep() {
        return QuoteCustomerChangedMessagePayload.deepCopy(this);
    }
}
