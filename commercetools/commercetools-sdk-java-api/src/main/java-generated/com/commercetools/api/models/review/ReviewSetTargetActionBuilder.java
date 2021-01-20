
package com.commercetools.api.models.review;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.review.ReviewSetTargetAction;
import com.commercetools.api.models.review.ReviewUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewSetTargetActionBuilder {

    private com.fasterxml.jackson.databind.JsonNode target;

    public ReviewSetTargetActionBuilder target(final com.fasterxml.jackson.databind.JsonNode target) {
        this.target = target;
        return this;
    }

    public com.fasterxml.jackson.databind.JsonNode getTarget() {
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
