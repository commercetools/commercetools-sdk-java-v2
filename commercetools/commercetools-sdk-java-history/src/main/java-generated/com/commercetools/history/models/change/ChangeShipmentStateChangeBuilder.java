package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.ShipmentState;
import com.commercetools.history.models.change.ChangeShipmentStateChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeShipmentStateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeShipmentStateChange changeShipmentStateChange = ChangeShipmentStateChange.builder()
 *             .change("{change}")
 *             .nextValue(ShipmentState.SHIPPED)
 *             .previousValue(ShipmentState.SHIPPED)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeShipmentStateChangeBuilder implements Builder<ChangeShipmentStateChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.ShipmentState nextValue;
    
    
    
    private com.commercetools.history.models.common.ShipmentState previousValue;

    
    /**
     *  <p>Update action for <code>changeShipmentState</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public ChangeShipmentStateChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeShipmentStateChangeBuilder nextValue( final com.commercetools.history.models.common.ShipmentState nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeShipmentStateChangeBuilder previousValue( final com.commercetools.history.models.common.ShipmentState previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>changeShipmentState</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.ShipmentState getNextValue(){
        return this.nextValue;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.ShipmentState getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds ChangeShipmentStateChange with checking for non-null required values
     * @return ChangeShipmentStateChange
     */
    public ChangeShipmentStateChange build() {
        Objects.requireNonNull(change, ChangeShipmentStateChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, ChangeShipmentStateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeShipmentStateChange.class + ": previousValue is missing");
        return new ChangeShipmentStateChangeImpl(change, nextValue, previousValue);
    }
    
    /**
     * builds ChangeShipmentStateChange without checking for non-null required values
     * @return ChangeShipmentStateChange
     */
    public ChangeShipmentStateChange buildUnchecked() {
        return new ChangeShipmentStateChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of ChangeShipmentStateChangeBuilder
     * @return builder 
     */
    public static ChangeShipmentStateChangeBuilder of() {
        return new ChangeShipmentStateChangeBuilder();
    }

    /**
     * create builder for ChangeShipmentStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeShipmentStateChangeBuilder of(final ChangeShipmentStateChange template) {
        ChangeShipmentStateChangeBuilder builder = new ChangeShipmentStateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
