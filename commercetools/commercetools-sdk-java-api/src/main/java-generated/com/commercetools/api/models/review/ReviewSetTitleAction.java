
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewSetTitleAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewSetTitleAction reviewSetTitleAction = ReviewSetTitleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewSetTitleActionImpl.class)
public interface ReviewSetTitleAction extends ReviewUpdateAction {

    /**
     * discriminator value for ReviewSetTitleAction
     */
    String SET_TITLE = "setTitle";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return title
     */

    @JsonProperty("title")
    public String getTitle();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param title value to be set
     */

    public void setTitle(final String title);

    /**
     * factory method
     * @return instance of ReviewSetTitleAction
     */
    public static ReviewSetTitleAction of() {
        return new ReviewSetTitleActionImpl();
    }

    /**
     * factory method to copy an instance of ReviewSetTitleAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReviewSetTitleAction of(final ReviewSetTitleAction template) {
        ReviewSetTitleActionImpl instance = new ReviewSetTitleActionImpl();
        instance.setTitle(template.getTitle());
        return instance;
    }

    /**
     * builder factory method for ReviewSetTitleAction
     * @return builder
     */
    public static ReviewSetTitleActionBuilder builder() {
        return ReviewSetTitleActionBuilder.of();
    }

    /**
     * create builder for ReviewSetTitleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewSetTitleActionBuilder builder(final ReviewSetTitleAction template) {
        return ReviewSetTitleActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReviewSetTitleAction(Function<ReviewSetTitleAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReviewSetTitleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewSetTitleAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewSetTitleAction>";
            }
        };
    }
}
