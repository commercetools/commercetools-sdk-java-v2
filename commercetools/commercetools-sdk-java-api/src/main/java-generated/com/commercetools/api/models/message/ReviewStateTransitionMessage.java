
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
@JsonDeserialize(as = ReviewStateTransitionMessageImpl.class)
public interface ReviewStateTransitionMessage extends Message {

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

    public static ReviewStateTransitionMessage of() {
        return new ReviewStateTransitionMessageImpl();
    }

    public static ReviewStateTransitionMessage of(final ReviewStateTransitionMessage template) {
        ReviewStateTransitionMessageImpl instance = new ReviewStateTransitionMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setOldState(template.getOldState());
        instance.setNewState(template.getNewState());
        instance.setOldIncludedInStatistics(template.getOldIncludedInStatistics());
        instance.setNewIncludedInStatistics(template.getNewIncludedInStatistics());
        instance.setTarget(template.getTarget());
        instance.setForce(template.getForce());
        return instance;
    }

    public static ReviewStateTransitionMessageBuilder builder() {
        return ReviewStateTransitionMessageBuilder.of();
    }

    public static ReviewStateTransitionMessageBuilder builder(final ReviewStateTransitionMessage template) {
        return ReviewStateTransitionMessageBuilder.of(template);
    }

    default <T> T withReviewStateTransitionMessage(Function<ReviewStateTransitionMessage, T> helper) {
        return helper.apply(this);
    }
}
