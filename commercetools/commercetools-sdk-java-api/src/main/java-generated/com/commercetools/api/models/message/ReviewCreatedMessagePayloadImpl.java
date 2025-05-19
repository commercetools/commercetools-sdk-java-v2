
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
 *  <p>Generated after a successful Create Review request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewCreatedMessagePayloadImpl implements ReviewCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.review.Review review;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReviewCreatedMessagePayloadImpl(@JsonProperty("review") final com.commercetools.api.models.review.Review review) {
        this.review = review;
        this.type = REVIEW_CREATED;
    }

    /**
     * create empty instance
     */
    public ReviewCreatedMessagePayloadImpl() {
        this.type = REVIEW_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Review that was created.</p>
     */

    public com.commercetools.api.models.review.Review getReview() {
        return this.review;
    }

    public void setReview(final com.commercetools.api.models.review.Review review) {
        this.review = review;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReviewCreatedMessagePayloadImpl that = (ReviewCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(review, that.review)
                .append(type, that.type)
                .append(review, that.review)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(review).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("review", review)
                .build();
    }

    @Override
    public ReviewCreatedMessagePayload copyDeep() {
        return ReviewCreatedMessagePayload.deepCopy(this);
    }
}
