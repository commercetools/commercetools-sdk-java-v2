package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerRemoveShippingAddressIdAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerRemoveShippingAddressIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerRemoveShippingAddressIdAction myCustomerRemoveShippingAddressIdAction = MyCustomerRemoveShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyCustomerRemoveShippingAddressIdActionBuilder implements Builder<MyCustomerRemoveShippingAddressIdAction> {

    
    @Nullable
    private String addressId;
    
    
    @Nullable
    private String addressKey;

    
    /**
     *  <p><code>id</code> of the Address to remove from <code>shippingAddressesIds</code>.</p>
     * @param addressId value to be set
     * @return Builder
     */
    
    public MyCustomerRemoveShippingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }
    
    
    
    
    /**
     *  <p><code>key</code> of the Address to remove from <code>shippingAddressesIds</code>.</p>
     * @param addressKey value to be set
     * @return Builder
     */
    
    public MyCustomerRemoveShippingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }
    
    

    /**
     *  <p><code>id</code> of the Address to remove from <code>shippingAddressesIds</code>.</p>
     * @return addressId
     */
    
    @Nullable
    public String getAddressId(){
        return this.addressId;
    }
    
    /**
     *  <p><code>key</code> of the Address to remove from <code>shippingAddressesIds</code>.</p>
     * @return addressKey
     */
    
    @Nullable
    public String getAddressKey(){
        return this.addressKey;
    }

    /**
     * builds MyCustomerRemoveShippingAddressIdAction with checking for non-null required values
     * @return MyCustomerRemoveShippingAddressIdAction
     */
    public MyCustomerRemoveShippingAddressIdAction build() {
        return new MyCustomerRemoveShippingAddressIdActionImpl(addressId, addressKey);
    }
    
    /**
     * builds MyCustomerRemoveShippingAddressIdAction without checking for non-null required values
     * @return MyCustomerRemoveShippingAddressIdAction
     */
    public MyCustomerRemoveShippingAddressIdAction buildUnchecked() {
        return new MyCustomerRemoveShippingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * factory method for an instance of MyCustomerRemoveShippingAddressIdActionBuilder
     * @return builder 
     */
    public static MyCustomerRemoveShippingAddressIdActionBuilder of() {
        return new MyCustomerRemoveShippingAddressIdActionBuilder();
    }

    /**
     * create builder for MyCustomerRemoveShippingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerRemoveShippingAddressIdActionBuilder of(final MyCustomerRemoveShippingAddressIdAction template) {
        MyCustomerRemoveShippingAddressIdActionBuilder builder = new MyCustomerRemoveShippingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
