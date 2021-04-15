
package com.commercetools.api.models.review;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewSetTargetActionBuilder {

    private java.lang.Object target;

    public ReviewSetTargetActionBuilder target(final java.lang.Object target) {
        this.target = target;
        return this;
    }

    public java.lang.Object getTarget() {
        return this.target;
    }

    public ReviewSetTargetAction build() {
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
