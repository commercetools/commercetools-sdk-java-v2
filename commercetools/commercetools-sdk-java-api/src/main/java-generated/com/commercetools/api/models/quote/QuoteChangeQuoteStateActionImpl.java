
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
 * QuoteChangeQuoteStateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteChangeQuoteStateActionImpl implements QuoteChangeQuoteStateAction, ModelBase {

    private String action;

    private com.commercetools.api.models.quote.QuoteState quoteState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteChangeQuoteStateActionImpl(
            @JsonProperty("quoteState") final com.commercetools.api.models.quote.QuoteState quoteState) {
        this.quoteState = quoteState;
        this.action = CHANGE_QUOTE_STATE;
    }

    /**
     * create empty instance
     */
    public QuoteChangeQuoteStateActionImpl() {
        this.action = CHANGE_QUOTE_STATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New state to be set for the Quote, except <code>DeclinedForRenegotiation</code>. The <code>DeclinedForRenegotiation</code> state can be set only when performing a renegotiation request.</p>
     */

    public com.commercetools.api.models.quote.QuoteState getQuoteState() {
        return this.quoteState;
    }

    public void setQuoteState(final com.commercetools.api.models.quote.QuoteState quoteState) {
        this.quoteState = quoteState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        QuoteChangeQuoteStateActionImpl that = (QuoteChangeQuoteStateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(quoteState, that.quoteState)
                .append(action, that.action)
                .append(quoteState, that.quoteState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(quoteState).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("quoteState", quoteState)
                .build();
    }

    @Override
    public QuoteChangeQuoteStateAction copyDeep() {
        return QuoteChangeQuoteStateAction.deepCopy(this);
    }
}
