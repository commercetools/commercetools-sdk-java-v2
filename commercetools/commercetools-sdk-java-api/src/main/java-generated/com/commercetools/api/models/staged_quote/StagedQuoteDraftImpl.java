
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * StagedQuoteDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteDraftImpl implements StagedQuoteDraft, ModelBase {

    private com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier quoteRequest;

    private Long quoteRequestVersion;

    private Boolean quoteRequestStateToAccepted;

    private String key;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private com.commercetools.api.models.state.StateReference state;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedQuoteDraftImpl(
            @JsonProperty("quoteRequest") final com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier quoteRequest,
            @JsonProperty("quoteRequestVersion") final Long quoteRequestVersion,
            @JsonProperty("quoteRequestStateToAccepted") final Boolean quoteRequestStateToAccepted,
            @JsonProperty("key") final String key,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("state") final com.commercetools.api.models.state.StateReference state) {
        this.quoteRequest = quoteRequest;
        this.quoteRequestVersion = quoteRequestVersion;
        this.quoteRequestStateToAccepted = quoteRequestStateToAccepted;
        this.key = key;
        this.custom = custom;
        this.state = state;
    }

    /**
     * create empty instance
     */
    public StagedQuoteDraftImpl() {
    }

    /**
     *  <p>QuoteRequest from which the StagedQuote is created.</p>
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
     *  <p>If <code>true</code>, the <code>quoteRequestState</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> will be set to <code>Accepted</code>.</p>
     */

    public Boolean getQuoteRequestStateToAccepted() {
        return this.quoteRequestStateToAccepted;
    }

    /**
     *  <p>User-defined unique identifier for the StagedQuote.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p><span>Custom Fields</span> to be added to the StagedQuote.</p>
     *  <ul>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> and added to the StagedQuote.</li>
     *   <li>If empty, the Custom Fields on the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> are added to the StagedQuote automatically.</li>
     *  </ul>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> of the Staged Quote. This reference can point to a State in a custom workflow.</p>
     */

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    public void setQuoteRequest(
            final com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifier quoteRequest) {
        this.quoteRequest = quoteRequest;
    }

    public void setQuoteRequestVersion(final Long quoteRequestVersion) {
        this.quoteRequestVersion = quoteRequestVersion;
    }

    public void setQuoteRequestStateToAccepted(final Boolean quoteRequestStateToAccepted) {
        this.quoteRequestStateToAccepted = quoteRequestStateToAccepted;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setState(final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
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
                .append(quoteRequestStateToAccepted, that.quoteRequestStateToAccepted)
                .append(key, that.key)
                .append(custom, that.custom)
                .append(state, that.state)
                .append(quoteRequest, that.quoteRequest)
                .append(quoteRequestVersion, that.quoteRequestVersion)
                .append(quoteRequestStateToAccepted, that.quoteRequestStateToAccepted)
                .append(key, that.key)
                .append(custom, that.custom)
                .append(state, that.state)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(quoteRequest)
                .append(quoteRequestVersion)
                .append(quoteRequestStateToAccepted)
                .append(key)
                .append(custom)
                .append(state)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("quoteRequest", quoteRequest)
                .append("quoteRequestVersion", quoteRequestVersion)
                .append("quoteRequestStateToAccepted", quoteRequestStateToAccepted)
                .append("key", key)
                .append("custom", custom)
                .append("state", state)
                .build();
    }

    @Override
    public StagedQuoteDraft copyDeep() {
        return StagedQuoteDraft.deepCopy(this);
    }
}
