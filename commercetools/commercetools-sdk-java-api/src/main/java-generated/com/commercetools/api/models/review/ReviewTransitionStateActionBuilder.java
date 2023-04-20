
package com.commercetools.api.models.review;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewTransitionStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewTransitionStateAction reviewTransitionStateAction = ReviewTransitionStateAction.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewTransitionStateActionBuilder implements Builder<ReviewTransitionStateAction> {

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    @Nullable
    private Boolean force;

    /**
     *  <p>Value to set. If there is no State yet, the new State must be an initial State. If the existing State has <code>transitions</code> set, there must be a direct transition to the new State. If <code>transitions</code> is not set, no validation is performed. If the new State does not have the role <code>ReviewIncludedInStatistics</code>, the Review is not taken into account in the ratings statistics of the target.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public ReviewTransitionStateActionBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If there is no State yet, the new State must be an initial State. If the existing State has <code>transitions</code> set, there must be a direct transition to the new State. If <code>transitions</code> is not set, no validation is performed. If the new State does not have the role <code>ReviewIncludedInStatistics</code>, the Review is not taken into account in the ratings statistics of the target.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public ReviewTransitionStateActionBuilder withState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If there is no State yet, the new State must be an initial State. If the existing State has <code>transitions</code> set, there must be a direct transition to the new State. If <code>transitions</code> is not set, no validation is performed. If the new State does not have the role <code>ReviewIncludedInStatistics</code>, the Review is not taken into account in the ratings statistics of the target.</p>
     * @param state value to be set
     * @return Builder
     */

    public ReviewTransitionStateActionBuilder state(
            final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Switch validations on or off.</p>
     * @param force value to be set
     * @return Builder
     */

    public ReviewTransitionStateActionBuilder force(@Nullable final Boolean force) {
        this.force = force;
        return this;
    }

    /**
     *  <p>Value to set. If there is no State yet, the new State must be an initial State. If the existing State has <code>transitions</code> set, there must be a direct transition to the new State. If <code>transitions</code> is not set, no validation is performed. If the new State does not have the role <code>ReviewIncludedInStatistics</code>, the Review is not taken into account in the ratings statistics of the target.</p>
     * @return state
     */

    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    /**
     *  <p>Switch validations on or off.</p>
     * @return force
     */

    @Nullable
    public Boolean getForce() {
        return this.force;
    }

    /**
     * builds ReviewTransitionStateAction with checking for non-null required values
     * @return ReviewTransitionStateAction
     */
    public ReviewTransitionStateAction build() {
        Objects.requireNonNull(state, ReviewTransitionStateAction.class + ": state is missing");
        return new ReviewTransitionStateActionImpl(state, force);
    }

    /**
     * builds ReviewTransitionStateAction without checking for non-null required values
     * @return ReviewTransitionStateAction
     */
    public ReviewTransitionStateAction buildUnchecked() {
        return new ReviewTransitionStateActionImpl(state, force);
    }

    /**
     * factory method for an instance of ReviewTransitionStateActionBuilder
     * @return builder
     */
    public static ReviewTransitionStateActionBuilder of() {
        return new ReviewTransitionStateActionBuilder();
    }

    /**
     * create builder for ReviewTransitionStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewTransitionStateActionBuilder of(final ReviewTransitionStateAction template) {
        ReviewTransitionStateActionBuilder builder = new ReviewTransitionStateActionBuilder();
        builder.state = template.getState();
        builder.force = template.getForce();
        return builder;
    }

}
