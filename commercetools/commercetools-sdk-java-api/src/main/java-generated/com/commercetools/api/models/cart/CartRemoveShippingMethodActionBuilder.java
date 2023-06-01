package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartRemoveShippingMethodAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartRemoveShippingMethodActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartRemoveShippingMethodAction cartRemoveShippingMethodAction = CartRemoveShippingMethodAction.builder()
 *             .shippingKey("{shippingKey}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartRemoveShippingMethodActionBuilder implements Builder<CartRemoveShippingMethodAction> {

    
    
    private String shippingKey;

    
    /**
     *  <p>User-defined unique identifier of the Shipping Method to remove from the Cart.</p>
     * @param shippingKey value to be set
     * @return Builder
     */
    
    public CartRemoveShippingMethodActionBuilder shippingKey( final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }
    
    

    /**
     *  <p>User-defined unique identifier of the Shipping Method to remove from the Cart.</p>
     * @return shippingKey
     */
    
    
    public String getShippingKey(){
        return this.shippingKey;
    }

    /**
     * builds CartRemoveShippingMethodAction with checking for non-null required values
     * @return CartRemoveShippingMethodAction
     */
    public CartRemoveShippingMethodAction build() {
        Objects.requireNonNull(shippingKey, CartRemoveShippingMethodAction.class + ": shippingKey is missing");
        return new CartRemoveShippingMethodActionImpl(shippingKey);
    }
    
    /**
     * builds CartRemoveShippingMethodAction without checking for non-null required values
     * @return CartRemoveShippingMethodAction
     */
    public CartRemoveShippingMethodAction buildUnchecked() {
        return new CartRemoveShippingMethodActionImpl(shippingKey);
    }

    /**
     * factory method for an instance of CartRemoveShippingMethodActionBuilder
     * @return builder 
     */
    public static CartRemoveShippingMethodActionBuilder of() {
        return new CartRemoveShippingMethodActionBuilder();
    }

    /**
     * create builder for CartRemoveShippingMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartRemoveShippingMethodActionBuilder of(final CartRemoveShippingMethodAction template) {
        CartRemoveShippingMethodActionBuilder builder = new CartRemoveShippingMethodActionBuilder();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
