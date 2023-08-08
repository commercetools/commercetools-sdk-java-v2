
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

/**
 *  <p>Represents the Buyer requesting renegotiation for a Quote. Valid for Quotes in a <code>Pending</code> or <code>Failed</code> state.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestQuoteRenegotiationActionImpl implements QuoteRequestQuoteRenegotiationAction, ModelBase {

    private String action;

    private String buyerComment;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteRequestQuoteRenegotiationActionImpl(@JsonProperty("buyerComment") final String buyerComment) {
        this.buyerComment = buyerComment;
        this.action = REQUEST_QUOTE_RENEGOTIATION;
    }

    /**
     * create empty instance
     */
    public QuoteRequestQuoteRenegotiationActionImpl() {
        this.action = REQUEST_QUOTE_RENEGOTIATION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Message from the Buyer regarding the Quote renegotiation request.</p>
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

        QuoteRequestQuoteRenegotiationActionImpl that = (QuoteRequestQuoteRenegotiationActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(buyerComment, that.buyerComment)
                .append(action, that.action)
                .append(buyerComment, that.buyerComment)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(buyerComment).toHashCode();
    }

}
