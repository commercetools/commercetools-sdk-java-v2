
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewSetAuthorNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewSetAuthorNameAction reviewSetAuthorNameAction = ReviewSetAuthorNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewSetAuthorNameActionImpl.class)
public interface ReviewSetAuthorNameAction extends ReviewUpdateAction {

    /**
     * discriminator value for ReviewSetAuthorNameAction
     */
    String SET_AUTHOR_NAME = "setAuthorName";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return authorName
     */

    @JsonProperty("authorName")
    public String getAuthorName();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param authorName value to be set
     */

    public void setAuthorName(final String authorName);

    /**
     * factory method
     * @return instance of ReviewSetAuthorNameAction
     */
    public static ReviewSetAuthorNameAction of() {
        return new ReviewSetAuthorNameActionImpl();
    }

    /**
     * factory method to copy an instance of ReviewSetAuthorNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReviewSetAuthorNameAction of(final ReviewSetAuthorNameAction template) {
        ReviewSetAuthorNameActionImpl instance = new ReviewSetAuthorNameActionImpl();
        instance.setAuthorName(template.getAuthorName());
        return instance;
    }

    /**
     * builder factory method for ReviewSetAuthorNameAction
     * @return builder
     */
    public static ReviewSetAuthorNameActionBuilder builder() {
        return ReviewSetAuthorNameActionBuilder.of();
    }

    /**
     * create builder for ReviewSetAuthorNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewSetAuthorNameActionBuilder builder(final ReviewSetAuthorNameAction template) {
        return ReviewSetAuthorNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReviewSetAuthorNameAction(Function<ReviewSetAuthorNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReviewSetAuthorNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewSetAuthorNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewSetAuthorNameAction>";
            }
        };
    }
}
