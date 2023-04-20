
package com.commercetools.api.models.quote_request;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestTransitionStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestTransitionStateAction quoteRequestTransitionStateAction = QuoteRequestTransitionStateAction.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestTransitionStateActionBuilder implements Builder<QuoteRequestTransitionStateAction> {

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    @Nullable
    private Boolean force;

    /**
     *  <p>Value to set. If there is no State yet, this must be an initial State.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public QuoteRequestTransitionStateActionBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If there is no State yet, this must be an initial State.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public QuoteRequestTransitionStateActionBuilder withState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If there is no State yet, this must be an initial State.</p>
     * @param state value to be set
     * @return Builder
     */

    public QuoteRequestTransitionStateActionBuilder state(
            final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Switch validations on or off.</p>
     * @param force value to be set
     * @return Builder
     */

    public QuoteRequestTransitionStateActionBuilder force(@Nullable final Boolean force) {
        this.force = force;
        return this;
    }

    /**
     *  <p>Value to set. If there is no State yet, this must be an initial State.</p>
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
     * builds QuoteRequestTransitionStateAction with checking for non-null required values
     * @return QuoteRequestTransitionStateAction
     */
    public QuoteRequestTransitionStateAction build() {
        Objects.requireNonNull(state, QuoteRequestTransitionStateAction.class + ": state is missing");
        return new QuoteRequestTransitionStateActionImpl(state, force);
    }

    /**
     * builds QuoteRequestTransitionStateAction without checking for non-null required values
     * @return QuoteRequestTransitionStateAction
     */
    public QuoteRequestTransitionStateAction buildUnchecked() {
        return new QuoteRequestTransitionStateActionImpl(state, force);
    }

    /**
     * factory method for an instance of QuoteRequestTransitionStateActionBuilder
     * @return builder
     */
    public static QuoteRequestTransitionStateActionBuilder of() {
        return new QuoteRequestTransitionStateActionBuilder();
    }

    /**
     * create builder for QuoteRequestTransitionStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestTransitionStateActionBuilder of(final QuoteRequestTransitionStateAction template) {
        QuoteRequestTransitionStateActionBuilder builder = new QuoteRequestTransitionStateActionBuilder();
        builder.state = template.getState();
        builder.force = template.getForce();
        return builder;
    }

}
