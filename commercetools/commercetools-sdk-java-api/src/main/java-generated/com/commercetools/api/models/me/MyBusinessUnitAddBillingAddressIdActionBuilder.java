package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyBusinessUnitUpdateAction;
import com.commercetools.api.models.me.MyBusinessUnitAddBillingAddressIdAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitAddBillingAddressIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitAddBillingAddressIdAction myBusinessUnitAddBillingAddressIdAction = MyBusinessUnitAddBillingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyBusinessUnitAddBillingAddressIdActionBuilder implements Builder<MyBusinessUnitAddBillingAddressIdAction> {

    
    @Nullable
    private String addressId;
    
    
    @Nullable
    private String addressKey;

    
    /**
     *  <p>ID of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     * @return Builder
     */
    
    public MyBusinessUnitAddBillingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Key of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     * @return Builder
     */
    
    public MyBusinessUnitAddBillingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
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
     * builds MyBusinessUnitAddBillingAddressIdAction with checking for non-null required values
     * @return MyBusinessUnitAddBillingAddressIdAction
     */
    public MyBusinessUnitAddBillingAddressIdAction build() {
        return new MyBusinessUnitAddBillingAddressIdActionImpl(addressId, addressKey);
    }
    
    /**
     * builds MyBusinessUnitAddBillingAddressIdAction without checking for non-null required values
     * @return MyBusinessUnitAddBillingAddressIdAction
     */
    public MyBusinessUnitAddBillingAddressIdAction buildUnchecked() {
        return new MyBusinessUnitAddBillingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * factory method for an instance of MyBusinessUnitAddBillingAddressIdActionBuilder
     * @return builder 
     */
    public static MyBusinessUnitAddBillingAddressIdActionBuilder of() {
        return new MyBusinessUnitAddBillingAddressIdActionBuilder();
    }

    /**
     * create builder for MyBusinessUnitAddBillingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitAddBillingAddressIdActionBuilder of(final MyBusinessUnitAddBillingAddressIdAction template) {
        MyBusinessUnitAddBillingAddressIdActionBuilder builder = new MyBusinessUnitAddBillingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
