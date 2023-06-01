package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetPurchaseOrderNumberChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetPurchaseOrderNumberChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetPurchaseOrderNumberChange setPurchaseOrderNumberChange = SetPurchaseOrderNumberChange.builder()
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
public class SetPurchaseOrderNumberChangeBuilder implements Builder<SetPurchaseOrderNumberChange> {

    
    
    private String change;
    
    
    
    private String previousValue;
    
    
    
    private String nextValue;

    
    /**
     *  <p>Update action for <code>setPurchaseOrderNumber</code>.</p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetPurchaseOrderNumberChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     *  <p>Purchase Order number prior to the update action.</p>
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetPurchaseOrderNumberChangeBuilder previousValue( final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     *  <p>Purchase Order number after the update action.</p>
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetPurchaseOrderNumberChangeBuilder nextValue( final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>setPurchaseOrderNumber</code>.</p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *  <p>Purchase Order number prior to the update action.</p>
     * @return previousValue
     */
    
    
    public String getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     *  <p>Purchase Order number after the update action.</p>
     * @return nextValue
     */
    
    
    public String getNextValue(){
        return this.nextValue;
    }

    /**
     * builds SetPurchaseOrderNumberChange with checking for non-null required values
     * @return SetPurchaseOrderNumberChange
     */
    public SetPurchaseOrderNumberChange build() {
        Objects.requireNonNull(change, SetPurchaseOrderNumberChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetPurchaseOrderNumberChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetPurchaseOrderNumberChange.class + ": nextValue is missing");
        return new SetPurchaseOrderNumberChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds SetPurchaseOrderNumberChange without checking for non-null required values
     * @return SetPurchaseOrderNumberChange
     */
    public SetPurchaseOrderNumberChange buildUnchecked() {
        return new SetPurchaseOrderNumberChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetPurchaseOrderNumberChangeBuilder
     * @return builder 
     */
    public static SetPurchaseOrderNumberChangeBuilder of() {
        return new SetPurchaseOrderNumberChangeBuilder();
    }

    /**
     * create builder for SetPurchaseOrderNumberChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetPurchaseOrderNumberChangeBuilder of(final SetPurchaseOrderNumberChange template) {
        SetPurchaseOrderNumberChangeBuilder builder = new SetPurchaseOrderNumberChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
