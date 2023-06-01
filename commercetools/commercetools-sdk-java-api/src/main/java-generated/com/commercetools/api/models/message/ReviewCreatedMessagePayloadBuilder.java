package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.review.Review;
import com.commercetools.api.models.message.ReviewCreatedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewCreatedMessagePayload reviewCreatedMessagePayload = ReviewCreatedMessagePayload.builder()
 *             .review(reviewBuilder -> reviewBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReviewCreatedMessagePayloadBuilder implements Builder<ReviewCreatedMessagePayload> {

    
    
    private com.commercetools.api.models.review.Review review;

    
    /**
     *  <p>Review that was created.</p>
     * @param builder function to build the review value
     * @return Builder
     */
    
    public ReviewCreatedMessagePayloadBuilder review(Function<com.commercetools.api.models.review.ReviewBuilder, com.commercetools.api.models.review.ReviewBuilder> builder) {
        this.review = builder.apply(com.commercetools.api.models.review.ReviewBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Review that was created.</p>
     * @param builder function to build the review value
     * @return Builder
     */
    
    public ReviewCreatedMessagePayloadBuilder withReview(Function<com.commercetools.api.models.review.ReviewBuilder, com.commercetools.api.models.review.Review> builder) {
        this.review = builder.apply(com.commercetools.api.models.review.ReviewBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Review that was created.</p>
     * @param review value to be set
     * @return Builder
     */
    
    public ReviewCreatedMessagePayloadBuilder review( final com.commercetools.api.models.review.Review review) {
        this.review = review;
        return this;
    }
    
    

    /**
     *  <p>Review that was created.</p>
     * @return review
     */
    
    
    public com.commercetools.api.models.review.Review getReview(){
        return this.review;
    }

    /**
     * builds ReviewCreatedMessagePayload with checking for non-null required values
     * @return ReviewCreatedMessagePayload
     */
    public ReviewCreatedMessagePayload build() {
        Objects.requireNonNull(review, ReviewCreatedMessagePayload.class + ": review is missing");
        return new ReviewCreatedMessagePayloadImpl(review);
    }
    
    /**
     * builds ReviewCreatedMessagePayload without checking for non-null required values
     * @return ReviewCreatedMessagePayload
     */
    public ReviewCreatedMessagePayload buildUnchecked() {
        return new ReviewCreatedMessagePayloadImpl(review);
    }

    /**
     * factory method for an instance of ReviewCreatedMessagePayloadBuilder
     * @return builder 
     */
    public static ReviewCreatedMessagePayloadBuilder of() {
        return new ReviewCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for ReviewCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewCreatedMessagePayloadBuilder of(final ReviewCreatedMessagePayload template) {
        ReviewCreatedMessagePayloadBuilder builder = new ReviewCreatedMessagePayloadBuilder();
        builder.review = template.getReview();
        return builder;
    }

}
