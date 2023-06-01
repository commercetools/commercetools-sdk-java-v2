package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.order.OrderSetReturnItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetReturnItemCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetReturnItemCustomFieldAction orderSetReturnItemCustomFieldAction = OrderSetReturnItemCustomFieldAction.builder()
 *             .returnItemId("{returnItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSetReturnItemCustomFieldActionBuilder implements Builder<OrderSetReturnItemCustomFieldAction> {

    
    
    private String returnItemId;
    
    
    
    private String name;
    
    
    @Nullable
    private java.lang.Object value;

    
    /**
     * set the value to the returnItemId
     * @param returnItemId value to be set
     * @return Builder
     */
    
    public OrderSetReturnItemCustomFieldActionBuilder returnItemId( final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public OrderSetReturnItemCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */
    
    public OrderSetReturnItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }
    
    

    /**
     * value of returnItemId}
     * @return returnItemId
     */
    
    
    public String getReturnItemId(){
        return this.returnItemId;
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
     * builds OrderSetReturnItemCustomFieldAction with checking for non-null required values
     * @return OrderSetReturnItemCustomFieldAction
     */
    public OrderSetReturnItemCustomFieldAction build() {
        Objects.requireNonNull(returnItemId, OrderSetReturnItemCustomFieldAction.class + ": returnItemId is missing");
        Objects.requireNonNull(name, OrderSetReturnItemCustomFieldAction.class + ": name is missing");
        return new OrderSetReturnItemCustomFieldActionImpl(returnItemId, name, value);
    }
    
    /**
     * builds OrderSetReturnItemCustomFieldAction without checking for non-null required values
     * @return OrderSetReturnItemCustomFieldAction
     */
    public OrderSetReturnItemCustomFieldAction buildUnchecked() {
        return new OrderSetReturnItemCustomFieldActionImpl(returnItemId, name, value);
    }

    /**
     * factory method for an instance of OrderSetReturnItemCustomFieldActionBuilder
     * @return builder 
     */
    public static OrderSetReturnItemCustomFieldActionBuilder of() {
        return new OrderSetReturnItemCustomFieldActionBuilder();
    }

    /**
     * create builder for OrderSetReturnItemCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetReturnItemCustomFieldActionBuilder of(final OrderSetReturnItemCustomFieldAction template) {
        OrderSetReturnItemCustomFieldActionBuilder builder = new OrderSetReturnItemCustomFieldActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
