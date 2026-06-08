
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewSetKeyAction reviewSetKeyAction = ReviewSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewSetKeyActionImpl.class)
public interface ReviewSetKeyAction extends ReviewUpdateAction {

    /**
     * discriminator value for ReviewSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ReviewSetKeyAction
     */
    public static ReviewSetKeyAction of() {
        return new ReviewSetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy ReviewSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReviewSetKeyAction of(final ReviewSetKeyAction template) {
        ReviewSetKeyActionImpl instance = new ReviewSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public ReviewSetKeyAction copyDeep();

    /**
     * factory method to create a deep copy of ReviewSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReviewSetKeyAction deepCopy(@Nullable final ReviewSetKeyAction template) {
        if (template == null) {
            return null;
        }
        ReviewSetKeyActionImpl instance = new ReviewSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ReviewSetKeyAction
     * @return builder
     */
    public static ReviewSetKeyActionBuilder builder() {
        return ReviewSetKeyActionBuilder.of();
    }

    /**
     * create builder for ReviewSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewSetKeyActionBuilder builder(final ReviewSetKeyAction template) {
        return ReviewSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReviewSetKeyAction(Function<ReviewSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static ReviewSetKeyAction ofUnset() {
        return ReviewSetKeyAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReviewSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewSetKeyAction>";
            }
        };
    }
}
