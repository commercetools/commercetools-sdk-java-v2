package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetExternalIdChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetExternalIdChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetExternalIdChange setExternalIdChange = SetExternalIdChange.builder()
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
public class SetExternalIdChangeBuilder implements Builder<SetExternalIdChange> {

    
    
    private String change;
    
    
    
    private String previousValue;
    
    
    
    private String nextValue;

    
    /**
     *  <p>Shape of the action for <code>setExternalId</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetExternalIdChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetExternalIdChangeBuilder previousValue( final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetExternalIdChangeBuilder nextValue( final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Shape of the action for <code>setExternalId</code></p>
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
     * builds SetExternalIdChange with checking for non-null required values
     * @return SetExternalIdChange
     */
    public SetExternalIdChange build() {
        Objects.requireNonNull(change, SetExternalIdChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetExternalIdChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetExternalIdChange.class + ": nextValue is missing");
        return new SetExternalIdChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds SetExternalIdChange without checking for non-null required values
     * @return SetExternalIdChange
     */
    public SetExternalIdChange buildUnchecked() {
        return new SetExternalIdChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetExternalIdChangeBuilder
     * @return builder 
     */
    public static SetExternalIdChangeBuilder of() {
        return new SetExternalIdChangeBuilder();
    }

    /**
     * create builder for SetExternalIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetExternalIdChangeBuilder of(final SetExternalIdChange template) {
        SetExternalIdChangeBuilder builder = new SetExternalIdChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
