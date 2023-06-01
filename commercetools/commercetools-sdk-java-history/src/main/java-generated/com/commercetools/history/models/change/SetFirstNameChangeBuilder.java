package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetFirstNameChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetFirstNameChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetFirstNameChange setFirstNameChange = SetFirstNameChange.builder()
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
public class SetFirstNameChangeBuilder implements Builder<SetFirstNameChange> {

    
    
    private String change;
    
    
    
    private String previousValue;
    
    
    
    private String nextValue;

    
    /**
     *  <p>Shape of the action for <code>setFirstName</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetFirstNameChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetFirstNameChangeBuilder previousValue( final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetFirstNameChangeBuilder nextValue( final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Shape of the action for <code>setFirstName</code></p>
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
     * builds SetFirstNameChange with checking for non-null required values
     * @return SetFirstNameChange
     */
    public SetFirstNameChange build() {
        Objects.requireNonNull(change, SetFirstNameChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetFirstNameChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetFirstNameChange.class + ": nextValue is missing");
        return new SetFirstNameChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds SetFirstNameChange without checking for non-null required values
     * @return SetFirstNameChange
     */
    public SetFirstNameChange buildUnchecked() {
        return new SetFirstNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetFirstNameChangeBuilder
     * @return builder 
     */
    public static SetFirstNameChangeBuilder of() {
        return new SetFirstNameChangeBuilder();
    }

    /**
     * create builder for SetFirstNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetFirstNameChangeBuilder of(final SetFirstNameChange template) {
        SetFirstNameChangeBuilder builder = new SetFirstNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
