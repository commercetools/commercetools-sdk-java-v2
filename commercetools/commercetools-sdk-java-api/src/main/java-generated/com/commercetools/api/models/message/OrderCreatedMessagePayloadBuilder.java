package com.commercetools.api.models.message;

import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.message.OrderCreatedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCreatedMessagePayload orderCreatedMessagePayload = OrderCreatedMessagePayload.builder()
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderCreatedMessagePayloadBuilder implements Builder<OrderCreatedMessagePayload> {

    
    
    private com.commercetools.api.models.order.Order order;

    
    /**
     *  <p>Order that was created.</p>
     * @param builder function to build the order value
     * @return Builder
     */
    
    public OrderCreatedMessagePayloadBuilder order(Function<com.commercetools.api.models.order.OrderBuilder, com.commercetools.api.models.order.OrderBuilder> builder) {
        this.order = builder.apply(com.commercetools.api.models.order.OrderBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Order that was created.</p>
     * @param builder function to build the order value
     * @return Builder
     */
    
    public OrderCreatedMessagePayloadBuilder withOrder(Function<com.commercetools.api.models.order.OrderBuilder, com.commercetools.api.models.order.Order> builder) {
        this.order = builder.apply(com.commercetools.api.models.order.OrderBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Order that was created.</p>
     * @param order value to be set
     * @return Builder
     */
    
    public OrderCreatedMessagePayloadBuilder order( final com.commercetools.api.models.order.Order order) {
        this.order = order;
        return this;
    }
    
    

    /**
     *  <p>Order that was created.</p>
     * @return order
     */
    
    
    public com.commercetools.api.models.order.Order getOrder(){
        return this.order;
    }

    /**
     * builds OrderCreatedMessagePayload with checking for non-null required values
     * @return OrderCreatedMessagePayload
     */
    public OrderCreatedMessagePayload build() {
        Objects.requireNonNull(order, OrderCreatedMessagePayload.class + ": order is missing");
        return new OrderCreatedMessagePayloadImpl(order);
    }
    
    /**
     * builds OrderCreatedMessagePayload without checking for non-null required values
     * @return OrderCreatedMessagePayload
     */
    public OrderCreatedMessagePayload buildUnchecked() {
        return new OrderCreatedMessagePayloadImpl(order);
    }

    /**
     * factory method for an instance of OrderCreatedMessagePayloadBuilder
     * @return builder 
     */
    public static OrderCreatedMessagePayloadBuilder of() {
        return new OrderCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for OrderCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCreatedMessagePayloadBuilder of(final OrderCreatedMessagePayload template) {
        OrderCreatedMessagePayloadBuilder builder = new OrderCreatedMessagePayloadBuilder();
        builder.order = template.getOrder();
        return builder;
    }

}
