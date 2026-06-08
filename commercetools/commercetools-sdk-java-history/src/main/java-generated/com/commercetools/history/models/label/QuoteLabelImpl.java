
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
 * QuoteLabel
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteLabelImpl implements QuoteLabel, ModelBase {

    private String type;

    private String key;

    private com.commercetools.history.models.common.Reference customer;

    private com.commercetools.history.models.common.Reference stagedQuote;

    private com.commercetools.history.models.common.Reference quoteRequest;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteLabelImpl(@JsonProperty("key") final String key,
            @JsonProperty("customer") final com.commercetools.history.models.common.Reference customer,
            @JsonProperty("stagedQuote") final com.commercetools.history.models.common.Reference stagedQuote,
            @JsonProperty("quoteRequest") final com.commercetools.history.models.common.Reference quoteRequest) {
        this.key = key;
        this.customer = customer;
        this.stagedQuote = stagedQuote;
        this.quoteRequest = quoteRequest;
        this.type = QUOTE_LABEL;
    }

    /**
     * create empty instance
     */
    public QuoteLabelImpl() {
        this.type = QUOTE_LABEL;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>User-defined unique identifier of the Quote.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The <span>Buyer</span> who requested the Quote.</p>
     */

    public com.commercetools.history.models.common.Reference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Staged Quote related to the Quote.</p>
     */

    public com.commercetools.history.models.common.Reference getStagedQuote() {
        return this.stagedQuote;
    }

    /**
     *  <p>Quote Request related to the Quote.</p>
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

    public void setStagedQuote(final com.commercetools.history.models.common.Reference stagedQuote) {
        this.stagedQuote = stagedQuote;
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

        QuoteLabelImpl that = (QuoteLabelImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(key, that.key)
                .append(customer, that.customer)
                .append(stagedQuote, that.stagedQuote)
                .append(quoteRequest, that.quoteRequest)
                .append(type, that.type)
                .append(key, that.key)
                .append(customer, that.customer)
                .append(stagedQuote, that.stagedQuote)
                .append(quoteRequest, that.quoteRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(key)
                .append(customer)
                .append(stagedQuote)
                .append(quoteRequest)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("key", key)
                .append("customer", customer)
                .append("stagedQuote", stagedQuote)
                .append("quoteRequest", quoteRequest)
                .build();
    }

    @Override
    public QuoteLabel copyDeep() {
        return QuoteLabel.deepCopy(this);
    }
}
