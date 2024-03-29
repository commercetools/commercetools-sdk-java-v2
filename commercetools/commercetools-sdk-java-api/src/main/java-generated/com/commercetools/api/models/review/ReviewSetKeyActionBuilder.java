
package com.commercetools.api.models.review;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewSetKeyAction reviewSetKeyAction = ReviewSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewSetKeyActionBuilder implements Builder<ReviewSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     * @return Builder
     */

    public ReviewSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds ReviewSetKeyAction with checking for non-null required values
     * @return ReviewSetKeyAction
     */
    public ReviewSetKeyAction build() {
        return new ReviewSetKeyActionImpl(key);
    }

    /**
     * builds ReviewSetKeyAction without checking for non-null required values
     * @return ReviewSetKeyAction
     */
    public ReviewSetKeyAction buildUnchecked() {
        return new ReviewSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of ReviewSetKeyActionBuilder
     * @return builder
     */
    public static ReviewSetKeyActionBuilder of() {
        return new ReviewSetKeyActionBuilder();
    }

    /**
     * create builder for ReviewSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewSetKeyActionBuilder of(final ReviewSetKeyAction template) {
        ReviewSetKeyActionBuilder builder = new ReviewSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
