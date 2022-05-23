
package com.commercetools.api.models.review;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ReviewSetTargetAction reviewSetTargetAction = ReviewSetTargetAction.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewSetTargetActionBuilder implements Builder<ReviewSetTargetAction> {

    private java.lang.Object target;

    /**
     *  <p>Identifies the target of the review. Can be a Product or a Channel. If <code>target</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
     */

    public ReviewSetTargetActionBuilder target(final java.lang.Object target) {
        this.target = target;
        return this;
    }

    public java.lang.Object getTarget() {
        return this.target;
    }

    public ReviewSetTargetAction build() {
        Objects.requireNonNull(target, ReviewSetTargetAction.class + ": target is missing");
        return new ReviewSetTargetActionImpl(target);
    }

    /**
     * builds ReviewSetTargetAction without checking for non null required values
     */
    public ReviewSetTargetAction buildUnchecked() {
        return new ReviewSetTargetActionImpl(target);
    }

    public static ReviewSetTargetActionBuilder of() {
        return new ReviewSetTargetActionBuilder();
    }

    public static ReviewSetTargetActionBuilder of(final ReviewSetTargetAction template) {
        ReviewSetTargetActionBuilder builder = new ReviewSetTargetActionBuilder();
        builder.target = template.getTarget();
        return builder;
    }

}
