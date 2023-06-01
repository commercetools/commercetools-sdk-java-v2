package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetAuthorNameChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAuthorNameChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAuthorNameChange setAuthorNameChange = SetAuthorNameChange.builder()
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
public class SetAuthorNameChangeBuilder implements Builder<SetAuthorNameChange> {

    
    
    private String change;
    
    
    
    private String previousValue;
    
    
    
    private String nextValue;

    
    /**
     *  <p>Shape of the action for <code>setAuthorName</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetAuthorNameChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetAuthorNameChangeBuilder previousValue( final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetAuthorNameChangeBuilder nextValue( final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Shape of the action for <code>setAuthorName</code></p>
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
     * builds SetAuthorNameChange with checking for non-null required values
     * @return SetAuthorNameChange
     */
    public SetAuthorNameChange build() {
        Objects.requireNonNull(change, SetAuthorNameChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetAuthorNameChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetAuthorNameChange.class + ": nextValue is missing");
        return new SetAuthorNameChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds SetAuthorNameChange without checking for non-null required values
     * @return SetAuthorNameChange
     */
    public SetAuthorNameChange buildUnchecked() {
        return new SetAuthorNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetAuthorNameChangeBuilder
     * @return builder 
     */
    public static SetAuthorNameChangeBuilder of() {
        return new SetAuthorNameChangeBuilder();
    }

    /**
     * create builder for SetAuthorNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAuthorNameChangeBuilder of(final SetAuthorNameChange template) {
        SetAuthorNameChangeBuilder builder = new SetAuthorNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
