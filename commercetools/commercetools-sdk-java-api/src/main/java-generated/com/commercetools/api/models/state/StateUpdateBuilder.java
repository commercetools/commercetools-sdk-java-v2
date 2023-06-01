package com.commercetools.api.models.state;

import com.commercetools.api.models.state.StateUpdateAction;
import com.commercetools.api.models.state.StateUpdate;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateUpdate stateUpdate = StateUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StateUpdateBuilder implements Builder<StateUpdate> {

    
    
    private Long version;
    
    
    
    private java.util.List<com.commercetools.api.models.state.StateUpdateAction> actions;

    
    /**
     *  <p>Expected version of the State on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @param version value to be set
     * @return Builder
     */
    
    public StateUpdateBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    
    /**
     *  <p>Update actions to be performed on the State.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public StateUpdateBuilder actions( final com.commercetools.api.models.state.StateUpdateAction ...actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }
    
    /**
     *  <p>Update actions to be performed on the State.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public StateUpdateBuilder actions( final java.util.List<com.commercetools.api.models.state.StateUpdateAction> actions) {
        this.actions = actions;
        return this;
    }
    
    /**
     *  <p>Update actions to be performed on the State.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public StateUpdateBuilder plusActions( final com.commercetools.api.models.state.StateUpdateAction ...actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }
    
    
    /**
     *  <p>Update actions to be performed on the State.</p>
     * @param builder function to build the actions value
     * @return Builder
     */
    
    public StateUpdateBuilder plusActions(Function<com.commercetools.api.models.state.StateUpdateActionBuilder, Builder<? extends com.commercetools.api.models.state.StateUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.state.StateUpdateActionBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Update actions to be performed on the State.</p>
     * @param builder function to build the actions value
     * @return Builder
     */
    
    public StateUpdateBuilder withActions(Function<com.commercetools.api.models.state.StateUpdateActionBuilder, Builder<? extends com.commercetools.api.models.state.StateUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.state.StateUpdateActionBuilder.of()).build());
        return this;
    }
                    
    

    /**
     *  <p>Expected version of the State on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @return version
     */
    
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>Update actions to be performed on the State.</p>
     * @return actions
     */
    
    
    public java.util.List<com.commercetools.api.models.state.StateUpdateAction> getActions(){
        return this.actions;
    }

    /**
     * builds StateUpdate with checking for non-null required values
     * @return StateUpdate
     */
    public StateUpdate build() {
        Objects.requireNonNull(version, StateUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, StateUpdate.class + ": actions is missing");
        return new StateUpdateImpl(version, actions);
    }
    
    /**
     * builds StateUpdate without checking for non-null required values
     * @return StateUpdate
     */
    public StateUpdate buildUnchecked() {
        return new StateUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of StateUpdateBuilder
     * @return builder 
     */
    public static StateUpdateBuilder of() {
        return new StateUpdateBuilder();
    }

    /**
     * create builder for StateUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateUpdateBuilder of(final StateUpdate template) {
        StateUpdateBuilder builder = new StateUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
