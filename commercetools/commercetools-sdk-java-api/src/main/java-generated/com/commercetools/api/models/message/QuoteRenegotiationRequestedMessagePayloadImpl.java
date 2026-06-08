
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequestQuoteRenegotiationAction" rel="nofollow">Request Quote Renegotiation</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRenegotiationRequestedMessagePayloadImpl
        implements QuoteRenegotiationRequestedMessagePayload, ModelBase {

    private String type;

    private String buyerComment;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteRenegotiationRequestedMessagePayloadImpl(@JsonProperty("buyerComment") final String buyerComment) {
        this.buyerComment = buyerComment;
        this.type = QUOTE_RENEGOTIATION_REQUESTED;
    }

    /**
     * create empty instance
     */
    public QuoteRenegotiationRequestedMessagePayloadImpl() {
        this.type = QUOTE_RENEGOTIATION_REQUESTED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Message from the <span>Buyer</span> regarding the Quote renegotiation request.</p>
     */

    public String getBuyerComment() {
        return this.buyerComment;
    }

    public void setBuyerComment(final String buyerComment) {
        this.buyerComment = buyerComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        QuoteRenegotiationRequestedMessagePayloadImpl that = (QuoteRenegotiationRequestedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(buyerComment, that.buyerComment)
                .append(type, that.type)
                .append(buyerComment, that.buyerComment)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(buyerComment).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("buyerComment", buyerComment)
                .build();
    }

    @Override
    public QuoteRenegotiationRequestedMessagePayload copyDeep() {
        return QuoteRenegotiationRequestedMessagePayload.deepCopy(this);
    }
}
