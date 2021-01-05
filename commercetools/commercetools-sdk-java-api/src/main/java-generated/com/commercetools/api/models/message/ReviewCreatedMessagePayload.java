package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.review.Review;
import com.commercetools.api.models.message.ReviewCreatedMessagePayloadImpl;

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
@JsonDeserialize(as = ReviewCreatedMessagePayloadImpl.class)
public interface ReviewCreatedMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("review")
    public Review getReview();

    public void setReview(final Review review);

    public static ReviewCreatedMessagePayload of(){
        return new ReviewCreatedMessagePayloadImpl();
    }
    

    public static ReviewCreatedMessagePayload of(final ReviewCreatedMessagePayload template) {
        ReviewCreatedMessagePayloadImpl instance = new ReviewCreatedMessagePayloadImpl();
        instance.setReview(template.getReview());
        return instance;
    }

    public static ReviewCreatedMessagePayloadBuilder builder(){
        return ReviewCreatedMessagePayloadBuilder.of();
    }
    
    public static ReviewCreatedMessagePayloadBuilder builder(final ReviewCreatedMessagePayload template){
        return ReviewCreatedMessagePayloadBuilder.of(template);
    }
    

    default <T> T withReviewCreatedMessagePayload(Function<ReviewCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
