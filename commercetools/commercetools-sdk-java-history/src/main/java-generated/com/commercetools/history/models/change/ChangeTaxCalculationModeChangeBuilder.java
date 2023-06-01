package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.TaxCalculationMode;
import com.commercetools.history.models.change.ChangeTaxCalculationModeChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTaxCalculationModeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTaxCalculationModeChange changeTaxCalculationModeChange = ChangeTaxCalculationModeChange.builder()
 *             .change("{change}")
 *             .previousValue(TaxCalculationMode.LINE_ITEM_LEVEL)
 *             .nextValue(TaxCalculationMode.LINE_ITEM_LEVEL)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeTaxCalculationModeChangeBuilder implements Builder<ChangeTaxCalculationModeChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.TaxCalculationMode previousValue;
    
    
    
    private com.commercetools.history.models.common.TaxCalculationMode nextValue;

    
    /**
     *  <p>Shape of the action for <code>changeTaxCalculationMode</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public ChangeTaxCalculationModeChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeTaxCalculationModeChangeBuilder previousValue( final com.commercetools.history.models.common.TaxCalculationMode previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeTaxCalculationModeChangeBuilder nextValue( final com.commercetools.history.models.common.TaxCalculationMode nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Shape of the action for <code>changeTaxCalculationMode</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.TaxCalculationMode getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.TaxCalculationMode getNextValue(){
        return this.nextValue;
    }

    /**
     * builds ChangeTaxCalculationModeChange with checking for non-null required values
     * @return ChangeTaxCalculationModeChange
     */
    public ChangeTaxCalculationModeChange build() {
        Objects.requireNonNull(change, ChangeTaxCalculationModeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeTaxCalculationModeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeTaxCalculationModeChange.class + ": nextValue is missing");
        return new ChangeTaxCalculationModeChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds ChangeTaxCalculationModeChange without checking for non-null required values
     * @return ChangeTaxCalculationModeChange
     */
    public ChangeTaxCalculationModeChange buildUnchecked() {
        return new ChangeTaxCalculationModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeTaxCalculationModeChangeBuilder
     * @return builder 
     */
    public static ChangeTaxCalculationModeChangeBuilder of() {
        return new ChangeTaxCalculationModeChangeBuilder();
    }

    /**
     * create builder for ChangeTaxCalculationModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTaxCalculationModeChangeBuilder of(final ChangeTaxCalculationModeChange template) {
        ChangeTaxCalculationModeChangeBuilder builder = new ChangeTaxCalculationModeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
