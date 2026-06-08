
package com.commercetools.api.models.staged_quote;

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
 * StagedQuoteSetSellerCommentAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteSetSellerCommentActionImpl implements StagedQuoteSetSellerCommentAction, ModelBase {

    private String action;

    private String sellerComment;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedQuoteSetSellerCommentActionImpl(@JsonProperty("sellerComment") final String sellerComment) {
        this.sellerComment = sellerComment;
        this.action = SET_SELLER_COMMENT;
    }

    /**
     * create empty instance
     */
    public StagedQuoteSetSellerCommentActionImpl() {
        this.action = SET_SELLER_COMMENT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>If <code>sellerComment</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
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

        StagedQuoteSetSellerCommentActionImpl that = (StagedQuoteSetSellerCommentActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(sellerComment, that.sellerComment)
                .append(action, that.action)
                .append(sellerComment, that.sellerComment)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(sellerComment).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("sellerComment", sellerComment)
                .build();
    }

    @Override
    public StagedQuoteSetSellerCommentAction copyDeep() {
        return StagedQuoteSetSellerCommentAction.deepCopy(this);
    }
}
