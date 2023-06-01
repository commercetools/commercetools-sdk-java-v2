package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.business_unit.BusinessUnitUpdateAction;
import com.commercetools.api.models.business_unit.BusinessUnitAddShippingAddressIdAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAddShippingAddressIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddShippingAddressIdAction businessUnitAddShippingAddressIdAction = BusinessUnitAddShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BusinessUnitAddShippingAddressIdActionBuilder implements Builder<BusinessUnitAddShippingAddressIdAction> {

    
    @Nullable
    private String addressId;
    
    
    @Nullable
    private String addressKey;

    
    /**
     *  <p>ID of the address to add as a shipping address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     * @return Builder
     */
    
    public BusinessUnitAddShippingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Key of the address to add as a shipping address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     * @return Builder
     */
    
    public BusinessUnitAddShippingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
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
     * builds BusinessUnitAddShippingAddressIdAction with checking for non-null required values
     * @return BusinessUnitAddShippingAddressIdAction
     */
    public BusinessUnitAddShippingAddressIdAction build() {
        return new BusinessUnitAddShippingAddressIdActionImpl(addressId, addressKey);
    }
    
    /**
     * builds BusinessUnitAddShippingAddressIdAction without checking for non-null required values
     * @return BusinessUnitAddShippingAddressIdAction
     */
    public BusinessUnitAddShippingAddressIdAction buildUnchecked() {
        return new BusinessUnitAddShippingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * factory method for an instance of BusinessUnitAddShippingAddressIdActionBuilder
     * @return builder 
     */
    public static BusinessUnitAddShippingAddressIdActionBuilder of() {
        return new BusinessUnitAddShippingAddressIdActionBuilder();
    }

    /**
     * create builder for BusinessUnitAddShippingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddShippingAddressIdActionBuilder of(final BusinessUnitAddShippingAddressIdAction template) {
        BusinessUnitAddShippingAddressIdActionBuilder builder = new BusinessUnitAddShippingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
