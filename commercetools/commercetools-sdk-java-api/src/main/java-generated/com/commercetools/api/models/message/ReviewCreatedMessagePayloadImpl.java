package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.review.Review;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Generated after a successful Create Review request.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReviewCreatedMessagePayloadImpl implements ReviewCreatedMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.review.Review review;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReviewCreatedMessagePayloadImpl(@JsonProperty("review") final com.commercetools.api.models.review.Review review) {
        this.review = review;
        this.type =  REVIEW_CREATED;
    }
    /**
     * create empty instance
     */
    public ReviewCreatedMessagePayloadImpl() {
        this.type =  REVIEW_CREATED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Review that was created.</p>
     */
    
    public com.commercetools.api.models.review.Review getReview(){
        return this.review;
    }

    
    public void setReview(final com.commercetools.api.models.review.Review review){
        this.review = review;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ReviewCreatedMessagePayloadImpl that = (ReviewCreatedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(review, that.review)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(review)
            .toHashCode();
    }

}
