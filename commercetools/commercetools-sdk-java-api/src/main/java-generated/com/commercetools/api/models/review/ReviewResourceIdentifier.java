
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a Review.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewResourceIdentifierImpl.class)
public interface ReviewResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Review> {

    String REVIEW = "review";

    /**
     *  <p>Unique identifier of the referenced Review. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced Review. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

    public static ReviewResourceIdentifier of() {
        return new ReviewResourceIdentifierImpl();
    }

    public static ReviewResourceIdentifier of(final ReviewResourceIdentifier template) {
        ReviewResourceIdentifierImpl instance = new ReviewResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ReviewResourceIdentifierBuilder builder() {
        return ReviewResourceIdentifierBuilder.of();
    }

    public static ReviewResourceIdentifierBuilder builder(final ReviewResourceIdentifier template) {
        return ReviewResourceIdentifierBuilder.of(template);
    }

    default <T> T withReviewResourceIdentifier(Function<ReviewResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewResourceIdentifier>";
            }
        };
    }
}
