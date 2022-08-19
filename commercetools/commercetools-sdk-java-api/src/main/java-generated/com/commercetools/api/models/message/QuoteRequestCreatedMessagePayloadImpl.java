
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
 *  <p>Generated after a successful Create Quote Request request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestCreatedMessagePayloadImpl implements QuoteRequestCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.quote_request.QuoteRequest quoteRequest;

    @JsonCreator
    QuoteRequestCreatedMessagePayloadImpl(
            @JsonProperty("quoteRequest") final com.commercetools.api.models.quote_request.QuoteRequest quoteRequest) {
        this.quoteRequest = quoteRequest;
        this.type = QUOTE_REQUEST_CREATED;
    }

    public QuoteRequestCreatedMessagePayloadImpl() {
        this.type = QUOTE_REQUEST_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Quote Request that was created.</p>
     */

    public com.commercetools.api.models.quote_request.QuoteRequest getQuoteRequest() {
        return this.quoteRequest;
    }

    public void setQuoteRequest(final com.commercetools.api.models.quote_request.QuoteRequest quoteRequest) {
        this.quoteRequest = quoteRequest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        QuoteRequestCreatedMessagePayloadImpl that = (QuoteRequestCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(quoteRequest, that.quoteRequest).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(quoteRequest).toHashCode();
    }

}
