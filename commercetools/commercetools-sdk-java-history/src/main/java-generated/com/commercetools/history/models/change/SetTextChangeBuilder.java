package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetTextChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetTextChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTextChange setTextChange = SetTextChange.builder()
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
public class SetTextChangeBuilder implements Builder<SetTextChange> {

    
    
    private String change;
    
    
    
    private String previousValue;
    
    
    
    private String nextValue;

    
    /**
     *  <p>Shape of the action for <code>setText</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetTextChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetTextChangeBuilder previousValue( final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetTextChangeBuilder nextValue( final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Shape of the action for <code>setText</code></p>
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
     * builds SetTextChange with checking for non-null required values
     * @return SetTextChange
     */
    public SetTextChange build() {
        Objects.requireNonNull(change, SetTextChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetTextChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetTextChange.class + ": nextValue is missing");
        return new SetTextChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds SetTextChange without checking for non-null required values
     * @return SetTextChange
     */
    public SetTextChange buildUnchecked() {
        return new SetTextChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetTextChangeBuilder
     * @return builder 
     */
    public static SetTextChangeBuilder of() {
        return new SetTextChangeBuilder();
    }

    /**
     * create builder for SetTextChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTextChangeBuilder of(final SetTextChange template) {
        SetTextChangeBuilder builder = new SetTextChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
