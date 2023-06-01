package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetStatusInterfaceCodeChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetStatusInterfaceCodeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetStatusInterfaceCodeChange setStatusInterfaceCodeChange = SetStatusInterfaceCodeChange.builder()
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
public class SetStatusInterfaceCodeChangeBuilder implements Builder<SetStatusInterfaceCodeChange> {

    
    
    private String change;
    
    
    
    private String previousValue;
    
    
    
    private String nextValue;

    
    /**
     *  <p>Shape of the action for <code>setStatusInterfaceCode</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetStatusInterfaceCodeChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetStatusInterfaceCodeChangeBuilder previousValue( final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetStatusInterfaceCodeChangeBuilder nextValue( final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Shape of the action for <code>setStatusInterfaceCode</code></p>
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
     * builds SetStatusInterfaceCodeChange with checking for non-null required values
     * @return SetStatusInterfaceCodeChange
     */
    public SetStatusInterfaceCodeChange build() {
        Objects.requireNonNull(change, SetStatusInterfaceCodeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetStatusInterfaceCodeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetStatusInterfaceCodeChange.class + ": nextValue is missing");
        return new SetStatusInterfaceCodeChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds SetStatusInterfaceCodeChange without checking for non-null required values
     * @return SetStatusInterfaceCodeChange
     */
    public SetStatusInterfaceCodeChange buildUnchecked() {
        return new SetStatusInterfaceCodeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetStatusInterfaceCodeChangeBuilder
     * @return builder 
     */
    public static SetStatusInterfaceCodeChangeBuilder of() {
        return new SetStatusInterfaceCodeChangeBuilder();
    }

    /**
     * create builder for SetStatusInterfaceCodeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetStatusInterfaceCodeChangeBuilder of(final SetStatusInterfaceCodeChange template) {
        SetStatusInterfaceCodeChangeBuilder builder = new SetStatusInterfaceCodeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
