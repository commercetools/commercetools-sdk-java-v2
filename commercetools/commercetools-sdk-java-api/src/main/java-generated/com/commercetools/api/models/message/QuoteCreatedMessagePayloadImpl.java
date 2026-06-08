
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/quotes:POST" rel="nofollow">Create Quote</a> request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteCreatedMessagePayloadImpl implements QuoteCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.quote.Quote quote;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteCreatedMessagePayloadImpl(@JsonProperty("quote") final com.commercetools.api.models.quote.Quote quote) {
        this.quote = quote;
        this.type = QUOTE_CREATED;
    }

    /**
     * create empty instance
     */
    public QuoteCreatedMessagePayloadImpl() {
        this.type = QUOTE_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><span>Quote</span> that was created.</p>
     */

    public com.commercetools.api.models.quote.Quote getQuote() {
        return this.quote;
    }

    public void setQuote(final com.commercetools.api.models.quote.Quote quote) {
        this.quote = quote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        QuoteCreatedMessagePayloadImpl that = (QuoteCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(quote, that.quote)
                .append(type, that.type)
                .append(quote, that.quote)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(quote).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("quote", quote)
                .build();
    }

    @Override
    public QuoteCreatedMessagePayload copyDeep() {
        return QuoteCreatedMessagePayload.deepCopy(this);
    }
}
