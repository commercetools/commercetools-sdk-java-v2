package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.StateType;
import com.commercetools.history.models.change.ChangeStateTypeChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeStateTypeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeStateTypeChange changeStateTypeChange = ChangeStateTypeChange.builder()
 *             .change("{change}")
 *             .previousValue(StateType.ORDER_STATE)
 *             .nextValue(StateType.ORDER_STATE)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeStateTypeChangeBuilder implements Builder<ChangeStateTypeChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.StateType previousValue;
    
    
    
    private com.commercetools.history.models.common.StateType nextValue;

    
    /**
     *  <p>Update action for <code>changeType</code> on state</p>
     * @param change value to be set
     * @return Builder
     */
    
    public ChangeStateTypeChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeStateTypeChangeBuilder previousValue( final com.commercetools.history.models.common.StateType previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeStateTypeChangeBuilder nextValue( final com.commercetools.history.models.common.StateType nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>changeType</code> on state</p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.StateType getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.StateType getNextValue(){
        return this.nextValue;
    }

    /**
     * builds ChangeStateTypeChange with checking for non-null required values
     * @return ChangeStateTypeChange
     */
    public ChangeStateTypeChange build() {
        Objects.requireNonNull(change, ChangeStateTypeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeStateTypeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeStateTypeChange.class + ": nextValue is missing");
        return new ChangeStateTypeChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds ChangeStateTypeChange without checking for non-null required values
     * @return ChangeStateTypeChange
     */
    public ChangeStateTypeChange buildUnchecked() {
        return new ChangeStateTypeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeStateTypeChangeBuilder
     * @return builder 
     */
    public static ChangeStateTypeChangeBuilder of() {
        return new ChangeStateTypeChangeBuilder();
    }

    /**
     * create builder for ChangeStateTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeStateTypeChangeBuilder of(final ChangeStateTypeChange template) {
        ChangeStateTypeChangeBuilder builder = new ChangeStateTypeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
