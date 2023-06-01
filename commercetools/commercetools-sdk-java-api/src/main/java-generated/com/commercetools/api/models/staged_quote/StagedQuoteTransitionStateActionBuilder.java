package com.commercetools.api.models.staged_quote;

import com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.staged_quote.StagedQuoteTransitionStateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedQuoteTransitionStateActionBuilder implements Builder<StagedQuoteTransitionStateAction> {

    
    
    private com.commercetools.api.models.state.StateResourceIdentifier state;
    
    
    @Nullable
    private Boolean force;

    
    /**
     *  <p>Value to set. If there is no State yet, the new State must be an initial State.</p>
     * @param builder function to build the state value
     * @return Builder
     */
    
    public StagedQuoteTransitionStateActionBuilder state(Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to set. If there is no State yet, the new State must be an initial State.</p>
     * @param builder function to build the state value
     * @return Builder
     */
    
    public StagedQuoteTransitionStateActionBuilder withState(Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to set. If there is no State yet, the new State must be an initial State.</p>
     * @param state value to be set
     * @return Builder
     */
    
    public StagedQuoteTransitionStateActionBuilder state( final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }
    
    
    
    
    /**
     *  <p>Switch validations on or off.</p>
     * @param force value to be set
     * @return Builder
     */
    
    public StagedQuoteTransitionStateActionBuilder force(@Nullable final Boolean force) {
        this.force = force;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If there is no State yet, the new State must be an initial State.</p>
     * @return state
     */
    
    
    public com.commercetools.api.models.state.StateResourceIdentifier getState(){
        return this.state;
    }
    
    /**
     *  <p>Switch validations on or off.</p>
     * @return force
     */
    
    @Nullable
    public Boolean getForce(){
        return this.force;
    }

    /**
     * builds StagedQuoteTransitionStateAction with checking for non-null required values
     * @return StagedQuoteTransitionStateAction
     */
    public StagedQuoteTransitionStateAction build() {
        Objects.requireNonNull(state, StagedQuoteTransitionStateAction.class + ": state is missing");
        return new StagedQuoteTransitionStateActionImpl(state, force);
    }
    
    /**
     * builds StagedQuoteTransitionStateAction without checking for non-null required values
     * @return StagedQuoteTransitionStateAction
     */
    public StagedQuoteTransitionStateAction buildUnchecked() {
        return new StagedQuoteTransitionStateActionImpl(state, force);
    }

    /**
     * factory method for an instance of StagedQuoteTransitionStateActionBuilder
     * @return builder 
     */
    public static StagedQuoteTransitionStateActionBuilder of() {
        return new StagedQuoteTransitionStateActionBuilder();
    }

    /**
     * create builder for StagedQuoteTransitionStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteTransitionStateActionBuilder of(final StagedQuoteTransitionStateAction template) {
        StagedQuoteTransitionStateActionBuilder builder = new StagedQuoteTransitionStateActionBuilder();
        builder.state = template.getState();
        builder.force = template.getForce();
        return builder;
    }

}
