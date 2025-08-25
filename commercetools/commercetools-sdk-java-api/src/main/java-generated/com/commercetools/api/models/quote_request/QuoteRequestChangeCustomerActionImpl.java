
package com.commercetools.api.models.quote_request;

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
 *  <p>Changes the owner of a Quote Request to a different Customer. Customer Group is not updated. This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequestCustomerChangedMessage" rel="nofollow">Quote Request Customer Changed</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestChangeCustomerActionImpl implements QuoteRequestChangeCustomerAction, ModelBase {

    private String action;

    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteRequestChangeCustomerActionImpl(
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        this.action = CHANGE_CUSTOMER;
    }

    /**
     * create empty instance
     */
    public QuoteRequestChangeCustomerActionImpl() {
        this.action = CHANGE_CUSTOMER;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New Customer to own the Quote Request.</p>
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

        QuoteRequestChangeCustomerActionImpl that = (QuoteRequestChangeCustomerActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customer, that.customer)
                .append(action, that.action)
                .append(customer, that.customer)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customer).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("customer", customer)
                .build();
    }

    @Override
    public QuoteRequestChangeCustomerAction copyDeep() {
        return QuoteRequestChangeCustomerAction.deepCopy(this);
    }
}
