
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewLabel
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewLabel reviewLabel = ReviewLabel.builder()
 *             .key("{key}")
 *             .title("{title}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewLabelImpl.class)
public interface ReviewLabel extends Label {

    String REVIEW_LABEL = "ReviewLabel";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *
     * @return title
     */
    @NotNull
    @JsonProperty("title")
    public String getTitle();

    public void setKey(final String key);

    public void setTitle(final String title);

    public static ReviewLabel of() {
        return new ReviewLabelImpl();
    }

    public static ReviewLabel of(final ReviewLabel template) {
        ReviewLabelImpl instance = new ReviewLabelImpl();
        instance.setKey(template.getKey());
        instance.setTitle(template.getTitle());
        return instance;
    }

    public static ReviewLabelBuilder builder() {
        return ReviewLabelBuilder.of();
    }

    public static ReviewLabelBuilder builder(final ReviewLabel template) {
        return ReviewLabelBuilder.of(template);
    }

    default <T> T withReviewLabel(Function<ReviewLabel, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewLabel>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewLabel>";
            }
        };
    }
}
