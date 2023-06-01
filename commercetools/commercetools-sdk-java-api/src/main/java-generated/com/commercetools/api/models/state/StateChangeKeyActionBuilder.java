package com.commercetools.api.models.state;

import com.commercetools.api.models.state.StateUpdateAction;
import com.commercetools.api.models.state.StateChangeKeyAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateChangeKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateChangeKeyAction stateChangeKeyAction = StateChangeKeyAction.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StateChangeKeyActionBuilder implements Builder<StateChangeKeyAction> {

    
    
    private String key;

    
    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public StateChangeKeyActionBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return key
     */
    
    
    public String getKey(){
        return this.key;
    }

    /**
     * builds StateChangeKeyAction with checking for non-null required values
     * @return StateChangeKeyAction
     */
    public StateChangeKeyAction build() {
        Objects.requireNonNull(key, StateChangeKeyAction.class + ": key is missing");
        return new StateChangeKeyActionImpl(key);
    }
    
    /**
     * builds StateChangeKeyAction without checking for non-null required values
     * @return StateChangeKeyAction
     */
    public StateChangeKeyAction buildUnchecked() {
        return new StateChangeKeyActionImpl(key);
    }

    /**
     * factory method for an instance of StateChangeKeyActionBuilder
     * @return builder 
     */
    public static StateChangeKeyActionBuilder of() {
        return new StateChangeKeyActionBuilder();
    }

    /**
     * create builder for StateChangeKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateChangeKeyActionBuilder of(final StateChangeKeyAction template) {
        StateChangeKeyActionBuilder builder = new StateChangeKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
