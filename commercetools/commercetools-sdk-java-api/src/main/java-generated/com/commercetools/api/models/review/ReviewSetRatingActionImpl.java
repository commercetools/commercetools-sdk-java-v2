package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
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
 *  <p>This update action produces the ReviewRatingSet Message.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReviewSetRatingActionImpl implements ReviewSetRatingAction, ModelBase {

    
    private String action;
    
    
    private Integer rating;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReviewSetRatingActionImpl(@JsonProperty("rating") final Integer rating) {
        this.rating = rating;
        this.action =  SET_RATING;
    }
    /**
     * create empty instance
     */
    public ReviewSetRatingActionImpl() {
        this.action =  SET_RATING;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    
    public Integer getRating(){
        return this.rating;
    }

    
    public void setRating(final Integer rating){
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ReviewSetRatingActionImpl that = (ReviewSetRatingActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(rating, that.rating)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(rating)
            .toHashCode();
    }

}
