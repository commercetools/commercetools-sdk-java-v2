
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewStateTransitionMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewStateTransitionMessagePayload reviewStateTransitionMessagePayload = ReviewStateTransitionMessagePayload.builder()
 *             .newState(newStateBuilder -> newStateBuilder)
 *             .oldIncludedInStatistics(true)
 *             .newIncludedInStatistics(true)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewStateTransitionMessagePayloadBuilder implements Builder<ReviewStateTransitionMessagePayload> {

    @Nullable
    private com.commercetools.api.models.state.StateReference oldState;

    private com.commercetools.api.models.state.StateReference newState;

    private Boolean oldIncludedInStatistics;

    private Boolean newIncludedInStatistics;

    @Nullable
    private com.commercetools.api.models.common.Reference target;

    private Boolean force;

    /**
     *  <p>State of the Review before the Transition State update action.</p>
     * @param builder function to build the oldState value
     * @return Builder
     */

    public ReviewStateTransitionMessagePayloadBuilder oldState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.oldState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Review before the Transition State update action.</p>
     * @param oldState value to be set
     * @return Builder
     */

    public ReviewStateTransitionMessagePayloadBuilder oldState(
            @Nullable final com.commercetools.api.models.state.StateReference oldState) {
        this.oldState = oldState;
        return this;
    }

    /**
     *  <p>State of the Review after the Transition State update action.</p>
     * @param builder function to build the newState value
     * @return Builder
     */

    public ReviewStateTransitionMessagePayloadBuilder newState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.newState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Review after the Transition State update action.</p>
     * @param newState value to be set
     * @return Builder
     */

    public ReviewStateTransitionMessagePayloadBuilder newState(
            final com.commercetools.api.models.state.StateReference newState) {
        this.newState = newState;
        return this;
    }

    /**
     *  <p>Whether the old Review was taken into account in the rating statistics of the target before the state transition.</p>
     * @param oldIncludedInStatistics value to be set
     * @return Builder
     */

    public ReviewStateTransitionMessagePayloadBuilder oldIncludedInStatistics(final Boolean oldIncludedInStatistics) {
        this.oldIncludedInStatistics = oldIncludedInStatistics;
        return this;
    }

    /**
     *  <p>Whether the new Review was taken into account in the rating statistics of the target after the state transition.</p>
     * @param newIncludedInStatistics value to be set
     * @return Builder
     */

    public ReviewStateTransitionMessagePayloadBuilder newIncludedInStatistics(final Boolean newIncludedInStatistics) {
        this.newIncludedInStatistics = newIncludedInStatistics;
        return this;
    }

    /**
     *  <p>Reference to the resource that the Review belongs to.</p>
     * @param target value to be set
     * @return Builder
     */

    public ReviewStateTransitionMessagePayloadBuilder target(
            @Nullable final com.commercetools.api.models.common.Reference target) {
        this.target = target;
        return this;
    }

    /**
     *  <p>Reference to the resource that the Review belongs to.</p>
     * @param builder function to build the target value
     * @return Builder
     */

    public ReviewStateTransitionMessagePayloadBuilder target(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.target = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     * @param force value to be set
     * @return Builder
     */

    public ReviewStateTransitionMessagePayloadBuilder force(final Boolean force) {
        this.force = force;
        return this;
    }

    @Nullable
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

    @Nullable
    public com.commercetools.api.models.common.Reference getTarget() {
        return this.target;
    }

    public Boolean getForce() {
        return this.force;
    }

    /**
     * builds ReviewStateTransitionMessagePayload with checking for non-null required values
     * @return ReviewStateTransitionMessagePayload
     */
    public ReviewStateTransitionMessagePayload build() {
        Objects.requireNonNull(newState, ReviewStateTransitionMessagePayload.class + ": newState is missing");
        Objects.requireNonNull(oldIncludedInStatistics,
            ReviewStateTransitionMessagePayload.class + ": oldIncludedInStatistics is missing");
        Objects.requireNonNull(newIncludedInStatistics,
            ReviewStateTransitionMessagePayload.class + ": newIncludedInStatistics is missing");
        Objects.requireNonNull(force, ReviewStateTransitionMessagePayload.class + ": force is missing");
        return new ReviewStateTransitionMessagePayloadImpl(oldState, newState, oldIncludedInStatistics,
            newIncludedInStatistics, target, force);
    }

    /**
     * builds ReviewStateTransitionMessagePayload without checking for non-null required values
     * @return ReviewStateTransitionMessagePayload
     */
    public ReviewStateTransitionMessagePayload buildUnchecked() {
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
