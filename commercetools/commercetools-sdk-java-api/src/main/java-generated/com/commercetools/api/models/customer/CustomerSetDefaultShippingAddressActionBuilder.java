package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetDefaultShippingAddressAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetDefaultShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetDefaultShippingAddressAction customerSetDefaultShippingAddressAction = CustomerSetDefaultShippingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerSetDefaultShippingAddressActionBuilder implements Builder<CustomerSetDefaultShippingAddressAction> {

    
    @Nullable
    private String addressId;
    
    
    @Nullable
    private String addressKey;

    
    /**
     *  <p><code>id</code> of the Address to become the default shipping address.</p>
     * @param addressId value to be set
     * @return Builder
     */
    
    public CustomerSetDefaultShippingAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }
    
    
    
    
    /**
     *  <p><code>key</code> of the Address to become the default shipping address.</p>
     * @param addressKey value to be set
     * @return Builder
     */
    
    public CustomerSetDefaultShippingAddressActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }
    
    

    /**
     *  <p><code>id</code> of the Address to become the default shipping address.</p>
     * @return addressId
     */
    
    @Nullable
    public String getAddressId(){
        return this.addressId;
    }
    
    /**
     *  <p><code>key</code> of the Address to become the default shipping address.</p>
     * @return addressKey
     */
    
    @Nullable
    public String getAddressKey(){
        return this.addressKey;
    }

    /**
     * builds CustomerSetDefaultShippingAddressAction with checking for non-null required values
     * @return CustomerSetDefaultShippingAddressAction
     */
    public CustomerSetDefaultShippingAddressAction build() {
        return new CustomerSetDefaultShippingAddressActionImpl(addressId, addressKey);
    }
    
    /**
     * builds CustomerSetDefaultShippingAddressAction without checking for non-null required values
     * @return CustomerSetDefaultShippingAddressAction
     */
    public CustomerSetDefaultShippingAddressAction buildUnchecked() {
        return new CustomerSetDefaultShippingAddressActionImpl(addressId, addressKey);
    }

    /**
     * factory method for an instance of CustomerSetDefaultShippingAddressActionBuilder
     * @return builder 
     */
    public static CustomerSetDefaultShippingAddressActionBuilder of() {
        return new CustomerSetDefaultShippingAddressActionBuilder();
    }

    /**
     * create builder for CustomerSetDefaultShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetDefaultShippingAddressActionBuilder of(final CustomerSetDefaultShippingAddressAction template) {
        CustomerSetDefaultShippingAddressActionBuilder builder = new CustomerSetDefaultShippingAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
