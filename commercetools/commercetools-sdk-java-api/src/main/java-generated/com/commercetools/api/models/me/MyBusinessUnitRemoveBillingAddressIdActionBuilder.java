package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyBusinessUnitUpdateAction;
import com.commercetools.api.models.me.MyBusinessUnitRemoveBillingAddressIdAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitRemoveBillingAddressIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitRemoveBillingAddressIdAction myBusinessUnitRemoveBillingAddressIdAction = MyBusinessUnitRemoveBillingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyBusinessUnitRemoveBillingAddressIdActionBuilder implements Builder<MyBusinessUnitRemoveBillingAddressIdAction> {

    
    @Nullable
    private String addressId;
    
    
    @Nullable
    private String addressKey;

    
    /**
     *  <p>ID of the billing address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     * @return Builder
     */
    
    public MyBusinessUnitRemoveBillingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Key of the billing address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     * @return Builder
     */
    
    public MyBusinessUnitRemoveBillingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }
    
    

    /**
     *  <p>ID of the billing address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */
    
    @Nullable
    public String getAddressId(){
        return this.addressId;
    }
    
    /**
     *  <p>Key of the billing address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */
    
    @Nullable
    public String getAddressKey(){
        return this.addressKey;
    }

    /**
     * builds MyBusinessUnitRemoveBillingAddressIdAction with checking for non-null required values
     * @return MyBusinessUnitRemoveBillingAddressIdAction
     */
    public MyBusinessUnitRemoveBillingAddressIdAction build() {
        return new MyBusinessUnitRemoveBillingAddressIdActionImpl(addressId, addressKey);
    }
    
    /**
     * builds MyBusinessUnitRemoveBillingAddressIdAction without checking for non-null required values
     * @return MyBusinessUnitRemoveBillingAddressIdAction
     */
    public MyBusinessUnitRemoveBillingAddressIdAction buildUnchecked() {
        return new MyBusinessUnitRemoveBillingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * factory method for an instance of MyBusinessUnitRemoveBillingAddressIdActionBuilder
     * @return builder 
     */
    public static MyBusinessUnitRemoveBillingAddressIdActionBuilder of() {
        return new MyBusinessUnitRemoveBillingAddressIdActionBuilder();
    }

    /**
     * create builder for MyBusinessUnitRemoveBillingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitRemoveBillingAddressIdActionBuilder of(final MyBusinessUnitRemoveBillingAddressIdAction template) {
        MyBusinessUnitRemoveBillingAddressIdActionBuilder builder = new MyBusinessUnitRemoveBillingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
