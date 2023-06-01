package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderRemoveItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderRemoveItemShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderRemoveItemShippingAddressAction orderRemoveItemShippingAddressAction = OrderRemoveItemShippingAddressAction.builder()
 *             .addressKey("{addressKey}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderRemoveItemShippingAddressActionBuilder implements Builder<OrderRemoveItemShippingAddressAction> {

    
    
    private String addressKey;

    
    /**
     * set the value to the addressKey
     * @param addressKey value to be set
     * @return Builder
     */
    
    public OrderRemoveItemShippingAddressActionBuilder addressKey( final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }
    
    

    /**
     * value of addressKey}
     * @return addressKey
     */
    
    
    public String getAddressKey(){
        return this.addressKey;
    }

    /**
     * builds OrderRemoveItemShippingAddressAction with checking for non-null required values
     * @return OrderRemoveItemShippingAddressAction
     */
    public OrderRemoveItemShippingAddressAction build() {
        Objects.requireNonNull(addressKey, OrderRemoveItemShippingAddressAction.class + ": addressKey is missing");
        return new OrderRemoveItemShippingAddressActionImpl(addressKey);
    }
    
    /**
     * builds OrderRemoveItemShippingAddressAction without checking for non-null required values
     * @return OrderRemoveItemShippingAddressAction
     */
    public OrderRemoveItemShippingAddressAction buildUnchecked() {
        return new OrderRemoveItemShippingAddressActionImpl(addressKey);
    }

    /**
     * factory method for an instance of OrderRemoveItemShippingAddressActionBuilder
     * @return builder 
     */
    public static OrderRemoveItemShippingAddressActionBuilder of() {
        return new OrderRemoveItemShippingAddressActionBuilder();
    }

    /**
     * create builder for OrderRemoveItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderRemoveItemShippingAddressActionBuilder of(final OrderRemoveItemShippingAddressAction template) {
        OrderRemoveItemShippingAddressActionBuilder builder = new OrderRemoveItemShippingAddressActionBuilder();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
