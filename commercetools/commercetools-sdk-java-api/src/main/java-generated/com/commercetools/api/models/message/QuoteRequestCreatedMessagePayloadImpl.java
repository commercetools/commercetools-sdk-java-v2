
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/quote-requests:POST" rel="nofollow">Create QuoteRequest</a> request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestCreatedMessagePayloadImpl implements QuoteRequestCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.quote_request.QuoteRequest quoteRequest;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteRequestCreatedMessagePayloadImpl(
            @JsonProperty("quoteRequest") final com.commercetools.api.models.quote_request.QuoteRequest quoteRequest) {
        this.quoteRequest = quoteRequest;
        this.type = QUOTE_REQUEST_CREATED;
    }

    /**
     * create empty instance
     */
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
     *  <p><span>Quote Request</span> that was created.</p>
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

        return new EqualsBuilder().append(type, that.type)
                .append(quoteRequest, that.quoteRequest)
                .append(type, that.type)
                .append(quoteRequest, that.quoteRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(quoteRequest).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("quoteRequest", quoteRequest)
                .build();
    }

    @Override
    public QuoteRequestCreatedMessagePayload copyDeep() {
        return QuoteRequestCreatedMessagePayload.deepCopy(this);
    }
}
