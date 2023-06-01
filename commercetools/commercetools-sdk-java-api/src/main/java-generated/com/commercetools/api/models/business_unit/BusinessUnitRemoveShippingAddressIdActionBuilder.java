package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.business_unit.BusinessUnitUpdateAction;
import com.commercetools.api.models.business_unit.BusinessUnitRemoveShippingAddressIdAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitRemoveShippingAddressIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitRemoveShippingAddressIdAction businessUnitRemoveShippingAddressIdAction = BusinessUnitRemoveShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BusinessUnitRemoveShippingAddressIdActionBuilder implements Builder<BusinessUnitRemoveShippingAddressIdAction> {

    
    @Nullable
    private String addressId;
    
    
    @Nullable
    private String addressKey;

    
    /**
     *  <p>ID of the address to be removed from <code>shippingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     * @return Builder
     */
    
    public BusinessUnitRemoveShippingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Key of the address to be removed from <code>shippingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     * @return Builder
     */
    
    public BusinessUnitRemoveShippingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }
    
    

    /**
     *  <p>ID of the address to be removed from <code>shippingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */
    
    @Nullable
    public String getAddressId(){
        return this.addressId;
    }
    
    /**
     *  <p>Key of the address to be removed from <code>shippingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */
    
    @Nullable
    public String getAddressKey(){
        return this.addressKey;
    }

    /**
     * builds BusinessUnitRemoveShippingAddressIdAction with checking for non-null required values
     * @return BusinessUnitRemoveShippingAddressIdAction
     */
    public BusinessUnitRemoveShippingAddressIdAction build() {
        return new BusinessUnitRemoveShippingAddressIdActionImpl(addressId, addressKey);
    }
    
    /**
     * builds BusinessUnitRemoveShippingAddressIdAction without checking for non-null required values
     * @return BusinessUnitRemoveShippingAddressIdAction
     */
    public BusinessUnitRemoveShippingAddressIdAction buildUnchecked() {
        return new BusinessUnitRemoveShippingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * factory method for an instance of BusinessUnitRemoveShippingAddressIdActionBuilder
     * @return builder 
     */
    public static BusinessUnitRemoveShippingAddressIdActionBuilder of() {
        return new BusinessUnitRemoveShippingAddressIdActionBuilder();
    }

    /**
     * create builder for BusinessUnitRemoveShippingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitRemoveShippingAddressIdActionBuilder of(final BusinessUnitRemoveShippingAddressIdAction template) {
        BusinessUnitRemoveShippingAddressIdActionBuilder builder = new BusinessUnitRemoveShippingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
