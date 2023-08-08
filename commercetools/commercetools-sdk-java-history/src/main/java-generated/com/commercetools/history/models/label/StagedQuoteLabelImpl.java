
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

/**
 * StagedQuoteLabel
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteLabelImpl implements StagedQuoteLabel, ModelBase {

    private String type;

    private String key;

    private com.commercetools.history.models.common.Reference customer;

    private com.commercetools.history.models.common.Reference quoteRequest;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedQuoteLabelImpl(@JsonProperty("key") final String key,
            @JsonProperty("customer") final com.commercetools.history.models.common.Reference customer,
            @JsonProperty("quoteRequest") final com.commercetools.history.models.common.Reference quoteRequest) {
        this.key = key;
        this.customer = customer;
        this.quoteRequest = quoteRequest;
        this.type = STAGED_QUOTE_LABEL;
    }

    /**
     * create empty instance
     */
    public StagedQuoteLabelImpl() {
        this.type = STAGED_QUOTE_LABEL;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>User-defined unique identifier of the Staged Quote.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The Buyer who requested the Quote.</p>
     */

    public com.commercetools.history.models.common.Reference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Quote Request related to the Staged Quote.</p>
     */

    public com.commercetools.history.models.common.Reference getQuoteRequest() {
        return this.quoteRequest;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setCustomer(final com.commercetools.history.models.common.Reference customer) {
        this.customer = customer;
    }

    public void setQuoteRequest(final com.commercetools.history.models.common.Reference quoteRequest) {
        this.quoteRequest = quoteRequest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedQuoteLabelImpl that = (StagedQuoteLabelImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(key, that.key)
                .append(customer, that.customer)
                .append(quoteRequest, that.quoteRequest)
                .append(type, that.type)
                .append(key, that.key)
                .append(customer, that.customer)
                .append(quoteRequest, that.quoteRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(key).append(customer).append(quoteRequest).toHashCode();
    }

}
