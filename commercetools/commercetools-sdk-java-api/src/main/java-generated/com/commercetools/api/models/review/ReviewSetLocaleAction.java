
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewSetLocaleAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewSetLocaleAction reviewSetLocaleAction = ReviewSetLocaleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setLocale")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewSetLocaleActionImpl.class)
public interface ReviewSetLocaleAction extends ReviewUpdateAction {

    /**
     * discriminator value for ReviewSetLocaleAction
     */
    String SET_LOCALE = "setLocale";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return locale
     */

    @JsonProperty("locale")
    public String getLocale();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param locale value to be set
     */

    public void setLocale(final String locale);

    /**
     * factory method
     * @return instance of ReviewSetLocaleAction
     */
    public static ReviewSetLocaleAction of() {
        return new ReviewSetLocaleActionImpl();
    }

    /**
     * factory method to create a shallow copy ReviewSetLocaleAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReviewSetLocaleAction of(final ReviewSetLocaleAction template) {
        ReviewSetLocaleActionImpl instance = new ReviewSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    public ReviewSetLocaleAction copyDeep();

    /**
     * factory method to create a deep copy of ReviewSetLocaleAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReviewSetLocaleAction deepCopy(@Nullable final ReviewSetLocaleAction template) {
        if (template == null) {
            return null;
        }
        ReviewSetLocaleActionImpl instance = new ReviewSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    /**
     * builder factory method for ReviewSetLocaleAction
     * @return builder
     */
    public static ReviewSetLocaleActionBuilder builder() {
        return ReviewSetLocaleActionBuilder.of();
    }

    /**
     * create builder for ReviewSetLocaleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewSetLocaleActionBuilder builder(final ReviewSetLocaleAction template) {
        return ReviewSetLocaleActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReviewSetLocaleAction(Function<ReviewSetLocaleAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReviewSetLocaleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewSetLocaleAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewSetLocaleAction>";
            }
        };
    }
}
