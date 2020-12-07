package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewSetAuthorNameActionImpl implements ReviewSetAuthorNameAction {

    private String action;
    
    private String authorName;

    @JsonCreator
    ReviewSetAuthorNameActionImpl(@JsonProperty("authorName") final String authorName) {
        this.authorName = authorName;
        this.action = "setAuthorName";
    }
    public ReviewSetAuthorNameActionImpl() {
        this.action = "setAuthorName";
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>If <code>authorName</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */
    public String getAuthorName(){
        return this.authorName;
    }

    public void setAuthorName(final String authorName){
        this.authorName = authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ReviewSetAuthorNameActionImpl that = (ReviewSetAuthorNameActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(authorName, that.authorName)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(authorName)
            .toHashCode();
    }

}
