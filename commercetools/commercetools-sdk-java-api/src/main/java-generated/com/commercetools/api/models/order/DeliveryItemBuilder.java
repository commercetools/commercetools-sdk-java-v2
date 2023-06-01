package com.commercetools.api.models.order;


import com.commercetools.api.models.order.DeliveryItem;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryItemBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryItem deliveryItem = DeliveryItem.builder()
 *             .id("{id}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DeliveryItemBuilder implements Builder<DeliveryItem> {

    
    
    private String id;
    
    
    
    private Long quantity;

    
    /**
     *  <p>Unique identifier of the DeliveryItem.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public DeliveryItemBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     * set the value to the quantity
     * @param quantity value to be set
     * @return Builder
     */
    
    public DeliveryItemBuilder quantity( final Long quantity) {
        this.quantity = quantity;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the DeliveryItem.</p>
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     * value of quantity}
     * @return quantity
     */
    
    
    public Long getQuantity(){
        return this.quantity;
    }

    /**
     * builds DeliveryItem with checking for non-null required values
     * @return DeliveryItem
     */
    public DeliveryItem build() {
        Objects.requireNonNull(id, DeliveryItem.class + ": id is missing");
        Objects.requireNonNull(quantity, DeliveryItem.class + ": quantity is missing");
        return new DeliveryItemImpl(id, quantity);
    }
    
    /**
     * builds DeliveryItem without checking for non-null required values
     * @return DeliveryItem
     */
    public DeliveryItem buildUnchecked() {
        return new DeliveryItemImpl(id, quantity);
    }

    /**
     * factory method for an instance of DeliveryItemBuilder
     * @return builder 
     */
    public static DeliveryItemBuilder of() {
        return new DeliveryItemBuilder();
    }

    /**
     * create builder for DeliveryItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryItemBuilder of(final DeliveryItem template) {
        DeliveryItemBuilder builder = new DeliveryItemBuilder();
        builder.id = template.getId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
