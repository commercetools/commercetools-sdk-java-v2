
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitRemoveShippingAddressIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitRemoveShippingAddressIdAction myBusinessUnitRemoveShippingAddressIdAction = MyBusinessUnitRemoveShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitRemoveShippingAddressIdActionBuilder
        implements Builder<MyBusinessUnitRemoveShippingAddressIdAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p>ID of the shipping address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId
     * @return Builder
     */

    public MyBusinessUnitRemoveShippingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Key of the shipping address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey
     * @return Builder
     */

    public MyBusinessUnitRemoveShippingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
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

    public MyBusinessUnitRemoveShippingAddressIdAction build() {
        return new MyBusinessUnitRemoveShippingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds MyBusinessUnitRemoveShippingAddressIdAction without checking for non null required values
     */
    public MyBusinessUnitRemoveShippingAddressIdAction buildUnchecked() {
        return new MyBusinessUnitRemoveShippingAddressIdActionImpl(addressId, addressKey);
    }

    public static MyBusinessUnitRemoveShippingAddressIdActionBuilder of() {
        return new MyBusinessUnitRemoveShippingAddressIdActionBuilder();
    }

    public static MyBusinessUnitRemoveShippingAddressIdActionBuilder of(
            final MyBusinessUnitRemoveShippingAddressIdAction template) {
        MyBusinessUnitRemoveShippingAddressIdActionBuilder builder = new MyBusinessUnitRemoveShippingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
