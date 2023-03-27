
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitSetDefaultBillingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitSetDefaultBillingAddressAction myBusinessUnitSetDefaultBillingAddressAction = MyBusinessUnitSetDefaultBillingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitSetDefaultBillingAddressActionBuilder
        implements Builder<MyBusinessUnitSetDefaultBillingAddressAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p>ID of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public MyBusinessUnitSetDefaultBillingAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Key of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public MyBusinessUnitSetDefaultBillingAddressActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p>ID of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p>Key of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */

    @Nullable
    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     * builds MyBusinessUnitSetDefaultBillingAddressAction with checking for non-null required values
     * @return MyBusinessUnitSetDefaultBillingAddressAction
     */
    public MyBusinessUnitSetDefaultBillingAddressAction build() {
        return new MyBusinessUnitSetDefaultBillingAddressActionImpl(addressId, addressKey);
    }

    /**
     * builds MyBusinessUnitSetDefaultBillingAddressAction without checking for non-null required values
     * @return MyBusinessUnitSetDefaultBillingAddressAction
     */
    public MyBusinessUnitSetDefaultBillingAddressAction buildUnchecked() {
        return new MyBusinessUnitSetDefaultBillingAddressActionImpl(addressId, addressKey);
    }

    /**
     * factory method for an instance of MyBusinessUnitSetDefaultBillingAddressActionBuilder
     * @return builder
     */
    public static MyBusinessUnitSetDefaultBillingAddressActionBuilder of() {
        return new MyBusinessUnitSetDefaultBillingAddressActionBuilder();
    }

    /**
     * create builder for MyBusinessUnitSetDefaultBillingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitSetDefaultBillingAddressActionBuilder of(
            final MyBusinessUnitSetDefaultBillingAddressAction template) {
        MyBusinessUnitSetDefaultBillingAddressActionBuilder builder = new MyBusinessUnitSetDefaultBillingAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
