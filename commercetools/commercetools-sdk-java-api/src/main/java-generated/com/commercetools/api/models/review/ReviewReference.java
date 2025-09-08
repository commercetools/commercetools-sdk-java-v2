
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewReference reviewReference = ReviewReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("review")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewReferenceImpl.class)
public interface ReviewReference extends Reference, com.commercetools.api.models.Identifiable<Review>,
        com.commercetools.api.models.IdentifiableObjHolder<Review> {

    /**
     * discriminator value for ReviewReference
     */
    String REVIEW = "review";

    /**
     *  <p>Contains the representation of the expanded Review. Only present in responses to requests with <span>Reference Expansion</span> for Reviews.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public Review getObj();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded Review. Only present in responses to requests with <span>Reference Expansion</span> for Reviews.</p>
     * @param obj value to be set
     */

    public void setObj(final Review obj);

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of ReviewReference
     */
    public static ReviewReference of() {
        return new ReviewReferenceImpl();
    }

    /**
     * factory method to create a shallow copy ReviewReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReviewReference of(final ReviewReference template) {
        ReviewReferenceImpl instance = new ReviewReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public ReviewReference copyDeep();

    /**
     * factory method to create a deep copy of ReviewReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReviewReference deepCopy(@Nullable final ReviewReference template) {
        if (template == null) {
            return null;
        }
        ReviewReferenceImpl instance = new ReviewReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(com.commercetools.api.models.review.Review.deepCopy(template.getObj()));
        return instance;
    }

    /**
     * builder factory method for ReviewReference
     * @return builder
     */
    public static ReviewReferenceBuilder builder() {
        return ReviewReferenceBuilder.of();
    }

    /**
     * create builder for ReviewReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewReferenceBuilder builder(final ReviewReference template) {
        return ReviewReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReviewReference(Function<ReviewReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReviewReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewReference>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewReference>";
            }
        };
    }
}
