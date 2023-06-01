package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.order.OrderSetDeliveryAddressCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetDeliveryAddressCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetDeliveryAddressCustomFieldAction orderSetDeliveryAddressCustomFieldAction = OrderSetDeliveryAddressCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSetDeliveryAddressCustomFieldActionBuilder implements Builder<OrderSetDeliveryAddressCustomFieldAction> {

    
    @Nullable
    private String deliveryId;
    
    
    @Nullable
    private String deliveryKey;
    
    
    
    private String name;
    
    
    @Nullable
    private java.lang.Object value;

    
    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryId value to be set
     * @return Builder
     */
    
    public OrderSetDeliveryAddressCustomFieldActionBuilder deliveryId(@Nullable final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryKey value to be set
     * @return Builder
     */
    
    public OrderSetDeliveryAddressCustomFieldActionBuilder deliveryKey(@Nullable final String deliveryKey) {
        this.deliveryKey = deliveryKey;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public OrderSetDeliveryAddressCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */
    
    public OrderSetDeliveryAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }
    
    

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryId
     */
    
    @Nullable
    public String getDeliveryId(){
        return this.deliveryId;
    }
    
    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryKey
     */
    
    @Nullable
    public String getDeliveryKey(){
        return this.deliveryKey;
    }
    
    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    
    
    public String getName(){
        return this.name;
    }
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */
    
    @Nullable
    public java.lang.Object getValue(){
        return this.value;
    }

    /**
     * builds OrderSetDeliveryAddressCustomFieldAction with checking for non-null required values
     * @return OrderSetDeliveryAddressCustomFieldAction
     */
    public OrderSetDeliveryAddressCustomFieldAction build() {
        Objects.requireNonNull(name, OrderSetDeliveryAddressCustomFieldAction.class + ": name is missing");
        return new OrderSetDeliveryAddressCustomFieldActionImpl(deliveryId, deliveryKey, name, value);
    }
    
    /**
     * builds OrderSetDeliveryAddressCustomFieldAction without checking for non-null required values
     * @return OrderSetDeliveryAddressCustomFieldAction
     */
    public OrderSetDeliveryAddressCustomFieldAction buildUnchecked() {
        return new OrderSetDeliveryAddressCustomFieldActionImpl(deliveryId, deliveryKey, name, value);
    }

    /**
     * factory method for an instance of OrderSetDeliveryAddressCustomFieldActionBuilder
     * @return builder 
     */
    public static OrderSetDeliveryAddressCustomFieldActionBuilder of() {
        return new OrderSetDeliveryAddressCustomFieldActionBuilder();
    }

    /**
     * create builder for OrderSetDeliveryAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetDeliveryAddressCustomFieldActionBuilder of(final OrderSetDeliveryAddressCustomFieldAction template) {
        OrderSetDeliveryAddressCustomFieldActionBuilder builder = new OrderSetDeliveryAddressCustomFieldActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.deliveryKey = template.getDeliveryKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
