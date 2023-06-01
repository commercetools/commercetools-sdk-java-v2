package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.business_unit.BusinessUnitUpdateAction;
import com.commercetools.api.models.business_unit.BusinessUnitSetDefaultBillingAddressAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitSetDefaultBillingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetDefaultBillingAddressAction businessUnitSetDefaultBillingAddressAction = BusinessUnitSetDefaultBillingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BusinessUnitSetDefaultBillingAddressActionBuilder implements Builder<BusinessUnitSetDefaultBillingAddressAction> {

    
    @Nullable
    private String addressId;
    
    
    @Nullable
    private String addressKey;

    
    /**
     *  <p>ID of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     * @return Builder
     */
    
    public BusinessUnitSetDefaultBillingAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Key of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     * @return Builder
     */
    
    public BusinessUnitSetDefaultBillingAddressActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }
    
    

    /**
     *  <p>ID of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */
    
    @Nullable
    public String getAddressId(){
        return this.addressId;
    }
    
    /**
     *  <p>Key of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */
    
    @Nullable
    public String getAddressKey(){
        return this.addressKey;
    }

    /**
     * builds BusinessUnitSetDefaultBillingAddressAction with checking for non-null required values
     * @return BusinessUnitSetDefaultBillingAddressAction
     */
    public BusinessUnitSetDefaultBillingAddressAction build() {
        return new BusinessUnitSetDefaultBillingAddressActionImpl(addressId, addressKey);
    }
    
    /**
     * builds BusinessUnitSetDefaultBillingAddressAction without checking for non-null required values
     * @return BusinessUnitSetDefaultBillingAddressAction
     */
    public BusinessUnitSetDefaultBillingAddressAction buildUnchecked() {
        return new BusinessUnitSetDefaultBillingAddressActionImpl(addressId, addressKey);
    }

    /**
     * factory method for an instance of BusinessUnitSetDefaultBillingAddressActionBuilder
     * @return builder 
     */
    public static BusinessUnitSetDefaultBillingAddressActionBuilder of() {
        return new BusinessUnitSetDefaultBillingAddressActionBuilder();
    }

    /**
     * create builder for BusinessUnitSetDefaultBillingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSetDefaultBillingAddressActionBuilder of(final BusinessUnitSetDefaultBillingAddressAction template) {
        BusinessUnitSetDefaultBillingAddressActionBuilder builder = new BusinessUnitSetDefaultBillingAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
