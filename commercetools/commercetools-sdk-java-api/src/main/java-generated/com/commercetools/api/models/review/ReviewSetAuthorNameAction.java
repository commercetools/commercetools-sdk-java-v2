
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

    String SET_AUTHOR_NAME = "setAuthorName";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("authorName")
    public String getAuthorName();

    public void setAuthorName(final String authorName);

    public static ReviewSetAuthorNameAction of() {
        return new ReviewSetAuthorNameActionImpl();
    }

    public static ReviewSetAuthorNameAction of(final ReviewSetAuthorNameAction template) {
        ReviewSetAuthorNameActionImpl instance = new ReviewSetAuthorNameActionImpl();
        instance.setAuthorName(template.getAuthorName());
        return instance;
    }

    public static ReviewSetAuthorNameActionBuilder builder() {
        return ReviewSetAuthorNameActionBuilder.of();
    }

    public static ReviewSetAuthorNameActionBuilder builder(final ReviewSetAuthorNameAction template) {
        return ReviewSetAuthorNameActionBuilder.of(template);
    }

    default <T> T withReviewSetAuthorNameAction(Function<ReviewSetAuthorNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewSetAuthorNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewSetAuthorNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewSetAuthorNameAction>";
            }
        };
    }
}
