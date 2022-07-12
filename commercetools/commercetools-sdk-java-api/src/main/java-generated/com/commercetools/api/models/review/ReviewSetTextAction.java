
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewSetTextAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewSetTextAction reviewSetTextAction = ReviewSetTextAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewSetTextActionImpl.class)
public interface ReviewSetTextAction extends ReviewUpdateAction {

    String SET_TEXT = "setText";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("text")
    public String getText();

    public void setText(final String text);

    public static ReviewSetTextAction of() {
        return new ReviewSetTextActionImpl();
    }

    public static ReviewSetTextAction of(final ReviewSetTextAction template) {
        ReviewSetTextActionImpl instance = new ReviewSetTextActionImpl();
        instance.setText(template.getText());
        return instance;
    }

    public static ReviewSetTextActionBuilder builder() {
        return ReviewSetTextActionBuilder.of();
    }

    public static ReviewSetTextActionBuilder builder(final ReviewSetTextAction template) {
        return ReviewSetTextActionBuilder.of(template);
    }

    default <T> T withReviewSetTextAction(Function<ReviewSetTextAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewSetTextAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewSetTextAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewSetTextAction>";
            }
        };
    }
}
