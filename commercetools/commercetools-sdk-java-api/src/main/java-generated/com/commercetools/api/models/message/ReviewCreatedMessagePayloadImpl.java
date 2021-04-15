
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewCreatedMessagePayloadImpl implements ReviewCreatedMessagePayload {

    private String type;

    private com.commercetools.api.models.review.Review review;

    @JsonCreator
    ReviewCreatedMessagePayloadImpl(@JsonProperty("review") final com.commercetools.api.models.review.Review review) {
        this.review = review;
        this.type = REVIEW_CREATED;
    }

    public ReviewCreatedMessagePayloadImpl() {
        this.type = REVIEW_CREATED;
    }

    public String getType() {
        return this.type;
    }

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

        return new EqualsBuilder().append(type, that.type).append(review, that.review).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(review).toHashCode();
    }

}
