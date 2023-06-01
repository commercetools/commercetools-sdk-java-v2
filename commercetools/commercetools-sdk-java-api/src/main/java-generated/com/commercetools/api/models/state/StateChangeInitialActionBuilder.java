package com.commercetools.api.models.state;

import com.commercetools.api.models.state.StateUpdateAction;
import com.commercetools.api.models.state.StateChangeInitialAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateChangeInitialActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateChangeInitialAction stateChangeInitialAction = StateChangeInitialAction.builder()
 *             .initial(true)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StateChangeInitialActionBuilder implements Builder<StateChangeInitialAction> {

    
    
    private Boolean initial;

    
    /**
     *  <p>Set to <code>true</code> for defining the State as initial State in a state machine and making it the first step in a workflow.</p>
     * @param initial value to be set
     * @return Builder
     */
    
    public StateChangeInitialActionBuilder initial( final Boolean initial) {
        this.initial = initial;
        return this;
    }
    
    

    /**
     *  <p>Set to <code>true</code> for defining the State as initial State in a state machine and making it the first step in a workflow.</p>
     * @return initial
     */
    
    
    public Boolean getInitial(){
        return this.initial;
    }

    /**
     * builds StateChangeInitialAction with checking for non-null required values
     * @return StateChangeInitialAction
     */
    public StateChangeInitialAction build() {
        Objects.requireNonNull(initial, StateChangeInitialAction.class + ": initial is missing");
        return new StateChangeInitialActionImpl(initial);
    }
    
    /**
     * builds StateChangeInitialAction without checking for non-null required values
     * @return StateChangeInitialAction
     */
    public StateChangeInitialAction buildUnchecked() {
        return new StateChangeInitialActionImpl(initial);
    }

    /**
     * factory method for an instance of StateChangeInitialActionBuilder
     * @return builder 
     */
    public static StateChangeInitialActionBuilder of() {
        return new StateChangeInitialActionBuilder();
    }

    /**
     * create builder for StateChangeInitialAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateChangeInitialActionBuilder of(final StateChangeInitialAction template) {
        StateChangeInitialActionBuilder builder = new StateChangeInitialActionBuilder();
        builder.initial = template.getInitial();
        return builder;
    }

}
