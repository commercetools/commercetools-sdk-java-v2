
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequestChangeQuoteRequestStateAction" rel="nofollow">Change Quote Request State</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestStateChangedMessagePayloadImpl implements QuoteRequestStateChangedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState;

    private com.commercetools.api.models.quote_request.QuoteRequestState oldQuoteRequestState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteRequestStateChangedMessagePayloadImpl(
            @JsonProperty("quoteRequestState") final com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState,
            @JsonProperty("oldQuoteRequestState") final com.commercetools.api.models.quote_request.QuoteRequestState oldQuoteRequestState) {
        this.quoteRequestState = quoteRequestState;
        this.oldQuoteRequestState = oldQuoteRequestState;
        this.type = QUOTE_REQUEST_STATE_CHANGED;
    }

    /**
     * create empty instance
     */
    public QuoteRequestStateChangedMessagePayloadImpl() {
        this.type = QUOTE_REQUEST_STATE_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>State of the Quote Request after the <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequestChangeQuoteRequestStateAction" rel="nofollow">Change Quote Request State</a> update action.</p>
     */

    public com.commercetools.api.models.quote_request.QuoteRequestState getQuoteRequestState() {
        return this.quoteRequestState;
    }

    /**
     *  <p>State of the Quote Request before the <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequestChangeQuoteRequestStateAction" rel="nofollow">Change Quote Request State</a> update action.</p>
     */

    public com.commercetools.api.models.quote_request.QuoteRequestState getOldQuoteRequestState() {
        return this.oldQuoteRequestState;
    }

    public void setQuoteRequestState(
            final com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState) {
        this.quoteRequestState = quoteRequestState;
    }

    public void setOldQuoteRequestState(
            final com.commercetools.api.models.quote_request.QuoteRequestState oldQuoteRequestState) {
        this.oldQuoteRequestState = oldQuoteRequestState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        QuoteRequestStateChangedMessagePayloadImpl that = (QuoteRequestStateChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(quoteRequestState, that.quoteRequestState)
                .append(oldQuoteRequestState, that.oldQuoteRequestState)
                .append(type, that.type)
                .append(quoteRequestState, that.quoteRequestState)
                .append(oldQuoteRequestState, that.oldQuoteRequestState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(quoteRequestState)
                .append(oldQuoteRequestState)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("quoteRequestState", quoteRequestState)
                .append("oldQuoteRequestState", oldQuoteRequestState)
                .build();
    }

    @Override
    public QuoteRequestStateChangedMessagePayload copyDeep() {
        return QuoteRequestStateChangedMessagePayload.deepCopy(this);
    }
}
