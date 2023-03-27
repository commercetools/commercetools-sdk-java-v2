
package com.commercetools.history.models.label;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewLabelBuilder
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
public class ReviewLabelBuilder implements Builder<ReviewLabel> {

    private String key;

    private String title;

    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */

    public ReviewLabelBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     * set the value to the title
     * @param title value to be set
     * @return Builder
     */

    public ReviewLabelBuilder title(final String title) {
        this.title = title;
        return this;
    }

    /**
     * value of key}
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * value of title}
     * @return title
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * builds ReviewLabel with checking for non-null required values
     * @return ReviewLabel
     */
    public ReviewLabel build() {
        Objects.requireNonNull(key, ReviewLabel.class + ": key is missing");
        Objects.requireNonNull(title, ReviewLabel.class + ": title is missing");
        return new ReviewLabelImpl(key, title);
    }

    /**
     * builds ReviewLabel without checking for non-null required values
     * @return ReviewLabel
     */
    public ReviewLabel buildUnchecked() {
        return new ReviewLabelImpl(key, title);
    }

    /**
     * factory method for an instance of ReviewLabelBuilder
     * @return builder
     */
    public static ReviewLabelBuilder of() {
        return new ReviewLabelBuilder();
    }

    /**
     * create builder for ReviewLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewLabelBuilder of(final ReviewLabel template) {
        ReviewLabelBuilder builder = new ReviewLabelBuilder();
        builder.key = template.getKey();
        builder.title = template.getTitle();
        return builder;
    }

}
