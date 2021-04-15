
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewStateTransitionMessagePayloadBuilder {

    private com.commercetools.api.models.state.StateReference oldState;

    private com.commercetools.api.models.state.StateReference newState;

    private Boolean oldIncludedInStatistics;

    private Boolean newIncludedInStatistics;

    private com.commercetools.api.models.common.Reference target;

    private Boolean force;

    public ReviewStateTransitionMessagePayloadBuilder oldState(
            final com.commercetools.api.models.state.StateReference oldState) {
        this.oldState = oldState;
        return this;
    }

    public ReviewStateTransitionMessagePayloadBuilder newState(
            final com.commercetools.api.models.state.StateReference newState) {
        this.newState = newState;
        return this;
    }

    public ReviewStateTransitionMessagePayloadBuilder oldIncludedInStatistics(final Boolean oldIncludedInStatistics) {
        this.oldIncludedInStatistics = oldIncludedInStatistics;
        return this;
    }

    public ReviewStateTransitionMessagePayloadBuilder newIncludedInStatistics(final Boolean newIncludedInStatistics) {
        this.newIncludedInStatistics = newIncludedInStatistics;
        return this;
    }

    public ReviewStateTransitionMessagePayloadBuilder target(
            final com.commercetools.api.models.common.Reference target) {
        this.target = target;
        return this;
    }

    public ReviewStateTransitionMessagePayloadBuilder force(final Boolean force) {
        this.force = force;
        return this;
    }

    public com.commercetools.api.models.state.StateReference getOldState() {
        return this.oldState;
    }

    public com.commercetools.api.models.state.StateReference getNewState() {
        return this.newState;
    }

    public Boolean getOldIncludedInStatistics() {
        return this.oldIncludedInStatistics;
    }

    public Boolean getNewIncludedInStatistics() {
        return this.newIncludedInStatistics;
    }

    public com.commercetools.api.models.common.Reference getTarget() {
        return this.target;
    }

    public Boolean getForce() {
        return this.force;
    }

    public ReviewStateTransitionMessagePayload build() {
        return new ReviewStateTransitionMessagePayloadImpl(oldState, newState, oldIncludedInStatistics,
            newIncludedInStatistics, target, force);
    }

    public static ReviewStateTransitionMessagePayloadBuilder of() {
        return new ReviewStateTransitionMessagePayloadBuilder();
    }

    public static ReviewStateTransitionMessagePayloadBuilder of(final ReviewStateTransitionMessagePayload template) {
        ReviewStateTransitionMessagePayloadBuilder builder = new ReviewStateTransitionMessagePayloadBuilder();
        builder.oldState = template.getOldState();
        builder.newState = template.getNewState();
        builder.oldIncludedInStatistics = template.getOldIncludedInStatistics();
        builder.newIncludedInStatistics = template.getNewIncludedInStatistics();
        builder.target = template.getTarget();
        builder.force = template.getForce();
        return builder;
    }

}
