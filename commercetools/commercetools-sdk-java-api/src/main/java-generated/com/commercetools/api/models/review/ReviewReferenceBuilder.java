
package com.commercetools.api.models.review;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewReferenceBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewReferenceBuilder implements Builder<ReviewReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.review.Review obj;

    /**
     *  <p>Unique identifier of the referenced Review.</p>
     * @param id value to be set
     * @return Builder
     */

    public ReviewReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Review. Only present in responses to requests with Reference Expansion for Reviews.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public ReviewReferenceBuilder obj(
            Function<com.commercetools.api.models.review.ReviewBuilder, com.commercetools.api.models.review.ReviewBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.review.ReviewBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Review. Only present in responses to requests with Reference Expansion for Reviews.</p>
     * @param obj value to be set
     * @return Builder
     */

    public ReviewReferenceBuilder obj(@Nullable final com.commercetools.api.models.review.Review obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.review.Review getObj() {
        return this.obj;
    }

    /**
     * builds ReviewReference with checking for non-null required values
     * @return ReviewReference
     */
    public ReviewReference build() {
        Objects.requireNonNull(id, ReviewReference.class + ": id is missing");
        return new ReviewReferenceImpl(id, obj);
    }

    /**
     * builds ReviewReference without checking for non-null required values
     * @return ReviewReference
     */
    public ReviewReference buildUnchecked() {
        return new ReviewReferenceImpl(id, obj);
    }

    public static ReviewReferenceBuilder of() {
        return new ReviewReferenceBuilder();
    }

    public static ReviewReferenceBuilder of(final ReviewReference template) {
        ReviewReferenceBuilder builder = new ReviewReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
