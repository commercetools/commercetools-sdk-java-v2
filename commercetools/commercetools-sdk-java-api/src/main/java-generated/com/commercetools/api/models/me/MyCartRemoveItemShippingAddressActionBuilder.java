package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartRemoveItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartRemoveItemShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartRemoveItemShippingAddressAction myCartRemoveItemShippingAddressAction = MyCartRemoveItemShippingAddressAction.builder()
 *             .addressKey("{addressKey}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyCartRemoveItemShippingAddressActionBuilder implements Builder<MyCartRemoveItemShippingAddressAction> {

    
    
    private String addressKey;

    
    /**
     *  <p><code>key</code> of the Address to remove from <code>itemShippingAddresses</code>.</p>
     * @param addressKey value to be set
     * @return Builder
     */
    
    public MyCartRemoveItemShippingAddressActionBuilder addressKey( final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }
    
    

    /**
     *  <p><code>key</code> of the Address to remove from <code>itemShippingAddresses</code>.</p>
     * @return addressKey
     */
    
    
    public String getAddressKey(){
        return this.addressKey;
    }

    /**
     * builds MyCartRemoveItemShippingAddressAction with checking for non-null required values
     * @return MyCartRemoveItemShippingAddressAction
     */
    public MyCartRemoveItemShippingAddressAction build() {
        Objects.requireNonNull(addressKey, MyCartRemoveItemShippingAddressAction.class + ": addressKey is missing");
        return new MyCartRemoveItemShippingAddressActionImpl(addressKey);
    }
    
    /**
     * builds MyCartRemoveItemShippingAddressAction without checking for non-null required values
     * @return MyCartRemoveItemShippingAddressAction
     */
    public MyCartRemoveItemShippingAddressAction buildUnchecked() {
        return new MyCartRemoveItemShippingAddressActionImpl(addressKey);
    }

    /**
     * factory method for an instance of MyCartRemoveItemShippingAddressActionBuilder
     * @return builder 
     */
    public static MyCartRemoveItemShippingAddressActionBuilder of() {
        return new MyCartRemoveItemShippingAddressActionBuilder();
    }

    /**
     * create builder for MyCartRemoveItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartRemoveItemShippingAddressActionBuilder of(final MyCartRemoveItemShippingAddressAction template) {
        MyCartRemoveItemShippingAddressActionBuilder builder = new MyCartRemoveItemShippingAddressActionBuilder();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
