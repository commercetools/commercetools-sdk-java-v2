
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

/**
 * QuoteDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteDraftImpl implements QuoteDraft, ModelBase {

    private com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier stagedQuote;

    private Long stagedQuoteVersion;

    private String key;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @JsonCreator
    QuoteDraftImpl(
            @JsonProperty("stagedQuote") final com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier stagedQuote,
            @JsonProperty("stagedQuoteVersion") final Long stagedQuoteVersion, @JsonProperty("key") final String key,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.stagedQuote = stagedQuote;
        this.stagedQuoteVersion = stagedQuoteVersion;
        this.key = key;
        this.custom = custom;
    }

    public QuoteDraftImpl() {
    }

    /**
     *  <p>The StagedQuote from which this Quote is created.</p>
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
     *  <p>User-defined unique identifier for the Quote.</p>
     */

    public String getKey() {
        return this.key;
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

    public void setStagedQuote(
            final com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier stagedQuote) {
        this.stagedQuote = stagedQuote;
    }

    public void setStagedQuoteVersion(final Long stagedQuoteVersion) {
        this.stagedQuoteVersion = stagedQuoteVersion;
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

        QuoteDraftImpl that = (QuoteDraftImpl) o;

        return new EqualsBuilder().append(stagedQuote, that.stagedQuote)
                .append(stagedQuoteVersion, that.stagedQuoteVersion)
                .append(key, that.key)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(stagedQuote)
                .append(stagedQuoteVersion)
                .append(key)
                .append(custom)
                .toHashCode();
    }

}
