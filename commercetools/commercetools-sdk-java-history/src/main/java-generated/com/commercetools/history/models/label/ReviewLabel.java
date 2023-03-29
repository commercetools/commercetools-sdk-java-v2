
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
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

    /**
     * discriminator value for ReviewLabel
     */
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

    /**
     * set key
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * set title
     * @param title value to be set
     */

    public void setTitle(final String title);

    /**
     * factory method
     * @return instance of ReviewLabel
     */
    public static ReviewLabel of() {
        return new ReviewLabelImpl();
    }

    /**
     * factory method to create a shallow copy ReviewLabel
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReviewLabel of(final ReviewLabel template) {
        ReviewLabelImpl instance = new ReviewLabelImpl();
        instance.setKey(template.getKey());
        instance.setTitle(template.getTitle());
        return instance;
    }

    /**
     * factory method to create a deep copy of ReviewLabel
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReviewLabel deepCopy(@Nullable final ReviewLabel template) {
        if (template == null) {
            return null;
        }
        ReviewLabelImpl instance = new ReviewLabelImpl();
        instance.setKey(template.getKey());
        instance.setTitle(template.getTitle());
        return instance;
    }

    /**
     * builder factory method for ReviewLabel
     * @return builder
     */
    public static ReviewLabelBuilder builder() {
        return ReviewLabelBuilder.of();
    }

    /**
     * create builder for ReviewLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewLabelBuilder builder(final ReviewLabel template) {
        return ReviewLabelBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReviewLabel(Function<ReviewLabel, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReviewLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewLabel>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewLabel>";
            }
        };
    }
}
