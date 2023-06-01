package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.order.OrderSetParcelCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetParcelCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetParcelCustomFieldAction orderSetParcelCustomFieldAction = OrderSetParcelCustomFieldAction.builder()
 *             .parcelId("{parcelId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSetParcelCustomFieldActionBuilder implements Builder<OrderSetParcelCustomFieldAction> {

    
    
    private String parcelId;
    
    
    
    private String name;
    
    
    @Nullable
    private java.lang.Object value;

    
    /**
     * set the value to the parcelId
     * @param parcelId value to be set
     * @return Builder
     */
    
    public OrderSetParcelCustomFieldActionBuilder parcelId( final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public OrderSetParcelCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */
    
    public OrderSetParcelCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
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
     * builds OrderSetParcelCustomFieldAction with checking for non-null required values
     * @return OrderSetParcelCustomFieldAction
     */
    public OrderSetParcelCustomFieldAction build() {
        Objects.requireNonNull(parcelId, OrderSetParcelCustomFieldAction.class + ": parcelId is missing");
        Objects.requireNonNull(name, OrderSetParcelCustomFieldAction.class + ": name is missing");
        return new OrderSetParcelCustomFieldActionImpl(parcelId, name, value);
    }
    
    /**
     * builds OrderSetParcelCustomFieldAction without checking for non-null required values
     * @return OrderSetParcelCustomFieldAction
     */
    public OrderSetParcelCustomFieldAction buildUnchecked() {
        return new OrderSetParcelCustomFieldActionImpl(parcelId, name, value);
    }

    /**
     * factory method for an instance of OrderSetParcelCustomFieldActionBuilder
     * @return builder 
     */
    public static OrderSetParcelCustomFieldActionBuilder of() {
        return new OrderSetParcelCustomFieldActionBuilder();
    }

    /**
     * create builder for OrderSetParcelCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetParcelCustomFieldActionBuilder of(final OrderSetParcelCustomFieldAction template) {
        OrderSetParcelCustomFieldActionBuilder builder = new OrderSetParcelCustomFieldActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
