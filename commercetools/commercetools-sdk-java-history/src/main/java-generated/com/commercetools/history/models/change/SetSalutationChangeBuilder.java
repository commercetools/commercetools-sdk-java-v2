package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetSalutationChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetSalutationChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetSalutationChange setSalutationChange = SetSalutationChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetSalutationChangeBuilder implements Builder<SetSalutationChange> {

    
    
    private String change;
    
    
    
    private String previousValue;
    
    
    
    private String nextValue;

    
    /**
     *  <p>Shape of the action for <code>setSalutation</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetSalutationChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetSalutationChangeBuilder previousValue( final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetSalutationChangeBuilder nextValue( final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Shape of the action for <code>setSalutation</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public String getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public String getNextValue(){
        return this.nextValue;
    }

    /**
     * builds SetSalutationChange with checking for non-null required values
     * @return SetSalutationChange
     */
    public SetSalutationChange build() {
        Objects.requireNonNull(change, SetSalutationChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetSalutationChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetSalutationChange.class + ": nextValue is missing");
        return new SetSalutationChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds SetSalutationChange without checking for non-null required values
     * @return SetSalutationChange
     */
    public SetSalutationChange buildUnchecked() {
        return new SetSalutationChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetSalutationChangeBuilder
     * @return builder 
     */
    public static SetSalutationChangeBuilder of() {
        return new SetSalutationChangeBuilder();
    }

    /**
     * create builder for SetSalutationChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetSalutationChangeBuilder of(final SetSalutationChange template) {
        SetSalutationChangeBuilder builder = new SetSalutationChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
