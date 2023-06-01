package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.StackingMode;
import com.commercetools.history.models.change.ChangeStackingModeChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeStackingModeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeStackingModeChange changeStackingModeChange = ChangeStackingModeChange.builder()
 *             .change("{change}")
 *             .nextValue(StackingMode.STACKING)
 *             .previousValue(StackingMode.STACKING)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeStackingModeChangeBuilder implements Builder<ChangeStackingModeChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.StackingMode nextValue;
    
    
    
    private com.commercetools.history.models.common.StackingMode previousValue;

    
    /**
     *  <p>Update action for <code>changeStackingMode</code> on cart discounts</p>
     * @param change value to be set
     * @return Builder
     */
    
    public ChangeStackingModeChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeStackingModeChangeBuilder nextValue( final com.commercetools.history.models.common.StackingMode nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeStackingModeChangeBuilder previousValue( final com.commercetools.history.models.common.StackingMode previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>changeStackingMode</code> on cart discounts</p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.StackingMode getNextValue(){
        return this.nextValue;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.StackingMode getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds ChangeStackingModeChange with checking for non-null required values
     * @return ChangeStackingModeChange
     */
    public ChangeStackingModeChange build() {
        Objects.requireNonNull(change, ChangeStackingModeChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, ChangeStackingModeChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeStackingModeChange.class + ": previousValue is missing");
        return new ChangeStackingModeChangeImpl(change, nextValue, previousValue);
    }
    
    /**
     * builds ChangeStackingModeChange without checking for non-null required values
     * @return ChangeStackingModeChange
     */
    public ChangeStackingModeChange buildUnchecked() {
        return new ChangeStackingModeChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of ChangeStackingModeChangeBuilder
     * @return builder 
     */
    public static ChangeStackingModeChangeBuilder of() {
        return new ChangeStackingModeChangeBuilder();
    }

    /**
     * create builder for ChangeStackingModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeStackingModeChangeBuilder of(final ChangeStackingModeChange template) {
        ChangeStackingModeChangeBuilder builder = new ChangeStackingModeChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
