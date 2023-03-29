
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewUpdate reviewUpdate = ReviewUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewUpdateImpl.class)
public interface ReviewUpdate
        extends com.commercetools.api.models.ResourceUpdate<ReviewUpdate, ReviewUpdateAction, ReviewUpdateBuilder> {

    /**
     *  <p>The expected version of the review on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>The list of update actions to be performed on the review.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ReviewUpdateAction> getActions();

    /**
     *  <p>The expected version of the review on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>The list of update actions to be performed on the review.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final ReviewUpdateAction... actions);

    /**
     *  <p>The list of update actions to be performed on the review.</p>
     * @param actions values to be set
     */

    public void setActions(final List<ReviewUpdateAction> actions);

    /**
     * factory method
     * @return instance of ReviewUpdate
     */
    public static ReviewUpdate of() {
        return new ReviewUpdateImpl();
    }

    /**
     * factory method to create a shallow copy ReviewUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReviewUpdate of(final ReviewUpdate template) {
        ReviewUpdateImpl instance = new ReviewUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of ReviewUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReviewUpdate deepCopy(@Nullable final ReviewUpdate template) {
        if (template == null) {
            return null;
        }
        ReviewUpdateImpl instance = new ReviewUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.review.ReviewUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ReviewUpdate
     * @return builder
     */
    public static ReviewUpdateBuilder builder() {
        return ReviewUpdateBuilder.of();
    }

    /**
     * create builder for ReviewUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewUpdateBuilder builder(final ReviewUpdate template) {
        return ReviewUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReviewUpdate(Function<ReviewUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReviewUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewUpdate>";
            }
        };
    }
}
