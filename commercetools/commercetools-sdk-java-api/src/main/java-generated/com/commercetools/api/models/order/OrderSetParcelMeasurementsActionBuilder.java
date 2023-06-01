package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.ParcelMeasurements;
import com.commercetools.api.models.order.OrderSetParcelMeasurementsAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetParcelMeasurementsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetParcelMeasurementsAction orderSetParcelMeasurementsAction = OrderSetParcelMeasurementsAction.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSetParcelMeasurementsActionBuilder implements Builder<OrderSetParcelMeasurementsAction> {

    
    
    private String parcelId;
    
    
    @Nullable
    private com.commercetools.api.models.order.ParcelMeasurements measurements;

    
    /**
     * set the value to the parcelId
     * @param parcelId value to be set
     * @return Builder
     */
    
    public OrderSetParcelMeasurementsActionBuilder parcelId( final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }
    
    
    
    
    /**
     * set the value to the measurements using the builder function
     * @param builder function to build the measurements value
     * @return Builder
     */
    
    public OrderSetParcelMeasurementsActionBuilder measurements(Function<com.commercetools.api.models.order.ParcelMeasurementsBuilder, com.commercetools.api.models.order.ParcelMeasurementsBuilder> builder) {
        this.measurements = builder.apply(com.commercetools.api.models.order.ParcelMeasurementsBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the measurements using the builder function
     * @param builder function to build the measurements value
     * @return Builder
     */
    
    public OrderSetParcelMeasurementsActionBuilder withMeasurements(Function<com.commercetools.api.models.order.ParcelMeasurementsBuilder, com.commercetools.api.models.order.ParcelMeasurements> builder) {
        this.measurements = builder.apply(com.commercetools.api.models.order.ParcelMeasurementsBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the measurements
     * @param measurements value to be set
     * @return Builder
     */
    
    public OrderSetParcelMeasurementsActionBuilder measurements(@Nullable final com.commercetools.api.models.order.ParcelMeasurements measurements) {
        this.measurements = measurements;
        return this;
    }
    
    

    /**
     * value of parcelId}
     * @return parcelId
     */
    
    
    public String getParcelId(){
        return this.parcelId;
    }
    
    /**
     * value of measurements}
     * @return measurements
     */
    
    @Nullable
    public com.commercetools.api.models.order.ParcelMeasurements getMeasurements(){
        return this.measurements;
    }

    /**
     * builds OrderSetParcelMeasurementsAction with checking for non-null required values
     * @return OrderSetParcelMeasurementsAction
     */
    public OrderSetParcelMeasurementsAction build() {
        Objects.requireNonNull(parcelId, OrderSetParcelMeasurementsAction.class + ": parcelId is missing");
        return new OrderSetParcelMeasurementsActionImpl(parcelId, measurements);
    }
    
    /**
     * builds OrderSetParcelMeasurementsAction without checking for non-null required values
     * @return OrderSetParcelMeasurementsAction
     */
    public OrderSetParcelMeasurementsAction buildUnchecked() {
        return new OrderSetParcelMeasurementsActionImpl(parcelId, measurements);
    }

    /**
     * factory method for an instance of OrderSetParcelMeasurementsActionBuilder
     * @return builder 
     */
    public static OrderSetParcelMeasurementsActionBuilder of() {
        return new OrderSetParcelMeasurementsActionBuilder();
    }

    /**
     * create builder for OrderSetParcelMeasurementsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetParcelMeasurementsActionBuilder of(final OrderSetParcelMeasurementsAction template) {
        OrderSetParcelMeasurementsActionBuilder builder = new OrderSetParcelMeasurementsActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.measurements = template.getMeasurements();
        return builder;
    }

}
