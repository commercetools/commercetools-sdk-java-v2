package com.commercetools.api.models.order;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order.OrderReference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderReference orderReference = OrderReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderReferenceBuilder implements Builder<OrderReference> {

    
    
    private String id;
    
    
    @Nullable
    private com.commercetools.api.models.order.Order obj;

    
    /**
     *  <p>Unique ID of the referenced resource.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public OrderReferenceBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     * set the value to the obj using the builder function
     * @param builder function to build the obj value
     * @return Builder
     */
    
    public OrderReferenceBuilder obj(Function<com.commercetools.api.models.order.OrderBuilder, com.commercetools.api.models.order.OrderBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.order.OrderBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the obj using the builder function
     * @param builder function to build the obj value
     * @return Builder
     */
    
    public OrderReferenceBuilder withObj(Function<com.commercetools.api.models.order.OrderBuilder, com.commercetools.api.models.order.Order> builder) {
        this.obj = builder.apply(com.commercetools.api.models.order.OrderBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the obj
     * @param obj value to be set
     * @return Builder
     */
    
    public OrderReferenceBuilder obj(@Nullable final com.commercetools.api.models.order.Order obj) {
        this.obj = obj;
        return this;
    }
    
    

    /**
     *  <p>Unique ID of the referenced resource.</p>
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     * value of obj}
     * @return obj
     */
    
    @Nullable
    public com.commercetools.api.models.order.Order getObj(){
        return this.obj;
    }

    /**
     * builds OrderReference with checking for non-null required values
     * @return OrderReference
     */
    public OrderReference build() {
        Objects.requireNonNull(id, OrderReference.class + ": id is missing");
        return new OrderReferenceImpl(id, obj);
    }
    
    /**
     * builds OrderReference without checking for non-null required values
     * @return OrderReference
     */
    public OrderReference buildUnchecked() {
        return new OrderReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of OrderReferenceBuilder
     * @return builder 
     */
    public static OrderReferenceBuilder of() {
        return new OrderReferenceBuilder();
    }

    /**
     * create builder for OrderReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderReferenceBuilder of(final OrderReference template) {
        OrderReferenceBuilder builder = new OrderReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
