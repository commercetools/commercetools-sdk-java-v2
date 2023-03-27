
package com.commercetools.api.models.review;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewResourceIdentifierBuilder
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
public class ReviewResourceIdentifierBuilder implements Builder<ReviewResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced Review. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     * @return Builder
     */

    public ReviewResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced Review. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     * @return Builder
     */

    public ReviewResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced Review. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced Review. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds ReviewResourceIdentifier with checking for non-null required values
     * @return ReviewResourceIdentifier
     */
    public ReviewResourceIdentifier build() {
        return new ReviewResourceIdentifierImpl(id, key);
    }

    /**
     * builds ReviewResourceIdentifier without checking for non-null required values
     * @return ReviewResourceIdentifier
     */
    public ReviewResourceIdentifier buildUnchecked() {
        return new ReviewResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of ReviewResourceIdentifierBuilder
     * @return builder
     */
    public static ReviewResourceIdentifierBuilder of() {
        return new ReviewResourceIdentifierBuilder();
    }

    /**
     * create builder for ReviewResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewResourceIdentifierBuilder of(final ReviewResourceIdentifier template) {
        ReviewResourceIdentifierBuilder builder = new ReviewResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
