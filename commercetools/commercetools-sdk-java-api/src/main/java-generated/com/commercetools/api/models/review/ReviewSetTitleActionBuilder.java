
package com.commercetools.api.models.review;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewSetTitleActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewSetTitleAction reviewSetTitleAction = ReviewSetTitleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewSetTitleActionBuilder implements Builder<ReviewSetTitleAction> {

    @Nullable
    private String title;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public ReviewSetTitleActionBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    @Nullable
    public String getTitle() {
        return this.title;
    }

    public ReviewSetTitleAction build() {
        return new ReviewSetTitleActionImpl(title);
    }

    /**
     * builds ReviewSetTitleAction without checking for non null required values
     */
    public ReviewSetTitleAction buildUnchecked() {
        return new ReviewSetTitleActionImpl(title);
    }

    public static ReviewSetTitleActionBuilder of() {
        return new ReviewSetTitleActionBuilder();
    }

    public static ReviewSetTitleActionBuilder of(final ReviewSetTitleAction template) {
        ReviewSetTitleActionBuilder builder = new ReviewSetTitleActionBuilder();
        builder.title = template.getTitle();
        return builder;
    }

}
