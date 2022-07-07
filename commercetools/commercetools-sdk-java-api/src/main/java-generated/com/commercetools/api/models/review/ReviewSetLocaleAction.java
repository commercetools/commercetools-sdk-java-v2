
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewSetLocaleActionImpl.class)
public interface ReviewSetLocaleAction extends ReviewUpdateAction {

    String SET_LOCALE = "setLocale";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("locale")
    public String getLocale();

    public void setLocale(final String locale);

    public static ReviewSetLocaleAction of() {
        return new ReviewSetLocaleActionImpl();
    }

    public static ReviewSetLocaleAction of(final ReviewSetLocaleAction template) {
        ReviewSetLocaleActionImpl instance = new ReviewSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    public static ReviewSetLocaleActionBuilder builder() {
        return ReviewSetLocaleActionBuilder.of();
    }

    public static ReviewSetLocaleActionBuilder builder(final ReviewSetLocaleAction template) {
        return ReviewSetLocaleActionBuilder.of(template);
    }

    default <T> T withReviewSetLocaleAction(Function<ReviewSetLocaleAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewSetLocaleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewSetLocaleAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewSetLocaleAction>";
            }
        };
    }
}
