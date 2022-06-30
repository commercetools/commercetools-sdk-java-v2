
package com.commercetools.api.models.staged_quote;

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
 * StagedQuoteDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteDraftImpl implements StagedQuoteDraft, ModelBase {

    private com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier quoteRequest;

    private Long quoteRequestVersion;

    private String key;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @JsonCreator
    StagedQuoteDraftImpl(
            @JsonProperty("quoteRequest") final com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier quoteRequest,
            @JsonProperty("quoteRequestVersion") final Long quoteRequestVersion, @JsonProperty("key") final String key,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.quoteRequest = quoteRequest;
        this.quoteRequestVersion = quoteRequestVersion;
        this.key = key;
        this.custom = custom;
    }

    public StagedQuoteDraftImpl() {
    }

    /**
     *  <p>The QuoteRequest from which this StagedQuote is created.</p>
     */

    public com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier getQuoteRequest() {
        return this.quoteRequest;
    }

    /**
     *  <p>Current version of the QuoteRequest.</p>
     */

    public Long getQuoteRequestVersion() {
        return this.quoteRequestVersion;
    }

    /**
     *  <p>User-defined unique identifier for the StagedQuote.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Custom Fields to be added to the StagedQuote.</p>
     *  <ul>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced QuoteRequest and added to the StagedQuote.</li>
     *   <li>If empty, the Custom Fields on the referenced QuoteRequest are added to the StagedQuote automatically.</li>
     *  </ul>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setQuoteRequest(
            final com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier quoteRequest) {
        this.quoteRequest = quoteRequest;
    }

    public void setQuoteRequestVersion(final Long quoteRequestVersion) {
        this.quoteRequestVersion = quoteRequestVersion;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedQuoteDraftImpl that = (StagedQuoteDraftImpl) o;

        return new EqualsBuilder().append(quoteRequest, that.quoteRequest)
                .append(quoteRequestVersion, that.quoteRequestVersion)
                .append(key, that.key)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(quoteRequest)
                .append(quoteRequestVersion)
                .append(key)
                .append(custom)
                .toHashCode();
    }

}
