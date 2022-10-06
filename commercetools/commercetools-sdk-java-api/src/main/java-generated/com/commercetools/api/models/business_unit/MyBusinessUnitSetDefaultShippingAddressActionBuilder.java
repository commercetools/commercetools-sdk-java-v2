
package com.commercetools.api.models.business_unit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitSetDefaultShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitSetDefaultShippingAddressAction myBusinessUnitSetDefaultShippingAddressAction = MyBusinessUnitSetDefaultShippingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitSetDefaultShippingAddressActionBuilder
        implements Builder<MyBusinessUnitSetDefaultShippingAddressAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p>ID of the address to add as a shipping address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    public MyBusinessUnitSetDefaultShippingAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Key of the address to add as a shipping address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    public MyBusinessUnitSetDefaultShippingAddressActionBuilder addressKey(@Nullable final String addressKey) {
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

    public MyBusinessUnitSetDefaultShippingAddressAction build() {
        return new MyBusinessUnitSetDefaultShippingAddressActionImpl(addressId, addressKey);
    }

    /**
     * builds MyBusinessUnitSetDefaultShippingAddressAction without checking for non null required values
     */
    public MyBusinessUnitSetDefaultShippingAddressAction buildUnchecked() {
        return new MyBusinessUnitSetDefaultShippingAddressActionImpl(addressId, addressKey);
    }

    public static MyBusinessUnitSetDefaultShippingAddressActionBuilder of() {
        return new MyBusinessUnitSetDefaultShippingAddressActionBuilder();
    }

    public static MyBusinessUnitSetDefaultShippingAddressActionBuilder of(
            final MyBusinessUnitSetDefaultShippingAddressAction template) {
        MyBusinessUnitSetDefaultShippingAddressActionBuilder builder = new MyBusinessUnitSetDefaultShippingAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
