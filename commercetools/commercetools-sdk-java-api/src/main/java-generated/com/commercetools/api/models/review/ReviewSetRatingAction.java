
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewRatingSetMessage" rel="nofollow">ReviewRatingSet</a> Message.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("setRating")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewSetRatingActionImpl.class)
public interface ReviewSetRatingAction extends ReviewUpdateAction {

    /**
     * discriminator value for ReviewSetRatingAction
     */
    String SET_RATING = "setRating";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return rating
     */

    @JsonProperty("rating")
    public Integer getRating();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param rating value to be set
     */

    public void setRating(final Integer rating);

    /**
     * factory method
     * @return instance of ReviewSetRatingAction
     */
    public static ReviewSetRatingAction of() {
        return new ReviewSetRatingActionImpl();
    }

    /**
     * factory method to create a shallow copy ReviewSetRatingAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReviewSetRatingAction of(final ReviewSetRatingAction template) {
        ReviewSetRatingActionImpl instance = new ReviewSetRatingActionImpl();
        instance.setRating(template.getRating());
        return instance;
    }

    public ReviewSetRatingAction copyDeep();

    /**
     * factory method to create a deep copy of ReviewSetRatingAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReviewSetRatingAction deepCopy(@Nullable final ReviewSetRatingAction template) {
        if (template == null) {
            return null;
        }
        ReviewSetRatingActionImpl instance = new ReviewSetRatingActionImpl();
        instance.setRating(template.getRating());
        return instance;
    }

    /**
     * builder factory method for ReviewSetRatingAction
     * @return builder
     */
    public static ReviewSetRatingActionBuilder builder() {
        return ReviewSetRatingActionBuilder.of();
    }

    /**
     * create builder for ReviewSetRatingAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewSetRatingActionBuilder builder(final ReviewSetRatingAction template) {
        return ReviewSetRatingActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReviewSetRatingAction(Function<ReviewSetRatingAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReviewSetRatingAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewSetRatingAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewSetRatingAction>";
            }
        };
    }
}
