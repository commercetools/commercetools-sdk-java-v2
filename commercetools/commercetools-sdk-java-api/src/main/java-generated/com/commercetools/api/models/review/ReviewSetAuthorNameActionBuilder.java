
package com.commercetools.api.models.review;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewSetAuthorNameActionBuilder
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
public class ReviewSetAuthorNameActionBuilder implements Builder<ReviewSetAuthorNameAction> {

    @Nullable
    private String authorName;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param authorName value to be set
     * @return Builder
     */

    public ReviewSetAuthorNameActionBuilder authorName(@Nullable final String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return authorName
     */

    @Nullable
    public String getAuthorName() {
        return this.authorName;
    }

    /**
     * builds ReviewSetAuthorNameAction with checking for non-null required values
     * @return ReviewSetAuthorNameAction
     */
    public ReviewSetAuthorNameAction build() {
        return new ReviewSetAuthorNameActionImpl(authorName);
    }

    /**
     * builds ReviewSetAuthorNameAction without checking for non-null required values
     * @return ReviewSetAuthorNameAction
     */
    public ReviewSetAuthorNameAction buildUnchecked() {
        return new ReviewSetAuthorNameActionImpl(authorName);
    }

    /**
     * factory method for an instance of ReviewSetAuthorNameActionBuilder
     * @return builder
     */
    public static ReviewSetAuthorNameActionBuilder of() {
        return new ReviewSetAuthorNameActionBuilder();
    }

    /**
     * create builder for ReviewSetAuthorNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewSetAuthorNameActionBuilder of(final ReviewSetAuthorNameAction template) {
        ReviewSetAuthorNameActionBuilder builder = new ReviewSetAuthorNameActionBuilder();
        builder.authorName = template.getAuthorName();
        return builder;
    }

}
