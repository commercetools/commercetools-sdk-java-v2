
package com.commercetools.api.models.review;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewSetTargetActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewSetTargetAction reviewSetTargetAction = ReviewSetTargetAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewSetTargetActionBuilder implements Builder<ReviewSetTargetAction> {

    private java.lang.Object target;

    /**
     *  <p>Value to set, specified as <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductResourceIdentifier" rel="nofollow">ProductResourceIdentifier</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelResourceIdentifier" rel="nofollow">ChannelResourceIdentifier</a>, respectively. If empty, any existing value will be removed.</p>
     * @param target value to be set
     * @return Builder
     */

    public ReviewSetTargetActionBuilder target(final java.lang.Object target) {
        this.target = target;
        return this;
    }

    /**
     *  <p>Value to set, specified as <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductResourceIdentifier" rel="nofollow">ProductResourceIdentifier</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelResourceIdentifier" rel="nofollow">ChannelResourceIdentifier</a>, respectively. If empty, any existing value will be removed.</p>
     * @return target
     */

    public java.lang.Object getTarget() {
        return this.target;
    }

    /**
     * builds ReviewSetTargetAction with checking for non-null required values
     * @return ReviewSetTargetAction
     */
    public ReviewSetTargetAction build() {
        Objects.requireNonNull(target, ReviewSetTargetAction.class + ": target is missing");
        return new ReviewSetTargetActionImpl(target);
    }

    /**
     * builds ReviewSetTargetAction without checking for non-null required values
     * @return ReviewSetTargetAction
     */
    public ReviewSetTargetAction buildUnchecked() {
        return new ReviewSetTargetActionImpl(target);
    }

    /**
     * factory method for an instance of ReviewSetTargetActionBuilder
     * @return builder
     */
    public static ReviewSetTargetActionBuilder of() {
        return new ReviewSetTargetActionBuilder();
    }

    /**
     * create builder for ReviewSetTargetAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewSetTargetActionBuilder of(final ReviewSetTargetAction template) {
        ReviewSetTargetActionBuilder builder = new ReviewSetTargetActionBuilder();
        builder.target = template.getTarget();
        return builder;
    }

}
