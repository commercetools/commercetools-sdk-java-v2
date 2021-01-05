package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.review.ReviewSetAuthorNameActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ReviewSetAuthorNameActionImpl.class)
public interface ReviewSetAuthorNameAction extends ReviewUpdateAction {

    /**
    *  <p>If <code>authorName</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */
    
    @JsonProperty("authorName")
    public String getAuthorName();

    public void setAuthorName(final String authorName);

    public static ReviewSetAuthorNameAction of(){
        return new ReviewSetAuthorNameActionImpl();
    }
    

    public static ReviewSetAuthorNameAction of(final ReviewSetAuthorNameAction template) {
        ReviewSetAuthorNameActionImpl instance = new ReviewSetAuthorNameActionImpl();
        instance.setAuthorName(template.getAuthorName());
        return instance;
    }

    public static ReviewSetAuthorNameActionBuilder builder(){
        return ReviewSetAuthorNameActionBuilder.of();
    }
    
    public static ReviewSetAuthorNameActionBuilder builder(final ReviewSetAuthorNameAction template){
        return ReviewSetAuthorNameActionBuilder.of(template);
    }
    

    default <T> T withReviewSetAuthorNameAction(Function<ReviewSetAuthorNameAction, T> helper) {
        return helper.apply(this);
    }
}
