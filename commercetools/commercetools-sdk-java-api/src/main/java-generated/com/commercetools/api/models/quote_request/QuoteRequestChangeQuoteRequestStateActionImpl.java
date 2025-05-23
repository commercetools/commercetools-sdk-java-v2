
package com.commercetools.api.models.quote_request;

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
 *  <p>Transitions the Quote Request to a different state. A Buyer is only allowed to cancel a Quote Request when it is in <code>Submitted</code> state.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestChangeQuoteRequestStateActionImpl
        implements QuoteRequestChangeQuoteRequestStateAction, ModelBase {

    private String action;

    private com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteRequestChangeQuoteRequestStateActionImpl(
            @JsonProperty("quoteRequestState") final com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState) {
        this.quoteRequestState = quoteRequestState;
        this.action = CHANGE_QUOTE_REQUEST_STATE;
    }

    /**
     * create empty instance
     */
    public QuoteRequestChangeQuoteRequestStateActionImpl() {
        this.action = CHANGE_QUOTE_REQUEST_STATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New state to be set for the Quote Request.</p>
     */

    public com.commercetools.api.models.quote_request.QuoteRequestState getQuoteRequestState() {
        return this.quoteRequestState;
    }

    public void setQuoteRequestState(
            final com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState) {
        this.quoteRequestState = quoteRequestState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        QuoteRequestChangeQuoteRequestStateActionImpl that = (QuoteRequestChangeQuoteRequestStateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(quoteRequestState, that.quoteRequestState)
                .append(action, that.action)
                .append(quoteRequestState, that.quoteRequestState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(quoteRequestState).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("quoteRequestState", quoteRequestState)
                .build();
    }

    @Override
    public QuoteRequestChangeQuoteRequestStateAction copyDeep() {
        return QuoteRequestChangeQuoteRequestStateAction.deepCopy(this);
    }
}
