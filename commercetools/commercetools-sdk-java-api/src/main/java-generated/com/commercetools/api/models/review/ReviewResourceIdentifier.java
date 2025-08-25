
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a>. Either <code>id</code> or <code>key</code> is required. If both are set, an <span>InvalidJsonInput</span> error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewResourceIdentifier reviewResourceIdentifier = ReviewResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("review")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewResourceIdentifierImpl.class)
public interface ReviewResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Review> {

    /**
     * discriminator value for ReviewResourceIdentifier
     */
    String REVIEW = "review";

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a>. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a>. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a>. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a>. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ReviewResourceIdentifier
     */
    public static ReviewResourceIdentifier of() {
        return new ReviewResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy ReviewResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReviewResourceIdentifier of(final ReviewResourceIdentifier template) {
        ReviewResourceIdentifierImpl instance = new ReviewResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public ReviewResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of ReviewResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReviewResourceIdentifier deepCopy(@Nullable final ReviewResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        ReviewResourceIdentifierImpl instance = new ReviewResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ReviewResourceIdentifier
     * @return builder
     */
    public static ReviewResourceIdentifierBuilder builder() {
        return ReviewResourceIdentifierBuilder.of();
    }

    /**
     * create builder for ReviewResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewResourceIdentifierBuilder builder(final ReviewResourceIdentifier template) {
        return ReviewResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReviewResourceIdentifier(Function<ReviewResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReviewResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewResourceIdentifier>";
            }
        };
    }
}
