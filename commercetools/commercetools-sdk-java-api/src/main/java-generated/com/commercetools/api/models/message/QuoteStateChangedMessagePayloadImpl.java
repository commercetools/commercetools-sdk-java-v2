
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

/**
 *  <p>Generated after a successful Change Quote State update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteStateChangedMessagePayloadImpl implements QuoteStateChangedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.quote.QuoteState quoteState;

    private com.commercetools.api.models.quote.QuoteState oldQuoteState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteStateChangedMessagePayloadImpl(
            @JsonProperty("quoteState") final com.commercetools.api.models.quote.QuoteState quoteState,
            @JsonProperty("oldQuoteState") final com.commercetools.api.models.quote.QuoteState oldQuoteState) {
        this.quoteState = quoteState;
        this.oldQuoteState = oldQuoteState;
        this.type = QUOTE_STATE_CHANGED;
    }

    /**
     * create empty instance
     */
    public QuoteStateChangedMessagePayloadImpl() {
        this.type = QUOTE_STATE_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>State of the Quote after the Change Quote State update action.</p>
     */

    public com.commercetools.api.models.quote.QuoteState getQuoteState() {
        return this.quoteState;
    }

    /**
     *  <p>State of the Quote before the Change Quote State update action.</p>
     */

    public com.commercetools.api.models.quote.QuoteState getOldQuoteState() {
        return this.oldQuoteState;
    }

    public void setQuoteState(final com.commercetools.api.models.quote.QuoteState quoteState) {
        this.quoteState = quoteState;
    }

    public void setOldQuoteState(final com.commercetools.api.models.quote.QuoteState oldQuoteState) {
        this.oldQuoteState = oldQuoteState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        QuoteStateChangedMessagePayloadImpl that = (QuoteStateChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(quoteState, that.quoteState)
                .append(oldQuoteState, that.oldQuoteState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(quoteState).append(oldQuoteState).toHashCode();
    }

}
