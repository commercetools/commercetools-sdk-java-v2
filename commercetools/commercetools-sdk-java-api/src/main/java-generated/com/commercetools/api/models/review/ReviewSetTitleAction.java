
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

    String SET_TITLE = "setTitle";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("title")
    public String getTitle();

    public void setTitle(final String title);

    public static ReviewSetTitleAction of() {
        return new ReviewSetTitleActionImpl();
    }

    public static ReviewSetTitleAction of(final ReviewSetTitleAction template) {
        ReviewSetTitleActionImpl instance = new ReviewSetTitleActionImpl();
        instance.setTitle(template.getTitle());
        return instance;
    }

    public static ReviewSetTitleActionBuilder builder() {
        return ReviewSetTitleActionBuilder.of();
    }

    public static ReviewSetTitleActionBuilder builder(final ReviewSetTitleAction template) {
        return ReviewSetTitleActionBuilder.of(template);
    }

    default <T> T withReviewSetTitleAction(Function<ReviewSetTitleAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewSetTitleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewSetTitleAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewSetTitleAction>";
            }
        };
    }
}
