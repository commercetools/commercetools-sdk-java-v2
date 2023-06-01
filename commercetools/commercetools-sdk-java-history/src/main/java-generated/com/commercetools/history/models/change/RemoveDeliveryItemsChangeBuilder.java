package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Delivery;
import com.commercetools.history.models.change.RemoveDeliveryItemsChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveDeliveryItemsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveDeliveryItemsChange removeDeliveryItemsChange = RemoveDeliveryItemsChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class RemoveDeliveryItemsChangeBuilder implements Builder<RemoveDeliveryItemsChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.Delivery previousValue;

    
    /**
     *  <p>Update action for <code>removeDelivery</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public RemoveDeliveryItemsChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public RemoveDeliveryItemsChangeBuilder previousValue(Function<com.commercetools.history.models.common.DeliveryBuilder, com.commercetools.history.models.common.DeliveryBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.DeliveryBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public RemoveDeliveryItemsChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.DeliveryBuilder, com.commercetools.history.models.common.Delivery> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.DeliveryBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public RemoveDeliveryItemsChangeBuilder previousValue( final com.commercetools.history.models.common.Delivery previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>removeDelivery</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.Delivery getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds RemoveDeliveryItemsChange with checking for non-null required values
     * @return RemoveDeliveryItemsChange
     */
    public RemoveDeliveryItemsChange build() {
        Objects.requireNonNull(change, RemoveDeliveryItemsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveDeliveryItemsChange.class + ": previousValue is missing");
        return new RemoveDeliveryItemsChangeImpl(change, previousValue);
    }
    
    /**
     * builds RemoveDeliveryItemsChange without checking for non-null required values
     * @return RemoveDeliveryItemsChange
     */
    public RemoveDeliveryItemsChange buildUnchecked() {
        return new RemoveDeliveryItemsChangeImpl(change, previousValue);
    }

    /**
     * factory method for an instance of RemoveDeliveryItemsChangeBuilder
     * @return builder 
     */
    public static RemoveDeliveryItemsChangeBuilder of() {
        return new RemoveDeliveryItemsChangeBuilder();
    }

    /**
     * create builder for RemoveDeliveryItemsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveDeliveryItemsChangeBuilder of(final RemoveDeliveryItemsChange template) {
        RemoveDeliveryItemsChangeBuilder builder = new RemoveDeliveryItemsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
