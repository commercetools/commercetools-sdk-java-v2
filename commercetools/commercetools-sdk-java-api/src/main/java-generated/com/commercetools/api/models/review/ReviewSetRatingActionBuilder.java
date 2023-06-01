package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.review.ReviewSetRatingAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewSetRatingActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewSetRatingAction reviewSetRatingAction = ReviewSetRatingAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReviewSetRatingActionBuilder implements Builder<ReviewSetRatingAction> {

    
    @Nullable
    private Integer rating;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param rating value to be set
     * @return Builder
     */
    
    public ReviewSetRatingActionBuilder rating(@Nullable final Integer rating) {
        this.rating = rating;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return rating
     */
    
    @Nullable
    public Integer getRating(){
        return this.rating;
    }

    /**
     * builds ReviewSetRatingAction with checking for non-null required values
     * @return ReviewSetRatingAction
     */
    public ReviewSetRatingAction build() {
        return new ReviewSetRatingActionImpl(rating);
    }
    
    /**
     * builds ReviewSetRatingAction without checking for non-null required values
     * @return ReviewSetRatingAction
     */
    public ReviewSetRatingAction buildUnchecked() {
        return new ReviewSetRatingActionImpl(rating);
    }

    /**
     * factory method for an instance of ReviewSetRatingActionBuilder
     * @return builder 
     */
    public static ReviewSetRatingActionBuilder of() {
        return new ReviewSetRatingActionBuilder();
    }

    /**
     * create builder for ReviewSetRatingAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewSetRatingActionBuilder of(final ReviewSetRatingAction template) {
        ReviewSetRatingActionBuilder builder = new ReviewSetRatingActionBuilder();
        builder.rating = template.getRating();
        return builder;
    }

}
