package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetMethodInfoInterfaceChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetMethodInfoInterfaceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMethodInfoInterfaceChange setMethodInfoInterfaceChange = SetMethodInfoInterfaceChange.builder()
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
public class SetMethodInfoInterfaceChangeBuilder implements Builder<SetMethodInfoInterfaceChange> {

    
    
    private String change;
    
    
    
    private String previousValue;
    
    
    
    private String nextValue;

    
    /**
     *  <p>Shape of the action for <code>setMethodInfoInterface</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetMethodInfoInterfaceChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetMethodInfoInterfaceChangeBuilder previousValue( final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetMethodInfoInterfaceChangeBuilder nextValue( final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Shape of the action for <code>setMethodInfoInterface</code></p>
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
     * builds SetMethodInfoInterfaceChange with checking for non-null required values
     * @return SetMethodInfoInterfaceChange
     */
    public SetMethodInfoInterfaceChange build() {
        Objects.requireNonNull(change, SetMethodInfoInterfaceChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetMethodInfoInterfaceChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetMethodInfoInterfaceChange.class + ": nextValue is missing");
        return new SetMethodInfoInterfaceChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds SetMethodInfoInterfaceChange without checking for non-null required values
     * @return SetMethodInfoInterfaceChange
     */
    public SetMethodInfoInterfaceChange buildUnchecked() {
        return new SetMethodInfoInterfaceChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetMethodInfoInterfaceChangeBuilder
     * @return builder 
     */
    public static SetMethodInfoInterfaceChangeBuilder of() {
        return new SetMethodInfoInterfaceChangeBuilder();
    }

    /**
     * create builder for SetMethodInfoInterfaceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMethodInfoInterfaceChangeBuilder of(final SetMethodInfoInterfaceChange template) {
        SetMethodInfoInterfaceChangeBuilder builder = new SetMethodInfoInterfaceChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
