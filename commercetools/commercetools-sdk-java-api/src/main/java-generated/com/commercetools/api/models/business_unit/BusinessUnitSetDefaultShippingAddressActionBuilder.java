package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.business_unit.BusinessUnitUpdateAction;
import com.commercetools.api.models.business_unit.BusinessUnitSetDefaultShippingAddressAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitSetDefaultShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetDefaultShippingAddressAction businessUnitSetDefaultShippingAddressAction = BusinessUnitSetDefaultShippingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BusinessUnitSetDefaultShippingAddressActionBuilder implements Builder<BusinessUnitSetDefaultShippingAddressAction> {

    
    @Nullable
    private String addressId;
    
    
    @Nullable
    private String addressKey;

    
    /**
     *  <p>ID of the address to add as a shipping address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     * @return Builder
     */
    
    public BusinessUnitSetDefaultShippingAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Key of the address to add as a shipping address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     * @return Builder
     */
    
    public BusinessUnitSetDefaultShippingAddressActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }
    
    

    /**
     *  <p>ID of the address to add as a shipping address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */
    
    @Nullable
    public String getAddressId(){
        return this.addressId;
    }
    
    /**
     *  <p>Key of the address to add as a shipping address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */
    
    @Nullable
    public String getAddressKey(){
        return this.addressKey;
    }

    /**
     * builds BusinessUnitSetDefaultShippingAddressAction with checking for non-null required values
     * @return BusinessUnitSetDefaultShippingAddressAction
     */
    public BusinessUnitSetDefaultShippingAddressAction build() {
        return new BusinessUnitSetDefaultShippingAddressActionImpl(addressId, addressKey);
    }
    
    /**
     * builds BusinessUnitSetDefaultShippingAddressAction without checking for non-null required values
     * @return BusinessUnitSetDefaultShippingAddressAction
     */
    public BusinessUnitSetDefaultShippingAddressAction buildUnchecked() {
        return new BusinessUnitSetDefaultShippingAddressActionImpl(addressId, addressKey);
    }

    /**
     * factory method for an instance of BusinessUnitSetDefaultShippingAddressActionBuilder
     * @return builder 
     */
    public static BusinessUnitSetDefaultShippingAddressActionBuilder of() {
        return new BusinessUnitSetDefaultShippingAddressActionBuilder();
    }

    /**
     * create builder for BusinessUnitSetDefaultShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSetDefaultShippingAddressActionBuilder of(final BusinessUnitSetDefaultShippingAddressAction template) {
        BusinessUnitSetDefaultShippingAddressActionBuilder builder = new BusinessUnitSetDefaultShippingAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
