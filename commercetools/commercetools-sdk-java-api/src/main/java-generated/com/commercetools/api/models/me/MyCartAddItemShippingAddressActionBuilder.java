package com.commercetools.api.models.me;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartAddItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartAddItemShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartAddItemShippingAddressAction myCartAddItemShippingAddressAction = MyCartAddItemShippingAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyCartAddItemShippingAddressActionBuilder implements Builder<MyCartAddItemShippingAddressAction> {

    
    
    private com.commercetools.api.models.common.BaseAddress address;

    
    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>.</p>
     *  <p>The new address must have a key that is unique accross this Cart.</p>
     * @param builder function to build the address value
     * @return Builder
     */
    
    public MyCartAddItemShippingAddressActionBuilder address(Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>.</p>
     *  <p>The new address must have a key that is unique accross this Cart.</p>
     * @param builder function to build the address value
     * @return Builder
     */
    
    public MyCartAddItemShippingAddressActionBuilder withAddress(Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>.</p>
     *  <p>The new address must have a key that is unique accross this Cart.</p>
     * @param address value to be set
     * @return Builder
     */
    
    public MyCartAddItemShippingAddressActionBuilder address( final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }
    
    

    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>.</p>
     *  <p>The new address must have a key that is unique accross this Cart.</p>
     * @return address
     */
    
    
    public com.commercetools.api.models.common.BaseAddress getAddress(){
        return this.address;
    }

    /**
     * builds MyCartAddItemShippingAddressAction with checking for non-null required values
     * @return MyCartAddItemShippingAddressAction
     */
    public MyCartAddItemShippingAddressAction build() {
        Objects.requireNonNull(address, MyCartAddItemShippingAddressAction.class + ": address is missing");
        return new MyCartAddItemShippingAddressActionImpl(address);
    }
    
    /**
     * builds MyCartAddItemShippingAddressAction without checking for non-null required values
     * @return MyCartAddItemShippingAddressAction
     */
    public MyCartAddItemShippingAddressAction buildUnchecked() {
        return new MyCartAddItemShippingAddressActionImpl(address);
    }

    /**
     * factory method for an instance of MyCartAddItemShippingAddressActionBuilder
     * @return builder 
     */
    public static MyCartAddItemShippingAddressActionBuilder of() {
        return new MyCartAddItemShippingAddressActionBuilder();
    }

    /**
     * create builder for MyCartAddItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartAddItemShippingAddressActionBuilder of(final MyCartAddItemShippingAddressAction template) {
        MyCartAddItemShippingAddressActionBuilder builder = new MyCartAddItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
