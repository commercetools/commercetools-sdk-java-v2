package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Parcel;
import com.commercetools.history.models.change.AddParcelToDeliveryChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddParcelToDeliveryChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddParcelToDeliveryChange addParcelToDeliveryChange = AddParcelToDeliveryChange.builder()
 *             .change("{change}")
 *             .deliveryId("{deliveryId}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AddParcelToDeliveryChangeBuilder implements Builder<AddParcelToDeliveryChange> {

    
    
    private String change;
    
    
    
    private String deliveryId;
    
    
    
    private com.commercetools.history.models.common.Parcel nextValue;

    
    /**
     *  <p>Update action for <code>addParcelToDelivery</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public AddParcelToDeliveryChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the deliveryId
     * @param deliveryId value to be set
     * @return Builder
     */
    
    public AddParcelToDeliveryChangeBuilder deliveryId( final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public AddParcelToDeliveryChangeBuilder nextValue(Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.ParcelBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public AddParcelToDeliveryChangeBuilder withNextValue(Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.Parcel> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ParcelBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public AddParcelToDeliveryChangeBuilder nextValue( final com.commercetools.history.models.common.Parcel nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>addParcelToDelivery</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of deliveryId}
     * @return deliveryId
     */
    
    
    public String getDeliveryId(){
        return this.deliveryId;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.Parcel getNextValue(){
        return this.nextValue;
    }

    /**
     * builds AddParcelToDeliveryChange with checking for non-null required values
     * @return AddParcelToDeliveryChange
     */
    public AddParcelToDeliveryChange build() {
        Objects.requireNonNull(change, AddParcelToDeliveryChange.class + ": change is missing");
        Objects.requireNonNull(deliveryId, AddParcelToDeliveryChange.class + ": deliveryId is missing");
        Objects.requireNonNull(nextValue, AddParcelToDeliveryChange.class + ": nextValue is missing");
        return new AddParcelToDeliveryChangeImpl(change, deliveryId, nextValue);
    }
    
    /**
     * builds AddParcelToDeliveryChange without checking for non-null required values
     * @return AddParcelToDeliveryChange
     */
    public AddParcelToDeliveryChange buildUnchecked() {
        return new AddParcelToDeliveryChangeImpl(change, deliveryId, nextValue);
    }

    /**
     * factory method for an instance of AddParcelToDeliveryChangeBuilder
     * @return builder 
     */
    public static AddParcelToDeliveryChangeBuilder of() {
        return new AddParcelToDeliveryChangeBuilder();
    }

    /**
     * create builder for AddParcelToDeliveryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddParcelToDeliveryChangeBuilder of(final AddParcelToDeliveryChange template) {
        AddParcelToDeliveryChangeBuilder builder = new AddParcelToDeliveryChangeBuilder();
        builder.change = template.getChange();
        builder.deliveryId = template.getDeliveryId();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
