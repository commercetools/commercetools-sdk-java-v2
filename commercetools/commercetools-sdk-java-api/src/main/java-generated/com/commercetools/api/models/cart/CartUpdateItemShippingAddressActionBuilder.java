package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.cart.CartUpdateItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartUpdateItemShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartUpdateItemShippingAddressAction cartUpdateItemShippingAddressAction = CartUpdateItemShippingAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartUpdateItemShippingAddressActionBuilder implements Builder<CartUpdateItemShippingAddressAction> {

    
    
    private com.commercetools.api.models.common.BaseAddress address;

    
    /**
     *  <p>The new Address with the same <code>key</code> as the Address it will replace.</p>
     * @param builder function to build the address value
     * @return Builder
     */
    
    public CartUpdateItemShippingAddressActionBuilder address(Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The new Address with the same <code>key</code> as the Address it will replace.</p>
     * @param builder function to build the address value
     * @return Builder
     */
    
    public CartUpdateItemShippingAddressActionBuilder withAddress(Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The new Address with the same <code>key</code> as the Address it will replace.</p>
     * @param address value to be set
     * @return Builder
     */
    
    public CartUpdateItemShippingAddressActionBuilder address( final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }
    
    

    /**
     *  <p>The new Address with the same <code>key</code> as the Address it will replace.</p>
     * @return address
     */
    
    
    public com.commercetools.api.models.common.BaseAddress getAddress(){
        return this.address;
    }

    /**
     * builds CartUpdateItemShippingAddressAction with checking for non-null required values
     * @return CartUpdateItemShippingAddressAction
     */
    public CartUpdateItemShippingAddressAction build() {
        Objects.requireNonNull(address, CartUpdateItemShippingAddressAction.class + ": address is missing");
        return new CartUpdateItemShippingAddressActionImpl(address);
    }
    
    /**
     * builds CartUpdateItemShippingAddressAction without checking for non-null required values
     * @return CartUpdateItemShippingAddressAction
     */
    public CartUpdateItemShippingAddressAction buildUnchecked() {
        return new CartUpdateItemShippingAddressActionImpl(address);
    }

    /**
     * factory method for an instance of CartUpdateItemShippingAddressActionBuilder
     * @return builder 
     */
    public static CartUpdateItemShippingAddressActionBuilder of() {
        return new CartUpdateItemShippingAddressActionBuilder();
    }

    /**
     * create builder for CartUpdateItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartUpdateItemShippingAddressActionBuilder of(final CartUpdateItemShippingAddressAction template) {
        CartUpdateItemShippingAddressActionBuilder builder = new CartUpdateItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
