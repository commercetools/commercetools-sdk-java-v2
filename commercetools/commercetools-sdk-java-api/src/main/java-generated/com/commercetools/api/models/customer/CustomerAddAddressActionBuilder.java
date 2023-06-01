package com.commercetools.api.models.customer;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerAddAddressAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerAddAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddAddressAction customerAddAddressAction = CustomerAddAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerAddAddressActionBuilder implements Builder<CustomerAddAddressAction> {

    
    
    private com.commercetools.api.models.common.BaseAddress address;

    
    /**
     *  <p>Value to append to the <code>addresses</code> array.</p>
     * @param builder function to build the address value
     * @return Builder
     */
    
    public CustomerAddAddressActionBuilder address(Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to append to the <code>addresses</code> array.</p>
     * @param builder function to build the address value
     * @return Builder
     */
    
    public CustomerAddAddressActionBuilder withAddress(Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to append to the <code>addresses</code> array.</p>
     * @param address value to be set
     * @return Builder
     */
    
    public CustomerAddAddressActionBuilder address( final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }
    
    

    /**
     *  <p>Value to append to the <code>addresses</code> array.</p>
     * @return address
     */
    
    
    public com.commercetools.api.models.common.BaseAddress getAddress(){
        return this.address;
    }

    /**
     * builds CustomerAddAddressAction with checking for non-null required values
     * @return CustomerAddAddressAction
     */
    public CustomerAddAddressAction build() {
        Objects.requireNonNull(address, CustomerAddAddressAction.class + ": address is missing");
        return new CustomerAddAddressActionImpl(address);
    }
    
    /**
     * builds CustomerAddAddressAction without checking for non-null required values
     * @return CustomerAddAddressAction
     */
    public CustomerAddAddressAction buildUnchecked() {
        return new CustomerAddAddressActionImpl(address);
    }

    /**
     * factory method for an instance of CustomerAddAddressActionBuilder
     * @return builder 
     */
    public static CustomerAddAddressActionBuilder of() {
        return new CustomerAddAddressActionBuilder();
    }

    /**
     * create builder for CustomerAddAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddAddressActionBuilder of(final CustomerAddAddressAction template) {
        CustomerAddAddressActionBuilder builder = new CustomerAddAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
