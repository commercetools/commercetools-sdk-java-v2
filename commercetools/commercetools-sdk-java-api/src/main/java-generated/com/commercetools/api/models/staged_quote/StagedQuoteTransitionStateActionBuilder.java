
package com.commercetools.api.models.staged_quote;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteTransitionStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteTransitionStateAction stagedQuoteTransitionStateAction = StagedQuoteTransitionStateAction.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteTransitionStateActionBuilder implements Builder<StagedQuoteTransitionStateAction> {

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    @Nullable
    private Boolean force;

    /**
     *  <p>Value to set. If there is no State yet, the new State must be an initial State.</p>
     * @return Builder
     */

    public StagedQuoteTransitionStateActionBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If there is no State yet, the new State must be an initial State.</p>
     * @param state
     * @return Builder
     */

    public StagedQuoteTransitionStateActionBuilder state(
            final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Switch validations on or off.</p>
     * @param force
     * @return Builder
     */

    public StagedQuoteTransitionStateActionBuilder force(@Nullable final Boolean force) {
        this.force = force;
        return this;
    }

    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    @Nullable
    public Boolean getForce() {
        return this.force;
    }

    public StagedQuoteTransitionStateAction build() {
        Objects.requireNonNull(state, StagedQuoteTransitionStateAction.class + ": state is missing");
        return new StagedQuoteTransitionStateActionImpl(state, force);
    }

    /**
     * builds StagedQuoteTransitionStateAction without checking for non null required values
     */
    public StagedQuoteTransitionStateAction buildUnchecked() {
        return new StagedQuoteTransitionStateActionImpl(state, force);
    }

    public static StagedQuoteTransitionStateActionBuilder of() {
        return new StagedQuoteTransitionStateActionBuilder();
    }

    public static StagedQuoteTransitionStateActionBuilder of(final StagedQuoteTransitionStateAction template) {
        StagedQuoteTransitionStateActionBuilder builder = new StagedQuoteTransitionStateActionBuilder();
        builder.state = template.getState();
        builder.force = template.getForce();
        return builder;
    }

}
