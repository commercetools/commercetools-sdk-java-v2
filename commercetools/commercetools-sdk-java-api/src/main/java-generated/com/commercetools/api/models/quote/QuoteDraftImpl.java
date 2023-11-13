
package com.commercetools.api.models.quote;

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
 * QuoteDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteDraftImpl implements QuoteDraft, ModelBase {

    private String key;

    private com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier stagedQuote;

    private Long stagedQuoteVersion;

    private Boolean stagedQuoteStateToSent;

    private com.commercetools.api.models.state.StateReference state;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("stagedQuote") final com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier stagedQuote,
            @JsonProperty("stagedQuoteVersion") final Long stagedQuoteVersion,
            @JsonProperty("stagedQuoteStateToSent") final Boolean stagedQuoteStateToSent,
            @JsonProperty("state") final com.commercetools.api.models.state.StateReference state,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.key = key;
        this.stagedQuote = stagedQuote;
        this.stagedQuoteVersion = stagedQuoteVersion;
        this.stagedQuoteStateToSent = stagedQuoteStateToSent;
        this.state = state;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public QuoteDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier for the Quote.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>StagedQuote from which the Quote is created.</p>
     */

    public com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier getStagedQuote() {
        return this.stagedQuote;
    }

    /**
     *  <p>Current version of the StagedQuote.</p>
     */

    public Long getStagedQuoteVersion() {
        return this.stagedQuoteVersion;
    }

    /**
     *  <p>If <code>true</code>, the <code>stagedQuoteState</code> of the referenced StagedQuote will be set to <code>Sent</code>.</p>
     */

    public Boolean getStagedQuoteStateToSent() {
        return this.stagedQuoteStateToSent;
    }

    /**
     *  <p>State of the Quote. This reference can point to a State in a custom workflow.</p>
     */

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p>Custom Fields to be added to the Quote.</p>
     *  <ul>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced StagedQuote and added to the Quote.</li>
     *   <li>If empty, the Custom Fields on the referenced StagedQuote are added to the Quote automatically.</li>
     *  </ul>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setStagedQuote(
            final com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier stagedQuote) {
        this.stagedQuote = stagedQuote;
    }

    public void setStagedQuoteVersion(final Long stagedQuoteVersion) {
        this.stagedQuoteVersion = stagedQuoteVersion;
    }

    public void setStagedQuoteStateToSent(final Boolean stagedQuoteStateToSent) {
        this.stagedQuoteStateToSent = stagedQuoteStateToSent;
    }

    public void setState(final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
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

        QuoteDraftImpl that = (QuoteDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(stagedQuote, that.stagedQuote)
                .append(stagedQuoteVersion, that.stagedQuoteVersion)
                .append(stagedQuoteStateToSent, that.stagedQuoteStateToSent)
                .append(state, that.state)
                .append(custom, that.custom)
                .append(key, that.key)
                .append(stagedQuote, that.stagedQuote)
                .append(stagedQuoteVersion, that.stagedQuoteVersion)
                .append(stagedQuoteStateToSent, that.stagedQuoteStateToSent)
                .append(state, that.state)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(stagedQuote)
                .append(stagedQuoteVersion)
                .append(stagedQuoteStateToSent)
                .append(state)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("stagedQuote", stagedQuote)
                .append("stagedQuoteVersion", stagedQuoteVersion)
                .append("stagedQuoteStateToSent", stagedQuoteStateToSent)
                .append("state", state)
                .append("custom", custom)
                .build();
    }

}
