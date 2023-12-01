
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
 *  <p>Generated after a successful Set Seller Comment update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteSellerCommentSetMessagePayloadImpl
        implements StagedQuoteSellerCommentSetMessagePayload, ModelBase {

    private String type;

    private String sellerComment;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedQuoteSellerCommentSetMessagePayloadImpl(@JsonProperty("sellerComment") final String sellerComment) {
        this.sellerComment = sellerComment;
        this.type = STAGED_QUOTE_SELLER_COMMENT_SET;
    }

    /**
     * create empty instance
     */
    public StagedQuoteSellerCommentSetMessagePayloadImpl() {
        this.type = STAGED_QUOTE_SELLER_COMMENT_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><code>sellerComment</code> on the StagedQuote after a successful Set Seller Comment update action.</p>
     */

    public String getSellerComment() {
        return this.sellerComment;
    }

    public void setSellerComment(final String sellerComment) {
        this.sellerComment = sellerComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedQuoteSellerCommentSetMessagePayloadImpl that = (StagedQuoteSellerCommentSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(sellerComment, that.sellerComment)
                .append(type, that.type)
                .append(sellerComment, that.sellerComment)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(sellerComment).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("sellerComment", sellerComment)
                .build();
    }

}
