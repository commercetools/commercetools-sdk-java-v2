package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetCustomerIdChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomerIdChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomerIdChange setCustomerIdChange = SetCustomerIdChange.builder()
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
public class SetCustomerIdChangeBuilder implements Builder<SetCustomerIdChange> {

    
    
    private String change;
    
    
    
    private String previousValue;
    
    
    
    private String nextValue;

    
    /**
     *  <p>Shape of the action for <code>setCustomerId</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetCustomerIdChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetCustomerIdChangeBuilder previousValue( final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetCustomerIdChangeBuilder nextValue( final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Shape of the action for <code>setCustomerId</code></p>
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
     * builds SetCustomerIdChange with checking for non-null required values
     * @return SetCustomerIdChange
     */
    public SetCustomerIdChange build() {
        Objects.requireNonNull(change, SetCustomerIdChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetCustomerIdChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCustomerIdChange.class + ": nextValue is missing");
        return new SetCustomerIdChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds SetCustomerIdChange without checking for non-null required values
     * @return SetCustomerIdChange
     */
    public SetCustomerIdChange buildUnchecked() {
        return new SetCustomerIdChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetCustomerIdChangeBuilder
     * @return builder 
     */
    public static SetCustomerIdChangeBuilder of() {
        return new SetCustomerIdChangeBuilder();
    }

    /**
     * create builder for SetCustomerIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomerIdChangeBuilder of(final SetCustomerIdChange template) {
        SetCustomerIdChangeBuilder builder = new SetCustomerIdChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
