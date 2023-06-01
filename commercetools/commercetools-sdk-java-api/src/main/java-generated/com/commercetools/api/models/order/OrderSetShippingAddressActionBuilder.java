package com.commercetools.api.models.order;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderSetShippingAddressAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetShippingAddressAction orderSetShippingAddressAction = OrderSetShippingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSetShippingAddressActionBuilder implements Builder<OrderSetShippingAddressAction> {

    
    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    
    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param builder function to build the address value
     * @return Builder
     */
    
    public OrderSetShippingAddressActionBuilder address(Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param builder function to build the address value
     * @return Builder
     */
    
    public OrderSetShippingAddressActionBuilder withAddress(Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param address value to be set
     * @return Builder
     */
    
    public OrderSetShippingAddressActionBuilder address(@Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }
    
    

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @return address
     */
    
    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress(){
        return this.address;
    }

    /**
     * builds OrderSetShippingAddressAction with checking for non-null required values
     * @return OrderSetShippingAddressAction
     */
    public OrderSetShippingAddressAction build() {
        return new OrderSetShippingAddressActionImpl(address);
    }
    
    /**
     * builds OrderSetShippingAddressAction without checking for non-null required values
     * @return OrderSetShippingAddressAction
     */
    public OrderSetShippingAddressAction buildUnchecked() {
        return new OrderSetShippingAddressActionImpl(address);
    }

    /**
     * factory method for an instance of OrderSetShippingAddressActionBuilder
     * @return builder 
     */
    public static OrderSetShippingAddressActionBuilder of() {
        return new OrderSetShippingAddressActionBuilder();
    }

    /**
     * create builder for OrderSetShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetShippingAddressActionBuilder of(final OrderSetShippingAddressAction template) {
        OrderSetShippingAddressActionBuilder builder = new OrderSetShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
