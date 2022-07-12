
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

/**
 *  <p>Transitions the Quote Request to a different state.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestChangeQuoteRequestStateActionImpl
        implements QuoteRequestChangeQuoteRequestStateAction, ModelBase {

    private String action;

    private com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState;

    @JsonCreator
    QuoteRequestChangeQuoteRequestStateActionImpl(
            @JsonProperty("quoteRequestState") final com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState) {
        this.quoteRequestState = quoteRequestState;
        this.action = CHANGE_QUOTE_REQUEST_STATE;
    }

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
     *  <p>The new state to be set for the Quote Request.</p>
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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(quoteRequestState).toHashCode();
    }

}
