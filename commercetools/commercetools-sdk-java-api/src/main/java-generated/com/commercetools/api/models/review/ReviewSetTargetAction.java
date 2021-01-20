
package com.commercetools.api.models.review;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.review.ReviewSetTargetActionImpl;
import com.commercetools.api.models.review.ReviewUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReviewSetTargetActionImpl.class)
public interface ReviewSetTargetAction extends ReviewUpdateAction {

    /**
    *  <p>Identifies the target of the review.
    *  Can be a Product or a Channel.
    *  If <code>target</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */
    @NotNull
    @JsonProperty("target")
    public JsonNode getTarget();

    public void setTarget(final JsonNode target);

    public static ReviewSetTargetAction of() {
        return new ReviewSetTargetActionImpl();
    }

    public static ReviewSetTargetAction of(final ReviewSetTargetAction template) {
        ReviewSetTargetActionImpl instance = new ReviewSetTargetActionImpl();
        instance.setTarget(template.getTarget());
        return instance;
    }

    public static ReviewSetTargetActionBuilder builder() {
        return ReviewSetTargetActionBuilder.of();
    }

    public static ReviewSetTargetActionBuilder builder(final ReviewSetTargetAction template) {
        return ReviewSetTargetActionBuilder.of(template);
    }

    default <T> T withReviewSetTargetAction(Function<ReviewSetTargetAction, T> helper) {
        return helper.apply(this);
    }
}
