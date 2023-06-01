package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetApplicationVersionChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetApplicationVersionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetApplicationVersionChange setApplicationVersionChange = SetApplicationVersionChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetApplicationVersionChangeBuilder implements Builder<SetApplicationVersionChange> {

    
    
    private String change;
    
    
    
    private Integer previousValue;
    
    
    
    private Integer nextValue;

    
    /**
     *  <p>Internal Update action for <code>setApplicationVersion</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetApplicationVersionChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetApplicationVersionChangeBuilder previousValue( final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetApplicationVersionChangeBuilder nextValue( final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Internal Update action for <code>setApplicationVersion</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public Integer getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public Integer getNextValue(){
        return this.nextValue;
    }

    /**
     * builds SetApplicationVersionChange with checking for non-null required values
     * @return SetApplicationVersionChange
     */
    public SetApplicationVersionChange build() {
        Objects.requireNonNull(change, SetApplicationVersionChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetApplicationVersionChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetApplicationVersionChange.class + ": nextValue is missing");
        return new SetApplicationVersionChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds SetApplicationVersionChange without checking for non-null required values
     * @return SetApplicationVersionChange
     */
    public SetApplicationVersionChange buildUnchecked() {
        return new SetApplicationVersionChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetApplicationVersionChangeBuilder
     * @return builder 
     */
    public static SetApplicationVersionChangeBuilder of() {
        return new SetApplicationVersionChangeBuilder();
    }

    /**
     * create builder for SetApplicationVersionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetApplicationVersionChangeBuilder of(final SetApplicationVersionChange template) {
        SetApplicationVersionChangeBuilder builder = new SetApplicationVersionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
