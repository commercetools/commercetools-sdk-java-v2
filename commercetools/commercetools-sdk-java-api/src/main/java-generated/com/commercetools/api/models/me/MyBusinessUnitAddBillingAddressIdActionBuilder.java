
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitAddBillingAddressIdActionBuilder
        implements Builder<MyBusinessUnitAddBillingAddressIdAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p>ID of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    public MyBusinessUnitAddBillingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Key of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    public MyBusinessUnitAddBillingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
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

    public MyBusinessUnitAddBillingAddressIdAction build() {
        return new MyBusinessUnitAddBillingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds MyBusinessUnitAddBillingAddressIdAction without checking for non null required values
     */
    public MyBusinessUnitAddBillingAddressIdAction buildUnchecked() {
        return new MyBusinessUnitAddBillingAddressIdActionImpl(addressId, addressKey);
    }

    public static MyBusinessUnitAddBillingAddressIdActionBuilder of() {
        return new MyBusinessUnitAddBillingAddressIdActionBuilder();
    }

    public static MyBusinessUnitAddBillingAddressIdActionBuilder of(
            final MyBusinessUnitAddBillingAddressIdAction template) {
        MyBusinessUnitAddBillingAddressIdActionBuilder builder = new MyBusinessUnitAddBillingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
