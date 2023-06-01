package com.commercetools.api.models.message;

import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.order.Delivery;
import com.commercetools.api.models.message.DeliveryRemovedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryRemovedMessagePayload deliveryRemovedMessagePayload = DeliveryRemovedMessagePayload.builder()
 *             .delivery(deliveryBuilder -> deliveryBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DeliveryRemovedMessagePayloadBuilder implements Builder<DeliveryRemovedMessagePayload> {

    
    
    private com.commercetools.api.models.order.Delivery delivery;
    
    
    @Nullable
    private String shippingKey;

    
    /**
     *  <p>The Delivery that was removed from the Order.</p>
     * @param builder function to build the delivery value
     * @return Builder
     */
    
    public DeliveryRemovedMessagePayloadBuilder delivery(Function<com.commercetools.api.models.order.DeliveryBuilder, com.commercetools.api.models.order.DeliveryBuilder> builder) {
        this.delivery = builder.apply(com.commercetools.api.models.order.DeliveryBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The Delivery that was removed from the Order.</p>
     * @param builder function to build the delivery value
     * @return Builder
     */
    
    public DeliveryRemovedMessagePayloadBuilder withDelivery(Function<com.commercetools.api.models.order.DeliveryBuilder, com.commercetools.api.models.order.Delivery> builder) {
        this.delivery = builder.apply(com.commercetools.api.models.order.DeliveryBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The Delivery that was removed from the Order.</p>
     * @param delivery value to be set
     * @return Builder
     */
    
    public DeliveryRemovedMessagePayloadBuilder delivery( final com.commercetools.api.models.order.Delivery delivery) {
        this.delivery = delivery;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */
    
    public DeliveryRemovedMessagePayloadBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }
    
    

    /**
     *  <p>The Delivery that was removed from the Order.</p>
     * @return delivery
     */
    
    
    public com.commercetools.api.models.order.Delivery getDelivery(){
        return this.delivery;
    }
    
    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @return shippingKey
     */
    
    @Nullable
    public String getShippingKey(){
        return this.shippingKey;
    }

    /**
     * builds DeliveryRemovedMessagePayload with checking for non-null required values
     * @return DeliveryRemovedMessagePayload
     */
    public DeliveryRemovedMessagePayload build() {
        Objects.requireNonNull(delivery, DeliveryRemovedMessagePayload.class + ": delivery is missing");
        return new DeliveryRemovedMessagePayloadImpl(delivery, shippingKey);
    }
    
    /**
     * builds DeliveryRemovedMessagePayload without checking for non-null required values
     * @return DeliveryRemovedMessagePayload
     */
    public DeliveryRemovedMessagePayload buildUnchecked() {
        return new DeliveryRemovedMessagePayloadImpl(delivery, shippingKey);
    }

    /**
     * factory method for an instance of DeliveryRemovedMessagePayloadBuilder
     * @return builder 
     */
    public static DeliveryRemovedMessagePayloadBuilder of() {
        return new DeliveryRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for DeliveryRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryRemovedMessagePayloadBuilder of(final DeliveryRemovedMessagePayload template) {
        DeliveryRemovedMessagePayloadBuilder builder = new DeliveryRemovedMessagePayloadBuilder();
        builder.delivery = template.getDelivery();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
