
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitAddShippingAddressIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitAddShippingAddressIdAction myBusinessUnitAddShippingAddressIdAction = MyBusinessUnitAddShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitAddShippingAddressIdActionBuilder
        implements Builder<MyBusinessUnitAddShippingAddressIdAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p>ID of the address to add as a shipping address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public MyBusinessUnitAddShippingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Key of the address to add as a shipping address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public MyBusinessUnitAddShippingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    @Nullable
    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     * builds MyBusinessUnitAddShippingAddressIdAction with checking for non-null required values
     * @return MyBusinessUnitAddShippingAddressIdAction
     */
    public MyBusinessUnitAddShippingAddressIdAction build() {
        return new MyBusinessUnitAddShippingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds MyBusinessUnitAddShippingAddressIdAction without checking for non-null required values
     * @return MyBusinessUnitAddShippingAddressIdAction
     */
    public MyBusinessUnitAddShippingAddressIdAction buildUnchecked() {
        return new MyBusinessUnitAddShippingAddressIdActionImpl(addressId, addressKey);
    }

    public static MyBusinessUnitAddShippingAddressIdActionBuilder of() {
        return new MyBusinessUnitAddShippingAddressIdActionBuilder();
    }

    public static MyBusinessUnitAddShippingAddressIdActionBuilder of(
            final MyBusinessUnitAddShippingAddressIdAction template) {
        MyBusinessUnitAddShippingAddressIdActionBuilder builder = new MyBusinessUnitAddShippingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
