package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerAddShippingAddressIdAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerAddShippingAddressIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddShippingAddressIdAction customerAddShippingAddressIdAction = CustomerAddShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerAddShippingAddressIdActionBuilder implements Builder<CustomerAddShippingAddressIdAction> {

    
    @Nullable
    private String addressId;
    
    
    @Nullable
    private String addressKey;

    
    /**
     *  <p><code>id</code> of the Address to become a shipping address.</p>
     * @param addressId value to be set
     * @return Builder
     */
    
    public CustomerAddShippingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }
    
    
    
    
    /**
     *  <p><code>key</code> of the Address to become a shipping address.</p>
     * @param addressKey value to be set
     * @return Builder
     */
    
    public CustomerAddShippingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }
    
    

    /**
     *  <p><code>id</code> of the Address to become a shipping address.</p>
     * @return addressId
     */
    
    @Nullable
    public String getAddressId(){
        return this.addressId;
    }
    
    /**
     *  <p><code>key</code> of the Address to become a shipping address.</p>
     * @return addressKey
     */
    
    @Nullable
    public String getAddressKey(){
        return this.addressKey;
    }

    /**
     * builds CustomerAddShippingAddressIdAction with checking for non-null required values
     * @return CustomerAddShippingAddressIdAction
     */
    public CustomerAddShippingAddressIdAction build() {
        return new CustomerAddShippingAddressIdActionImpl(addressId, addressKey);
    }
    
    /**
     * builds CustomerAddShippingAddressIdAction without checking for non-null required values
     * @return CustomerAddShippingAddressIdAction
     */
    public CustomerAddShippingAddressIdAction buildUnchecked() {
        return new CustomerAddShippingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * factory method for an instance of CustomerAddShippingAddressIdActionBuilder
     * @return builder 
     */
    public static CustomerAddShippingAddressIdActionBuilder of() {
        return new CustomerAddShippingAddressIdActionBuilder();
    }

    /**
     * create builder for CustomerAddShippingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddShippingAddressIdActionBuilder of(final CustomerAddShippingAddressIdAction template) {
        CustomerAddShippingAddressIdActionBuilder builder = new CustomerAddShippingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
