
package com.commercetools.api.models.review;

import java.util.*;

import javax.annotation.Nullable;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewSetRatingActionBuilder implements Builder<ReviewSetRatingAction> {

    @Nullable
    private Integer rating;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public ReviewSetRatingActionBuilder rating(@Nullable final Integer rating) {
        this.rating = rating;
        return this;
    }

    @Nullable
    public Integer getRating() {
        return this.rating;
    }

    public ReviewSetRatingAction build() {
        return new ReviewSetRatingActionImpl(rating);
    }

    /**
     * builds ReviewSetRatingAction without checking for non null required values
     */
    public ReviewSetRatingAction buildUnchecked() {
        return new ReviewSetRatingActionImpl(rating);
    }

    public static ReviewSetRatingActionBuilder of() {
        return new ReviewSetRatingActionBuilder();
    }

    public static ReviewSetRatingActionBuilder of(final ReviewSetRatingAction template) {
        ReviewSetRatingActionBuilder builder = new ReviewSetRatingActionBuilder();
        builder.rating = template.getRating();
        return builder;
    }

}
