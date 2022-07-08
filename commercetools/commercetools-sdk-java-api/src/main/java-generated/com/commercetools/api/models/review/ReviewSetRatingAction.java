
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action produces the ReviewRatingSetMessage.</p>
 *
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
@JsonDeserialize(as = ReviewSetRatingActionImpl.class)
public interface ReviewSetRatingAction extends ReviewUpdateAction {

    String SET_RATING = "setRating";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("rating")
    public Integer getRating();

    public void setRating(final Integer rating);

    public static ReviewSetRatingAction of() {
        return new ReviewSetRatingActionImpl();
    }

    public static ReviewSetRatingAction of(final ReviewSetRatingAction template) {
        ReviewSetRatingActionImpl instance = new ReviewSetRatingActionImpl();
        instance.setRating(template.getRating());
        return instance;
    }

    public static ReviewSetRatingActionBuilder builder() {
        return ReviewSetRatingActionBuilder.of();
    }

    public static ReviewSetRatingActionBuilder builder(final ReviewSetRatingAction template) {
        return ReviewSetRatingActionBuilder.of(template);
    }

    default <T> T withReviewSetRatingAction(Function<ReviewSetRatingAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewSetRatingAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewSetRatingAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewSetRatingAction>";
            }
        };
    }
}
