
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReviewStateTransitionMessagePayloadImpl.class)
public interface ReviewStateTransitionMessagePayload extends MessagePayload {

    String REVIEW_STATE_TRANSITION = "ReviewStateTransition";

    @NotNull
    @Valid
    @JsonProperty("oldState")
    public StateReference getOldState();

    @NotNull
    @Valid
    @JsonProperty("newState")
    public StateReference getNewState();

    @NotNull
    @JsonProperty("oldIncludedInStatistics")
    public Boolean getOldIncludedInStatistics();

    @NotNull
    @JsonProperty("newIncludedInStatistics")
    public Boolean getNewIncludedInStatistics();

    @NotNull
    @Valid
    @JsonProperty("target")
    public Reference getTarget();

    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    public void setOldState(final StateReference oldState);

    public void setNewState(final StateReference newState);

    public void setOldIncludedInStatistics(final Boolean oldIncludedInStatistics);

    public void setNewIncludedInStatistics(final Boolean newIncludedInStatistics);

    public void setTarget(final Reference target);

    public void setForce(final Boolean force);

    public static ReviewStateTransitionMessagePayload of() {
        return new ReviewStateTransitionMessagePayloadImpl();
    }

    public static ReviewStateTransitionMessagePayload of(final ReviewStateTransitionMessagePayload template) {
        ReviewStateTransitionMessagePayloadImpl instance = new ReviewStateTransitionMessagePayloadImpl();
        instance.setOldState(template.getOldState());
        instance.setNewState(template.getNewState());
        instance.setOldIncludedInStatistics(template.getOldIncludedInStatistics());
        instance.setNewIncludedInStatistics(template.getNewIncludedInStatistics());
        instance.setTarget(template.getTarget());
        instance.setForce(template.getForce());
        return instance;
    }

    public static ReviewStateTransitionMessagePayloadBuilder builder() {
        return ReviewStateTransitionMessagePayloadBuilder.of();
    }

    public static ReviewStateTransitionMessagePayloadBuilder builder(
            final ReviewStateTransitionMessagePayload template) {
        return ReviewStateTransitionMessagePayloadBuilder.of(template);
    }

    default <T> T withReviewStateTransitionMessagePayload(Function<ReviewStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
