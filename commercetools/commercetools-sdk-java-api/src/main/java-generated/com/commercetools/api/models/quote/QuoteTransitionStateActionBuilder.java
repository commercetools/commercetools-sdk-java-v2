
package com.commercetools.api.models.quote;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteTransitionStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteTransitionStateAction quoteTransitionStateAction = QuoteTransitionStateAction.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteTransitionStateActionBuilder implements Builder<QuoteTransitionStateAction> {

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    @Nullable
    private Boolean force;

    /**
     *  <p>Value to set. If there is no State yet, this must be an initial State.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public QuoteTransitionStateActionBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If there is no State yet, this must be an initial State.</p>
     * @param state value to be set
     * @return Builder
     */

    public QuoteTransitionStateActionBuilder state(
            final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Switch validations on or off.</p>
     * @param force value to be set
     * @return Builder
     */

    public QuoteTransitionStateActionBuilder force(@Nullable final Boolean force) {
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

    /**
     * builds QuoteTransitionStateAction with checking for non-null required values
     * @return QuoteTransitionStateAction
     */
    public QuoteTransitionStateAction build() {
        Objects.requireNonNull(state, QuoteTransitionStateAction.class + ": state is missing");
        return new QuoteTransitionStateActionImpl(state, force);
    }

    /**
     * builds QuoteTransitionStateAction without checking for non-null required values
     * @return QuoteTransitionStateAction
     */
    public QuoteTransitionStateAction buildUnchecked() {
        return new QuoteTransitionStateActionImpl(state, force);
    }

    public static QuoteTransitionStateActionBuilder of() {
        return new QuoteTransitionStateActionBuilder();
    }

    public static QuoteTransitionStateActionBuilder of(final QuoteTransitionStateAction template) {
        QuoteTransitionStateActionBuilder builder = new QuoteTransitionStateActionBuilder();
        builder.state = template.getState();
        builder.force = template.getForce();
        return builder;
    }

}
