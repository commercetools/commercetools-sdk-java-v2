
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/staged-quotes:POST" rel="nofollow">Create StagedQuote</a> request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteCreatedMessagePayloadImpl implements StagedQuoteCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.staged_quote.StagedQuote stagedQuote;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedQuoteCreatedMessagePayloadImpl(
            @JsonProperty("stagedQuote") final com.commercetools.api.models.staged_quote.StagedQuote stagedQuote) {
        this.stagedQuote = stagedQuote;
        this.type = STAGED_QUOTE_CREATED;
    }

    /**
     * create empty instance
     */
    public StagedQuoteCreatedMessagePayloadImpl() {
        this.type = STAGED_QUOTE_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><span>Staged Quote</span> that was created.</p>
     */

    public com.commercetools.api.models.staged_quote.StagedQuote getStagedQuote() {
        return this.stagedQuote;
    }

    public void setStagedQuote(final com.commercetools.api.models.staged_quote.StagedQuote stagedQuote) {
        this.stagedQuote = stagedQuote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedQuoteCreatedMessagePayloadImpl that = (StagedQuoteCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(stagedQuote, that.stagedQuote)
                .append(type, that.type)
                .append(stagedQuote, that.stagedQuote)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(stagedQuote).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("stagedQuote", stagedQuote)
                .build();
    }

    @Override
    public StagedQuoteCreatedMessagePayload copyDeep() {
        return StagedQuoteCreatedMessagePayload.deepCopy(this);
    }
}
